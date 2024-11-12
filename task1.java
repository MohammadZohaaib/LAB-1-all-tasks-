public class task1 {   
    public static void main(String[] args)
 {
     String str1 = "Hello";
     String str2 = "World";
     String str3 = new String("Java");
     String str4 = new String("Programming");    
     String str5 = str3.intern();
     System.out.println("String 1:" + str1);
     System.out.println("String 2:" + str2);
     System.out.println("String 3:" + str3);
     System.out.println("String 4:" + str4);
     System.out.println("String 5:" + str5);
 }
}