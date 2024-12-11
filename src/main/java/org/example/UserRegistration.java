package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class UserRegistration {

    public static void registerUser()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName : ");
        String user = sc.next();
        System.out.println("Enter Country : ");
        String country = sc.next();

        try
        {
            String checkCountry = "India";
            if(country.equalsIgnoreCase(checkCountry))
            {
                System.out.println("Congrats "+user);
                System.out.println("registration Succesfull");
            }
            else
            {
                throw new InvalidCountryException();
            }
        }
        catch(InvalidCountryException e)
        {
            System.out.println(e.getStr());
        }

    }

    public static void main(String[] args) {

        UserRegistration ur = new UserRegistration();
        ur.registerUser();

    }

}

