package example.testgenral;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FinalTst {

	public static void main(String[] args) {
		
		final List<Integer> li=new ArrayList<Integer>();
		li.add(123);
		li.add(546);
		li.add(908);
		/*The final local variable li cannot be assigned.
		**It must be blank and not using a compound assignment*/
		//li = new LinkedList<Integer>();
		Set<Integer> set=new HashSet<Integer>(li);
		List<Integer> mainList=new ArrayList<Integer>();
		mainList.addAll(set);
		Iterator it=mainList.iterator();
		while(it.hasNext()){
			System.out.println("String:"+it.next());
		}
	}
}
