package com.app;

import com.app.model.Person;


public class App
{
    public static void main( String[] args )
    {
        Person p = new Person();
        p.setName("JAN");
        p.setAge(30);

        System.out.println("NOWA OSOBA");
        Person p2 = new Person();
        p2.setName("IZA");
        p2.setAge(18);
    }
}
