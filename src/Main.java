import JobLocationBridge.JobController;
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

        JobController jobController = new JobController();

        while (true) {
            JobController.showAvailableJobs();
            int jobCount = JobController.getAvailableJobCount();
            System.out.print("Please state your choice\n");
            int choice = adapter.readChosenOption(jobCount);
            if (choice == -1) {
                continue;
            }
            System.out.printf("Chosen: %d\n", choice);
            JobController.chooseJob(choice);
        }
        // when "do this"         (used as the client of the InputAdapter)
        // set and use strategy   (also the client of strategies)

        // prepare next day
        // choose a random selection of strategies
        // draw UI                (Controls the builder)


        // singleton expansion: there is one list of possible job strategies, I'll throw them into a singleton class
        // state expansion: states: wait for input, display what happens during working with a slight delay
        // Bridge expansion: make a cocrete implementation for each location, these will affect all jobs

//    UIBuilder bunnyBuilder = new UIBuilder();
//        bunnyBuilder.addBunnyEars();
//        bunnyBuilder.addMenuOptions();
//        bunnyBuilder.addMenuStats();
//        System.out.printf(bunnyBuilder.getResult() + "\n\n");
//
//    UIBuilder catBuilder = new UIBuilder();
//        catBuilder.addCatEars();
//        catBuilder.addCatFace();
//        catBuilder.addCatFeet();
//        System.out.printf(catBuilder.getResult() + "\n\n");
//
//    UIBuilder birdBuilder = new UIBuilder();
//        birdBuilder.addBirdEars();
//        birdBuilder.addBirdFace();
//        birdBuilder.addBirdFeet();
//        System.out.printf(birdBuilder.getResult() + "\n\n");
//
//    UIBuilder pigBuilder = new UIBuilder();
//        pigBuilder.addPigEars();
//        pigBuilder.addPigFace();
//        pigBuilder.addPigFeet();
//        System.out.printf(pigBuilder.getResult() + "\n\n");
    }
}