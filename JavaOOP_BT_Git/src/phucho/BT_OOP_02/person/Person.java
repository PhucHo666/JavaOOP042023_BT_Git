package phucho.BT_OOP_02.person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private int phone;

    public Person(String name, int age, String gender, String address, int phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    public Person(String name, int age, String gender) {
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

    protected String getAddress() {
        return address;
    }

    protected int getPhone() {
        return phone;
    }
    protected void getInfoPerson(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone: " + getPhone());
    }
    public void getInfoCompanyClass(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
    }

}
