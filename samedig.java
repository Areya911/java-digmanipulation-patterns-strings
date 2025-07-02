import java.util.*; 
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int lastdig=num%10;
		boolean issame=true;
			while(num!=0){
		    int rem=num%10;
		    if(rem!=lastdig){
		        issame=false;
		        break;
		    }
		    num=num/10;
		}
		if(issame==true){
		    System.out.println("yes, all digits are same");
		   
		}	else{
		    System.out.println("no, all digits are not same");
		   
		}
	}
    
}