import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap ten cua ban: ");
        String ten = scanner.nextLine();
        System.out.println("Hello " + ten);
        scanner.close();
    }
}
