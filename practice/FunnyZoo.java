class Animal {
    private String name;  
    public Animal(String name) {  
        this.name = name;
    }

    public String getName() {  
        return name;
    }

    public void setName(String name) {  
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}


abstract class Bird extends Animal {  
    public Bird(String name) {
        super(name);
    }

    public abstract void fly();  
}




class Penguin extends Bird {  

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " tries to fly but waddles instead. Penguins can't fly!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " goes 'Noot noot!'");
    }
}


class Parrot extends Bird { 

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies high in the sky!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says 'Polly wants a cracker!'");
    }
}



public class FunnyZoo {

    public static void main(String[] args) {
        Animal penguin = new Penguin("Pingu");
        Animal parrot = new Parrot("Polly");

        penguin.makeSound();
        ((Bird) penguin).fly();

        parrot.makeSound();
        ((Bird) parrot).fly();

        System.out.println("\nLet's change Polly's name using encapsulation!");

        parrot.setName("Captain Flint");
        parrot.makeSound();
    }
}

















