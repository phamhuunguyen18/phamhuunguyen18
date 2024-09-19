import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int SoThuNhat = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int SoThuHai = scanner.nextInt();
        int tong = SoThuNhat + SoThuHai;
        int hieu = SoThuNhat - SoThuHai;
        int tich = SoThuNhat * SoThuHai;
        double thuong = (double) SoThuNhat / SoThuHai;
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        scanner.close();
    }
}
