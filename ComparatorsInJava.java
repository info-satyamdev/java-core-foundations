import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Students{
    int age;
    String name;
    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Student [age = " + age + ", name = " + name + "]";     
    }
}
public class ComparatorsInJava {
    public static void main(String[] args) {
        Comparator<Integer> obj = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    return 1;

                }
                else{
                    return -1;
                }
            }
        }; 
        List<Integer> lists = new ArrayList<>();
        lists.add(45);
        lists.add(75);
        lists.add(84);
        lists.add(79);
        lists.add(81);
        lists.add(43);
        Collections.sort(lists, obj);
        System.out.println(lists);    
        // lamba expression
        Comparator<Students> obj1 = (Students i, Students j) -> i.age>j.age?1:-1;               // if(i.age > j.age){
                //     return 1;
                // }
                // else{
                //     return -1;
                // }
                // ternary operator
                

        List<Students> students = new ArrayList<>();
        students.add(new Students(19, "AP"));
        students.add(new Students(21, "Sam"));
        students.add(new Students(22, "HK"));
        students.add(new Students(19, "JP"));
        students.add(new Students(22, "Gibs"));
        students.add(new Students(19, "DD"));
        Collections.sort(students, obj1);
        for(Students s: students){
            System.out.println(s);
        }
    }    
}
