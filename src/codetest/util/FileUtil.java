/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kiss
 */
public class FileUtil {

    public static StringBuilder openFile(File file)throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
            try (Scanner in = new Scanner(file)) {
                while (in.hasNext()) {
                    sb.append(in.nextLine());
                    sb.append(" ");
                }
            }
        return sb;
        } 

}
