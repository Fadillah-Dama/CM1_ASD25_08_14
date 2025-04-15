import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceClass list = new ServiceClass();

        Barang brg1 = new Barang("Br001", "Leo Kripik", "Makanan", 10, 1000);
        Barang brg2 = new Barang("Br002", "You C1000", "Minuman", 10, 7000);
        Barang brg3 = new Barang("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
        Barang brg4 = new Barang("Br004", "Rinso Cair", "Sabun", 10, 7000);
        Barang brg5 = new Barang("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);

        TransaksiPembelian tr1 = new TransaksiPembelian("Tr001", "Santi", "21-04-2024", 1, brg1, brg1.harga);
        
        while (true) {
            System.out.println("BANK MENU : ");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("6. exit");
            System.out.println("Pilih Menu (1-6) :");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
            case 1:
                
                break;
        
            default:
                break;
        }
            
        }
    }
}
