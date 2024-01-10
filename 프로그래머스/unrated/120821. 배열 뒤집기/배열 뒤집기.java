class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] reversedArray = new int[length];
        
        for (int i = 0; i < length; i++) {
            reversedArray[length - i - 1] = num_list[i];
        }

        return reversedArray;
    }
}