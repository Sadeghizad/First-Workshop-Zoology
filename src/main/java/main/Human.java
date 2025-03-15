package main;

public class Human extends Mammal implements Carnivore, Herbivore {
    Logger logger = Logger.getLogger(this.getClass().getName());
    private String name;
    public Human(String name, int age) {
        this.name = name;
    }
    @Override
    public void move() {
        logger.info(this.name + "is walking");
    }
    @Override
    public void makeSound() {
        logger.info(this.name + "is speaking");
    }

    @Override
    public void eatMeat() {
        logger.info(this.name + "is eating meat");
    }

    @Override
    public void eatPlants() {
        logger.info(this.name + "is eating plants");
    }

    public void work() {
        logger.info(this.name + "is working");
    }
}
