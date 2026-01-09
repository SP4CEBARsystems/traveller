package GameState;

import Builder.UIBuilder;

public class WorkingState implements IGameState {

    @Override
    public void handle(GameContext context) {
        UIBuilder builder = new UIBuilder();
        builder.reset();
        builder.addWorkTitle();
        builder.addStatDay(context.getDay());
        builder.addStatMoney(context.getMoneyContext().getTotalMoney());

        System.out.println("\n" + builder.getResult());
        System.out.println("\n--- Working ---\n");

        int earned = context.getMoneyContext().executeStrategy();

        System.out.println("\n--- Day Result ---");
        if (earned > 0) {
            System.out.println("Earned: +$" + earned);
        } else if (earned < 0) {
            System.out.println("Lost: -$" + Math.abs(earned));
        } else {
            System.out.println("Result: $0 (break even)");
        }

        System.out.println("Total Money: $" + context.getMoneyContext().getTotalMoney());

        context.incrementDay();

        try {
            System.out.println("\nPress Enter to continue to next day...");
            while (System.in.available() > 0) {
                System.in.read();
            }
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        context.setState(new InputState(context.getInputAdapter()));
    }
}
