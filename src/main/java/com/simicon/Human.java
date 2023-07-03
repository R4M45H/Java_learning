package com.simicon;

public class Human {
//    private String name;
//    public Human(String name){
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }

    final String name;
    final int age;
    final String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }


}
