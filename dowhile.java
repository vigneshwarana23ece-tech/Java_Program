import java.util.*;

class dowhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Using do while
        // int a;
        // do { 
        //     a = s.nextInt();
        //     System.out.println("User Entered: "+a);
        // } while (a != 0);

        //Using While
         int a = s.nextInt(); 
        while (a != 0) {
            a = s.nextInt();
            System.out.println("User Entered: " + a);
        }
    }
}
