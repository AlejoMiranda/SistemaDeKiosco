package tableModel;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.Venta;

public class TMVerHistoricoVenta implements TableModel{
    
    private List<Venta> ventaList;

    public TMVerHistoricoVenta(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }
    
    public Venta getVenta(int index) {
        return ventaList.get(index);
    }
    
    @Override
    // para saber la cantidad de filas
    public int getRowCount() {
        return ventaList.size();
    }

    @Override
    // cantidad de columnas
    public int getColumnCount() {
        return 3;
    }

    @Override
    // para obtener el nombre de la columna
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "Fecha Transacción";
            default:
                return "Total Venta";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venta v = ventaList.get(rowIndex);
        
        switch(columnIndex){
            
            case 0:
                return v.getId();
            case 1:
                return v.getFecha();
            default:
                return v.getTotal();
                
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    
    }
    
    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    
}