package QTechSolutionsProjects.project3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students =new ArrayList<>();
    static ArrayList<Teacher> teachers =new ArrayList<>();
    public static void main(String[] args) {
        students.add(new Student("rama",1,95,93.4));
        students.add(new Student("krishna",2,96,90.4));
        students.add(new Student("hari",3,97,97.32));
        students.add(new Student("sai",4,89,78.9));
        students.add(new Student("ganesh",5,99,86.33));

        teachers.add(new Teacher("Anuradha","Telugu",7));
        teachers.add(new Teacher("Nirmala","English",8));
        teachers.add(new Teacher("Suresh","Maths",9));
        teachers.add(new Teacher("chandra","Science",10));
        Scanner s=new Scanner(System.in);
        System.out.println("=========School Management System========");
        while(true){
            System.out.println("1.View all Students");
            System.out.println("2.View all Teachers");
            System.out.println("3.view student by rollno");
            System.out.println("4.update Student");
            System.out.println("5.Delete student");
            System.out.println("6.Exit");
            System.out.println("Enter your choice: ");
            int choice=s.nextInt();
            s.nextLine();

            switch(choice){
                case 1:
                    System.out.println("All Students :");
                    for(Student st: students){
                        System.out.println(st);
                    }
                    break;

                case 2:
                    System.out.println("All Teachers:");
                    for(Teacher t: teachers){
                        System.out.println(t);
                    }
                    break;
                
                case 3:
                    System.out.println("Enter student rollno:");
                    int rollno=s.nextInt();
                    boolean found=false;
                    for(Student st:students){
                        if(st.getRollno()==rollno){
                            found=true;
                            System.out.println(st);
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Student not found!\n");
                    }
                    break;

                case 4:
                    System.out.println("Enter rollno to update student:");
                    int r=s.nextInt();
                    boolean updated=false;
                    for(Student st:students){
                        if(st.getRollno()==r){
                            System.out.println("Enter new name:");
                            st.setName(s.nextLine());
                            s.next();
                            System.out.println("Enter new marks:");
                            st.setMarks(s.nextInt());
                            System.out.println("Enter new attendence in perncentage:");
                            st.setAttendance(s.nextDouble());
                            updated=true;
                            break;
                        }
                    }
                    if(updated){
                        System.out.println("Student record updated successfully!...\n");
                    }
                    else{
                        System.out.println("Student not found!\n");
                    }
                    break;

                case 5:
                    System.out.println("Enter student rollno to delete:");
                    int rn=s.nextInt();
                    boolean f=false;
                    for(Student st:students){
                        if(st.getRollno()==rn){
                            f=true;
                            students.remove(st);
                            System.out.println("Student record deleted successfully!..\n");
                            break;
                        }
                    }
                    if(!f){
                        System.out.println("Student not found!\n");
                    }
                    break;

                case 6:
                    System.out.println("Exiting.......");
                    return;
                
            }
        }
    }
}
