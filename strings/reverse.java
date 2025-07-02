package strings;
import java.util.*;
class inp{
public static void main(String[] args){
    Scanner in=new Scanner(System.in);

    String s=in.nextLine();
    s= new StringBuilder(s).reverse().toString();
    System.out.println(s);
}
}
