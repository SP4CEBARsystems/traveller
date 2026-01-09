package MoneyStrategies;

import java.util.Random;

public class MoneyStrategyBeg implements IMakeMoneyStrategy {
    private Random random = new Random();

    @Override
    public int earnMoney() {
        int chance = random.nextInt(100);

        if (chance < 15) {
            int loss = 10 + random.nextInt(21);
            System.out.println("Police fined you for begging in a restricted area! Lost $" + loss);
            return -loss;
        } else if (chance < 25) {
            int loss = 5 + random.nextInt(11);
            System.out.println("You got robbed while begging! Lost $" + loss);
            return -loss;
        } else if (chance < 35) {
            System.out.println("People ignored you today. Earned nothing.");
            return 0;
        } else {
            int earnings = 5 + random.nextInt(16);
            System.out.println("You begged on the streets and received $" + earnings);
            return earnings;
        }
    }

    @Override
    public String getJobName() {
        return "Begging";
    }
}
