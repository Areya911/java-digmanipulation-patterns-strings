import java.util.Scanner;
public class FreqofeachDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        int[] freq= new int[10]; //stores 0-9
        while(num!=0){
            int rem=(int)num%10;
            freq[rem]++;
            num=num/10;
        }
         for(int i=0;i<10;i++){
             System.out.printf("frequency of %d : %d\n",i,freq[i]);
         }
        
    }
}
