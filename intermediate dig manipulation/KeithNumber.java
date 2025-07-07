import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a = in.nextInt();
		int temp=a;
		int sum1=0;
		ArrayList<Integer> digits = new ArrayList<>();
		while(temp!=0) {
			int rem = temp%10;
		    digits.add(0,rem); // stores at 0th index and shifts to right as new elemnts come
//For 197:
// temp = 197 → 197 % 10 = 7 → insert at front → [7]
// temp = 19 → 19 % 10 = 9 → insert at front → [9, 7]
// temp = 1 → 1 % 10 = 1 → insert at front → [1, 9, 7]
			temp=temp/10;
		}
		int n=digits.size();
		while(true){
		    for(int i=0;i<n;i++){
		        sum1+=digits.get(i);
		    }
		    if(sum1==a){
		        System.out.println("Keith number");
		        break;
		    }
		    if(sum1>a){
		        System.out.println("Keith number");
		        break;
		    }
		    digits.remove(0); // removes first element
		    digits.add(sum1);  //appends the  sum to last of the list
//  1, 9, 7  
// 1+9+7 = 17   
// 9+7+17 = 33   //1 removed and 17 added to last of list
// 7+17+33 = 57  //9 removed and 33 added to last of list
// 17+33+57 = 107  //7 removed and 57 added to last of list
// 33+57+107 = 197 ← match! ✅

		    
		}
	}
}