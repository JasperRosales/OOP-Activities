class Staff extends Person{
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

    @Override
    public String toString(){
        String StdText = String.format("Hello I am %s, I lived in %s. I am a Staff at %s. I have a salary of %.2f pesos", this.Name, this.Address, this.School, this.Salary );
        return StdText; 
    }
}