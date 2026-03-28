package advance;
import java.util.*;
import java.util.stream.Stream;
class Employe{
	String name;
	String dept;
	public Employe(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
}
public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Employe> list = new ArrayList<Employe>();
        list.add(new Employe("Aman","CS"));
        list.add(new Employe("Anmol","CS"));
     //   List<Employe> n = list.stream().toList().map(emp->emp.name).toList();
        
        
	}

}
