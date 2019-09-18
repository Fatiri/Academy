//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import com.enigma.model.Mobil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) throws IOException {
        BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input coordinate X,Y = ");
        String var2 = var1.readLine();
        String[] var3 = var2.split(",");
        Mobil var4 = new Mobil(Integer.parseInt(var3[0]), Integer.parseInt(var3[1]));

        System.out.print("Isi Bensin = ");
        String var5 = var1.readLine();
        var4.setFuel(Integer.parseInt(var5));
        System.out.print("Masukkan Intruksi = ");
        String var6 = var1.readLine();
        var4.setCommands(var6);
        var4.run();
        System.out.println("-----------------------------------------");
        System.out.println(var4.print());
        System.out.println("-----------------------------------------");
    }
}
