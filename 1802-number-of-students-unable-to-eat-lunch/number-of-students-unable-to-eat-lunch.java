class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = new LinkedList<>();
        Queue<Integer> sandwichQueue = new LinkedList<>();

        for(int student:students){
            studentsQueue.add(student);
        }
        for(int sandwich:sandwiches){
            sandwichQueue.add(sandwich);
        }
        int no_student = 0;

        while(studentsQueue.size()!=no_student){
            if(studentsQueue.peek().equals(sandwichQueue.peek())){
                studentsQueue.poll();
                sandwichQueue.poll();
                no_student=0;
            }else{
            int temp = studentsQueue.peek();
            studentsQueue.poll();
            studentsQueue.offer(temp);
            no_student++;
        }
    }
    return studentsQueue.size();

    }
}