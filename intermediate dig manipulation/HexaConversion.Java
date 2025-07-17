class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";

        char[] hexChar = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while(num != 0 && sb.length() < 8){
            int hexdigi = num & 0xf; //0xf=15
            sb.append(hexChar[hexdigi]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
// easiest sol:
// class Solution {
//     public String toHex(int num) {
//          String s=String.format("%h",num);
//          return s;
//     }
// }