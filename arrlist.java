import java.util.ArrayList;
import java.util.Collections;
class arrlist {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        System.out.println(arr);
        arr.set(3,3);
        arr.set(4,1);
        System.out.println(arr);
        arr.remove(1);
        arr.remove(3);
        System.out.println(arr);
        arr.add(651);
        arr.add(56);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.contains(1));
    }
}
