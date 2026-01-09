package MoneyStrategies;

import java.util.Random;

public class MoneyStrategyInvest implements IMakeMoneyStrategy {
    private Random random = new Random();

    @Override
    public int earnMoney() {
        int result = -20 + random.nextInt(121);
        if (result > 0) {
            System.out.println("Your investments paid off! Earned $" + result);
        } else if (result < 0) {
            System.out.println("Market downturn! Lost $" + Math.abs(result));
        } else {
            System.out.println("Market was flat. No gains or losses.");
        }
        return result;
    }

    @Override
    public String getJobName() {
        return "Investing";
    }
}
