package BT_OOP_02.company;

import BT_OOP_02.person.Person;

public class Company extends Person {

    public void getInfo(){

        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());

    }

    public static void main(String[] args) {
        Company company = new Company();
        company.getInfo();


    }
}
