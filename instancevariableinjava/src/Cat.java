public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void displayInfo(){
        System.out.println(this.name + " is " + this.age + " year(s) old");
    }
}