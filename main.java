import java.util.*;
public class main{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=in.nextLine();
		int no=name.length();
		System.out.println("Your name has "+no+" characters.");
		for(int i=0; i<no; i++){
			char a=name.charAt(i);
			System.out.println(a);
		}
	}
}
