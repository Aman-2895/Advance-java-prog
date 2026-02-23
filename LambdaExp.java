@FunctionalInterface
interface Vote{                      
     void check(int a);
                      		
}
class Voterlist{
	void checkvoter(int a){
		if(a<18)
			System.out.println("you can not vote");
		else
			System.out.println("you can vote");
	}
}

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vote c1 = (int a)->{
			if(a<18)
				System.out.println("you can not vote");
			else
				System.out.println("you can vote");
		};
		c1.check(20);
		
	//	Voterlist vl = new Voterlist();  refrence dene ke leye onject bnana zruri h
	//	Vote v1 = vl::checkvoter;      //interface object taking refrence of another class which already lambda expression
	//	v1.check(17);                     // :: use for refrencing in java
	}
}

// practice
// Runnable r = ()->System.out.println("running thread");
// comparator<Integer> comp = (Integer a, Integer b)->a-b;
//Callable<Interger> c = ()->100;
//ActionListner a1 = (ActionEvent e)->System.out.println("Button clicked");
