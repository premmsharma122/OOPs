public class day1{
    class Person{
        private String name;
        private int age;
        Person(String name , int age){
            this.name =name;
            this.age =age;
        }
        void displayInfo(){
            System.out.println(name);
            System.out.println(age);
        }
    }
    class Student extends Person{
        private int rollno;
        private String branch;
        Student(int rollno, String branch, String name, int age){
            super(name,age);
            this.rollno=rollno;
            this.branch=branch;
        }
        void displayStudentInfo(){
            displayInfo();
            System.out.println(rollno);
            System.out.println(branch);
        }
    }
    public static void main(String args[]){
        day1 obj = new day1();
        Student s1 = obj.new Student(49,"CSE","Prem_Sharma",21);
        s1.displayStudentInfo();
        Student s2 = obj.new Student(21, "CSE", "Dev", 19);
        s2.displayInfo();


        
    }
}