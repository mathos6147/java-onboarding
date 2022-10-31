package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        int dp[] = new int[10001];
        dp[1] =0;
        for(int i=2; i<=number; i++){
            int cnt =0;
            int tmp =i;
            while(tmp !=0){
                int tmp2 = tmp % 10;
                if(tmp2 %3 == 0) cnt++;
                tmp /= 10;
            }
            dp[i] = dp[i-1] + cnt;
        }
        answer = dp[number];
        return answer;
    }
}
