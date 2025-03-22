package main;

public class Cat extends Mammal implements Carnivore {
    Logger logger = Logger.getLogger(this.getClass().getName());
    private String name;
    private int age;
    private int species;
    public Cat(String name, int age, int species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSpecies() {
        return species;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSpecies(int species) {
        this.species = species;
    }
    @Override
    public void move() {
        logger.info(this.name + "is moving");
    }
    @Override
    public void makeSound() {
        logger.info(this.name + "is mewing");
    }

    @Override
    public void eatMeat() {
        logger.info(this.name + "is hunting for meat");
    }
}
