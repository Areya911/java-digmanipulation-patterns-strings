import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int product;
		int sum=0;
		while(a!=0){
		    int rem=a%10;
		    product=1;
		    for(int i=1;i<=rem;i++){ 
		      product*=i;
		    }
		    sum+=product;
		    a=a/10;
		}
		System.out.println(sum);
	}
}
