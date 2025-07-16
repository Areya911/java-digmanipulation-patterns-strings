import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int absNum = Math.abs(num); 
        boolean square = false;
        for (int i = 0; i * i <= absNum; i++) { 
            if (i * i == absNum) {
                square = true;
                break;
            }
        }
        if (square) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
}
// class Solution {
//     public boolean isPerfectSquare(int num) {
//         double root = Math.sqrt(num);
//         return (root/(int)root == 1);
//     }}
