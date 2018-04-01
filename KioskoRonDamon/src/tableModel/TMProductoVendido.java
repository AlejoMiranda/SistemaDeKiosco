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

public class TMProductoVendido implements TableModel {

    private List<Producto> productoList;
    private Data d;

    public TMProductoVendido(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public Producto getProducto(int index) {
        return productoList.get(index);
    }

    @Override
    // para saber la cantidad de filas
    public int getRowCount() {
        return productoList.size();
    }

    @Override
    // cantidad de columnas
    public int getColumnCount() {
        return 2;
    }

    @Override
    // para obtener el nombre de la columna
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Nombre Producto";
            default:
                return "Precio Unitario";
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
        Producto p = productoList.get(rowIndex);

        switch (columnIndex) {

            case 0:
                return p.getNombre();
            default:
                return p.getPrecioVenta();

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
