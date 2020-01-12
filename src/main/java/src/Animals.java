package src;
public class Animals{
    private String name;
    public void sound(){
        System.out.println("sound...");
    }
    public void eat() {
        System.out.println(name + " eats");
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
}