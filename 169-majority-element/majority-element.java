class Solution {
    public int majorityElement(int[] nums) {
    int candidate =nums[0];
    int count = 1;
    for(int i = 1;i<nums.length;i++){
        if(count==0){
           candidate = nums[i];
           count =1;
        }
        else if(nums[i]==candidate){
            count++;
        }else{
            count--;
        }
    }
    return candidate;
}}
 //Boyee Moree Voting Algorithim
/*
int candidate = nums[0];
   int count = 1;
   for(int i = 1;i<nums.length;i++){
      if(count ==0){
        candidate = nums[i];
        count =1;
      }
      else if(candidate == nums[i]){
        count++;
      }else{
        count--;
      }
   }
    return candidate;    
       
    }

*/    




 /* 
 Using Hasmap we solved it 
 On and space oN 
 
 Map<Integer,Integer> myMap = new HashMap<>();
        
        int maxCount = 0;
        int maxElement = 0;
        for(int i =0;i<nums.length;i++){
            myMap.put(nums[i],myMap.getOrDefault(nums[i],0)+1);
        }


        for(Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        return maxElement;
        */
