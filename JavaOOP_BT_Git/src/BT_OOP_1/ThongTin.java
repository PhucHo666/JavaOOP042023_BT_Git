package BT_OOP_1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanvien = new NhanVien();

        System.out.println("Tên nhân viên là: " + nhanvien.getName());
        System.out.println("Tuổi nhân viên là: " + nhanvien.getAge());
        System.out.println("Địa chỉ của nhân viên ở: " + nhanvien.getAddress());
        System.out.println("ID của nhân viên là: " + nhanvien.getID());

    }

}
