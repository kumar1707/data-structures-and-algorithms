package com.company;

public class ch2_String_methods {
    public static void main(String[] args) {
        String name = "Aryan is a good boy";

        // length - Length of a String
        int length = name.length();
        System.out.printf("The length of the string is %d\n", length);

        // Lower Case a String
        String lower_cased_name = name.toLowerCase();
        System.out.printf("The lower cased is %s\n", lower_cased_name);

        // Lower Case a String
        String upper_cased_name = name.toUpperCase();
        System.out.printf("The upper cased is %s\n", upper_cased_name);

        //trim - Trimming the line (removing all spaces)
        String unTrimmedString = "    Aryan            ";
        String trimmedString = unTrimmedString.trim();
        System.out.printf("The trimmed string is %s\n", trimmedString);

        // replace - replacing
        String replacedWord = name.replace(" ", "_");
        System.out.printf("The word %s is replaced with %s\n", name, replacedWord);

        // return the string in a particular index
        /*  <<USE>>
         * --> name.substring(int start)
         * return the string in a particular index
         * -->  name.substring(int start, int)
         * returns the string under the start and the end index
         * NOTE
         * It starts with 0
         * */

        // USE 1
        String substring1 = name.substring(6);
        System.out.println(substring1);

        // USE 2
        String substring2 = name.substring(6, 13);
        System.out.println(substring2);

        // startsWith - returns t/f if the string starts with the given parameter
        boolean is_starting_with_THE = name.startsWith("the");
        System.out.println(is_starting_with_THE);

        // endsWith - returns t/f if the string ends with the given parameter
        boolean is_ending_with_BOY = name.endsWith("boy");
        System.out.println(is_ending_with_BOY);

        // charAt - returns the char at the given index
        char test = name.charAt(4);
        System.out.println(test);

        // indexOf & lastIndexOf
        /*
         * indexOf(String str) - returns the index of the given string
         * indexOf(String str, int pivot) - returns the inedx of the string and the search begins from the
         * pivot index!
         */
        String aryan = "Aryan";
        int req_index = aryan.indexOf("r");
        System.out.println(req_index);

        int index = aryan.indexOf("a", 3);
        System.out.println(index);

        int lastIndex = aryan.lastIndexOf("y");
        System.out.println(lastIndex);

        int lastIndexFromPivot = aryan.lastIndexOf("y", 1);
        System.out.println(lastIndexFromPivot);

        // isEmpty and isBlank - return t/f if empty
        System.out.println(aryan.isBlank());
        System.out.println(aryan.isEmpty());

        // equals - equates with the given string and returns t/f acc to it
        boolean is_same = aryan.equals("aryan");
        System.out.println(is_same);
        boolean is_similar = aryan.equalsIgnoreCase("ARyan");
        System.out.println(is_similar);

        System.out.println("Hello \"aryan\"");

    }

}
