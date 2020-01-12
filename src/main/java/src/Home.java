package src;
import java.util.*;
public class Home{
    ArrayList<Animals> pets = new ArrayList<>();
    public void adoptPet(Animals pet){
        pets.add(pet);
    }
    public void makeAllSounds(){
        for(Animals a: pets){
            a.sound();
        }
    }
}