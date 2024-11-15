public class EncapsulationSample{
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
