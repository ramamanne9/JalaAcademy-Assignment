package javabasics1;

public class BasicClass {
	// 1.How to create a class, object, method and its signature

		public  int sum(int a , int b) {
		    return a + b;	
		}
		
		public static void main(String[] args){

	BasicClass  mn = new  BasicClass ();
	   int result = mn.sum(2 ,3);
	   System.out.println("sum"+ result);

	}
	}

