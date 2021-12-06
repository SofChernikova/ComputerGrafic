package com.company;

import com.company.Util.ArrayUtils;
import com.company.Util.JTableUtils;
import com.company.Util.SwingUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Visualization extends JFrame {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;

    private JPanel panelMain;
    private JScrollPane scrollPane;
    private JTable table;
    private JButton startButton;

    public Visualization() {
        this.setTitle("Sort");
        this.setSize(WIDTH, HEIGHT);
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);

        JTableUtils.initJTableForArray(table, 80, false, true, false, true);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int[] arr = ArrayUtils.readIntArrayFromFile("input.txt");
                    //  JTableUtils.resizeJTable(table, 0, arr.length);
                    JTableUtils.writeArrayToJTable(table, arr);
                    TableRenderer.sort(arr);
                    int[][] newArr = TableRenderer.listToArray();
                    JTableUtils.writeArrayToJTable(table, newArr);

                   table.setDefaultRenderer(Object.class, new TableRenderer());


                } catch (Exception e) {
                    SwingUtils.showErrorMessageBox(e);
                }
            }
        });


    }

}
