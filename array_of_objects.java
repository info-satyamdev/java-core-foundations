class Student{
    String name;
    int roll;
    int marks;
}

public class array_of_objects {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Aaa";
        s1.roll = 1;
        s1.marks = 95;

        Student s2 = new Student();
        s2.name = "Aab";
        s2.roll = 2;
        s2.marks = 85;

        Student s3 = new Student();
        s3.name = "Aac";
        s3.roll = 3;
        s3.marks = 45;

        Student arr[] = new Student[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        for(int i=0; i<arr.length; i++){
            System.out.println("Name: " + arr[i].name);
            System.out.println("Roll: " + arr[i].roll);
            System.out.println("Marks: " + arr[i].marks);
            System.out.println();
        }
        for (int k = 0; k<arr.length; k++){
            
            System.out.println( arr[k].name + " " + arr[k].roll + " " + arr[k].marks);
        }
    }
}
