package com.example.fragrecycle;

public class Person {

    private String name;
    private String telmun;

    public Person(String name, String telmun) {
        this.name = name;
        this.telmun = telmun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelmun() {
        return telmun;
    }

    public void setTelmun(String telmun) {
        this.telmun = telmun;
    }
}
