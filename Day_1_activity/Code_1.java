import java.util.*;
public class Code_1{

    public static void main(String[] arg) {
        
        Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the first name: ");
        String firstName=scanner.next();
	System.out.println("Enter the last name: ");
        String lastName=scanner.next();       
        int size= firstName.length();
        System.out.println((("Output: "+ firstName.substring(0,1)).toUpperCase()+(firstName.substring(1,size).toLowerCase()))+" "+ ((lastName.toUpperCase())));
    }
}