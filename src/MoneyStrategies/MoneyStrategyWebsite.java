package MoneyStrategies;

import java.util.Random;

public class MoneyStrategyWebsite implements IMakeMoneyStrategy {
    private Random random = new Random();
    private int trafficLevel = 1;

    @Override
    public int earnMoney() {
        int chance = random.nextInt(100);

        if (chance < 12) {
            int loss = 40 + random.nextInt(41);
            if (trafficLevel > 1) {
                trafficLevel--;
                System.out.println("Website got hacked! Security fix cost $" + loss + ". Traffic dropped!");
            } else {
                System.out.println("Website got hacked! Security fix cost $" + loss);
            }
            return -loss;
        } else if (chance < 22) {
            int loss = 25 + random.nextInt(26);
            System.out.println("Server crashed! Hosting and repair costs: $" + loss);
            return -loss;
        } else if (chance < 32) {
            int loss = 15 + random.nextInt(16);
            System.out.println("Domain renewal and maintenance fees: $" + loss);
            return -loss;
        } else {
            int baseEarnings = 30 + random.nextInt(51);
            int bonus = trafficLevel * (5 + random.nextInt(15));
            int total = baseEarnings + bonus;

            System.out.println("Website ad revenue (Traffic Level " + trafficLevel + "): $" + total);

            if (random.nextInt(100) < 30) {
                trafficLevel++;
                System.out.println("Your website traffic increased!");
            }

            return total;
        }
    }

    @Override
    public String getJobName() {
        return "Website Development";
    }
}
