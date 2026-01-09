package MoneyStrategies;

import java.util.Random;

public class MoneyStrategyJob implements IMakeMoneyStrategy {
    private Random random = new Random();

    @Override
    public int earnMoney() {
        int chance = random.nextInt(100);

        if (chance < 10) {
            int loss = 20 + random.nextInt(31);
            System.out.println("You made a costly mistake at work and got fined $" + loss);
            return -loss;
        } else if (chance < 20) {
            int loss = 15 + random.nextInt(21);
            System.out.println("Transportation and meal expenses cost you $" + loss);
            return -loss;
        } else {
            int earnings = 50 + random.nextInt(51);
            System.out.println("You worked a steady job and earned $" + earnings);
            return earnings;
        }
    }

    @Override
    public String getJobName() {
        return "Regular Job";
    }
}
