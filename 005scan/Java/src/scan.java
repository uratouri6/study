import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class scan {
    public static void main(String[] args){

        List list = new ArrayList();
        Collection collection = list;
        list.add(5555);
        list.add(333333);
        list.add(23);
        list.add(5965908);
        list.add(24235);
        list.add(3543545);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("dekai:" + Collections.max(collection));
        System.out.println("tiisai: " + Collections.min(collection));
    }
}