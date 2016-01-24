/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportalgoritm;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aga
 */
public class Main {

    public static void main(String[] args) {
        JFrame MainForm;
        MainForm = creatingForm();
        MainForm.setVisible(true);
    }

    // тут параметром добавить размеры таблицы! 
    // отдельным методом можно заполнить стартовые значения
    public static JTable creatingTable(JFrame form) {

        int Data[][] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}}; // Testing Data !

        JTable table = new JTable(new AbstractTableModel() {

            @Override
            public int getRowCount() {
                return Data.length;
            }

            @Override
            public int getColumnCount() {
                return Data[0].length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                return Data[rowIndex][columnIndex];
            }

        });

        /*   Object[][] mat = {{1,2,3}, {4,5,6}};
         Object[] column = {"A", "B", "C"};
        
         JTable table = new JTable(mat, column);
         table.setBackground(form.getBackground());
         table.setShowGrid(false);
         table.setSize(300, 300);*/
        return table;

    }

    public static JFrame creatingForm() {
        JFrame form = new JFrame("Транспортная задача");
        JTable table;
        table = creatingTable(form);
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.setSize(500, 500);
        form.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder("Data:"));
        panel.setPreferredSize(new Dimension(250, 100));
        table.setBackground(panel.getBackground());
        panel.add(table);
        form.add(panel);
        form.pack();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        return form;
    }

}
