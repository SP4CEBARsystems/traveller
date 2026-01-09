package StrategySingleton;

import MoneyStrategies.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StrategyManager {
    private static StrategyManager instance;
    private List<IMakeMoneyStrategy> availableStrategies;
    private Random random;

    private StrategyManager() {
        random = new Random();
        availableStrategies = new ArrayList<>();
        initializeStrategies();
    }

    public static StrategyManager getInstance() {
        if (instance == null) {
            instance = new StrategyManager();
        }
        return instance;
    }

    private void initializeStrategies() {
        availableStrategies.add(new MoneyStrategyJob());
        availableStrategies.add(new MoneyStrategyBeg());
        availableStrategies.add(new MoneyStrategyGamble());
        availableStrategies.add(new MoneyStrategyInvest());
        availableStrategies.add(new MoneyStrategyLemonade());
        availableStrategies.add(new MoneyStrategyWebsite());
    }

    public List<IMakeMoneyStrategy> getAllStrategies() {
        return new ArrayList<>(availableStrategies);
    }

    public List<IMakeMoneyStrategy> getRandomStrategies(int count) {
        List<IMakeMoneyStrategy> selected = new ArrayList<>();
        List<IMakeMoneyStrategy> pool = new ArrayList<>(availableStrategies);

        int actualCount = Math.min(count, pool.size());

        for (int i = 0; i < actualCount; i++) {
            int index = random.nextInt(pool.size());
            selected.add(pool.remove(index));
        }

        return selected;
    }

    public IMakeMoneyStrategy getStrategyByIndex(int index) {
        if (index >= 0 && index < availableStrategies.size()) {
            return availableStrategies.get(index);
        }
        return null;
    }

    public int getStrategyCount() {
        return availableStrategies.size();
    }
}
