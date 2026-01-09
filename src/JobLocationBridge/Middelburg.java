package JobLocationBridge;

import MoneyStrategies.IMakeMoneyStrategy;
import StrategySingleton.StrategyManager;

public class Middelburg implements IAmACity {
    String description = "A medium-sized city with canals.";
    IMakeMoneyStrategy[] jobs;

    Middelburg () {
        StrategyManager strategy = StrategyManager.getInstance();
        this.jobs = new IMakeMoneyStrategy[]{
                strategy.getStrategyByIndex(0),
                strategy.getStrategyByIndex(1),
                strategy.getStrategyByIndex(2),
        };
    }

    public IMakeMoneyStrategy[] getJobs() {
        return this.jobs;
    }

    public int getJobCount() {
        return this.jobs.length;
    }
}
