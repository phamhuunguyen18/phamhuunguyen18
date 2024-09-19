public class Bai2 {
    public static void main(String[] args) {
         String ten = "Pham Huu Nguyen";
         int tuoi = 19;
         double chieuCao = 1.7;
         char LapTrinh = 'C'; 
         boolean CoThichLapTrinh = (LapTrinh == 'C');
         System.out.println("Ten: " + ten);
         System.out.println("Tuoi: " + tuoi);
         System.out.println("Chieu Cao: " + chieuCao + " m");
         System.out.println("Thich Lap Trinh Khong: " + (CoThichLapTrinh ? "Có" : "Không"));
    }
}
