package QTechSolutionsProjects.project3;

public class Student {
    private String name;
    private int rollno;
    private int marks;
    private double attendance;
    public Student(String name, int rollno, int marks, double attendance) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        this.attendance = attendance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public double getAttendance() {
        return attendance;
    }
    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString(){
        return "name:"+name+" rollno:"+rollno+" marks:"+marks+" attendance:"+attendance+"%";
    }
}
