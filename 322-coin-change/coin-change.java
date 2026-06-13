class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount+1];
        
        for(int i=0;i<arr.length;i++) arr[i] = amount+1;
        arr[0] =0;
        for(int c : coins){
            for(int i=c;i<amount+1;i++){
                arr[i] = Math.min(arr[i],arr[i-c]+1);
            }
        }
        if (arr[amount]>amount) {return -1;}
        else {return arr[amount];}




    }
}