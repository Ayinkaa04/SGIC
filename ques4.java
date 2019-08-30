import java.util.Scanner;

public class ques4{
  public static void main(String[] args) {
	  String org,rev="";
	  
	Scanner Object = new Scanner (System.in);
	System.out.print("Enter the word: ");
       org = Object.nextLine();
		 int length=org.length();
		 
		 for(int i=length-1; i>=0; i--){
				rev=rev+org.charAt(i);
				
				
		 }
				if(org.equals(rev)){
					System.out.println("The word   "+org+ "   is palindrome ");
				}
				else{
					
					System.out.println("The word   "+org+ "   is not palindrome ");
					
				}	 
	
		
	}
	
}