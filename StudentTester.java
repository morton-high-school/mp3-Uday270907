public class StudentTester{
    public static void main(String[] args){
        Student uday = new Student("Uday");
        
        Student.addStudents(50);
        System.out.println(Student.getStudentCount());

        uday.addGrade(4);
        uday.addGrade(2);
        System.out.println(uday.getGPA());

        Teacher zeller = new Teacher("Zeller", "He teaches the best");
        Teacher beard = new Teacher("Beard", "She's fun");
        uday.setFavoriteTeacher(zeller);
        System.out.println(uday.getFavoriteTeacher().getName());
        uday.setFavoriteTeacher(beard);
        System.out.println(uday.getFavoriteTeacher().getName());
    }
}