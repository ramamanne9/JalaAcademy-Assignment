//6. Write a function to print your name and call the function from main method

package javabasics1;

public class Name {
String name = "Rama amnne";
public void myName() {
	System.out.println(name);
}
public static void main(String[] args) {
Name nm= new Name();
nm.myName();
}
}