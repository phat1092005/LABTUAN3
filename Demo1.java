package Bai1;
public class Demo1 {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        System.out.println("Nhap thong tin hoc sinh 1:");
        hs1.input();
        System.out.println("Thong tin hoc sinh 1:");
        hs1.output();

        HocSinh hs2 = new HocSinh(111, "Nguyen Ngoc Lan", 8.5f);
        System.out.println("Thong tin hoc sinh 2:");
        hs2.output();

        HocSinh hs3 = new HocSinh(hs2);
        System.out.println("Thong tin hoc sinh 3 (sao chep tu hs2):");
        hs3.output();

        hs3.setHoTen("Phan Chau Tuan");
        System.out.println("Thong tin hoc sinh 3 sau khi doi ten:");
        hs3.output();

        float max = hs1.getDtb();
        String tenMax = hs1.getHoTen();
        if (max < hs2.getDtb()) {
            max = hs2.getDtb();
            tenMax = hs2.getHoTen();
        }
        if (max < hs3.getDtb()) {
            max = hs3.getDtb();
            tenMax = hs3.getHoTen();
        }
        System.out.println("Hoc sinh " + tenMax + " co diem trung binh lon nhat la: " + max);
    }
}