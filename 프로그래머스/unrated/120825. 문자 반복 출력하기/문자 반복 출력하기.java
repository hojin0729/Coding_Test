class Solution {
    public StringBuffer solution(String my_string, int n) {

        char[] arr = my_string.toCharArray();
        StringBuffer answer = new StringBuffer();
        // arr = [h,e,l,l,o]
        for(char k : arr){
            for(int i=0; i<n;i++){
                answer.append(k);
            }           
        }
        return answer;
    }
}