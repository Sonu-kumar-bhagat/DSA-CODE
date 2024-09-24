// package Dynamic Prog;

import java.util.Arrays;

public class CoinProblem {
    static int recursion(int n,int coins[],int dp[]){
        if(n==0)return n;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(n-coins[i]>=0){
                int subAns=0;
                if(dp[n-coins[i]]!=-1)subAns=dp[n-coins[i]];
                else subAns=recursion(n-coins[i], coins,dp);                 
                if(subAns!=ans&&subAns+1<ans)ans=subAns+1;
            }
        }
        return dp[n]=ans;
        
    }
    public static void main(String[] args) {
        int n=18;
        int []coins={7,5,1};
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int ans=recursion(n,coins,dp);
        System.out.println(ans);
        for(int x:dp)
        System.out.print(x+" ");
    }
}
