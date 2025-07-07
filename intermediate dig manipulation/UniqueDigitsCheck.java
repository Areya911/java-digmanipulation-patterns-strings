import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a = in.nextInt();
		int check=-1;
		boolean[] digits=new boolean[10]; //stores 0-9 with default 'false' value
		boolean check=true;
		while(a!=0) {
			int rem = a%10;
			if(digits[rem]==true) {
				check=false;
				break;
			}
			digits[rem]=true;
			a=a/10;
		}
		if (check==true) System.out.println("all  digits are unique");
		else System.out.println("not unique digits");
	}
}