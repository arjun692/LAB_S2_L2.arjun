public class Human {
    // Data members
    private String name;
    private int age;
    private String eye_color;
    private String hair_type;
    // Basic constructor
    public Human(String name, int age, String eye_color, String hair_type) {
        this.name = name;
        this.age = age;
        this.eye_color =  eye_color;
        this.hair_type = hair_type;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getEyeColor(){
        return eye_color;

    }
    public String getHairType(){
        return hair_type;

    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = (age > 0) ? age : 1; // Ensure the age is positive
    }
    public void setEyeColor(String eye_color) {
        this.eye_color = eye_color;
    }
    public void setHairType(String hair_type){
        this.hair_type = hair_type;
    }
    // Custom method
    public void talk(String message) {
        System.out.println(name + " says: " + message);
    }
    public void drive(String destination){
        System.out.println(name + " is driving to " + destination);
    }
}

