package practice.dynamicprogramming;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5}, 11));
    }
    public static int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount+1];
        Arrays.fill(minCoins, amount+1);
        minCoins[0] = 0;
        
        System.out.println(Arrays.toString(minCoins));
        for(int i=1; i<= amount; i++){
            System.out.println("i: "+ i);
            for(int j=0; j<coins.length; j++){
                if(i-coins[j] >= 0){
                    minCoins[i] = Math.min(minCoins[i], 1+ minCoins[i-coins[j]]);
                }
                System.out.println("j: "+j+" - "+Arrays.toString(minCoins));
            }
        }
        return minCoins[amount] != amount+1 ? minCoins[amount] : -1;
    }
}
