package Builder;

import java.util.ArrayList;
import java.util.List;

public class UIBuilder {
    String title = "";
    List<String> stats = new ArrayList<>();
    List<String> options = new ArrayList<>();

    public void addIntermissionTitle(int day){
        this.title = "Day " + day;
    }

    public void addMenuTitle(){
        this.title = "Menu";
    }

    public void addTravelTitle(){
        this.title = "Travel";
    }

    public void addWorkTitle(){
        this.title = "Work";
    }

    public void addStatDay(int stat){
        this.stats.add("day: " + stat);
    }

    public void addStatLocation(String stat){
        this.stats.add("location: " + stat);
    }

    public void addStatMoney(int stat){
        this.stats.add("money: " + stat);
    }

    public void addStatOccupation(int stat){
        this.stats.add("occupation: " + stat);
    }

    public void addStatProduce(int stat){
        this.stats.add("produce: " + stat);
    }

    public void addMenuOptions(String stat){
        this.options.add((this.options.size() + 1) + ". " + stat);
    }

    public void addJobOption(String jobName){
        this.options.add((this.options.size() + 1) + ". " + jobName);
    }

    public void reset(){
        this.title = "";
        this.stats.clear();
        this.options.clear();
    }

    public String getResult(){
        String joinedStats = String.join(" - ", stats);
        String joinedOptions = String.join("\n", options);
        return this.title + "\n" + joinedStats + "\n" + joinedOptions;
    }
}
