import java.util.*; //product of digits
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int product=1;
		while(num!=0){
		    int rem=num%10;
		    product*=rem;
		    num=num/10;
		}
		System.out.println(product);
	}
	
}