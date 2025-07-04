import java.util.Arrays;
import java.util.Scanner;
class RearrangeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String numstr = sc.next();
        System.out.print("Enter asc/desc:");
        String str = sc.next().toLowerCase();
        char[] digits=numstr.tocharArray();
        Arrays.sort(digits);
        if(str=='desc'){ //gives desceneding sort
            for(int i=0;int j=digits.length();i<j;i++,j--){
                char temp=digits[i];
                digits[i]=digits[j];
                digits[j]=temp;
            }
        }

        
        // new string(array_name)-convert a char[] (character array) into a String.
        System.out.print(new String(digits)); 
    }
}