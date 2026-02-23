import java.util.ArrayList;
//encapsulation is programming approach in which we set members as pvt and have getter setter to read and write the value of that member
// use for 
class student {
    private String name;
    private String course;
    private int id;

    public student(String name, String course, int id) {
        this.name = name;
        this.course = course;
        this.id = id;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
}

public class encap {

    public static void main(String[] args) {

        ArrayList<student> li = new ArrayList<>();

        student s1 = new student("Student1", "MCA", 1);
        student s2 = new student("Student2", "MCA", 2);
        student s3 = new student("Student3", "MCA", 3);
        student s4 = new student("Student4", "MCA", 4);
        student s5 = new student("Student5", "MCA", 5);

        li.add(s1);
        li.add(s2);
        li.add(s3);
        li.add(s4);
        li.add(s5);

        System.out.println("Student ID\tName\t\tCourse");

        for (student s : li) {
            String result = String.format("%10d\t%-10s\t%s",
                    s.getId(), s.getName(), s.getCourse());

            System.out.println(result);   // ⭐ THIS WAS MISSING
        }
    }
}

//what are four main principle of oop
//how does oop differ from procedural programming
// why is oop considered benificail for large scale s/w development
//copy constructor //clone object 
//static final this super keyword
// constructor chaining - calling constructor into constructor 
//  
