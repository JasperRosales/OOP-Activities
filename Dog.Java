
import java.util.ArrayList;
import java.util.List;

public class Dog implements DogInterface{
    public String name;
    public Boolean isMale;
    public Integer numberOfPuppies;
    public List<Dog> listOfPuppies = new ArrayList<>();
    
    @Override
    public Dog setName(String dogname) {
        this.name = dogname;
        return this;
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

    //Just to insert an array/list of dogs to the Attribute
    public Dog setListOfPuppies(Dog[] puppies){
        for(int i = 0; i < this.numberOfPuppies; i++){
            this.listOfPuppies.add(puppies[i]);
        }
        return this;
    }

    public Dog showPuppies(){
        System.out.print("List of puppies of " + this.name + ": {");
        for(int i = 0; i < this.numberOfPuppies;i++){
            System.out.print(" (" + this.listOfPuppies.get(i).name + ") ");
        }
        System.out.print("}\n");
        return this;
    }




}
