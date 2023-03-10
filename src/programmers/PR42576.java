package programmers;

import java.util.Arrays;

public class PR42576 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = participant[participant.length - 1];
        for (int i = 0; i <completion.length; i++) {
            if (!completion[i].equals(participant[i])){
                answer = participant[i];
                break;
            }
        }
        return answer;
    }
}
