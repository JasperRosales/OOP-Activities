public class InheritanceExample {
    public static void main(String[] args){

        System.out.println("--------------Student-------------------");

        Student student1 = new Student("Mickey Jayce Biadoy", "Brgy. Yellow", "BSIT", 2);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());


        System.out.println();

        System.out.println("--------------Staff-------------------");

        Staff staff1 = new Staff("Ferrari Cedrick", "Sucol Balayan", "BSU-Balayan", 23000.00);

        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff Program: " + staff1.getSchool());
        System.out.println("Staff Year: " + staff1.getSalary());


    }
}



class Person{
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


class Student extends Person{
    private String Program;
    private Integer Year;

    public Student(String name, String address, String program, Integer year){
        this.Name = name;
        this.Address = address;
        this.Program = program;
        this.Year = year;
    }

    public void setProgram(String Program){
        this.Program = Program;
    }

    public void setYear(Integer Year){
        this.Year = Year;
    }

    public Integer getYear(){
        return this.Year;
    }

    public String getProgram(){
        return this.Program;
    }
}


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
}