class construct{
    public static void main(String[] args) {
        constructors o = new construct("Roshan");
        constructors o2 = new construct(o);

        System.out.println(o.name);
        System.out.println(o2.name2);

    }
    
}
class constructors{
    String name;
    String name2;
    constructors(){
        System.out.println("hi");
    }
    
}