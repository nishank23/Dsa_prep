class Solution {
    public boolean hasSameDigits(String val) {
        while(val.length()!=2){
            String newS = "";
            for(int i =0;i<val.length()-1;i++){
                int a = Integer.parseInt(val.substring(i,i+1));
                int b = Integer.parseInt(val.substring(i+1,i+2));
                System.out.println("Values of a "+a +" Values of b "+b );
                newS = newS + String.valueOf ( (a+b) % 10) ;
            }
            System.out.println("MY NEW STRING "+newS);
            val = newS;
        }


        return val.charAt(0) == val.charAt(1);
    }
    
}