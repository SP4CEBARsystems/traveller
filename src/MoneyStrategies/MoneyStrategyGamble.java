package MoneyStrategies;

import java.util.Random;

public class MoneyStrategyGamble implements IMakeMoneyStrategy {
    private Random random = new Random();

    @Override
    public int earnMoney() {
        int result = -50 + random.nextInt(251);
        if (result > 0) {
            System.out.println("You won at gambling! Earned $" + result);
        } else if (result < 0) {
            System.out.println("You lost at gambling! Lost $" + Math.abs(result));
        } else {
            System.out.println("You broke even at gambling.");
        }
        return result;
    }

    @Override
    public String getJobName() {
        return "Gambling";
    }
}
