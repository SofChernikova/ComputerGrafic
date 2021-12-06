package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TableRenderer extends DefaultTableCellRenderer {
    static List<int[]> list = new ArrayList<>();


    public static void sort(int[] data) {
        int k = 0;
        int size = data.length;
        for (int i = 1; i < size - 1; i++) {
            int[] tempArr = data.clone();
            list.add(k, tempArr);
            k++;
            for (int j = size - 1; j >= i; j--) {
                if (data[j - 1] > data[j]) {
                    int temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        // k++;
        list.add(k, data);
    }

    public static int[][] listToArray() {
        int[][] arr = new int[list.size()][list.get(0).length];
        for (int i = 0; i < list.size(); i++) {
            int[] temp = list.get(i);
            for (int j = 0; j < temp.length; j++) {
                arr[i][j] = temp[j];
            }
        }
        return arr;
    }


    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel c = (JLabel) super.getTableCellRendererComponent(table, value, false, false, row, column);
       c.setSize(25, 25);
        if(row == 0) {
            c.setBackground(Color.WHITE);
        } else{
           if (column <= row - 1){
                c.setBackground(Color.GREEN);
            } else c.setBackground(Color.WHITE);
        }
        if(row == table.getRowCount()-1){
            c.setBackground(Color.GREEN);
        }

        return c;
    }
}
