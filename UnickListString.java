package example.testgenral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnickListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        List<String> initialList = Arrays.asList("eBay", "paypal", "google", "eBay", "google", "paypal");
	        System.out.printf("\nInitial list: %s%n", initialList);
	        sortList(initialList);
	    }
	 
	    public static void sortList (List<String> myList){
	        Set<String> hashsetList = new HashSet<String>(myList);
	        System.out.printf("\nUnique values using HashSet: %s%n", hashsetList);
	 
	        Set<String> treesetList = new TreeSet<String>(myList);
	        System.out.printf("\nUnique values using TreeSet - Sorted order: %s%n", treesetList);
	    }

}
