class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length ; i++) {
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i +"에 있다";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] seoul = {"Jane", "Kim"};

        System.out.println(sol.solution(seoul));


    }
}

