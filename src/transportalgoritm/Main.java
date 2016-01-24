/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportalgoritm;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

/**
 *
 * @author Aga
 */
public class Main {
    public static void main(String[] args) {
        JFrame form = new JFrame("Транспортная задача");
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.setSize(500, 500);
        form.setLocationRelativeTo(null);
       
        JTable table;
        table = creatingTable(form);
        
        form.add(new JScrollPane(table));
        form.setVisible(true);
        
    }
    
    
    public static JTable creatingTable(JFrame form) {
        Object[][] mat = {{1,2,3}, {4,5,6}};
        Object[] column = {"A", "B", "C"};
        
        JTable table = new JTable(mat, column);
        table.setBackground(form.getBackground());
        table.setShowGrid(false);
        table.setSize(300, 300);
        return table;
    }
    
    
    
    
    
}
