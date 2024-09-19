import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien muon gui(VND): ");
        double SoTienGui = scanner.nextDouble();
        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatHangNam = scanner.nextDouble() / 100; // Chuyển lãi suất thành tỷ lệ
        System.out.print("Nhap so thang gui: ");
        int SoThangGui = scanner.nextInt();
        double laiSuatThang = laiSuatHangNam / 12;
        double SoTienLai = SoTienGui * laiSuatThang * SoThangGui;
        double SoTienGocCuoiKy = SoTienGui + SoTienLai;
        System.out.println("Tien lai: " + SoTienLai + " VND");
        System.out.println("Tien goc cuoi ky: " + SoTienGocCuoiKy + " VND");
        scanner.close();
    }
}
