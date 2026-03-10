import java.util.*;

class BannerCharacter {
    String[] pattern;

    BannerCharacter(String[] pattern) {
        this.pattern = pattern;
    }
}

public class OOPSBannerUC8 {

    static void render(String word, Map<Character, BannerCharacter> map) {
        for (int i = 0; i < 5; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(map.get(c).pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, BannerCharacter> map = new HashMap<>();

        map.put('O', new BannerCharacter(new String[]{
                " *** ", "*   *", "*   *", "*   *", " *** "
        }));

        map.put('P', new BannerCharacter(new String[]{
                "**** ", "*   *", "**** ", "*    ", "*    "
        }));

        map.put('S', new BannerCharacter(new String[]{
                " ****", "*    ", " *** ", "    *", "**** "
        }));

        render("OOPS", map);
    }
}
