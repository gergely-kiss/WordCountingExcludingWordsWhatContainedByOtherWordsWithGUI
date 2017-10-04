/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest.util;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Kiss
 */
public class OutputUtil {

    public static String getText(Map map) {
        List<String> properOrder = MapUtil.sortMapKeysByLengthLongerToShort(map);
        StringBuilder sb = new StringBuilder();
        for (String s : properOrder) {
            if (s.length() > 0) {
                sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1, s.length()));
                sb.append(": ");
                sb.append(map.get(s));
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
