//single dimensional
import java.util.Arrays;
class ArraysEx{
	public static void main(String args[]){
		
		//separate the string using String.split
  		String data = "Shyam,monica,vidhya,pavi,priya,bala,hari";//csv - comma separated value
		String name[] = data.split(","); 
		System.out.println(name);
		System.out.println(Arrays.toString(name));

		//to find equals val in two dimensional array using deepEquals() method
		int t1[][] = {{1,2},{3,4}};
		int t2[][] = {{1,2},{3,4}};
		System.out.println(Arrays.equals(t1,t2));//returns false because it is 2 dimensionals
		System.out.println(Arrays.deepEquals(t1,t2));//returns true


		int x[] = {10,2,1,8,5,6,7,8};
		int y[] = {8,7,8,9,6,5,5,4,4};
		System.out.println(x[0]);

		//Arrays.copyOf
		int z[] = Arrays.copyOf(y,5);//the var to be copy and how many length to be added

		//Arrays.sort()
		Arrays.sort(x);
		System.out.println(x[0]);
		
		//for loop
		 for(int i = 0; i <x.length;i++){
			System.out.print(x[i]);
		}
		

		//for each loop // (forward)one direction
		for(int i : x){
			System.out.println(i);
		}
		
		
		//Arrays.binarySearch()
		int find = 8;
		int result = Arrays.binarySearch(x,find);
		System.out.println(result);


		//Arrays.equals()
		boolean equals = Arrays.equals(x,y);
		System.out.println(equals);

		//Arrays.toString
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(z));
		
		
	}
}



	