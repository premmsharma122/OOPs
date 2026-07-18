// public class day1{
//     class Person{
//         private String name;
//         private int age;
//         Person(String name , int age){
//             this.name =name;
//             this.age =age;
//         }
//         void displayInfo(){
//             System.out.println(name);
//             System.out.println(age);
//         }
//     }
//     class Student extends Person{
//         private int rollno;
//         private String branch;
//         Student(int rollno, String branch, String name, int age){
//             super(name,age);
//             this.rollno=rollno;
//             this.branch=branch;
//         }
//         void displayStudentInfo(){
//             displayInfo();
//             System.out.println(rollno);
//             System.out.println(branch);
//         }
//     }
//     public static void main(String args[]){
//         day1 obj = new day1();
//         Student s1 = obj.new Student(49,"CSE","Prem_Sharma",21);
//         s1.displayStudentInfo();
//         Student s2 = obj.new Student(21, "CSE", "Dev", 19);
//         s2.displayInfo();


        
//     }
// }
public class day1 {

    class Person {
        private String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public boolean isAdult() {
            return age >= 18;
        }

        void displayInfo() {
            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);
        }
    }

    class Student extends Person {

        private int rollNo;
        private String branch;

        Student(int rollNo, String branch, String name, int age) {
            super(name, age);
            this.rollNo = rollNo;
            this.branch = branch;
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }

        public String getBranch() {
            return branch;
        }

        void displayStudentInfo() {
            displayInfo();
            System.out.println("Roll No : " + rollNo);
            System.out.println("Branch  : " + branch);
            System.out.println("Adult   : " + (isAdult() ? "Yes" : "No"));
            System.out.println("-----------------------------");
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", branch='" + branch + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        day1 obj = new day1();

        Student s1 = obj.new Student(49, "CSE", "Prem Sharma", 21);
        Student s2 = obj.new Student(21, "CSE", "Dev", 19);

        s1.displayStudentInfo();
        s2.displayStudentInfo();

        // Updating branch
        s2.setBranch("AI & ML");

        System.out.println("After Branch Update:");
        s2.displayStudentInfo();

        // Demonstrating toString()
        System.out.println(s1);
        System.out.println(s2);
    }
}