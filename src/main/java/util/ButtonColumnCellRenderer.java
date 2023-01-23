package util;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Willian Costa
 */
public class ButtonColumnCellRenderer extends DefaultTableCellRenderer {
    
    private String buttonType;   
    
    public ButtonColumnCellRenderer(String buttonType) {
        this.buttonType = buttonType;
    }
    
    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, 
                          int column) {
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, value, 
                isSelected, hasFocus, row, column);
        label.setHorizontalAlignment(JLabel.CENTER);
        ImageIcon ic =  new ImageIcon("resources/"+buttonType+".png");
        label.setIcon(ic);
        return label;
    }
}
