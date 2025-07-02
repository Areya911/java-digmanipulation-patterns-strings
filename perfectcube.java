import java.util.Scanner;
 class MAin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int absNum = Math.abs(num); // abs(-134)=134 
        //takes negative values to get converted to positive values
        boolean isCube = false;
        for (int i = 0; i * i * i <= absNum; i++) { 
            if (i * i * i == absNum) {
                isCube = true;
                break;
            }
        }
        if (isCube) {
            System.out.println(num + " is a perfect cube.");
        } else {
            System.out.println(num + " is not a perfect cube.");
        }
    }
}

