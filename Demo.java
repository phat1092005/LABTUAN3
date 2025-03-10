package Bai2;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p1 = new PhanSo();
        System.out.print("p1 mac dinh: ");
        p1.xuatPhanSo();
        p1.nhapPhanSo();
        System.out.print("p1 sau nhap: ");
        p1.xuatPhanSo();
        PhanSo p2 = new PhanSo(4, 16);
        System.out.print("p2: ");
        p2.xuatPhanSo();
        System.out.print("Nhap tu so p3: ");
        int tuP3 = sc.nextInt();
        System.out.print("Nhap mau so p3: ");
        int mauP3 = sc.nextInt();
        PhanSo p3 = new PhanSo(tuP3, mauP3);
        System.out.print("p3: ");
        p3.xuatPhanSo();
        System.out.print("p1 + p3 = ");
        p1.cong(p3).xuatPhanSo();
        PhanSo p4 = new PhanSo(p1.cong(p3));
        System.out.print("p4: ");
        p4.xuatPhanSo();
        System.out.print("p4 * p2 = ");
        p4.nhan(p2).xuatPhanSo();
        sc.close();
    }
}