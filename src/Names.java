import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the first and last names as separate variables (use the Scanner object to get the input)
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();;
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        String fullname = firstName + " "+ lastName;
        System.out.println(fullname);
        System.out.println(fullname.length());
        System.out.print(firstName.substring(0,1));
        System.out.println(lastName.substring(0,1));
        String lastname = new String();
        int var1 = firstName.compareTo(lastname);
        System.out.println(var1);
        System.out.println(lastname.indexOf('a'));
        System.out.println(firstName.indexOf('o'));
        char ch1 = firstName.charAt(0);
        char ch2 = firstName.charAt(1);
        char ch3 = firstName.charAt(2);
        char ch4 = lastName.charAt(5);
        char ch5 = lastName.charAt(6);
        char ch6 = lastName.charAt(7);
        char ch7 = lastName.charAt(8);
        char ch8 = lastName.charAt(0);
        char ch9 = lastName.charAt(1);
        char ch10  = lastName.charAt(2);
        char ch11 = lastName.charAt(3);
        System.out.print(ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7 + " " + ch8 + ch9 + ch10 + ch11);






        // Use the required string methods to print out the information



    }
}
