package com.masai.recyclerviewiii;

public class Employee {
    private final String name;
    private final String address;
    private final int age;

    public Employee(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
