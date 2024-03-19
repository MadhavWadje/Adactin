package Corejava;
  
public class practice {
	int b=20;
    static int empid=100;
	int a=10;
	public void madhav() {
	System.out.println("madhav executed");
	System.out.println("a="+a+"---local");
	}
	public void wadje() {
		System.out.println("wadje executed");
		System.out.println("b="+b+"---instance var");
		System.out.println("empid="+empid+"---static var");
		System.out.println("--------------------------------------------");
	}
public static void main(String args[]) {
	  int m=10;
		if(m>=5) {
			System.out.println("if print");
		
		if (m%2==0){
			System.out.println("even");
			System.out.println("------------------------------------");
		}
		else {
			System.out.println("odd");
		}
		}
		else {
			System.out.println("else");
		}
		
		int w=10;
		while(w<20) {
			System.out.println(w);
			w++;
			System.out.println("------------------");
		}
		
		int z=10;
		do {
			System.out.println(z);
			z++;
		}
		while(z<=15);
		
		for(int i=1; i<=10; i++) {
		System.out.println(i);
		}
		
	
System.out.println("Hello");
practice s=new practice();
s.madhav();
s.wadje();


}
}
