import java.util.*;
 class Main
{ 
    public  static boolean prime(int rem){
    if(rem<2) return false;
	    for(int i=2 ; i*i<=rem ; i++){
	       if(rem%i==0) return false;
	      }
	     return true;
	    }
     
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    int num=in.nextInt();
	    int count=0;
	    while(num!=0){
	        int rem=num%10;
	        if(prime(rem)==true)count++;
	        num=num/10;
	    }
	    System.out.println(count);
}
}
