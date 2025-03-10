package Bai5;
public class Demo {
    public static void main(String[] args) {
        TamGiac tamGiac1 = new TamGiac(3, 4, 5);
        TamGiac tamGiac2 = new TamGiac(5, 5, 5);
        TamGiac tamGiac3 = new TamGiac(3, 4, 6);

        inThongTinTamGiac(tamGiac1);
        inThongTinTamGiac(tamGiac2);
        inThongTinTamGiac(tamGiac3);
}

    public static void inThongTinTamGiac(TamGiac tamGiac) {
        System.out.println("Chu vi: " + tamGiac.tinhChuVi());
        System.out.println("Diện tích: " + tamGiac.tinhDienTich());
        System.out.println("Loại tam giác: " + tamGiac.xacDinhLoaiTamGiac());
        System.out.println();
    }
}