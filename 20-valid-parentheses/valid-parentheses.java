class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> myStack = new Stack<>();
        
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                myStack.push(c);
            }else{
                if(myStack.isEmpty()){
                    return false;
                }
                if(!myStack.isEmpty() && map.get(myStack.pop()) != c){
                    return false;
                }
            }
        }
        return myStack.isEmpty();


    }
}