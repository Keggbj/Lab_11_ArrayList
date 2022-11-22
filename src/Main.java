import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final String menu = "A = Add D = Delete P = Print Q = Quit";
        boolean done = false;
        String cmd = "";

        do {
            //displays the list
            displayList();
            // display the mneu options
            //get a menu choise
            cmd = Safeinput.getRegExString(console, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();



            //execute the choice
            switch (cmd)
            {


                case "A":
                    break;
                    // Prompt the user for a list item
                    // make sure that it is not an empty string
                    // add it to the list
                case "D":
                    break;
                case "P":
                    break;
                case "Q":
                    System.exit(0);
                    break;
            }
        } while (!done);
        }
        private static void displayList()
        {
            System.out.println("----------------------------------");
            if (list.size() !=0)
        for (int i = 0; i < list.size(); i++)
        {
            System.out.printf("%3d%35s", i+1, list.get(i));
        }
            else
                System.out.println("---     List is empty          ---");
            System.out.println("----------------------------------");

        }


}