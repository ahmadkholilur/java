import java.util.Scanner;

public class switchcase4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, total = 0;
        int potongan1, potongan2, potongan3;

        System.out.print ("Masukkan Harga Barang : Rp ");
        harga = input.nextInt();
        System.out.print ("Jumlah Barangnya : ");
        jumlah = input.nextInt();
        total = harga*jumlah;
        System.out.println("Total Bayar : Rp "+ total);
        potongan1 = (total -((total*5)/100));
        potongan2 = (total - ((total*10)/100));
        potongan3 = (total - ((total*15)/100));

        if(total >= 200000){
        System.out.println("Total Bayar (Diskon 15%) : Rp "+ potongan3);
        }else if(total >= 100000 ){
        System.out.println("Total Bayar (Diskon 10%) : Rp "+ potongan2);
        }else if(total >= 50000){
        System.out.println("Total Bayar (Diskon 5%) : Rp "+ potongan1);
        }
        if (jumlah >= 50 && total >= 200000) {
        System.out.println("Total Bayar (Diskon 5%) : Rp " +(potongan3-((potongan3*5)/100)));
        }else if (jumlah >= 50 && total >= 100000) {
        System.out.println("Total Bayar : Rp "+ (potongan2-((potongan2*5)/100)));
        }else if (jumlah >= 50 && total >= 50000){
        System.out.println("Total Bayar (Diskon 5%) : Rp "+ (potongan1-((potongan1*5)/100)));
        }else if (jumlah >= 50){
        System.out.println("Total Bayar (Diskon 5%) : Rp "+ (total-((total*5)/100)));}
    }
}
