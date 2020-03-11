public class HW02{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Jerry");
        student1.setId("107021077");
        student1.setGender("Male");
        student1.setHeight("185");
        student1.setPersonality("Cheerful");
        System.out.println(student1.getName() );
        System.out.println(student1.getId() );
        System.out.println(student1.getGender() );
        System.out.println(student1.getHeight() );
        System.out.println(student1.getPersonality() );
    }
}