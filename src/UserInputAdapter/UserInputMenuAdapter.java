package UserInputAdapter;

public class UserInputMenuAdapter implements IAmUserInputAdapter {
    ConsoleReader adaptee;
    public UserInputMenuAdapter(ConsoleReader reader) {
        //console reader is the service of this adapter
        this.adaptee = reader;
    }

    @Override
    public int readChosenOption(int choiceCount) {
        String res = this.adaptee.readLine();
        if (res == null) {
            System.out.print("Invalid input\n");
            return -1;
        } else if (res.equals("exit")) {
            System.exit(0);
        }

        try {
            int chosenOption = Integer.parseInt(res);
            if (chosenOption < 1 || chosenOption > choiceCount) {
                System.out.print("Invalid option, choose in range 1 to " + choiceCount + "\n");
                return -1;
            }
            return chosenOption;
        } catch (NumberFormatException e) {
            System.out.print("Invalid input, you must type an integer number in range 1 to " + choiceCount + "\n");
            return -1;
        }
    }
}
