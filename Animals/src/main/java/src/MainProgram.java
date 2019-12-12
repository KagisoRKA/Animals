package src;
import java.util.*;
public class MainProgram{
    public static void main(String[] args){
        Home home = new Home();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        home.adoptPet(dog1);
        home.adoptPet(cat1);
        home.makeAllSounds();
    }
}
