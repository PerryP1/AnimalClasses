/*
 * This is the parent class. Also called the super class
 */
    public class Animal {

        boolean isAlive;

        public Animal() {
            System.out.println("A new animal has been created!");
        }
        public String sleep() {
            return "An animal sleeps...";
        }
        public String eat() {
            return "An animal eats...";
        }
    }
