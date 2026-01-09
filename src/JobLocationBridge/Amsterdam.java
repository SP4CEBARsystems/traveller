package JobLocationBridge;

import MoneyStrategies.IMakeMoneyStrategy;

public class Amsterdam implements IAmACity {
    String description = "A big city with canals.";
    IMakeMoneyStrategy[] jobs = {
    };

    public IMakeMoneyStrategy[] getJobs() {
        return this.jobs;
    }

    public int getJobCount() {
        return this.jobs.length;
    }
}
