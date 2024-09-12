

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Dog implements DogInterface{
    public String name;
    public Boolean isMale;
    public Integer numberOfPuppies;
    public String[] lsitOfPuppies;
    
    @Override
    public String setName(String dogname) {
        return this.name = dogname;
    }

    public String showName() {
        return this.name;
    }

    @Override
    public void bark() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public Integer setNumberOfPuppies(Integer numofpuppies) {
        return this.numberOfPuppies = numofpuppies;
    }

    @Override
    public String showNumberOfPuppies() {
        return "Number of puppies: " + this.numberOfPuppies;
    }
    
    public  String[] setListOfPuppies(String[] puppies){
        return this.lsitOfPuppies = puppies;
    }
    

    public void showPuppies(){
        for(int i = 0; i < this.numberOfPuppies; i++ ){
            System.out.println(lsitOfPuppies[i]);
        }
    }
}
