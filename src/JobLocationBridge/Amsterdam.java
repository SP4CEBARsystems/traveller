package JobLocationBridge;

import MoneyStrategies.IMakeMoneyStrategy;
import StrategySingleton.StrategyManager;

public class Amsterdam implements IAmACity {
    String name = "Amsterdam";

    String description = "A big city with canals.";

    IMakeMoneyStrategy[] jobs;

    Amsterdam () {
        StrategyManager strategy = StrategyManager.getInstance();
        this.jobs = new IMakeMoneyStrategy[]{
            strategy.getStrategyByIndex(0),
            strategy.getStrategyByIndex(1),
            strategy.getStrategyByIndex(2),
            strategy.getStrategyByIndex(3),
            strategy.getStrategyByIndex(4),
            strategy.getStrategyByIndex(5)
        };
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public IMakeMoneyStrategy[] getJobs() {
        return this.jobs;
    }

    public int getJobCount() {
        return this.jobs.length;
    }
}
