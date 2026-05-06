import java.util.Scanner;
class score_grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Mark: ");
        int a = s.nextInt();
        if(a>=91 && a<=100){
            System.out.println("Grade : O");
        }
        else if(a>=81 && a<=90){
            System.out.println("Grade : A+");
        }
        else if(a>=71 && a<=80){
            System.out.println("Grade : A");
        }
        else if(a>=61 && a<=70){
            System.out.println("Grade : B");
        }
        else if(a>=50 && a<=60){
            System.out.println("Grade : B+");
        }
        else{
            System.out.println("Grade : U");
        }
        s.close();
    }
}
