interface Exam{
    void percentage();
}
class Student{
    String name;                                                                                          
    int rollno;
    int[] marks=new int[5];
    int totalmarks;
    Student(String name,int rollno,int[] marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
        for(int i=0;i<5;i++){
            this.totalmarks+=this.marks[i];
        }
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("Total Marks: "+totalmarks);
    }
}
class Result extends Student implements Exam{
    double per;
    Result(String name,int rollno,int[] marks){
        super(name,rollno,marks);
    }
    public void percentage(){
        per=(double)totalmarks/5;
    }
    void display(){
        super.display();
        System.out.printf("Percentage: %.2f%%\n", per);
    }
}
public class Lab5a {
    public static void main(String[] args) {
        int[] marks={85,90,78,92,88};
        Result r=new Result("Pranav", 314, marks);
        r.percentage();
        r.display();
    }
    
}
