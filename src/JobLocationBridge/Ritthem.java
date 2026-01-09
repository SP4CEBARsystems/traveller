package JobLocationBridge;

import MoneyStrategies.IMakeMoneyStrategy;

public class Ritthem implements IAmACity {
    String description = "A farmer's village near industry and large harbors.";

    IMakeMoneyStrategy[] jobs = {
    };

    public IMakeMoneyStrategy[] getJobs() {
        return this.jobs;
    }

    public int getJobCount() {
        return this.jobs.length;
    }
}
