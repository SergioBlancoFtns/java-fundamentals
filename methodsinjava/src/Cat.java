public class Cat {
    private String mood;

    public Cat(String mood) {
        this.mood = mood;
    }

    public void meow() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("Scratch!");
    }

    private void changeMood(String newMood) {
        mood = newMood;
    }

    public void displayBehavior() {
        meow();
        scratch();
        changeMood("curious");
    }
}