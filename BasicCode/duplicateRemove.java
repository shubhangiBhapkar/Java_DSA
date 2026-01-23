import java.util.LinkedHashSet;

public class duplicateRemove {
    public static void main(String args[]) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        String s = "Programming";
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char c:set){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
