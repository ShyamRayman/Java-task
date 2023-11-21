class DefaultConstructParameter{
	int id;
	String name;
	DefaultConstructParameter(int i,String n){
	id= i;
	name =n ;
	}
	void display(){System.out.println(id+" "+name);}

	public static void main(String args[]){
	DefaultConstructParameter  s1 = new DefaultConstructParameter(111,"shyam");
	DefaultConstructParameter  s2 = new DefaultConstructParameter(222,"yoki");
	

	s1.display();
	s2.display();
	
	}
}