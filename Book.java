public class Book{
    private String name, author, type, date ,publishingHouse;

    public Book() {
        System.out.println("book object has created!");
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setType(String newType){
        this.type = newType;
    }

    public String getType(){
        return this.type;
    }

    public void setDate(String newDate){
        this.date = newDate;
    }

    public String getDate(){
        return this.date;
    }

    public void setPublishingHouse(String newPublishingHouse){
        this.publishingHouse = newPublishingHouse;
    }

    public String getPublishingHouse(){
        return this.publishingHouse;
    }
}