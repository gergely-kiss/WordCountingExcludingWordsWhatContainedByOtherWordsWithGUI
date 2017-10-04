/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest.util;

import java.util.Arrays;

/**
 *
 * @author Kiss
 */
public class InputUtil {

    public static String[] stringToArray(String str) {
        String lowerCase = str.toLowerCase();
        String[] splitedStringArray = lowerCase.split(" ");
        Arrays.sort(splitedStringArray, new ComperatorTypeString());
        return splitedStringArray;
    }
}
