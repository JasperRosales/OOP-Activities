public class Book {
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
