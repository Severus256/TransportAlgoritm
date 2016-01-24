/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportalgoritm;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Aga
 */
public class Main {

    public static void main(String[] args) {
       JFrame MainForm;
       MainForm = creatingForm();

        


    }

    // тут параметром добавить размеры таблицы! 
    // отдельным методом можно заполнить стартовые значения
    public static JTable creatingTable(JFrame form) {

          Object[][] mat = {{1,2,3}, {4,5,6}};
         Object[] column = {"A", "B", "C"};
        
         JTable table = new JTable(mat, column);
         table.setBackground(form.getBackground());
         table.setShowGrid(false);
         table.setSize(300, 300);
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
        form.setVisible(true);

        return form;
    }

}
