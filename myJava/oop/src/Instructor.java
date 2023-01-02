public class Instructor {
     private String name;
     private String surname;
     private String departmant;

     public Instructor(String name, String surname, String departmant) {
          this.name = name;
          this.surname = surname;
          this.departmant = departmant;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getSurname() {
          return surname;
     }

     public void setSurname(String surname) {
          this.surname = surname;
     }

     public String getDepartmant() {
          return departmant;
     }

     public void setDepartmant(String departmant) {
          this.departmant = departmant;
     }
}
