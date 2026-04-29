class operators {
    public static void main(String[] args){
        int a = 10, b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nUnary Operators:");
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (b--));
        System.out.println("!true = " + (!true));

        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        System.out.println("\nLogical Operators:");
        System.out.println("(a > 5 && b < 5) : " + (a > 5 && b < 5));
        System.out.println("(a > 5 || b < 5) : " + (a > 5 || b < 5));
        System.out.println("!(a > b) : " + !(a > b));

        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b)); // XOR
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));

        System.out.println("\nAssignment Operators:");
        int x = 10;
        x += 5;
        System.out.println("x += 5 : " + x);
        x -= 3;
        System.out.println("x -= 3 : " + x);
        x *= 2;
        System.out.println("x *= 2 : " + x);
        x /= 4;
        System.out.println("x /= 4 : " + x);
        x %= 3;
        System.out.println("x %= 3 : " + x);

        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max value = " + max);

    }
    
}
              