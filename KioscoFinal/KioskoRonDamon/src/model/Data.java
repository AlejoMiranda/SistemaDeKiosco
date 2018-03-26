package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<Venta> ventaList;
    private List<Producto> productoList;
    private final Conexion con;
    private ResultSet rs;
    private String query;

    public Data() throws SQLException, ClassNotFoundException {
        con = new Conexion("localhost", "root", "", "bdKioskoRD");
    }

    public List<Venta> getHistoricoVenta(String desde, String hasta) throws SQLException {
        query = "SELECT * FROM venta WHERE fecha BETWEEN '" + desde + "' AND '" + hasta + "' ";

        ventaList = new ArrayList<>();
        Venta v; // null

        rs = con.ejecutarSql(query);

        while (rs.next()) {
            v = new Venta();

            v.setId(rs.getInt(1));
            v.setFecha(rs.getTimestamp(2));
            v.setTotal(rs.getInt(3));

            ventaList.add(v);
        }
        con.desconectar();

        return ventaList;
    }

    public List<Producto> getProductoList() throws SQLException {
        query = "SELECT * FROM producto";

        productoList = new ArrayList<>();
        Producto p;

        rs = con.ejecutarSql(query);

        while (rs.next()) {
            p = new Producto();

            p.setId(rs.getInt(1));
            p.setNombre(rs.getString(2));
            p.setStock(rs.getInt(3));
            p.setDescripcion(rs.getString(4));
            p.setPrecioVenta(rs.getInt(5));
            p.setPrecioCompra(rs.getInt(6));
            p.setTipoProductoFK(rs.getInt(7));
            p.setProveedorFK(rs.getInt(8));

            productoList.add(p);
        }
        con.desconectar();

        return productoList;
    }

    public List<TipoProducto> getTipoProductoList() throws SQLException {
        List<TipoProducto> listaTP = new ArrayList<>();

        TipoProducto tp;

        query = "SELECT * FROM tipoProducto";

        rs = con.ejecutarSql(query);

        while (rs.next()) {
            tp = new TipoProducto();

            tp.setId(rs.getInt(1));
            tp.setDescripcion(rs.getString(2));

            listaTP.add(tp);
        }

        con.desconectar();

        return listaTP;

    }

    public List<Proveedor> getProveedorList() throws SQLException {
        List<Proveedor> listaPro = new ArrayList<>();
        Proveedor pr;

        query = "SELECT * FROM proveedor";

        rs = con.ejecutarSql(query);

        while (rs.next()) {
            pr = new Proveedor();

            pr.setId(rs.getInt(1));
            pr.setRut(rs.getString(2));
            pr.setNombre(rs.getString(3));
            pr.setTelefono(rs.getString(4));
            pr.setDireccion(rs.getString(5));

            listaPro.add(pr);
        }

        con.desconectar();

        return listaPro;

    }

    public List<Usuario> getUsuarioList() throws SQLException {
        List<Usuario> listaUsu = new ArrayList<>();
        Usuario u;

        query = "SELECT * FROM usuario";

        rs = con.ejecutarSql(query);

        while (rs.next()) {
            u = new Usuario();

            u.setId(rs.getInt(1));
            u.setNombre(rs.getString(2));
            u.setApellido(rs.getString(3));
            u.setPass(rs.getString(4));

            listaUsu.add(u);
        }

        con.desconectar();

        return listaUsu;

    }

    public int getIdProductoActual() throws SQLException {
        query = "SELECT MAX(id) FROM producto";

        rs = con.ejecutarSql(query);

        int id = 0;

        if (rs.next()) {
            id = rs.getInt(1);
        }

        con.desconectar();

        return id + 1;
    }

    public int getIdProveedor() throws SQLException {
        query = "SELECT MAX(id) FROM proveedor";

        rs = con.ejecutarSql(query);

        int id = 0;

        if (rs.next()) {
            id = rs.getInt(1);
        }

        con.desconectar();

        return id + 1;
    }

    public void addProducto(Producto p) throws SQLException {

        query = "INSERT INTO producto VALUES (null, '" + p.getNombre() + "', " + p.getStock() + ", '" + p.getDescripcion() + "', " + p.getPrecioVenta() + "," + p.getPrecioCompra() + "," + p.getTipoProductoFK() + "," + p.getProveedorFK() + ")";
        con.ejecutar(query);
    }

    public void addProveedor(Proveedor pee) throws SQLException {

        query = "INSERT INTO proveedor VALUES (null, '" + pee.getRut() + "', '" + pee.getNombre() + "', '" + pee.getTelefono() + "', '" + pee.getDireccion() + "')";
        con.ejecutar(query);
    }

    public void addVenta(int totalVenta) throws SQLException {

        query = "INSERT INTO venta VALUES (null, now(), " + totalVenta + ")";
        con.ejecutar(query);
    }
    
    public List<Producto> buscarProducto(String texto) throws SQLException {
        query = "SELECT * FROM producto WHERE nombre like '%" + texto + "%'";

        productoList = new ArrayList<>();
        Producto pro; // null

        rs = con.ejecutarSql(query);
        
        while (rs.next()) {
            pro = new Producto();
            
            pro.setId(rs.getInt(1));
            pro.setNombre(rs.getString(2));
            pro.setStock(rs.getInt(3));
            pro.setDescripcion(rs.getString(4));
            pro.setPrecioVenta(rs.getInt(5));
            pro.setPrecioCompra(rs.getInt(6));
            pro.setTipoProductoFK(rs.getInt(7));
            pro.setProveedorFK(rs.getInt(8));

            productoList.add(pro);
        }
        con.desconectar();

        return productoList;
    }
}
