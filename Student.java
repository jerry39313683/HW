public class Student{
    private String name, id, gender, height ,personality;

    public Student() {
        System.out.println("student object has created!");
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void setId(String newId){
        this.id = newId;
    }

    public String getId(){
        return this.id;
    }

    public void setGender(String newGender){
        this.gender = newGender;
    }

    public String getGender(){
        return this.gender;
    }

    public void setHeight(String newHeight){
        this.height = newHeight;
    }

    public String getHeight(){
        return this.height;
    }

    public void setPersonality(String newPersonality){
        this.personality = newPersonality;
    }

    public String getPersonality(){
        return this.personality;
    }
}