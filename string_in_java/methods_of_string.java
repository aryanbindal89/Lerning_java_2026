package string_in_java;

class methods_of_string{
    public static void main(String[] args) {
        String name = "Aryan";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lString = name.toLowerCase();
        System.out.println(lString);
        String UString = name.toUpperCase();
        System.out.println(UString);

        String nontrimedString= "        ARYAN         ";
        System.out.println(nontrimedString);
        System.out.println(nontrimedString.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('a', 'b'));
        System.out.println(name.startsWith("Ar"));
        System.out.println(name.endsWith("yan"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('y'));
        System.out.println(name.equals("Aryan"));
        System.out.println(name.equalsIgnoreCase("aryan"));

        System.out.println("I am escape sequence!! /n By Aryan Agrawal");

    }

}