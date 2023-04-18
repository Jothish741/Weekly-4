import java.util.ArrayList;
import java.util.List;

public class JoinArray {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("First list: " + list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println("Second list: " + list2);
        List<Integer> joinedList = new ArrayList<>();
        joinedList.addAll(list1);
        joinedList.addAll(list2);

        System.out.println("Joined list: " + joinedList);
    }
}
