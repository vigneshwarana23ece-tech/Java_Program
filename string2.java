import java.util.*;
class string2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String a = sc.nextLine();
        second x = new second();
        x.todo(a);

    }
}
class second{
    void todo(String b){
        if(b.isBlank()){
            System.out.println("Task not entered");
            return;
        }
        else
            System.out.println("your task "+b);
    System.out.println("Thank you for your task");
    }
    

    
}