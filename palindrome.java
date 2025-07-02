
import java.util.*; //palindrome check
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println("yes its a palindrome");
		}
		else {
			System.out.println("no, not a palindrome");
		}
	}
}