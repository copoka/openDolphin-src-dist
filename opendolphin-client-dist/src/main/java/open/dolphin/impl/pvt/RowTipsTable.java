
package open.dolphin.impl.pvt;

import java.awt.event.MouseEvent;
import javax.swing.JTable;
import open.dolphin.infomodel.PatientVisitModel;
import open.dolphin.table.ListTableModel;

/**
 *
 * @author Kazushi Minagawa.
 */
public class RowTipsTable extends JTable {
    
    @Override
    public String getToolTipText(MouseEvent e) {
        
        ListTableModel<PatientVisitModel> model = (ListTableModel<PatientVisitModel>) getModel();
        int row = rowAtPoint(e.getPoint());
        PatientVisitModel pvt = model.getObject(row);
        return pvt != null ? pvt.getPatientModel().getKanaName() : null;
    }
}
