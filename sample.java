class sample{
    public static void main(String[] args){
        sample1 o = new sample1();
        o.add();
        System.out.println(o.a);
        System.out.println(sample1.b);
    }
}
class sample1{
    int a = 20;
    static int b = 30;

    void add(){
        final int a = 10;
        System.out.println(a);
    }

}