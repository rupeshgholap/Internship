package org.example;

public class InvalidCountryException extends Exception {

    private String str;

    public InvalidCountryException()
    {
        super();
        this.str="invalid country ";
    }

    public String getStr()
    {
        return str;
    }


}
