class Student{
    private int studentId;
    private String studentName;

    Student(int studentId, String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    void displayStudentInfo(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Id :"+studentId);
    }

}
class Course{
    private int courseId;
    private String courseName;

    Course(int courseId, String courseName){
        this.courseId=courseId;
        this.courseName=courseName;
    }
    void displayCourseInfo(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Cousre Id: "+courseId);
    }

}
class Enrollment{
    private Student student;
    private Course course;

    Enrollment(Student student, Course course){
        this.student = student;
        this.course=course;
    }
    void enrollStudent(){
        System.out.println("Student Enroll Successfully!");
    }
    void displayEnrollment(){
        student.displayStudentInfo();
        System.out.println();
        course.displayCourseInfo();
    }
}
public class day6{
    public static void main(String args[]){
        Student s1 = new Student(1, "Prem");
        Course c1 = new Course(12, "Btech");
        Enrollment e1 = new Enrollment(s1, c1);
        e1.enrollStudent();
        e1.displayEnrollment();
    }
}