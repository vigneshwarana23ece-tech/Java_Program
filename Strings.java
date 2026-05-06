class Strings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String word = "JavaProgramming";
        String text = "  java programming  ";
        String empty = "";
        String blank = "   ";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println("== : " + (s1 == s2));
        System.out.println("equals() : " + s1.equals(s2));
        System.out.println("equalsIgnoreCase() : " + s1.equalsIgnoreCase("hello"));
        System.out.println("compareTo() : " + s1.compareTo("World"));
        System.out.println("contains() : " + s1.contains("ell"));

        System.out.println("length() : " + s1.length());
        System.out.println("isEmpty() : " + empty.isEmpty());
        System.out.println("isBlank() : " + blank.isBlank());

        System.out.println("charAt(0) : " + word.charAt(0));
        System.out.println("substring(0,4) : " + word.substring(0, 4));
        System.out.println("indexOf('a') : " + word.indexOf('a'));
        System.out.println("lastIndexOf('a') : " + word.lastIndexOf('a'));

        System.out.println("startsWith() : " + word.startsWith("Java"));
        System.out.println("endsWith() : " + word.endsWith("ing"));

        System.out.println("toUpperCase() : " + text.toUpperCase());
        System.out.println("toLowerCase() : " + text.toLowerCase());
        System.out.println("trim() : " + text.trim());
        System.out.println("replace() : " + text.replace("java", "Python"));
        System.out.println("repeat() : " + "Hi ".repeat(3));

        String name = "java";

        name.toUpperCase();
        System.out.println("Without reassignment : " + name);

        name = name.toUpperCase();
        System.out.println("With reassignment : " + name);

        System.out.println("Name:\t\"Alice\"");
        System.out.println("Path:\tC:\\Users\\Alice");
        System.out.println("Line1\nLine2");

        String joined = String.join("-", "A", "B", "C");
        System.out.println("join() : " + joined);

        String[] arr = joined.split("-");

        for (String i : arr) {
            System.out.println("split() : " + i);
        }

        String json = """
                {
                    "name":"Alice",
                    "role":"Developer"
                }
                """;

        System.out.println(json);

        String userInput = null;

        System.out.println("Null Safe Comparison : " + "Admin".equals(userInput));
    }
}
