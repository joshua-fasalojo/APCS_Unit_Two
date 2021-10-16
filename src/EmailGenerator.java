public class EmailGenerator<main> {
    public static void main(String[] args) {
        String myName = "Brian";
    makeUserName(myName);
    //System.out.print("jfasalojo ");
    }

    private static void makeUserName(String name) {
        // name = Josh Fasalojo -> jfasalojo
        String firstInitial =  name.substring(0,1);
        int indexof = name.indexOf(" ") + 1;

        double max;
        double min;
        int randomNumber = (int) (Math.random()*(max-min)) +min;




    }



}


