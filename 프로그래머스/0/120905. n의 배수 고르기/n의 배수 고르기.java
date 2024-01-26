class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int[] Array = new int[numlist.length];
        int count = 0;
        for(int i = 0; i<numlist.length; i++){
            if( numlist[i]%n == 0){
                Array[count] = numlist[i];
                count++;
            }
        }
        
        int[] answer = new int[count];
        for(int i = 0; i<count; i++){
            answer[i] = Array[i];
        }
        
        return answer;
    }
}