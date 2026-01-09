package GameState;

import MoneyStrategies.IMakeMoneyStrategy;
import StrategySingleton.StrategyManager;
import UserInputAdapter.IAmUserInputAdapter;
import Builder.UIBuilder;
import java.util.List;

public class InputState implements IGameState {
    private IAmUserInputAdapter inputAdapter;

    public InputState(IAmUserInputAdapter inputAdapter) {
        this.inputAdapter = inputAdapter;
    }

    @Override
    public void handle(GameContext context) {
        UIBuilder builder = new UIBuilder();
        builder.reset();
        builder.addMenuTitle();
        builder.addStatDay(context.getDay());
        builder.addStatMoney(context.getMoneyContext().getTotalMoney());

        StrategyManager manager = StrategyManager.getInstance();
        List<IMakeMoneyStrategy> dailyOptions = manager.getRandomStrategies(3);

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
