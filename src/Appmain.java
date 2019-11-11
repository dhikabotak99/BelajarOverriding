/**
 *
 * @author Etem
 */
import java.util.Scanner;
public class Appmain {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int  pilih;
        System.out.println("Pilih Barang : ");
        System.out.println("1. Meja\n2. Kursi\n3. Lemari");
        System.out.print("Masukkan Pilihan Furniture : ");
        pilih=input.nextInt();
        Furniture barang = new Meja();
        Furniture barang2 = new Kursi();
        Furniture barang3 = new Lemari();
        if (pilih==1) {
            barang.tampilBarang();
            barang.tampilHarga();
        }
        else if(pilih==2){
            barang2.tampilBarang();
            barang2.tampilHarga();
        }
        else if(pilih==3){
            barang3.tampilBarang();
            barang3.tampilHarga();
        }
        else{
            System.out.println("Salah memilih pilihan");
        }
    }
}
