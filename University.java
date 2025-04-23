//Aim: write a java program to stimulate a university system using innw=er classes 1.outer class name University with varables university name ,inner classes with name department with varable department,dept code nd method to display department detals,2.other innwe c;lass student with varables student name and roll number and a method to display student details
//3. create a main method to create objects of inner classes and display the details of university, department and student
public class University {
    private String universityName;
    private Department department;
    private Student student;
    public University(String universityName) {
        this.universityName = universityName;
    }
    public void setDepartment(String departmentName, String deptCode) {
        this.department = new Department(departmentName, deptCode);
    }
    public void setStudent(String studentName, String rollNumber) {
        this.student = new Student(studentName, rollNumber);
    }
    public void displayDetails() {
        System.out.println("University Name: " + universityName);
        if (department != null) {
            department.displayDepartmentDetails();
        }
        if (student != null) {
            student.displayStudentDetails();
        }
    }
    // Inner class Department
    class Department {
        private String departmentName;
        private String deptCode;
        public Department(String departmentName, String deptCode) {
            this.departmentName = departmentName;
            this.deptCode = deptCode;
        }
        public void displayDepartmentDetails() {
            System.out.println("Department Name: " + departmentName);
            System.out.println("Department Code: " + deptCode);
        }
    }
    // Inner class Student
    class Student {
        private String studentName;
        private String rollNumber;
        public Student(String studentName, String rollNumber) {
            this.studentName = studentName;
            this.rollNumber = rollNumber;
        }
        public void displayStudentDetails() {
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll Number: " + rollNumber);
        }
    }
    public static void main(String[] args) {
        University university = new University("Amrita Vishwa Vidyapeetham");
        university.setDepartment("Computer Science", "CSE123");
        university.setStudent("Sohail", "23319");
        university.displayDetails();
    }
