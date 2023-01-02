public class App {

    // Encapsulation (kapsülleme)
    // Inharitance (Kalıtım)
    // Polymorphism (Çok biçimlilik)
    // Abstraction (Soyutlama)
    public static void main(String[] args) throws Exception {

        Book harryPotter = new Book("Harry Potter", 500);
        Book lordOfTheRings = new Book("Lord of the Rings", 700);

        Student s1 = new Student("elif", "emre", "biyo", "biyo101", 95);

        Instructor teacher = new Instructor("elif", "emre", "biyo");

        Course mat = new Course("matematik", "mat101", teacher);

        System.out.println(mat.getInstructor().getName());


        

    }
}
