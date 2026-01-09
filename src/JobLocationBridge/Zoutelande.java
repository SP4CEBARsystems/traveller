package JobLocationBridge;

import MoneyStrategies.IMakeMoneyStrategy;
import StrategySingleton.StrategyManager;

public class Zoutelande implements IAmACity {
    String description = "A coastal village with a nice beach and a lot of tourism.";
    IMakeMoneyStrategy[] jobs;

    Zoutelande () {
        StrategyManager strategy = StrategyManager.getInstance();
        this.jobs = new IMakeMoneyStrategy[]{
            strategy.getStrategyByIndex(1),
            strategy.getStrategyByIndex(4),
        };
    }

    public IMakeMoneyStrategy[] getJobs() {
        return this.jobs;
    }

    public int getJobCount() {
        return this.jobs.length;
    }
}
