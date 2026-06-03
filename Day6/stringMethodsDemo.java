public class stringMethodsDemo {
    public static void main(String[] args) {

        String str = "Hello Java";

        System.out.println("Original String: " + str);

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // substring()
        System.out.println("Substring: " + str.substring(6));

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // equals()
        System.out.println("Equals 'Hello Java': " + str.equals("Hello Java"));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase("hello java"));

        // contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // startsWith()
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // endsWith()
        System.out.println("Ends with 'Java': " + str.endsWith("Java"));

        // indexOf()
        System.out.println("Index of 'J': " + str.indexOf('J'));

        // lastIndexOf()
        System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));

        // replace()
        System.out.println("Replace: " + str.replace("Java", "World"));

        // concat()
        System.out.println("Concat: " + str.concat(" Programming"));

        // trim()
        String s = "   Java   ";
        System.out.println("Trim: '" + s.trim() + "'");

        // isEmpty()
        String empty = "";
        System.out.println("Is Empty: " + empty.isEmpty());

        // compareTo()
        System.out.println("CompareTo: " + str.compareTo("Hello"));

        // split()
        String data = "Apple,Banana,Mango";
        String[] fruits = data.split(",");
        System.out.println("Split:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        // valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf: " + numStr);

        // join()
        System.out.println("Join: " + String.join("-", "A", "B", "C"));
    }
}