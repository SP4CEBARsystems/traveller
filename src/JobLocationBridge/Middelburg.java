package JobLocationBridge;

import MoneyStrategies.IMakeMoneyStrategy;

public class Middelburg implements IAmACity {
    String description = "A medium-sized city with canals.";
    IMakeMoneyStrategy[] jobs = {
    };

    public IMakeMoneyStrategy[] getJobs() {
        return this.jobs;
    }

    public int getJobCount() {
        return this.jobs.length;
    }
}
