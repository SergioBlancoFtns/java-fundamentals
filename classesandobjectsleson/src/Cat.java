public class Cat {
    private String color;
    private String mood;

    public Cat(String color, String mood) {
        this.color = color;
        this.mood = mood;
    }

    public String getColor() {
        return color;
    }

    public String getMood() {
        return mood;
    }

    private void changeMood(String newMood) {
        mood = newMood;
    }

    void purr(){
        System.out.println("Cat purrs");
    }

    public void makeHappy(){
        changeMood("Happy");
        purr();
    }
}
