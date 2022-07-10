package programers.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// 완주하지 못한선수
public class Hash01 {
    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Map<Integer, String> participantMap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            participantMap.put(i, participant[i]);
        }

        System.out.println(participantMap);

        for (int i = 0; i < participantMap.size(); i++) {
            for (int j = 0; j < completion.length; j++) {
                if (completion[j].equals(participantMap.get(i))) {
                    participantMap.remove(i);
                }
            }
        }

        System.out.println(participantMap);
    }
}
