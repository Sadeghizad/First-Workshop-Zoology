package Main;

public class Human extends Mammal implements Carnivore, Herbivore {
    private String name;
    private int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void move() {
        System.out.println(this.name + "is walking");
    }
    @Override
    public void makeSound() {
        System.out.println(this.name + "is speaking");
    }

    @Override
    public void eatMeat() {
        System.out.println(this.name + "is eating meat");
    }

    @Override
    public void eatPlants() {
        System.out.println(this.name + "is eating plants");
    }

    public void work() {
        System.out.println(this.name + "is working");
    }
}
