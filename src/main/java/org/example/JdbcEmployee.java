package org.example;

import java.sql.*;

public class JdbcEmployee {

    public static void main(String[] args) {

        try
        {
            //Loading Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating connection with employee_db database
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
            System.out.println("connection established ");

            //statement
            Statement st = con.createStatement();

            //execute-query
            ResultSet rs = st.executeQuery("select * from employee where salary ");
            //ResultSet rs = st.executeQuery("select * from employee where salary>2600");
            while (rs.next())
            {
                int id = rs.getInt(1);
                String name = rs.getString(3);
                String department = rs.getString(2);
                double salary = rs.getDouble(4);
                System.out.println("ID : "+id+", Name : "+name+", Department : "+department+", Salary : "+salary);
            }

            //execute-update using statement
            int s=st.executeUpdate("update employee set salary= 10000 where salary < 2200");
            System.out.println(s);
            System.out.println("database updated");

            //execute-update using prepared statement
            PreparedStatement ps = con.prepareStatement("update employee set department = ? where department = ?");
            ps.setString(1,"tech-support");
            ps.setString(2,"support");
            int d = ps.executeUpdate();
            System.out.println(d+" rows updated");

            //Inserting data
            String query ="insert into employee (id, department,name,salary) values(?,?,?,?)";
            PreparedStatement insert = con.prepareStatement(query);
            insert.setInt(1, 8);
            insert.setString(2,"backend");
            insert.setString(3,"sham");
            insert.setDouble(4,1700.00);
            int i = insert.executeUpdate();
            System.out.println(i+" record inserted");
        }

        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
