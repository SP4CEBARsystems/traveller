package JobLocationBridge;

import MoneyStrategies.IMakeMoneyStrategy;

public interface IAmACity {
    public IMakeMoneyStrategy[] getJobs();
    public int getJobCount();
}
