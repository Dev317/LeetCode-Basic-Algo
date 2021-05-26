public class Knapsack01 {
    public static void main(String[] args){
        int[] weight = {-1,1,2,4,2,5};
        int[] value = {-1,5,3,5,3,2};
        System.out.println(knapSack(5,10,weight,value));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int knapSack(int numItemsLeft, int maxWeight, int[] weight, int[]value) {
        if (numItemsLeft == 0 || maxWeight == 0) {
            return 0;
        } else if (weight[numItemsLeft] > maxWeight) {
            return knapSack(numItemsLeft-1,maxWeight,weight,value);
        } else {
            int notChoose = knapSack(numItemsLeft-1,maxWeight,weight,value);

            int Choose = value[numItemsLeft] + knapSack(numItemsLeft-1,maxWeight-weight[numItemsLeft],weight,value);
            return max(notChoose,Choose);
        }
    }
}