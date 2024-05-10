class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            Boolean even = arr[i] % 2 == 0;
            if(arr[i] >= 50 && even){
                answer[i] = (arr[i] / 2);
            }
            else if(arr[i] <= 50 && !even){
                answer[i] = (arr[i] * 2);
            }
            else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}