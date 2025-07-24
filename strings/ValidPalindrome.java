class Solution {
    public boolean isPalindrome(String s) {

        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
      
        String reversed=new StringBuilder(str).reverse().toString();
       
        if(reversed.equals(str)) return true;
         //reversed==true check only if both these strings points to same objects in the memory
         // it does not check if the contents are equal
        else return false;
    }
}