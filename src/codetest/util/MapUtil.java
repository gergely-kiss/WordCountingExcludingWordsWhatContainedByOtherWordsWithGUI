/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kiss
 */
public class MapUtil {

    public static List<String> sortMapKeysByLengthLongerToShort(Map map) {
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new ComperatorTypeString());
        return list;
    }

    public static Map strArrayToMap(String[] strArray) {
        Map<String, String> map = new HashMap<>();
        for (String string : strArray) {
            map.put(string, "");
        }
        return map;
    }
}
