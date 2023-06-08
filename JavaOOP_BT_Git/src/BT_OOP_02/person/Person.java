package BT_OOP_02.person;

public class Person {
    private String name = "Phúc";
    private int age = 33;
    private String gender = "Male";
    private String address = "Cà Mau";
    private int phone = 1234567890;

    public Person(String name, int age, String gender, String address, int phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
Submit BT_OOP_02
    public Person() {

    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected String getGender() {
        return gender;
    }

    private String getAddress() {
        return address;
    }

    private int getPhone() {
        return phone;
    }

    public void getInfoPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}
