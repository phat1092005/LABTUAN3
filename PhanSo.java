package Bai2;
import java.util.Scanner;
public class PhanSo {
    private int tu;   
    private int mau;  
    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        if (mau != 0) {
            this.mau = mau;
        } else {
            System.out.println("Mau so khong the bang 0! Gan mau = 1.");
            this.mau = 1;
        }
    }

    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public void nhapPhanSo() {
        Scanner t = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tu = t.nextInt();
        do {
            System.out.print("Nhap mau so: ");
            mau = t.nextInt();
            if (mau == 0) {
                System.out.println("Mau so khong the bang 0! Vui long nhap lai.");
            }
        } while (mau == 0);
    }

    public void xuatPhanSo() {
        System.out.println(tu + "/" + mau);
    }

    private int USCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void rutGon() {
        int ucln = USCLN(tu, mau);
        tu = tu / ucln;
        mau = mau / ucln;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }

    public PhanSo cong(PhanSo p) {
        PhanSo ketQua = new PhanSo();
        ketQua.tu = this.tu * p.mau + this.mau * p.tu;
        ketQua.mau = this.mau * p.mau;
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo tru(PhanSo p) {
        PhanSo ketQua = new PhanSo();
        ketQua.tu = this.tu * p.mau - this.mau * p.tu;
        ketQua.mau = this.mau * p.mau;
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo nhan(PhanSo p) {
        PhanSo ketQua = new PhanSo();
        ketQua.tu = this.tu * p.tu;
        ketQua.mau = this.mau * p.mau;
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo chia(PhanSo p) {
        if (p.tu == 0) {
            System.out.println("Khong the chia cho phan so co tu so bang 0!");
            return new PhanSo();
        }
        PhanSo ketQua = new PhanSo();
        ketQua.tu = this.tu * p.mau;
        ketQua.mau = this.mau * p.tu;
        ketQua.rutGon();
        return ketQua;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        if (mau != 0) {
            this.mau = mau;
        } else {
            System.out.println("Mau so khong the bang 0! Gan mau = 1.");
            this.mau = 1;
        }
    }
}