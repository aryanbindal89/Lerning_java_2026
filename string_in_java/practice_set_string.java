package string_in_java;

class practice_set_string {
    public static void main(String[] args) {
        
        //question 1 - Write a java program to convert a string to lower Case??
        String a = "ARYAN";
        System.out.println(a.toLowerCase());

        //question 2 - Write a java program to replace spaces spaces with underscores??
        String b = "    ARYAN   ";
        System.out.println(b.replace("  ", "_"));

        // Write a program to detect double and tripal spaces in a string??
        String ig = "aryan  agrawal   89";
        System.out.println(ig.indexOf("  "));
        System.err.println(ig.indexOf("   "));



    }
    
}