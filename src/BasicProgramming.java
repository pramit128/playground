public class BasicProgramming {
    public static void main(String args[]){
        reverseStringUsingStringBuffer("Hello World");
        System.out.println(reverseStringUsingRecursion("Recursion reverse"));
    }

    private static void reverseStringUsingStringBuffer(String string){
        System.out.println("Reverse String using StringBuffer: " + new StringBuffer(string).reverse().toString());
    }

    private static String reverseStringUsingRecursion(String string){
        if(string.length() < 2)
            return string;
        return reverseStringUsingRecursion(string.substring(1)) + string.charAt(0);
    }
}
