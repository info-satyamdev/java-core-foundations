import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Students implements Comparable<Students> {
    int age;
    String name;
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }
    @Override
    public int compareTo(Students that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
public class ComparableInterface {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(19, "AP"));
        students.add(new Students(21, "Sam"));
        students.add(new Students(22, "HK"));
        students.add(new Students(19, "JP"));
        students.add(new Students(22, "Gibs"));
        students.add(new Students(19, "DD"));
        Collections.sort(students);
        for (Students s : students) {
            System.out.println(s);
        }
    }
}
