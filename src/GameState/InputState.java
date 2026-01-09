package GameState;

import MoneyStrategies.IMakeMoneyStrategy;
import UserInputAdapter.IAmUserInputAdapter;
import Builder.UIBuilder;
import JobLocationBridge.JobController;
import java.util.Arrays;
import java.util.List;

public class InputState implements IGameState {
    private IAmUserInputAdapter inputAdapter;

    public InputState(IAmUserInputAdapter inputAdapter) {
        this.inputAdapter = inputAdapter;
    }

    @Override
    public void handle(GameContext context) {
        JobController jobController = context.getJobController();
        String cityName = jobController.getCityName();

        UIBuilder builder = new UIBuilder();
        builder.reset();
        builder.addMenuTitle();
        builder.addStatDay(context.getDay());
        builder.addStatMoney(context.getMoneyContext().getTotalMoney());
        builder.addCity(cityName);

        IMakeMoneyStrategy[] jobsArray = jobController.getAvailableJobs();
        List<IMakeMoneyStrategy> dailyOptions = Arrays.asList(jobsArray);
        for (IMakeMoneyStrategy strategy : dailyOptions) {
            builder.addJobOption(strategy.getJobName());
        }

        System.out.println("\n" + builder.getResult());
        System.out.print("\nSelect a job: ");

        int choice = inputAdapter.readChosenOption(dailyOptions.size());

        if (choice == -1) {
            System.out.println("Invalid choice. Try again.");
            return;
        }

        IMakeMoneyStrategy selectedStrategy = dailyOptions.get(choice - 1);
        context.getMoneyContext().setStrategy(selectedStrategy);
        context.setDailyOptions(dailyOptions);

        System.out.println("\nYou chose: " + selectedStrategy.getJobName());

        context.setState(new WorkingState());
    }
}
