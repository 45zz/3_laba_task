package com.company;

abstract class  Dog {
    int age;
    String name;
    int length;
    String type;

    public Dog(int age,String name,int length,String type){
        this.name=name;
        this.age=age;
        this.length=length;
        this.type=type;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
