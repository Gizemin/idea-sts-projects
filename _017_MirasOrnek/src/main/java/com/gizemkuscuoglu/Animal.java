package com.gizemkuscuoglu;

public class Animal {

    private int age;
    private String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void isMammal() {
        System.out.println("isMammal methodu");
    }

    public void mate() {
        System.out.println("mate methodu");
    }

}
