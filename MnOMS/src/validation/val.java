
package validation;

import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class val {
    public boolean isEmptyRequiredField(Vector<JTextField> fields, Vector<JLabel> labels){
        
        boolean status = false;
        int count = 0;
        for (int i = 0; i < fields.size(); i++) {
           
            if (fields.get(i).getText().equals("")) {
                JLabel lbl = labels.get(i);
                lbl.setVisible(true);
                status = true;
            }
            else{
                JLabel lbl = labels.get(i);
                lbl.setVisible(false);
                status = false;
                count++;
            }
        }
        
        if (count == fields.size()) {
            
            status= false;
            
        } else {
            
            status = true;
        }
        return status;
    }
    
}
