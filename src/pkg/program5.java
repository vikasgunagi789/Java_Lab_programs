package pkg; 
 
public class program5 { 
    public static void main(String[] args) { 
 
        String str1 = "Java Programming"; 
        String str2 = "java programming"; 
        String str3 = "Java"; 
 
        System.out.println("Original String: " + str1); 
 
        // Character Extraction Methods 
        System.out.println("\n--- Character Extraction ---"); 
 
        // charAt() 
        System.out.println("Character at index 5: " + str1.charAt(5)); 
 
        // getChars() 
        char[] arr = new char[4]; 
        str1.getChars(0, 4, arr, 0); 
        System.out.println("getChars(): " + new String(arr)); 
 
        // toCharArray() 
        char[] ch = str1.toCharArray(); 
        System.out.println("toCharArray(): "); 
        for(char c : ch) { 
            System.out.print(c + " "); 
        } 
 
        // String Comparison Methods 
        System.out.println("\n\n--- String Comparison ---"); 
 
        System.out.println("equals(): " + str1.equals(str2)); 
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2)); 
        System.out.println("compareTo(): " + str1.compareTo(str3)); 
        System.out.println("startsWith(\"Java\"): " + str1.startsWith("Java")); 
        System.out.println("endsWith(\"ing\"): " + str1.endsWith("ing")); 
 
        // String Search Methods 
        System.out.println("\n--- String Search ---"); 
 
        System.out.println("indexOf('a'): " + str1.indexOf('a')); 
        System.out.println("lastIndexOf('a'): " + str1.lastIndexOf('a')); 
        System.out.println("indexOf(\"Pro\"): " + str1.indexOf("Pro")); 
        System.out.println("contains(\"gram\"): " + str1.contains("gram")); 
 
        // String Modification Methods 
        System.out.println("\n--- String Modification ---"); 
 
        System.out.println("substring(5): " + str1.substring(5)); 
        System.out.println("substring(0,4): " + str1.substring(0,4)); 
        System.out.println("replace('a','@'): " + str1.replace('a','@')); 
        System.out.println("toUpperCase(): " + str1.toUpperCase()); 
        System.out.println("toLowerCase(): " + str1.toLowerCase()); 
        System.out.println("trim(): " + "   Hello   ".trim()); 
    } 
} 