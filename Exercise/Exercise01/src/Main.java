import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

    public static void main(String[] args) throws IOException {
        //Membuat Text Input Jumlah
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Jumlah Data = ");
        String data = br.readLine();
        int banyakData = Integer.parseInt(data);
        String [] arrayNama = new String[banyakData];
        String [] arrayUmur = new String[banyakData];
        int noUrut =1;
        for (int jumlah = 0; jumlah<banyakData; jumlah++){
            System.out.println("Masukan data ke = "+noUrut++);
            System.out.print("Nama = ");
            String nama = br.readLine();
            System.out.print("Umur = ");
            String umur = br.readLine();

            arrayNama[jumlah] = nama;
            arrayUmur [jumlah] =umur;


        }
        System.out.println("| Nama | Umur |");

        for (int tampilArray=0; tampilArray<banyakData; tampilArray++){
            System.out.println("|"+arrayNama [tampilArray]+"|"+arrayUmur [tampilArray]+"|");

        }
    }
}