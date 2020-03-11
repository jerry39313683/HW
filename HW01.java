public class HW01{
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("A List of Cages");
        book1.setAuthor("Robin Roe");
        book1.setType("imaginary");
        book1.setDate("2017/1/4");
        book1.setPublishingHouse("Disney Hyperion");
        System.out.println(book1.getName() );
        System.out.println(book1.getAuthor() );
        System.out.println(book1.getType() );
        System.out.println(book1.getDate() );
        System.out.println(book1.getPublishingHouse() );
    }
}