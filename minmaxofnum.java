import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int maxdig=0;
		int mindig=9;
		 // Handle 0 explicitly
        if (num == 0) {
            maxdig = 0;
            mindig = 0;
        }
		while(num!=0) {
			int rem=num%10;
			if(rem>maxdig) {
				maxdig=rem;
			}
			if (rem<mindig) {
				mindig=rem;
			}
			num=num/10;
		}
		System.out.println("max digit:"+maxdig);
			System.out.println("min digit:"+mindig);
	}
}
