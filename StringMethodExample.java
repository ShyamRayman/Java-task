class StringMethodExample{
	public static void main(String args[]){
		String value = "Batch 20 is toxic";
		String val = "		Welcome		";
		System.out.println(value.contains("toxic"));
		System.out.println(value.concat("By birth"));
		System.out.println(value.equals("Batch 20 is toxic"));
		System.out.println(value.equalsIgnoreCase("batch 20 is toxic"));
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());
		System.out.println(value.length());
		System.out.println("charAt(): " + value.charAt(4));

		//compareTo() returns the lexicographic positive value if it contains any term that has been available in the variable
		System.out.println("compareTo(): " + value.compareTo(val));

		//compareToIgnoreCase() returns the lexicographic zero value if the variables are same
		System.out.println("compareToIgnoreCase(): " + value.compareToIgnoreCase(val));
 
		System.out.println("compareTo(): " + value.compareTo("hello"));

		//indexof() returns the value of specified char
		System.out.println("indexof(): " + value.indexOf('s'));

		//isEmpty() method checks method checks whether the given variable is empty or not
		System.out.println("replace(): " + value.replace("toxic","Not Bad"));

		//substring() methods return a part of string by getting start and end of a string
		System.out.println("substring(): " + value.substring(3,11));

		//trim() methods removes the starting and ending spaces of a string.
		System.out.println(val);
		System.out.println("trim(): " + val.trim());

		//returns the index of last occurence of the given character
		System.out.println("lastIndexof(): " + value.lastIndexOf('i'));

		//hashcode() return the key from the hash table which hold variable as values
		System.out.println("hashCode(): "+value.hashCode());

		//format() changes the given input int the specified format
		System.out.println("format(): " + value.format("%x",5));//d,x,s

		//join() method si used to set delimiter and join the parameterized values
		System.out.println("join(): " + String.join("*","kareem","bala","moni"));
		System.out.println("replaceAll(): "+value.replaceAll("i","y"));
}
}
		

		