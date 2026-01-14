class Solution {

   
    class Transaction {
        String name;
        int time;
        int value;
        String city;
        boolean isValid;

        void setValid(boolean value) {
            isValid = value;
        }

        boolean getValid() {
            return isValid;
        }

        Transaction(String trans) {
            String[] ch = trans.split(",");
            name = ch[0];
            time = Integer.parseInt(ch[1]);
            value = Integer.parseInt(ch[2]);
            city = ch[3];
            isValid = false;
        }

        @Override
        public String toString() {
            return name + ',' + time + ',' + value + ',' + city;
        }
    }


    public List<String> invalidTransactions(String[] transactions) {
        List<String> invalidList = new ArrayList<>();
        List<Transaction> transactionList = new ArrayList<>();
        for (String trans : transactions) {
            Transaction object = new Transaction(trans);
            transactionList.add(object);
        }
        for(int i =0;i<transactionList.size();i++){
            
            Transaction t1=transactionList.get(i);
            if(t1.value>1000){
                t1.setValid(true);
                transactionList.set(i,t1);
            }
            for(int j =0;j<transactionList.size();j++){
                if(i==j) continue;
                Transaction t2=transactionList.get(j);
                if(t1.name.equals(t2.name) && !t1.city.equals(t2.city) && Math.abs(t1.time- t2.time)<=60){
                    t2.setValid(true);
                    t1.setValid(true);
                    transactionList.set(i,t1);
                    transactionList.set(j,t2);
                }
            }
        }
        
        for(int i =0;i<transactionList.size();i++){
            if(transactionList.get(i).getValid()){
                invalidList.add(transactionList.get(i).toString());
            }
        }
        return invalidList;
    }
}
