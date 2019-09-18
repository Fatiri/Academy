
import com.enigma.model.Heroes;
import com.enigma.model.Tower;

import java.io.IOException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        Heroes vegeta = new Heroes(1000, 500, 70);
        Heroes goku = new Heroes(1000, 450, 50);
        Tower tower = new Tower(10000);
        vegeta.attack(tower);
        vegeta.attack(goku);
        System.out.println(tower.print());
        System.out.println(vegeta.print());
        System.out.println(goku.print());
    }
}
