package tableModel;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.Data;
import model.Producto;
import model.Proveedor;

public class TMVerProveedor implements TableModel {

    private List<Proveedor> proveedorList;
    private Data d;

    public TMVerProveedor(List<Proveedor> proveedorList) {
        this.proveedorList = proveedorList;
    }

    public Proveedor getProveedor(int index) {
        return proveedorList.get(index);
    }

    @Override
    // para saber la cantidad de filas
    public int getRowCount() {
        return proveedorList.size();
    }

    @Override
    // cantidad de columnas
    public int getColumnCount() {
        return 4;
    }

    @Override
    // para obtener el nombre de la columna
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "RUT";
            case 2:
                return "Nombre";
            default:
                return "Telefóno";
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
        Proveedor p = proveedorList.get(rowIndex);

        switch (columnIndex) {

            case 0:
                return p.getId();
            case 1:
                return p.getRut();
            case 2:
                return p.getNombre();
            default:
                return p.getTelefono();

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
