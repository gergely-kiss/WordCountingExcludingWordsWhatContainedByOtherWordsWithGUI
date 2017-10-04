/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest.util;

import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;

/**
 *
 * @author Kiss
 */
public class FileChooser {
    
    private final JFileChooser fileChooser;
    private StringBuilder sb;

    public FileChooser() {
        fileChooser= new JFileChooser();
        sb = new StringBuilder();
    }
    
        public void choose() throws FileNotFoundException {
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            sb = FileUtil.openFile(file);
        } 
    }

    public String getSb() {
        return sb.toString();
    }
}
