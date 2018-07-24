public class Elephant extends Animal {

    public Elephant() {
        super();
        System.out.println("Now I am a Dog!");
    }

    @Override
    public String sleep() {
        return "A Elephant sleeps...";
    }

    @Override
    public String eat() {
        return "A Elephant eats...";
    }

    public String trumpet() {
        return "trumpet...";
    }

}

