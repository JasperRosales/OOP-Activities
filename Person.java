public class Person{
    protected String Name;
    protected String Address;

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
}