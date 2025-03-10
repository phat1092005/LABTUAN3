package Bai5;
public class TamGiac {
    private int canh1;
    private int canh2;
    private int canh3;

    public TamGiac(int canh1, int canh2, int canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }   
    public int getCanh1() {
        return canh1;
    }
    public int getCanh2() {
        return canh2;
    }
    public int getCanh3() {
        return canh3;
    }

    public double tinhChuVi() {
        return canh1 + canh2 + canh3;
    }

    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }

    public String xacDinhLoaiTamGiac() {
        if (canh1 == canh2 && canh2 == canh3) {
            return "Tam giác đều";
        } else if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3) {
            return "Tam giác cân";
        } else if (canh1 * canh1 + canh2 * canh2 == canh3 * canh3 ||
                   canh1 * canh1 + canh3 * canh3 == canh2 * canh2 ||
                   canh2 * canh2 + canh3 * canh3 == canh1 * canh1) {
            return "Tam giác vuông";
        } else {
            return "Tam giác thường";
        }
    }
}