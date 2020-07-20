
package objectequality;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int grade;

    public Student() {
    }

  
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
//    @Override
//    public boolean equals(Object obj){
//        if(obj ==null){
//            return false;
//        }
//        Student other = (Student)obj;
//        //An to onoma pou me kalei einai to idio me tou obj 
//        //kai h hlikia tou this einai idia me tou obj
//        //kai o vathmos tou this einai idios me tou obj
//        //tote epestrepse true
//        boolean areNamesEqual =  this.name.equals(other.name);
//        boolean areAgesEqual = this.age == other.age;
//        boolean areGradesEqual = this.grade == other.grade;
//        if(areNamesEqual && areAgesEqual && areGradesEqual){
//            return true;
//        }else{
//            return false;
//        } 
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.age;
        hash = 59 * hash + this.grade;
        return hash;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.grade != other.grade) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
