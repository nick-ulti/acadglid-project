package com.example.aditykum.acadglidsession7assignment3;

/**
 * Created by aditykum on 2/18/2016.
 */

public class Human {
    private int id;
    private int age;
    private String name;
    private byte[] image;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    public Human()
    {}
    public Human(int age,String name,byte [] img)
    {
        super();
        this.age=age;
        this.name=name;
        this.image=img;
    }
}
