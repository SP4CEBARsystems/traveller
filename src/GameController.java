public class GameController {
    // when "do this"         (used as the client of the InputAdapter)
    // set and use strategy   (also the client of strategies)
    // draw UI                (Controls the builder)

    UIBuilder bunnyBuilder = new UIBuilder();
        bunnyBuilder.addBunnyEars();
        bunnyBuilder.addMenuOptions();
        bunnyBuilder.addMenuStats();
        System.out.printf(bunnyBuilder.getResult() + "\n\n");

    UIBuilder catBuilder = new UIBuilder();
        catBuilder.addCatEars();
        catBuilder.addCatFace();
        catBuilder.addCatFeet();
        System.out.printf(catBuilder.getResult() + "\n\n");

    UIBuilder birdBuilder = new UIBuilder();
        birdBuilder.addBirdEars();
        birdBuilder.addBirdFace();
        birdBuilder.addBirdFeet();
        System.out.printf(birdBuilder.getResult() + "\n\n");

    UIBuilder pigBuilder = new UIBuilder();
        pigBuilder.addPigEars();
        pigBuilder.addPigFace();
        pigBuilder.addPigFeet();
        System.out.printf(pigBuilder.getResult() + "\n\n");
}
