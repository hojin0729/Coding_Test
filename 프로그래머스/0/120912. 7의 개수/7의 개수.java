import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String s = Arrays.toString(array);
        String[] arr = s.split("");
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i].equals("7")){
                answer++;
            }
        }
        return answer;
    }
}