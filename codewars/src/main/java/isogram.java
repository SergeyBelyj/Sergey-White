import java.util.HashMap;
import java.util.Map;

public class isogram {
    public static boolean  isIsogram(String str) {
        boolean result = false;
        str = str.toLowerCase();
        char[] chAr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++)
        map.put(chAr[i],1);
        if ((map.size() == chAr.length) ||(str.length() == 0)) result = true;
        return  result;
    }
}
