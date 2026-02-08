class Student{
    String name;
    int marks;
    int roll_no;

}
public class array_objects_22{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.roll_no=50;
        s1.name="Prajwal";
        s1.marks=90;

        Student s2=new Student();
        s2.roll_no=44;
        s2.name="Rohan";
        s2.marks=40;

        Student s3 = new Student();
        s3.roll_no=12;
        s3.name="Naman";
        s3.marks=97;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        
        // for(int i =0;i<students.length;i++){
        //     System.out.println(students[i].name + " " + students[i].roll_no+" "+ students[i].marks);
        // }

        for(Student stud:students){
            System.out.println(stud.name+" "+stud.roll_no+" "+stud.marks);
        }
    }
}