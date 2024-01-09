class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 0;
        for(int i = 0; i<=n;i++){
            if(i%7 == 1){
                pizza++;
            }
        }
        answer = pizza;
        return answer;
    }
}