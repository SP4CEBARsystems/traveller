package MoneyStrategies;

import java.util.Random;

public class MoneyStrategyLemonade implements IMakeMoneyStrategy {
    private Random random = new Random();

    @Override
    public int earnMoney() {
        int chance = random.nextInt(100);

        if (chance < 15) {
            int loss = 25 + random.nextInt(26);
            System.out.println("Rainy day! No customers. Supply costs: $" + loss);
            return -loss;
        } else if (chance < 25) {
            int loss = 15 + random.nextInt(16);
            System.out.println("Health inspector fined you for no permit! Lost $" + loss);
            return -loss;
        } else if (chance < 35) {
            int loss = 10 + random.nextInt(11);
            String[] badWeather = {"stormy", "freezing cold", "too hot"};
            String today = badWeather[random.nextInt(badWeather.length)];
            System.out.println("Weather was " + today + "! Spoiled supplies cost $" + loss);
            return -loss;
        } else {
            int earnings = 20 + random.nextInt(61);
            String[] weather = {"sunny", "cloudy", "partly cloudy", "warm"};
            String today = weather[random.nextInt(weather.length)];
            System.out.println("Lemonade stand on a " + today + " day! Earned $" + earnings);
            return earnings;
        }
    }

    @Override
    public String getJobName() {
        return "Lemonade Stand";
    }
}
