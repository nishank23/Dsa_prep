class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
            Arrays.sort(happiness);
            int picked = 0;
            long maxHappiness = 0;
            int index = happiness.length-1;
            while(index>=0 && k > 0){
                int current = happiness[index] - picked;
                if(current<=0) break;
                maxHappiness += current;

                index--;
                picked++;
                k--;



            }        
        
        
            return maxHappiness;
        
        
        
        
        
        //  int maxHappiness = 0;
        // Arrays.sort(happiness);
        // if (k == 1) {
        //     return happiness[happiness.length - 1];
        // } else {
        //     for (int i = happiness.length - 1; i >= 0; i--) {
        //         if (k > 0) {
        //             maxHappiness += happiness[i]<0? 0:happiness[i];
        //             k--;
                    
        //             for(int j = i-1;j>=0;j--){
        //                 if(happiness[j]<=0){
        //                     happiness[j] = 0;
        //                 }else{
        //                     happiness[j]--;
        //                 }
        //                 System.out.println("My array after decrement"+happiness[j]);

        //             }

        //         }
        //     }
        // }


        // return (long) maxHappiness;
    }
}