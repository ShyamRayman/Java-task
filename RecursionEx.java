class RecursionEx{

	public int sum(int num){
		if(num==1){
		  return 1;
		}else{
		  return sum(num-1)+num;//recursion(call itself)
		}
	}
		
	public static void main(String args[]){
		//object creation
		RecursionEx obj = new RecursionEx();
		System.out.println(obj.sum(4));
	}
}
		