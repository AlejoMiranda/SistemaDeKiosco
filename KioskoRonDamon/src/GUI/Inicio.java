package GUI;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Data;
import model.Producto;
import model.ProductoActualizar;
import model.Proveedor;
import model.TipoProducto;
import model.Usuario;
import model.Venta;
import tableModel.TMProductoVendido;
import tableModel.TMVerHistoricoVenta;
import tableModel.TMVerProducto;
import tableModel.TMVerProveedor;

public class Inicio extends javax.swing.JFrame {

    private Data data;
    private List<Usuario> usuariosList;
    private List<Producto> productoVentaList;
    private List<ProductoActualizar> productActualizarList = new ArrayList<>();

    int totalActual = 0; // cantidad que actualmente se pagará 

    public Inicio() {
        try {
            initComponents();

            data = new Data();
            cargarTablaProductos();
            init();
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfrMenu = new javax.swing.JFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmiAgregarProducto = new javax.swing.JMenuItem();
        jmiAddProveedor = new javax.swing.JMenuItem();
        jmiRealizarVenta = new javax.swing.JMenu();
        jmiVender = new javax.swing.JMenuItem();
        jmiVerHistorico = new javax.swing.JMenuItem();
        jmenSalir = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jfrAddProducto = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblIDproductoReg = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        cboTipoProducto = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescrip = new javax.swing.JTextArea();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        btnGuardarProducto = new javax.swing.JButton();
        btnCancelarReg = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        cboProveedor = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jfrAddProveedor = new javax.swing.JFrame();
        jLabel14 = new javax.swing.JLabel();
        lblIDProvee = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtRutProvee = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNombreProvee = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelefonoProvee = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDireccionProvee = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbleProveedor = new javax.swing.JTable();
        txtGuardarProvee = new javax.swing.JButton();
        txtCancelarProvee = new javax.swing.JButton();
        jfrVender = new javax.swing.JFrame();
        pnlVenta = new javax.swing.JPanel();
        txtBuscarProducto = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbleProductos = new javax.swing.JTable();
        lblProductoaComprar = new javax.swing.JLabel();
        txtNombreProductoaComprar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCantProductoaComprar = new javax.swing.JTextField();
        btnAddProductoComprar = new javax.swing.JButton();
        lblPrecioProducto = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblStockProducto = new javax.swing.JLabel();
        pnlConfirmarVenta = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblProductoAvender = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        lblTotalaPagar = new javax.swing.JLabel();
        btnGenerarVenta = new javax.swing.JButton();
        btnCancelarVenta = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jfrHistoricoVenta = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jdcDesde = new com.toedter.calendar.JDateChooser();
        jdcHasta = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnFiltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHistoricodeVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();

        jfrMenu.setTitle("Kiosko Ron Damon");

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shop_icon-icons.com_51010.png"))); // NOI18N
        jMenu2.setText("Almacén");
        jMenu2.setFont(new java.awt.Font("Arial Narrow", 2, 16)); // NOI18N

        jmiAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping_cart_full_22024.png"))); // NOI18N
        jmiAgregarProducto.setText("Agregar Producto");
        jmiAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAgregarProducto);

        jmiAddProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/groups_people_people_1716.png"))); // NOI18N
        jmiAddProveedor.setText("Añadir Proveedor");
        jmiAddProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddProveedorActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAddProveedor);

        jMenuBar1.add(jMenu2);

        jmiRealizarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping_22120.png"))); // NOI18N
        jmiRealizarVenta.setText("Venta");
        jmiRealizarVenta.setFont(new java.awt.Font("Arial Narrow", 2, 16)); // NOI18N

        jmiVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping-basket-accept256_24905.png"))); // NOI18N
        jmiVender.setText("Realizar Venta");
        jmiVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVenderActionPerformed(evt);
            }
        });
        jmiRealizarVenta.add(jmiVender);

        jmiVerHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        jmiVerHistorico.setText("Historico Venta");
        jmiVerHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVerHistoricoActionPerformed(evt);
            }
        });
        jmiRealizarVenta.add(jmiVerHistorico);

        jMenuBar1.add(jmiRealizarVenta);

        jmenSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_delete_exit_close_1545.png"))); // NOI18N
        jmenSalir.setText("Salir");
        jmenSalir.setFont(new java.awt.Font("Arial Narrow", 2, 16)); // NOI18N

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_delete_exit_close_1545.png"))); // NOI18N
        jMenuItem5.setText("Cerrar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmenSalir.add(jMenuItem5);

        jMenuBar1.add(jmenSalir);

        jfrMenu.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jfrMenuLayout = new javax.swing.GroupLayout(jfrMenu.getContentPane());
        jfrMenu.getContentPane().setLayout(jfrMenuLayout);
        jfrMenuLayout.setHorizontalGroup(
            jfrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jfrMenuLayout.setVerticalGroup(
            jfrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        jfrAddProducto.setTitle("Kiosko Ron Damon -- Agregar Producto");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tipo Producto:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Stock :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Precio Venta:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Descripcion:");

        lblIDproductoReg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIDproductoReg.setText("X");

        txtNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cboTipoProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtDescrip.setColumns(20);
        txtDescrip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescrip.setRows(5);
        jScrollPane1.setViewportView(txtDescrip);

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save_icon-icons.com_73702.png"))); // NOI18N
        btnGuardarProducto.setText("Guardar");
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        btnCancelarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelarReg.setText("Cancelar");
        btnCancelarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegActionPerformed(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblProductos);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Precio Compra:");

        txtPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cboProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Proveedor:");

        javax.swing.GroupLayout jfrAddProductoLayout = new javax.swing.GroupLayout(jfrAddProducto.getContentPane());
        jfrAddProducto.getContentPane().setLayout(jfrAddProductoLayout);
        jfrAddProductoLayout.setHorizontalGroup(
            jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrAddProductoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jfrAddProductoLayout.createSequentialGroup()
                        .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jfrAddProductoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jfrAddProductoLayout.createSequentialGroup()
                                .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jfrAddProductoLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(14, 14, 14)
                                        .addComponent(lblIDproductoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel6))
                                    .addGroup(jfrAddProductoLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(10, 10, 10)
                                        .addComponent(cboTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfrAddProductoLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jfrAddProductoLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(cboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jfrAddProductoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jfrAddProductoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(48, 48, 48)
                        .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarProducto)
                            .addComponent(btnCancelarReg))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jfrAddProductoLayout.setVerticalGroup(
            jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrAddProductoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfrAddProductoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDproductoReg)
                            .addComponent(jLabel6)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(cboTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(cboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnGuardarProducto))
                .addGap(2, 2, 2)
                .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfrAddProductoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jfrAddProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jfrAddProductoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCancelarReg)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jfrAddProveedor.setTitle("Kiosko Ron Damon -- Agregar Proveedor");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("ID:");

        lblIDProvee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIDProvee.setText("X");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("R.U.T:");

        txtRutProvee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Nombre:");

        txtNombreProvee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Telefono:");

        txtTelefonoProvee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Dirección");

        txtDireccionProvee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tbleProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tbleProveedor);

        txtGuardarProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save_icon-icons.com_73702.png"))); // NOI18N
        txtGuardarProvee.setText("Guardar");
        txtGuardarProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardarProveeActionPerformed(evt);
            }
        });

        txtCancelarProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        txtCancelarProvee.setText("Cancelar");
        txtCancelarProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelarProveeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jfrAddProveedorLayout = new javax.swing.GroupLayout(jfrAddProveedor.getContentPane());
        jfrAddProveedor.getContentPane().setLayout(jfrAddProveedorLayout);
        jfrAddProveedorLayout.setHorizontalGroup(
            jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrAddProveedorLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jfrAddProveedorLayout.createSequentialGroup()
                        .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jfrAddProveedorLayout.createSequentialGroup()
                                .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jfrAddProveedorLayout.createSequentialGroup()
                                        .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel16))
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfrAddProveedorLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)))
                                .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRutProvee, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txtTelefonoProvee)
                                    .addComponent(txtNombreProvee)
                                    .addComponent(lblIDProvee)))
                            .addGroup(jfrAddProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccionProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111)
                        .addComponent(txtGuardarProvee)
                        .addGap(40, 40, 40)
                        .addComponent(txtCancelarProvee))
                    .addGroup(jfrAddProveedorLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jfrAddProveedorLayout.setVerticalGroup(
            jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrAddProveedorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblIDProvee))
                .addGap(18, 18, 18)
                .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtRutProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfrAddProveedorLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGuardarProvee)
                            .addComponent(txtCancelarProvee)))
                    .addGroup(jfrAddProveedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefonoProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jfrAddProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jfrVender.setTitle("Kiosko Ron Damon -- Realizar Venta");

        pnlVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });

        tbleProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbleProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbleProductosMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tbleProductos);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Cantidad:");

        btnAddProductoComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_icon-icons.com_74429.png"))); // NOI18N
        btnAddProductoComprar.setText("Agregar");
        btnAddProductoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductoComprarActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Nombre Producto :");

        javax.swing.GroupLayout pnlVentaLayout = new javax.swing.GroupLayout(pnlVenta);
        pnlVenta.setLayout(pnlVentaLayout);
        pnlVentaLayout.setHorizontalGroup(
            pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlVentaLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addGroup(pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVentaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVentaLayout.createSequentialGroup()
                                .addComponent(lblPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddProductoComprar))
                            .addComponent(txtNombreProductoaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlVentaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblProductoaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlVentaLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantProductoaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVentaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStockProducto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlVentaLayout.setVerticalGroup(
            pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblProductoaComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProductoaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVentaLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(pnlVentaLayout.createSequentialGroup()
                        .addGroup(pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtCantProductoaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(lblStockProducto)
                        .addGap(28, 28, 28)
                        .addGroup(pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVentaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPrecioProducto)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVentaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddProductoComprar)
                                .addGap(34, 34, 34))))))
        );

        pnlConfirmarVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblProductoAvender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblProductoAvender);

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 2, 16)); // NOI18N
        jLabel11.setText("TOTAL A PAGAR:");

        lblTotalaPagar.setFont(new java.awt.Font("Arial Narrow", 2, 16)); // NOI18N
        lblTotalaPagar.setText("0");

        btnGenerarVenta.setFont(new java.awt.Font("Arial Narrow", 2, 16)); // NOI18N
        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money_dollar_cash_coins_riches_wealth_icon-icons.com_53585.png"))); // NOI18N
        btnGenerarVenta.setText("Terminar Venta");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        btnCancelarVenta.setFont(new java.awt.Font("Arial Narrow", 2, 16)); // NOI18N
        btnCancelarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_delete_exit_close_1545.png"))); // NOI18N
        btnCancelarVenta.setText("Cancelar Venta");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 2, 16)); // NOI18N
        jLabel19.setText("$");

        javax.swing.GroupLayout pnlConfirmarVentaLayout = new javax.swing.GroupLayout(pnlConfirmarVenta);
        pnlConfirmarVenta.setLayout(pnlConfirmarVentaLayout);
        pnlConfirmarVentaLayout.setHorizontalGroup(
            pnlConfirmarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlConfirmarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConfirmarVentaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnlConfirmarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenerarVenta)
                            .addComponent(btnCancelarVenta)))
                    .addGroup(pnlConfirmarVentaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConfirmarVentaLayout.setVerticalGroup(
            pnlConfirmarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmarVentaLayout.createSequentialGroup()
                .addGroup(pnlConfirmarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConfirmarVentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConfirmarVentaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlConfirmarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblTotalaPagar)
                            .addComponent(jLabel19))
                        .addGap(35, 35, 35)
                        .addComponent(btnGenerarVenta)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarVenta)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jfrVenderLayout = new javax.swing.GroupLayout(jfrVender.getContentPane());
        jfrVender.getContentPane().setLayout(jfrVenderLayout);
        jfrVenderLayout.setHorizontalGroup(
            jfrVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrVenderLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jfrVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlConfirmarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 759, Short.MAX_VALUE))
                .addContainerGap())
        );
        jfrVenderLayout.setVerticalGroup(
            jfrVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrVenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConfirmarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jfrHistoricoVenta.setTitle("Kiosko Ron Damon -- Historico Venta");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione rango de fechas para ver las ventas realizadas"));

        jLabel9.setText("Desde :");

        jLabel10.setText("Hasta:");

        btnFiltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_locate_find_6278.png"))); // NOI18N
        btnFiltar.setText("Filtrar");
        btnFiltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jdcDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jdcHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(btnFiltar)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnFiltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblHistoricodeVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblHistoricodeVentas);

        javax.swing.GroupLayout jfrHistoricoVentaLayout = new javax.swing.GroupLayout(jfrHistoricoVenta.getContentPane());
        jfrHistoricoVenta.getContentPane().setLayout(jfrHistoricoVentaLayout);
        jfrHistoricoVentaLayout.setHorizontalGroup(
            jfrHistoricoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrHistoricoVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jfrHistoricoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jfrHistoricoVentaLayout.setVerticalGroup(
            jfrHistoricoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrHistoricoVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kiosko Ron Damón");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña:");

        txtNomUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtContrasena.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnIniciar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnIniciar.setText("Entrar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomUsuario)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnIniciar)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnIniciar)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        String usuario, pass;

        usuario = txtNomUsuario.getText();
        pass = txtContrasena.getText();

        try {
            usuariosList = data.getUsuarioList();
            for (Usuario ua : usuariosList) {
                if (ua.getNombre().equals(usuario) && ua.getPass().equals(pass)) {

                    jfrMenu.setVisible(true);
                    jfrMenu.setLocationRelativeTo(null);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Error de Credenciales");
                    txtNomUsuario.setText(null);
                    txtContrasena.setText(null);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jmiAddProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddProveedorActionPerformed
        jfrAddProveedor.setVisible(true);
    }//GEN-LAST:event_jmiAddProveedorActionPerformed

    private void jmiVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVenderActionPerformed
        jfrVender.setVisible(true);
        totalActual = 0;
        productoVentaList = new ArrayList<>();
    }//GEN-LAST:event_jmiVenderActionPerformed

    private void jmiVerHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVerHistoricoActionPerformed
        jfrHistoricoVenta.setVisible(true);
    }//GEN-LAST:event_jmiVerHistoricoActionPerformed

    private void jmiAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarProductoActionPerformed
        jfrAddProducto.setVisible(true);
    }//GEN-LAST:event_jmiAgregarProductoActionPerformed

    private void btnFiltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltarActionPerformed
        try {
            /*Recupero el año, mes y dia del date chooser*/
            int añoDesde = jdcDesde.getCalendar().get(Calendar.YEAR);
            int mesDesde = jdcDesde.getCalendar().get(Calendar.MONTH) + 1;
            int diaDesde = jdcDesde.getCalendar().get(Calendar.DAY_OF_MONTH);

            int añoHasta = jdcHasta.getCalendar().get(Calendar.YEAR);
            int mesHasta = jdcHasta.getCalendar().get(Calendar.MONTH) + 1;
            int diaHasta = jdcHasta.getCalendar().get(Calendar.DAY_OF_MONTH);

            String desde = añoDesde + "/" + mesDesde + "/" + diaDesde;
            String hasta = añoHasta + "/" + mesHasta + "/" + diaHasta;

            System.out.println("DESDE : " + desde);
            System.out.println("HASTA : " + hasta);

            List<Venta> list = data.getHistoricoVenta(desde, hasta);

            TMVerHistoricoVenta model = new TMVerHistoricoVenta(list);

            tblHistoricodeVentas.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFiltarActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        try {
            TipoProducto tp;
            Proveedor prov;

            int stock, tipoProductoId, proveedorId, precioCompra, precioVenta;
            String nombre, descripcion;

            nombre = txtNombreProducto.getText();
            stock = Integer.parseInt(txtCantidad.getText());

            tp = (TipoProducto) cboTipoProducto.getSelectedItem();
            tipoProductoId = tp.getId();

            prov = (Proveedor) cboProveedor.getSelectedItem();
            proveedorId = prov.getId();

            precioCompra = Integer.parseInt(txtPrecioCompra.getText());
            precioVenta = Integer.parseInt(txtPrecioVenta.getText());
            descripcion = txtDescrip.getText();

            Producto p = new Producto(nombre, stock, descripcion, precioVenta, precioCompra, tipoProductoId, proveedorId);

            data.addProducto(p);

            cleanFormProducto();

            cargarTablaProductos();

        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnCancelarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegActionPerformed
        txtNombreProducto.setText(null);
        cboProveedor.setSelectedIndex(0);
        cboTipoProducto.setSelectedIndex(0);
        txtCantidad.setText(null);
        txtPrecioCompra.setText(null);
        txtPrecioVenta.setText(null);
        txtDescrip.setText(null);

        jfrAddProducto.setVisible(false);
    }//GEN-LAST:event_btnCancelarRegActionPerformed

    private void txtGuardarProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardarProveeActionPerformed
        try {
            String rut, nombre, telefono, direccion;

            rut = txtRutProvee.getText();
            nombre = txtNombreProvee.getText();
            telefono = txtTelefonoProvee.getText();
            direccion = txtDireccionProvee.getText();

            Proveedor pee = new Proveedor(rut, nombre, telefono, direccion);

            data.addProveedor(pee);

            cleanFormProveedor();

            cargarTablaProveedor();

        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtGuardarProveeActionPerformed

    private void txtCancelarProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelarProveeActionPerformed
        txtRutProvee.setText(null);
        txtNombreProvee.setText(null);
        txtTelefonoProvee.setText(null);
        txtDireccionProvee.setText(null);

        jfrAddProveedor.setVisible(false);
    }//GEN-LAST:event_txtCancelarProveeActionPerformed

    private void tbleProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbleProductosMouseReleased
        if (evt.getClickCount() == 2) {

            int fila = tbleProductos.getSelectedRow();

            TMVerProducto model = (TMVerProducto) tbleProductos.getModel();

            Producto p = model.getProducto(fila);

            lblProductoaComprar.setText(Integer.toString(p.getId())); /*id del producto a comprar*/
            lblStockProducto.setText(Integer.toString(p.getStock())); /*Stock actual del producto*/
            lblPrecioProducto.setText(Integer.toString(p.getPrecioVenta()));
            txtNombreProductoaComprar.setText(p.getNombre());
        }
    }//GEN-LAST:event_tbleProductosMouseReleased

    private void btnAddProductoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductoComprarActionPerformed

        int cantidadPro = Integer.parseInt(txtCantProductoaComprar.getText());
        int precioProducto = Integer.parseInt(lblPrecioProducto.getText());
        
        /* PARA ACTUALIZAR EL PRODUCTO*/
        int idProducto = Integer.parseInt(lblProductoaComprar.getText());
        int stock = Integer.parseInt(lblStockProducto.getText());
        
        ProductoActualizar proAc = new ProductoActualizar(idProducto, stock, cantidadPro);
        productActualizarList.add(proAc);       
        
        /* PARA ACTUALIZAR EL PRODUCTO*/
        
        
        String nombreProducto = txtNombreProductoaComprar.getText();

        totalActual = totalActual + (cantidadPro * precioProducto);

        Producto p = new Producto(nombreProducto, precioProducto);
        productoVentaList.add(p);

        TMProductoVendido tm = new TMProductoVendido(productoVentaList);
        tblProductoAvender.setModel(tm);

        lblTotalaPagar.setText(Integer.toString(totalActual));

    }//GEN-LAST:event_btnAddProductoComprarActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        try {
            int totalVenta = Integer.parseInt(lblTotalaPagar.getText());
            data.addVenta(totalVenta);
            
            for (ProductoActualizar proAct : productActualizarList) {
                data.actualizarStock(proAct.getId(), (proAct.getStockActual() - proAct.getCantMenos()));
            }

            cleanFormVenta();

        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        lblProductoaComprar.setText(null);
        txtBuscarProducto.setText(null);
        lblTotalaPagar.setText(null);
        lblPrecioProducto.setText(null);
        txtNombreProductoaComprar.setText(null);
        txtCantProductoaComprar.setText(null);

        totalActual = 0;
        usuariosList = new ArrayList<>();
        productActualizarList = new ArrayList<>();
        
        TMProductoVendido tm = new TMProductoVendido(productoVentaList);
        tblProductoAvender.setModel(tm);

        jfrVender.setVisible(false);
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased
        try {
            String text = txtBuscarProducto.getText();

            List<Producto> list = data.buscarProducto(text);

            TMVerProducto model = new TMVerProducto(list);

            tbleProductos.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    private void init() {
        try {
            txtNombreProductoaComprar.setEditable(false);
            this.setLocationRelativeTo(null);
            jfrMenu.setBounds(0, 0, 800, 600);
            jfrAddProveedor.setBounds(288, 138, 790, 520);
            jfrHistoricoVenta.setBounds(288, 138, 790, 520);
            jfrVender.setBounds(288, 138, 790, 520);
            jfrAddProducto.setBounds(288, 138, 790, 520);
            cargarProveedores();
            cargarTipoProductos();
            cargarTablaProveedor();

            lblIDproductoReg.setText("" + data.getIdProductoActual());

            lblIDProvee.setText("" + data.getIdProveedor());
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProductoComprar;
    private javax.swing.JButton btnCancelarReg;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnFiltar;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox cboProveedor;
    private javax.swing.JComboBox cboTipoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private com.toedter.calendar.JDateChooser jdcDesde;
    private com.toedter.calendar.JDateChooser jdcHasta;
    private javax.swing.JFrame jfrAddProducto;
    private javax.swing.JFrame jfrAddProveedor;
    private javax.swing.JFrame jfrHistoricoVenta;
    private javax.swing.JFrame jfrMenu;
    private javax.swing.JFrame jfrVender;
    private javax.swing.JMenu jmenSalir;
    private javax.swing.JMenuItem jmiAddProveedor;
    private javax.swing.JMenuItem jmiAgregarProducto;
    private javax.swing.JMenu jmiRealizarVenta;
    private javax.swing.JMenuItem jmiVender;
    private javax.swing.JMenuItem jmiVerHistorico;
    private javax.swing.JLabel lblIDProvee;
    private javax.swing.JLabel lblIDproductoReg;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblProductoaComprar;
    private javax.swing.JLabel lblStockProducto;
    private javax.swing.JLabel lblTotalaPagar;
    private javax.swing.JPanel pnlConfirmarVenta;
    private javax.swing.JPanel pnlVenta;
    private javax.swing.JTable tblHistoricodeVentas;
    private javax.swing.JTable tblProductoAvender;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tbleProductos;
    private javax.swing.JTable tbleProveedor;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JButton txtCancelarProvee;
    private javax.swing.JTextField txtCantProductoaComprar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextArea txtDescrip;
    private javax.swing.JTextField txtDireccionProvee;
    private javax.swing.JButton txtGuardarProvee;
    private javax.swing.JTextField txtNomUsuario;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreProductoaComprar;
    private javax.swing.JTextField txtNombreProvee;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtRutProvee;
    private javax.swing.JTextField txtTelefonoProvee;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaProductos() {
        try {
            List<Producto> listProducto = data.getProductoList();
            TMVerProducto tm = new TMVerProducto(listProducto);
            tbleProductos.setModel(tm);

            tblProductos.setModel(tm);

        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarTablaProveedor() {
        try {
            List<Proveedor> listProveedor = data.getProveedorList();
            TMVerProveedor tm = new TMVerProveedor(listProveedor);
            tbleProveedor.setModel(tm);

        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarTipoProductos() {
        try {
            List<TipoProducto> lista = data.getTipoProductoList();

            cboTipoProducto.removeAllItems();

            for (TipoProducto tp : lista) {
                cboTipoProducto.addItem(tp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarProveedores() {
        try {
            List<Proveedor> lista = data.getProveedorList();

            cboProveedor.removeAllItems();

            for (Proveedor p : lista) {
                cboProveedor.addItem(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cleanFormProducto() {
        try {
            txtNombreProducto.setText(null);
            cboProveedor.setSelectedIndex(0);
            cboTipoProducto.setSelectedIndex(0);
            txtCantidad.setText(null);
            txtPrecioCompra.setText(null);
            txtPrecioVenta.setText(null);
            txtDescrip.setText(null);
            lblIDproductoReg.setText("" + data.getIdProductoActual());

//        jfrAddProducto.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cleanFormProveedor() {
        try {
            txtRutProvee.setText(null);
            txtNombreProvee.setText(null);
            txtTelefonoProvee.setText(null);
            txtDireccionProvee.setText(null);

            lblIDProvee.setText("" + data.getIdProveedor());

//        jfrAddProducto.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cleanFormVenta() {
        lblProductoaComprar.setText(null);
        txtBuscarProducto.setText(null);
        lblPrecioProducto.setText(null);
        txtNombreProductoaComprar.setText(null);
        txtCantProductoaComprar.setText(null);
        lblTotalaPagar.setText(null);

        totalActual = 0;
        usuariosList = new ArrayList<>();
        productActualizarList = new ArrayList<>();
        
        TMProductoVendido tm = new TMProductoVendido(productoVentaList);
        tblProductoAvender.setModel(tm);

//        jfrAddProducto.setVisible(false);
    }

}
