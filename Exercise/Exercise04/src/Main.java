import com.enigma.model.*;

public class Main {
    public static void main(String[] args) {
        Skills jump = new Skills("Jump", 20, 20 );

        Heroes goku = new TankHeroes(1000,500,20, jump);
        Heroes vegeta = new StrengthBasedHeroes(1000,500,20, jump);
        Creep creep = new Creep(50,5);
        Tower tower = new Tower(5000, 50);

        vegeta.attack(tower);

        goku.castSkills(vegeta);
        goku.castSkills(creep);
        creep.attack(goku);

        System.out.println("Goku = "+goku.print());
        System.out.println(vegeta.print());
        System.out.println(creep.print());
    }
}
