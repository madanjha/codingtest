package example.testCollection;
import java.util.*;

public class MyClass implements Comparator<MyClass>{
	int dishSize;
	public static void main(String[] args) {
		MyClass[] va = {new MyClass(40), new MyClass(200), new MyClass(66)};
	Arrays.sort(va, va[0]);
	int index = Arrays.binarySearch(va, new MyClass(40), va[0]);
	System.out.print(index +" ");
	index = Arrays.binarySearch(va, new MyClass(80), va[0]);
	System.out.print(index);

	     
	} 

	//public int compare(MyClass a, MyClass b) {
	//return b.dishSize — a.dishSize;

	 
	   
	 

	MyClass(int d) { dishSize = d; }
	
	public int compare(MyClass a, MyClass b) {
		// TODO Auto-generated method stub
		return b.dishSize-a.dishSize;
	}
}
