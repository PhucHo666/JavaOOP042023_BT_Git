package phucho.BT_OOP_01;

public class NhanVien {
    String name;
    String address;
    int age;
    int ID;

    public NhanVien(String name, String address, int age, int ID) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.ID = ID;
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

    public int getID() {
        return ID;
    }

    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getID());
    }
}

