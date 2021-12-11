import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the first and last names as separate variables (use the Scanner object to get the input)
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();;
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        String fullname = firstName + lastName;
        System.out.println(fullname);
        System.out.println(fullname.length());
        System.out.print(firstName.substring(0,1));
        System.out.println(lastName.substring(0,1));
        String lastname = new String();
        int var1 = firstName.compareTo(lastname);
        System.out.println(var1);
        String str = "Fasalojo";
        String str2 = "Joshua";
        char ch = 'a';
        int PosofA = str.indexOf(str,ch);
        int mid1 = 3;
        int mid2 = 7;






        // Use the required string methods to print out the information



    }
}
