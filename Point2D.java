package Bai3;
public class Point2D {
    private double x;
    private double y;
    public Point2D() {
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public Point2D tinhTong(Point2D other) {
        return new Point2D(this.x + other.x, this.y + other.y);
    }
    public Point2D diemDoiXungQuaOx() {
        return new Point2D(this.x, -this.y);
    }
    public void inToaDo() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(3.0, 4.0);
        System.out.println("Tọa độ p1:");
        p1.inToaDo();
        System.out.println("Tọa độ p2:");
        p2.inToaDo();
        Point2D p3 = p1.tinhTong(p2);
        System.out.println("Tổng p1 và p2:");
        p3.inToaDo();
        Point2D p4 = p2.diemDoiXungQuaOx();
        System.out.println("Điểm đối xứng của p2 qua Ox:");
        p4.inToaDo();
    }
}