package phucho.BT_OOP_01;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanvien = new NhanVien("Phúc", "Cà Mau", 30, 1001);

        System.out.println("Tên nhân viên là: " + nhanvien.getName());
        System.out.println("Tuổi nhân viên là: " + nhanvien.getAge());
        System.out.println("================================================================");
        System.out.println("Địa chỉ của nhân viên ở: " + nhanvien.getAddress());
        System.out.println("ID của nhân viên là: " + nhanvien.getID());

    }

}
