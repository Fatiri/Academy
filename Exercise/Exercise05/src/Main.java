import java.util.*;
import com.enigma.model.Collection;
public class Main{
    public static void main(String[] args) throws InterruptedException {
        Set<Collection> circleSet = new HashSet<>();

        circleSet.add(new Collection(10));
        circleSet.add(new Collection(5));
        circleSet.add(new Collection(1));
        circleSet.add(new Collection(1));
        circleSet.add(new Collection(1));
        circleSet.add(new Collection(3));
        circleSet.add(new Collection(4));

        for (Collection i: circleSet) {
            System.out.println(i.getR());
        }
        System.out.println("-------------");
        System.out.println("Size = "+circleSet.size());
        System.out.println("-------------");


    }


}
