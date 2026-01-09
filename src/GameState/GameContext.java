package GameState;

import MoneyStrategies.MoneyContext;
import MoneyStrategies.IMakeMoneyStrategy;
import UserInputAdapter.IAmUserInputAdapter;
import java.util.List;

public class GameContext {
    private IGameState currentState;
    private MoneyContext moneyContext;
    private IAmUserInputAdapter inputAdapter;
    private int currentDay;
    private List<IMakeMoneyStrategy> dailyOptions;

    public GameContext(IAmUserInputAdapter inputAdapter) {
        this.inputAdapter = inputAdapter;
        this.moneyContext = new MoneyContext();
        this.currentDay = 1;
        this.currentState = new InputState(inputAdapter);
    }

    public void setState(IGameState state) {
        this.currentState = state;
    }

    public void handleState() {
        currentState.handle(this);
    }

    public MoneyContext getMoneyContext() {
        return moneyContext;
    }

    public IAmUserInputAdapter getInputAdapter() {
        return inputAdapter;
    }

    public int getDay() {
        return currentDay;
    }

    public void incrementDay() {
        currentDay++;
    }

    public void setDailyOptions(List<IMakeMoneyStrategy> options) {
        this.dailyOptions = options;
    }

    public List<IMakeMoneyStrategy> getDailyOptions() {
        return dailyOptions;
    }

    public boolean isRunning() {
        return true;
    }
}
