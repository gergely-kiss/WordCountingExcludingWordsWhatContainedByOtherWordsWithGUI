/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import codetest.util.FileChooser;
import solution.CountWords;
import codetest.util.OutputUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Kiss
 */
public class GUI extends JFrame {

    private JTextArea inputTextArea;
    private JButton btnInput;
    private JButton btnFileChooser;
    private JTextArea outputTextArea;

    public GUI() {
        init();
    }

    private void init() {
        this.setSize(700, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Coding test bonus");        
        try {
            URL url = getClass().getResource("../res/img/icon-team-dev.png");
            File image = new File(url.getPath());
            this.setIconImage(ImageIO.read(image));
        } catch (IOException ex) {
            outputTextArea.setText(ex.getMessage());
        }

        inputTextArea = new JTextArea();
        inputTextArea.setEditable(true);
        inputTextArea.setLineWrap(true);
        inputTextArea.setBounds(50, 50, 200, 325);
        inputTextArea.setToolTipText("Input field showing the text from file or "
                + "you can type / paste the it to it.");

        btnInput = new JButton("Count Input");
        btnInput.setBounds(300, 100, 100, 25);
        btnInput.setToolTipText("Click it to show the worlds of the "
                + "text and the number how many times it is in the text if it is"
                + " not partialy matching longer words.");

        btnFileChooser = new JButton("Open File");
        btnFileChooser.setBounds(300, 250, 100, 25);
        btnFileChooser.setToolTipText("Click it to show open a text file from "
                + "your filesystem");

        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setLineWrap(true);
        outputTextArea.setBounds(450, 50, 200, 325);
        outputTextArea.setToolTipText("Output field showing the worlds of the "
                + "text and the number how many times it is in the text if it is"
                + " not partialy matching longer words.");
        
        btnInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputTextArea.getText();
                String output = OutputUtil.getText(CountWords.worldCount(input));
                outputTextArea.setText(output);
            }
        });
        
        btnFileChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileChooser fileUtil = new FileChooser();
                try {
                    fileUtil.choose();
                    String input = fileUtil.getSb();
                    inputTextArea.setText(input);
                } catch (FileNotFoundException ex) {
                    outputTextArea.setText(ex.getMessage());
                }

            }
        });

        this.add(inputTextArea);
        this.add(btnInput);
        this.add(btnFileChooser);
        this.add(outputTextArea);
        this.setVisible(true);
    }
}
