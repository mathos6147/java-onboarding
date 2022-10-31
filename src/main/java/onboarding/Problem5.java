package onboarding;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        int moneyTmp = money;
        int []moneyCan = {50000, 10000, 5000, 1000, 500, 100, 50, 10,1};
        for(int i=0; i<9; i++){
            int cnt =0;
            cnt = moneyTmp / moneyCan[i];
            answer.add(cnt);
            moneyTmp = moneyTmp % moneyCan[i];
        }
        return answer;
    }
}
