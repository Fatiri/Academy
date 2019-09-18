
import com.enigma.model.Direction;
import com.enigma.model.Robot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] var0) throws IOException {

        BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input coordinate (X,Y)  & Input Direction NORTH, EAST, SOUTH, WEST = ");
        String var2 = var1.readLine();
        String[] var3 = var2.split(",");
        Direction dir = Direction.valueOf(var3[2].toUpperCase());
        Robot var4 = new Robot(Integer.parseInt(var3[0]), Integer.parseInt(var3[1]), dir);

        System.out.print("Batry Terisi = ");
        String var5 = var1.readLine();
        var4.setBatry(Integer.parseInt(var5));
        System.out.print("Masukkan Intruksi F for FORWARD R for RIGHT, L for LEFT = ");
        String var6 = var1.readLine();
        System.out.println("-----------------------------------------");
        var4.setCommands(var6);
        var4.run();

        System.out.println("-----------------------------------------");
        System.out.println(var4.print());
        System.out.println("-----------------------------------------");
        }

}
