package JobLocationBridge;
import MoneyStrategies.IMakeMoneyStrategy;

import java.util.concurrent.ThreadLocalRandom;


public class JobController {
    IAmACity city;

    IAmACity[] cities = {
        new Middelburg(),
        new Ritthem(),
        new Zoutelande(),
        new Amsterdam()
    };

    JobController () {
        this.randomizeCity();
    }

    public void randomizeCity() {
        int random = ThreadLocalRandom.current().nextInt(0, 4);
        this.city = cities[random];
    }

    public void showAvailableJobs() {
        IMakeMoneyStrategy[] jobs = this.city.getJobs();
        for (IMakeMoneyStrategy job : jobs) {
            System.out.println(job.getJobName());
        }
    }

    public int getAvailableJobCount() {
        return 0;
    }

    public void chooseJob(int choice) {
        return;
    }
}
