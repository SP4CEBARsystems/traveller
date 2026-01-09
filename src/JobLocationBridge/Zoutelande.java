package JobLocationBridge;

import MoneyStrategies.IMakeMoneyStrategy;

public class Zoutelande implements IAmACity {
     String description = "A coastal village with a nice beach and a lot of tourism.";

    IMakeMoneyStrategy[] jobs = {
    };

    public IMakeMoneyStrategy[] getJobs() {
        return this.jobs;
    }

    public int getJobCount() {
        return this.jobs.length;
    }
}
