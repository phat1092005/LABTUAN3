package Bai1;
public class Demo2 {
    public static void main(String[] args) {
        DSHocSinh danhSach = new DSHocSinh();
        danhSach.nhapDS();
        System.out.println("Danh sach truoc khi sap xep:");
        danhSach.xuatDS();
        danhSach.sapXep();
        System.out.println("Danh sach sau khi sap xep giam dan theo diem trung binh:");
        danhSach.xuatDS();
    }
}