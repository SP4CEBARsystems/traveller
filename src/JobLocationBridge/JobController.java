package JobLocationBridge;
import MoneyStrategies.IMakeMoneyStrategy;

import java.util.concurrent.ThreadLocalRandom;


public class JobController {
    public IAmACity city;

    IAmACity[] cities = {
        new Middelburg(),
        new Ritthem(),
        new Zoutelande(),
        new Amsterdam()
    };

    public JobController() {
        this.randomizeCity();
    }

    public void randomizeCity() {
        int random = ThreadLocalRandom.current().nextInt(0, 4);
        this.city = cities[random];
    }

    public String getCityName() {
        return this.city.getName();
    }

    public String getCityDescription() {
        return this.city.getDescription();
    }

    public IMakeMoneyStrategy[] getAvailableJobs() {
        IMakeMoneyStrategy[] jobs = this.city.getJobs();
        return jobs;
//        for (IMakeMoneyStrategy job : jobs) {
//            System.out.println(job.getJobName());
//        }
    }

    public int getAvailableJobCount() {
        return this.city.getJobCount();
    }
}
