public class Course {
     private String courseName;
     private String code;
     private Instructor instructor;

     public Course(String courseName, String code, Instructor instructor) {
          this.courseName = courseName;
          this.code = code;
          this.instructor = instructor;
     }

     public String getCourseName() {
          return courseName;
     }

     public void setCourseName(String courseName) {
          this.courseName = courseName;
     }

     public String getCode() {
          return code;
     }

     public void setCode(String code) {
          this.code = code;
     }

     public Instructor getInstructor() {
          return instructor;
     }

     public void setInstructor(Instructor instructor) {
          this.instructor = instructor;
     }

     //course sınıfı student sınıfına bağlıdır
     public int calcAvarege(Student[] students){

          Student st4 = new Student("elif", "emre", "biyo", "biyo101", 95);

          int avarege = 0;

          for(int i = 0; i < students.length; i++){

               avarege += students[i].getNote();


          }


               return avarege / students.length;
     }
}
