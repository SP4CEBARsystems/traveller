import UserInputAdapter.ConsoleReader;
import UserInputAdapter.UserInputMenuAdapter;
import UserInputAdapter.IAmUserInputAdapter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // set up user input adapter and set GameController as its client

        ConsoleReader reader = new ConsoleReader();
        IAmUserInputAdapter adapter = new UserInputMenuAdapter(reader);
        while (true) {
            System.out.print("Please state your choice\n");
            int choice = adapter.readChosenOption(5);
            if (choice == -1) {
                continue;
            }
            System.out.printf("Chosen: %d\n", choice);
        }
    }
}