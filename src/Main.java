import java.nio.channels.Pipe;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Integer i = 0;
        final Integer init = 0;
        for (Character ch : line.toCharArray()) {

            if (map.containsKey(ch)) {
                i = map.get(ch) + 1;
                map.put(ch, i);
            } else {
                map.put(ch, init);
            }
        }
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            System.out.println(kv.getKey() + " - " + kv.getValue());
        }
        System.out.println(map);

    }
}
