package phucho.BT_OOP_02.person;

public class Information {
    public static void main(String[] args) {
        Person person1 = new Person("Phúc",30,"Male", "Cà Mau",1234567890);
        Person person2 = new Person("Oanh",28,"Female", "Hà Tây",987654321);
        person1.getInfoPerson();
        System.out.println("================================================");
        person2.getInfoPerson();
    }
}
