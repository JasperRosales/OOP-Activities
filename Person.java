public class Person{
    protected String Name;
    protected String Address;

    public Person(){

    }

    public Person(String name, String address){
        this.Name = name;
        this.Address = address;
    }

    public void setName(String name){
        this.Name = name;
    }

    public void setAddress(String address){
        this.Address = address;
    }

    public String getName(){
        return this.Name;
    }

    public String getAddress(){
        return this.Address;
    }

    public String toString(){
        return "Hello I am " + this.Name + " and " + "I lived in " + this.Address + ".";
    }
}
