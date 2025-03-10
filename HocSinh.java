package Bai1;
import java.util.Scanner;
public class HocSinh {
    private int maSo;
    private String hoTen;
    private float dtb;
    
    public HocSinh() {
        this.maSo = 0;
        this.hoTen = null;
        this.dtb = 0f;
    }

    public HocSinh(int maSo, String hoTen, float dtb) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.dtb = dtb;
    }

    public HocSinh(HocSinh tmp) {
        this.maSo = tmp.maSo;
        this.hoTen = tmp.hoTen;
        this.dtb = tmp.dtb;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public void input() {
        Scanner t = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        maSo = t.nextInt();
        System.out.print("Nhap ho ten: ");
        t.nextLine(); 
        hoTen = t.nextLine();
        System.out.print("Nhap diem trung binh: ");
        dtb = t.nextFloat();
    }

    public void output() {
        System.out.println(maSo + " - " + hoTen + " - " + dtb);
    }
}