package Day5_II;

class Professor{
    private int professorId;
    private String professorName;
    private String subject;

    Professor(int professorId, String professorName, String subject){
        this.professorId=professorId;
        this.professorName=professorName;
        this.subject=subject;
    }
    void displayProfessorInfo(){
        System.out.println("Professor Id: "+professorId);
        System.out.println("Professor Name: "+professorName);
        System.out.println("Subject Name :"+subject);
    }
}
class University{
    private String universityName;
    private String universityCode;

    // has a relation
    private Professor professor;
    University(String universityName, String universityCode, Professor professor){
        this.universityCode=universityCode;
        this.universityName=universityName;
        this.professor=professor;
    }
    void displayUniversityInfo() {
        System.out.println("University Name : " + universityName);
        System.out.println("University Code : " + universityCode);

        System.out.println();

        professor.displayProfessorInfo();
    }
}
public class day5 {
    public static void main(String[] args) {
        Professor p1 = new Professor(11, "Prem", "Maths");
        University u1 = new  University("GLA", "121", p1);
        p1.displayProfessorInfo();
        u1.displayUniversityInfo();
    }
}
