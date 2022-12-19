import java.util.*;
import java.util.Collections;

public class Main {
    static String line0 =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna " +
                    "aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                    "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis " +
                    "aute irure dolor in reprehenderit in voluptate velit esse " +
                    "cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
                    "occaecat cupidatat non proident, sunt in culpa qui officia " +
                    "deserunt mollit anim id est laborum.";

    static String line =
            """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ultricies leo integer malesuada nunc vel risus commodo viverra. In ornare quam viverra orci sagittis eu volutpat odio facilisis. Rhoncus est pellentesque elit ullamcorper dignissim cras. Natoque penatibus et magnis dis parturient montes nascetur ridiculus mus. Dignissim enim sit amet venenatis. Pellentesque habitant morbi tristique senectus. Et netus et malesuada fames ac turpis egestas maecenas. A lacus vestibulum sed arcu non odio euismod lacinia. Nisi scelerisque eu ultrices vitae auctor eu augue. Dignissim enim sit amet venenatis urna cursus.

                    Odio pellentesque diam volutpat commodo sed. Pellentesque id nibh tortor id aliquet lectus proin. Sit amet consectetur adipiscing elit. Integer feugiat scelerisque varius morbi enim nunc faucibus a. Phasellus vestibulum lorem sed risus ultricies tristique nulla. In mollis nunc sed id semper risus in hendrerit. Justo laoreet sit amet cursus sit. Erat pellentesque adipiscing commodo elit at. Cum sociis natoque penatibus et magnis dis. Aliquet bibendum enim facilisis gravida neque. Ut tristique et egestas quis ipsum suspendisse ultrices. Hac habitasse platea dictumst vestibulum rhoncus est. Lorem dolor sed viverra ipsum nunc aliquet bibendum.

                    Tempus imperdiet nulla malesuada pellentesque elit. Maecenas accumsan lacus vel facilisis volutpat est velit egestas dui. Nullam non nisi est sit amet. Netus et malesuada fames ac turpis egestas. Scelerisque mauris pellentesque pulvinar pellentesque habitant morbi tristique. Auctor eu augue ut lectus. Mi quis hendrerit dolor magna. Odio eu feugiat pretium nibh ipsum consequat nisl vel pretium. Aliquam faucibus purus in massa. Ut morbi tincidunt augue interdum velit euismod. Tellus integer feugiat scelerisque varius morbi. Cum sociis natoque penatibus et. Quis blandit turpis cursus in hac habitasse. Enim ut sem viverra aliquet eget sit.

                    Mauris cursus mattis molestie a iaculis at erat pellentesque. Nunc scelerisque viverra mauris in aliquam sem fringilla. Nisl nisi scelerisque eu ultrices vitae auctor eu augue. Cras semper auctor neque vitae tempus quam pellentesque. Massa sed elementum tempus egestas sed sed risus. Enim eu turpis egestas pretium. Volutpat diam ut venenatis tellus in metus. Dignissim suspendisse in est ante in. Maecenas sed enim ut sem viverra aliquet eget sit. Nunc mattis enim ut tellus elementum sagittis vitae et leo. Mattis enim ut tellus elementum sagittis vitae et leo duis. Gravida dictum fusce ut placerat orci nulla pellentesque dignissim. Lectus mauris ultrices eros in cursus turpis massa tincidunt dui. Leo urna molestie at elementum eu facilisis sed. Elit pellentesque habitant morbi tristique senectus. Nec ultrices dui sapien eget mi proin sed libero. Dictum sit amet justo donec enim diam vulputate ut pharetra. Posuere ac ut consequat semper viverra nam.

                    In metus vulputate eu scelerisque felis imperdiet. Aenean vel elit scelerisque mauris pellentesque. Ac felis donec et odio pellentesque. Eu non diam phasellus vestibulum lorem sed risus. Amet nulla facilisi morbi tempus iaculis urna id. Scelerisque varius morbi enim nunc. Hendrerit gravida rutrum quisque non tellus orci ac auctor. Fames ac turpis egestas sed tempus urna et. Justo laoreet sit amet cursus sit amet dictum sit. Et molestie ac feugiat sed. Sed id semper risus in hendrerit gravida rutrum quisque. Aliquet enim tortor at auctor. Congue nisi vitae suscipit tellus mauris a. Commodo quis imperdiet massa tincidunt nunc pulvinar. Lacus viverra vitae congue eu. Volutpat sed cras ornare arcu dui.

                    Bibendum est ultricies integer quis auctor elit sed vulputate mi. Bibendum at varius vel pharetra vel turpis nunc. Habitant morbi tristique senectus et netus et malesuada. Facilisi morbi tempus iaculis urna id volutpat. Pellentesque pulvinar pellentesque habitant morbi tristique. Sit amet nisl purus in mollis. Mattis vulputate enim nulla aliquet porttitor lacus luctus accumsan tortor. Diam sit amet nisl suscipit adipiscing bibendum est ultricies. Etiam non quam lacus suspendisse faucibus interdum. Amet volutpat consequat mauris nunc congue nisi. Felis imperdiet proin fermentum leo vel orci porta non pulvinar. Non pulvinar neque laoreet suspendisse interdum consectetur libero.


                    Faucibus ornare suspendisse sed nisi lacus sed viverra tellus. Euismod in pellentesque massa placerat duis ultricies. Est placerat in egestas erat imperdiet sed euismod nisi. Et magnis dis parturient montes. Ipsum suspendisse ultrices gravida dictum fusce ut placerat orci nulla. Lacus viverra vitae congue eu consequat ac felis donec. Ullamcorper malesuada proin libero nunc consequat. Placerat orci nulla pellentesque dignissim. Nulla porttitor massa id neque aliquam vestibulum morbi blandit. Cursus in hac habitasse platea dictumst quisque sagittis purus sit. Quis hendrerit dolor magna eget est lorem ipsum dolor sit. Eleifend donec pretium vulputate sapien. Porttitor leo a diam sollicitudin tempor. Malesuada proin libero nunc consequat interdum varius sit. Sit amet volutpat consequat mauris nunc congue nisi vitae. Nam aliquam sem et tortor consequat id porta nibh. Ut porttitor leo a diam sollicitudin tempor. Urna nunc id cursus metus aliquam. Velit aliquet sagittis id consectetur purus ut faucibus. Id ornare arcu odio ut.

                    Sagittis purus sit amet volutpat consequat mauris nunc congue. Phasellus vestibulum lorem sed risus ultricies tristique nulla aliquet. Eget nullam non nisi est sit amet. Scelerisque in dictum non consectetur. In iaculis nunc sed augue lacus viverra vitae congue. Faucibus a pellentesque sit amet porttitor eget dolor. Sed elementum tempus egestas sed sed. Mattis ullamcorper velit sed ullamcorper morbi tincidunt ornare. Odio tempor orci dapibus ultrices in iaculis nunc sed augue. In cursus turpis massa tincidunt dui. Id diam maecenas ultricies mi. Risus nullam eget felis eget nunc lobortis mattis aliquam. Odio facilisis mauris sit amet.

                    Ut venenatis tellus in metus vulputate eu scelerisque felis imperdiet. Vitae auctor eu augue ut lectus arcu bibendum at. Sagittis vitae et leo duis ut. Aliquam faucibus purus in massa tempor nec feugiat. In cursus turpis massa tincidunt dui ut ornare. Aliquet nibh praesent tristique magna sit amet purus. Integer malesuada nunc vel risus commodo viverra maecenas. Gravida cum sociis natoque penatibus et magnis dis parturient montes. Velit ut tortor pretium viverra suspendisse. Amet volutpat consequat mauris nunc congue nisi vitae. Massa ultricies mi quis hendrerit dolor magna eget. Diam sollicitudin tempor id eu nisl. Et malesuada fames ac turpis egestas sed tempus. Dapibus ultrices in iaculis nunc sed augue. Vitae aliquet nec ullamcorper sit amet risus nullam. Posuere urna nec tincidunt praesent semper feugiat nibh. Tristique senectus et netus et malesuada fames ac. Et malesuada fames ac turpis. Sed augue lacus viverra vitae congue eu consequat ac.""";

    public static void main(String[] args) {
        line = line.toLowerCase();
//        line = line.replaceAll("[^a-zA-Z]", "");

        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : line.toCharArray()) {
            if (Character.isLetter(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println(map);
        System.out.println("Maximum number of characters: " + Collections.max(map.values()) + " letter - " + getKeyByValue(map, Collections.max(map.values())));
        System.out.println("Minimum number of characters: " + Collections.min(map.values()) + " letter - " + getKeyByValue(map, Collections.min(map.values())));

    }
    private static boolean check(String line) {
        char[] ch = line.toCharArray();
        return !Character.isLetter(ch[0]);
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
