class Solution {
    public int bestClosingTime(String customers) {
      int penalty = 0;
      for(char c : customers.toCharArray()){
        if(c=='Y')penalty++;
      }
      System.out.println("THIS IS MY Y"+penalty);
      int minPenalty = penalty;
      int bestHour = 0;


      for(int i = 1;i<=customers.length();i++){
        if(customers.charAt(i-1)=='Y'){
            penalty--;
        }else{
            penalty++;
        }
        if(penalty<minPenalty){
            minPenalty = penalty;
            bestHour = i;
        }


      } 

      return bestHour;
    }
}