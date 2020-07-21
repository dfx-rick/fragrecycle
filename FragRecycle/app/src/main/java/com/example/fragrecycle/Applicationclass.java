package com.example.fragrecycle;

import android.app.Application;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class Applicationclass extends Application {


    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people=new ArrayList<Person>();
        people.add(new Person("Rikin Ramachandran", "6235126720"));
        people.add(new Person("Kavitha Ramachandran", "9995167824"));
        people.add(new Person("Ramachandran M", "+968 99572029"));


    }
}
