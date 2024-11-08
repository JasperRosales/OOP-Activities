public class EncapsulationExample{
    public static void main(String[] args){

        System.out.println("--------------Student-------------------");
        System.out.println();

        Student s1 = new Student();

        s1.setId(12345);
        s1.setName("Jeric Bayola");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println();

        System.out.println("----------------Book-----------------");
        System.out.println();
        Book b1 = new Book();
        b1.setAuthor("Kristine De padua");
        b1.setBookNumber(236);
        b1.setPrice(150.00);
        b1.setTitle("Si kristine ay gusto magbalik");
        System.out.println(b1.getBookNumber());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getTitle());
        System.out.println(b1.getPrice());
        System.out.println();

      


    }
}


class Student{
    private int Student_id;
    private String Name;

    public void setId(Integer s_id){
        this.Student_id = s_id;
    }

    public void setName(String s_name){
        this.Name = s_name;
    }

    public String getName(){
        return this.Name;
    }

    public Integer getId(){
        return this.Student_id;
    }

}


class Book{
    private Integer book_number;
    private String title;
    private String author;
    private Double price;

    public void setBookNumber(Integer bookNum){
        this.book_number = bookNum;
    }

    public void setTitle(String Title){
        this.title = Title;
    }


    public void setAuthor(String Author){
        this.author = Author;
    }

    public void setPrice(Double Price){
        this.price = Price;
    }

    public Integer getBookNumber(){
        return this.book_number;
    }

    public String getTitle(){
        return this.title;
    }


    public String getAuthor(){
        return this.author;
    }

    public Double getPrice(){
        return this.price;
    }

}