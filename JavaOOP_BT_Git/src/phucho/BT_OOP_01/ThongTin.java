package phucho.BT_OOP_01;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Phúc", "Cà Mau", 30, 1001);
        nv1.getInfo();
        System.out.println("================================================");
        NhanVien nv2 = new NhanVien("Oanh", "Hà Tây", 30, 1002);
        nv2.getInfo();
    }

}
