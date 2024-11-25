public class Student{
    
    private static int students = 0;
    
    private String name;
    private double gpa;
    private int id;
    private Teacher faveTeacher;
    private int gradeCount;

    public Student(String name){
        this.name = name;
        this.id = students;
        students++;
        gradeCount = 0;
    }

    public static void addStudents(int num){
        students += num;
    }

    public static int getStudentCount(){
        return students;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public void addGrade(double grade){
        if(gradeCount == 0){
            gpa = grade;
        }else{
            gpa += grade;
        }
        gradeCount++;
    }

    public double getGPA(){
        return gpa / gradeCount;
    }

    public void setFavoriteTeacher(Teacher a){
        faveTeacher = new Teacher(a.getName(), a.getReason());
    }

    public Teacher getFavoriteTeacher(){
        return faveTeacher;
    }
}
