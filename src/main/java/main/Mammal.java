package main;

public abstract class Mammal implements Creature {
    Logger logger =  Logger.getLogger(getClass().getName());
    public abstract void move();
    public abstract void makeSound();
    @Override
    public void live() {
        logger.info("Mammal is live");
    }
}
