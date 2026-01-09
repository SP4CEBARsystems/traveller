package JobLocationBridge;

import MoneyStrategies.IMakeMoneyStrategy;
import StrategySingleton.StrategyManager;

public class Ritthem implements IAmACity {
    String description = "A farmer's village near industry and large harbors.";
    IMakeMoneyStrategy[] jobs;

    Ritthem () {
        StrategyManager strategy = StrategyManager.getInstance();
        this.jobs = new IMakeMoneyStrategy[]{
            strategy.getStrategyByIndex(0),
            strategy.getStrategyByIndex(5),
        };
    }

    public IMakeMoneyStrategy[] getJobs() {
        return this.jobs;
    }

    public int getJobCount() {
        return this.jobs.length;
    }
}
