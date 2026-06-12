import java.util.Scanner;
import java.java.util.ArrayList;
class Student{
int grade;
String name;
Student(int grade,String name){
    this.grade=grade;
    this.name=name;
}
}
public class Student{
    public static void main(String[] args){
        ArrayList<Integer> marks=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the student"+(i+1) "marks:");
            marks.add(sc.nextInt());
        

        }
        int total=0;
        int highest=marks.get(0);
        int lowest=marks.get(0);
        for(int marks:marks){

            total+=mark;
            if(mark>highest)highest=mark;
            if(marks<lowest)lowest=mark;
        }
        double average=(double)total/n;
        System.out.println("\n--- REPORT ---");
        System.out.println("Total Students:"+n);
        System.out.println("Average marks:"+average);
        System.out.println("Highest marks:"+highest);
        System.out.println("Lowest marks:"+lowest);

    }
}