package MoneyStrategies;

public class MoneyContext {
    private IMakeMoneyStrategy strategy;
    private int totalMoney;

    public MoneyContext() {
        this.totalMoney = 0;
    }

    public void setStrategy(IMakeMoneyStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy() {
        if (strategy == null) {
            System.out.println("No job selected!");
            return 0;
        }
        int earned = strategy.earnMoney();
        totalMoney += earned;
        return earned;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public String getCurrentJob() {
        if (strategy == null) {
            return "Unemployed";
        }
        return strategy.getJobName();
    }
}
