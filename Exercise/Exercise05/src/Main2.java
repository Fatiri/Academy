import java.util.*;

import com.enigma.model.NameFrindlist;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {

     HashSet<NameFrindlist> Jajang = new HashSet<>();

         Jajang.add(new NameFrindlist("Udin"));
         Jajang.add(new NameFrindlist("Mamang"));
         Jajang.add(new NameFrindlist("Ahmad"));
         Jajang.add(new NameFrindlist("Saepudin"));
         Jajang.add(new NameFrindlist("Entis"));
         Jajang.add(new NameFrindlist("Ucup"));

      HashSet<NameFrindlist> Rudi = new HashSet<>();

         Rudi.add(new NameFrindlist("Udin"));
         Rudi.add(new NameFrindlist("Mamang"));
         Rudi.add(new NameFrindlist("Agil"));
         Rudi.add(new NameFrindlist("Nunu"));
         Rudi.add(new NameFrindlist("Entis"));
         Rudi.add(new NameFrindlist("Mahfud"));

        System.out.print ("Jajang friends = ");

        for (NameFrindlist jajangFriend: Jajang){
            System.out.print(jajangFriend.setName()+" ");
        }

        System.out.println();
        System.out.print ("Rudi friends = ");

        for (NameFrindlist rudiFriend: Rudi){
            System.out.print(rudiFriend.setName()+" ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.print("Same Friends = ");

      Set<NameFrindlist> nameFriends = new HashSet<>(Jajang);

        nameFriends.retainAll(Rudi);

        for (NameFrindlist friendJajang: nameFriends) {
            System.out.print(friendJajang.setName()+" ");
        }

    }
}




