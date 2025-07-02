import java.util.*; //count num of digits
class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	int temp=num;
	int ct=0;
	while(num!=0){
	    ct+=1;
	    num=num/10;
	} 
	System.out.printf("the num of digits in the number %d:%d",temp ,ct);
	}
}
