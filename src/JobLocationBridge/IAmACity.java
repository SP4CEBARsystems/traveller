package JobLocationBridge;

import MoneyStrategies.IMakeMoneyStrategy;

public interface IAmACity {
    public String getName();
    public String getDescription();
    public IMakeMoneyStrategy[] getJobs();
    public int getJobCount();
}
