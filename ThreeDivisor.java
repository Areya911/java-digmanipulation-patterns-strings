class Solution {
    public boolean isThree(int n) 
    {
        int ct=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) ct++;
        }
        if(ct==3) return true;
        else return false;
    }
}