
public class Staff extends Person{
    private String School;
    private Double Salary;

    public Staff(String name, String address, String school, Double salary){
        this.Name = name;
        this.Address = address;
        this.School = school;
        this.Salary = salary;
    }

    public void setSchool(String school){
        this.School = school;
    }

    public void setSalary(Double salary){
        this.Salary = salary;
    }

    public String getSchool(){
        return this.School;
    }

    public Double getSalary(){
        return this.Salary;
    }
}