public  class ques3{
	//You expected to store the characters in a character array , you need to reversely print the contents in the Array.
	public static void main(String args[]){
		String name="abcdefghi";
		char Array[] = name.toCharArray();
		for(int i=0; i<Array.length; i++){
			System.out.println(Array[Array.length-i-1]);
		
	}
}
}