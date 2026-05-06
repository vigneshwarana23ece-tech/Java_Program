import java.util.Arrays;
class arrayclone{
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        int b[] = new int [5];
        int c[] = new int [5];
        int d[] = new int [5];
        b = a.clone();
        for(int i=0 ; i<b.length ; i++){
            System.out.println(b[i]);
        }
        System.arraycopy(a, 0, c, 0, 5);
        for(int i=0 ; i<c.length ; i++){
            System.out.println(c[i]);
        }
        d = Arrays.copyOf(a,5);
        for(int i=0 ; i<d.length ; i++){
            System.out.println(d[i]);
        }
    }
}