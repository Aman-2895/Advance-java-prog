package abc;

public class MainVar {
   public static void main(String[] args) {
	   int a=10;
	   // initialisation is must
	   // not initialised by null data type is must
	   var b =20;
	   var name = "Aman";                   // local variable type infrance
	   String name1 = new String("this is string");
	   var name2 = new String("this is string with var");
	   
	   int []arr = {1,2,3,4,5};
	   for( var nums: arr) {
		   System.out.println(nums);
	   }
	   
   }
}
