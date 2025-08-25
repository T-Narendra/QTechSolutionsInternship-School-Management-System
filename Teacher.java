package QTechSolutionsProjects.project3;

public class Teacher {
    private String tName;
    private String tSubject;
    private int classTeacher;
    public Teacher(String tName, String tSubject, int classTeacher) {
        this.tName = tName;
        this.tSubject = tSubject;
        this.classTeacher = classTeacher;
    }
    public String gettName() {
        return tName;
    }
    public void settName(String tName) {
        this.tName = tName;
    }
    public String gettSubject() {
        return tSubject;
    }
    public void settSubject(String tSubject) {
        this.tSubject = tSubject;
    }
    public int getClassTeacher() {
        return classTeacher;
    }
    public void setClassTeacher(int classTeacher) {
        this.classTeacher = classTeacher;
    }
    @Override
    public String toString(){
        return "Teacher name:"+tName+" Subject:"+tSubject+" class teacher of:"+classTeacher;
    }
}
