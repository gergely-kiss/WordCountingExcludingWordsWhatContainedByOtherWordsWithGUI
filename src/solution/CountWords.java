/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import codetest.util.InputUtil;
import codetest.util.MapUtil;
import java.util.Map;

/**
 *
 * @author Kiss
 */
public class CountWords {

    public static Map worldCount(String str) {
        
        String[] sorted = InputUtil.stringToArray(str);
        Map<String, String> worldCount = MapUtil.strArrayToMap(sorted);

        for (String compared : sorted) {
            int count = 0;
            for (String comparedTo : sorted) {
                if (comparedTo.equalsIgnoreCase(compared)) {
                    count++;
                    worldCount.put(compared, count + "");
                }
                if (comparedTo.length() > compared.length() && comparedTo.contains(compared)) {
                    worldCount.remove(compared);
                }
            }
        }
        return worldCount;
    }

}
