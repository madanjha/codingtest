package example.testgenral;

import java.util.Arrays;

public class RmvDuplicateArray {

	public static void main(String[] args) {
		int[] arr={1,1,3,2,4,1,2,3,7,5,6,8,9,10};
		int current=arr[0];
		boolean flag=false;
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++){
			if(current==arr[i]&&!flag){
			flag=true;	
			}else if(current!=arr[i]){
				current=arr[i];
				flag=false;
				System.out.println(current);
			}
		}

	}

}
