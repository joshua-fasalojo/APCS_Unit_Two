public class EmailGenerator<main> {
    public static void main(String[] args) {
        String newString = "george fox";
        String username = makeUserName(newString);
        System.out.println(username);
        String address = "icloud.com";
        String emailaddress = makeEmail(username, address);
        System.out.println(emailaddress);

    }

    public static String makeUserName(String name) {
        // name = Josh Fasalojo -> jfasalojo
        String firstInitial =  name.substring(0,1);
        int space = name.indexOf(" ");
        String lastName = name.substring(space+1);

        int randomNumber = (int) (Math.random()*(99-10 + 1)) +10;
        return firstInitial + lastName + randomNumber;



    }

    public static String makeEmail(String name, String address){
        return name + "@" + address;
    }


}


