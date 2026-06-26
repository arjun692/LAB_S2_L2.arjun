public class Main {
    public static void main(String[] args) {
        // Create a new Human instance
        Human person = new Human("John Doe", 30, "blue", "straight");
        Student student = new Student(2, "Inglewood");

        // Using the getter methods
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", eye color is " + person.getEyeColor() + ", hair type is " + person.getHairType() + ".");
        System.out.println("Time studying was " + student.getStudyTime() + " hours. " + "They go to " + student.getsSchool());
        
        // Using the setter methods
        person.setName("Jane Doe");
        person.setAge(28);

        // Invoking the custom method
        person.talk("Hello, world!");
        person.drive("McDonalds.");
    }
}
