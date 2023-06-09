package phucho.BT_OOP_02.company;

import phucho.BT_OOP_02.person.Person;

public class Company extends Person {
    public static void main(String[] args) {
        Person person = new Person("Nhi",30,"Female");
        person.getInfoCompany();
    }
}
