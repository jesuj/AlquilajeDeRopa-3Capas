package Presentacion;

import Negocio.NCategoria;
import Negocio.NEmpleado;
import Negocio.NPrenda;
import Negocio.NVestimenta;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oni
 */
public class PVestimenta extends javax.swing.JFrame {

    private int id;
    private String nombre;
    private int cantidad;
    private int precio;
    private int id_categoria;
    private int id_empleado;
    private NVestimenta nvestimenta;

    private NCategoria ncategoria;
    private NEmpleado nempleado;

    private NPrenda nprenda;

    private ArrayList<Object[]> agregardetallePrenda;
    private ArrayList<Object[]> eliminardetallePrenda;

    /**
     * Creates new form PVestimenta
     */
    public PVestimenta() {
        initComponents();
        this.jtf_id.setEditable(false);
        this.jtf_id.setEnabled(false);

        this.nvestimenta = new NVestimenta();
        this.ncategoria = new NCategoria();
        this.nempleado = new NEmpleado();
        this.nprenda = new NPrenda();

        this.cargarCategoria();
        this.cargarEmpleado();
        this.cargarPrenda();

        this.agregardetallePrenda = new ArrayList();
        this.eliminardetallePrenda = new ArrayList<>();

        this.listar();
        this.jtf_id.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbt_crear = new javax.swing.JButton();
        jbt_editar = new javax.swing.JButton();
        jbt_eliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jsp_cantidad = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jsp_precio = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jcb_empleado = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_listar_vestimentas = new javax.swing.JTable();
        jcb_categoria = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtf_color = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jsp_stock = new javax.swing.JSpinner();
        jcb_prenda = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jbt_agregar = new javax.swing.JButton();
        jbt_quitar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_listar_prendas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbt_crear.setText("Crear");
        jbt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_crearActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jbt_editar.setText("Editar");
        jbt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_editarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jbt_eliminar.setText("Eliminar");
        jbt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Vestimenta"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jtf_id.setBorder(null);
        jPanel2.add(jtf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 70, 22));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/limpiar.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 30, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 20));

        jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Cantidad:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 60, 20));

        jsp_cantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel2.add(jsp_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Precio:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 40, 20));

        jsp_precio.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel2.add(jsp_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Empleado:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jPanel2.add(jcb_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 190, -1));

        jt_listar_vestimentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "cantidad", "precio", "empleado", "categoria"
            }
        ));
        jt_listar_vestimentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jt_listar_vestimentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_listar_vestimentasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_listar_vestimentas);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 470, 190));

        jPanel2.add(jcb_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 190, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("Categoria:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 470, 350));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("detallePrenda"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Stock:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 20));

        jtf_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_colorActionPerformed(evt);
            }
        });
        jPanel3.add(jtf_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 200, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Color:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 40, 20));

        jsp_stock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel3.add(jsp_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, -1));

        jPanel3.add(jcb_prenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 200, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Prenda:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jbt_agregar.setText("Agregar");
        jbt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_agregarActionPerformed(evt);
            }
        });
        jPanel3.add(jbt_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jbt_quitar.setText("Quitar");
        jbt_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_quitarActionPerformed(evt);
            }
        });
        jPanel3.add(jbt_quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jt_listar_prendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "prenda", "color", "stock"
            }
        ));
        jt_listar_prendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jt_listar_prendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_listar_prendasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_listar_prendas);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 350, 190));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 350, 350));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vestimenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 860, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.jtf_id.setText("");
        this.apagarbotonCrear(true);
        String[] column = {"prenda", "stock", "color"};
        this.jt_listar_prendas.setModel(new DefaultTableModel(null, column));
        this.cargarPrenda();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreActionPerformed

    private void jbt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_crearActionPerformed
        this.nombre = this.jtf_nombre.getText();
        this.cantidad = (int) this.jsp_cantidad.getValue();
        this.precio = (int) this.jsp_precio.getValue();
        this.id_categoria = Integer.valueOf(this.jcb_categoria.getSelectedItem().toString().split("-")[0]);
        this.id_empleado = Integer.valueOf(this.jcb_empleado.getSelectedItem().toString().split("-")[0]);
        this.crear();
        String[] column = {"prenda", "stock", "color"};
        this.jt_listar_prendas.setModel(new DefaultTableModel(null, column));
    }//GEN-LAST:event_jbt_crearActionPerformed

    private void jbt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_editarActionPerformed
        // TODO add your handling code here:
        this.id = Integer.valueOf(this.jtf_id.getText());
        this.nombre = this.jtf_nombre.getText();
        this.cantidad = (int) this.jsp_cantidad.getValue();
        this.precio = (int) this.jsp_precio.getValue();
        this.id_categoria = Integer.valueOf(this.jcb_categoria.getSelectedItem().toString().split("-")[0]);
        this.id_empleado = Integer.valueOf(this.jcb_empleado.getSelectedItem().toString().split("-")[0]);
        this.editar();
        String[] column = {"prenda", "stock", "color"};
        this.jt_listar_prendas.setModel(new DefaultTableModel(null, column));
    }//GEN-LAST:event_jbt_editarActionPerformed

    private void jbt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_eliminarActionPerformed
        this.id = Integer.valueOf(this.jtf_id.getText());
        this.eliminar();
        String[] column = {"prenda", "stock", "color"};
        this.jt_listar_prendas.setModel(new DefaultTableModel(null, column));
    }//GEN-LAST:event_jbt_eliminarActionPerformed

    private void jt_listar_prendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_listar_prendasMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jt_listar_prendasMouseClicked

    private void jtf_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_colorActionPerformed

    private void jt_listar_vestimentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_listar_vestimentasMouseClicked
        // TODO add your handling code here:
        this.clearLista();

        int rowSelected = this.jt_listar_vestimentas.getSelectedRow();
        this.jtf_id.setText(this.jt_listar_vestimentas.getValueAt(rowSelected, 0).toString());
        this.jtf_nombre.setText(this.jt_listar_vestimentas.getValueAt(rowSelected, 1).toString());
        this.jsp_cantidad.setValue(Integer.valueOf(this.jt_listar_vestimentas.getValueAt(rowSelected, 2).toString()));
        this.jsp_precio.setValue(Integer.valueOf(this.jt_listar_vestimentas.getValueAt(rowSelected, 3).toString()));
        this.jcb_empleado.setSelectedItem(this.jt_listar_vestimentas.getValueAt(rowSelected, 4).toString());
        this.jcb_categoria.setSelectedItem(this.jt_listar_vestimentas.getValueAt(rowSelected, 5).toString());
        this.apagarbotonCrear(false);

        int id_vestimenta = (this.jt_listar_vestimentas.getValueAt(rowSelected, 0).toString() == "") ? 0 : Integer.valueOf(this.jt_listar_vestimentas.getValueAt(rowSelected, 0).toString());

        listardetallePrenda(id_vestimenta);
    }//GEN-LAST:event_jt_listar_vestimentasMouseClicked

    private void jbt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_agregarActionPerformed
        //Boton Agregar
        Object[] agregar = {
            this.jcb_prenda.getSelectedItem().toString(),
            this.jsp_stock.getValue().toString(),
            this.jtf_color.getText(),};
        agregardetallePrenda.add(agregar);

        int id_categoria = (this.jtf_id.getText().isEmpty()) ? 0 : Integer.valueOf(this.jtf_id.getText());
        this.listardetallePrenda(id_categoria);
    }//GEN-LAST:event_jbt_agregarActionPerformed

    private void jbt_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_quitarActionPerformed
        //Boton Quitar
        int rowSelect = this.jt_listar_prendas.getSelectedRow();
        Object[] elementoAQuitar = {
            this.jt_listar_prendas.getValueAt(rowSelect, 0).toString(),
            this.jt_listar_prendas.getValueAt(rowSelect, 1).toString(),
            this.jt_listar_prendas.getValueAt(rowSelect, 2).toString(),};

        if (buscarEliminar(agregardetallePrenda, elementoAQuitar)) {
            DefaultTableModel dm = (DefaultTableModel) this.jt_listar_prendas.getModel();
            dm.removeRow(rowSelect);
        } else {
            this.eliminardetallePrenda.add(elementoAQuitar);
            DefaultTableModel dm = (DefaultTableModel) this.jt_listar_prendas.getModel();
            dm.removeRow(rowSelect);
        }
    }//GEN-LAST:event_jbt_quitarActionPerformed

    public int indiceEliminar(String id, ArrayList<Object[]> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (id.equals(lista.get(i)[0].toString())) {
                return i;
            }
        }
        return -1;
    }

    private boolean buscarEliminar(ArrayList<Object[]> lista, Object[] buscar) {
        String prendaBuscar = String.valueOf(buscar[0]);
        String colorBuscar = String.valueOf(buscar[1]);
        String stockBuscar = String.valueOf(buscar[2]);
        for (int i = 0; i < lista.size(); i++) {
            String prenda = String.valueOf(lista.get(i)[0]);
            String color = String.valueOf(lista.get(i)[1]);
            String stock = String.valueOf(lista.get(i)[2]);
            if (prendaBuscar == prenda && colorBuscar == color && stockBuscar == stock) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }

    private void crear() {
        if (this.nvestimenta.crear(this.nombre, this.cantidad, this.precio, this.id_empleado, this.id_categoria, this.agregardetallePrenda)) {
            JOptionPane.showMessageDialog(null, "Se Inserto Correctamente", "Crear", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Insertar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void eliminar() {
        if (this.nvestimenta.eliminar(this.id)) {
            JOptionPane.showMessageDialog(null, "Se Elimino correctamente", "Eliminacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Eliminar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void editar() {
        if (this.nvestimenta.editar(this.id, this.nombre, this.cantidad, this.precio, this.id_empleado, this.id_categoria, agregardetallePrenda, eliminardetallePrenda)) {
            JOptionPane.showMessageDialog(null, "Se Edito Correctamen", "Edicion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Editar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void listar() {
        ArrayList<Object[]> vestimentas = new ArrayList<>();
        vestimentas = this.nvestimenta.listar();
        String data[][] = (vestimentas.size() != 0) ? new String[vestimentas.size()][vestimentas.get(0).length] : null;
        for (int i = 0; i < vestimentas.size(); i++) {
            data[i][0] = String.valueOf(vestimentas.get(i)[0]);
            data[i][1] = String.valueOf(vestimentas.get(i)[1]);
            data[i][2] = String.valueOf(vestimentas.get(i)[2]);
            data[i][3] = String.valueOf(vestimentas.get(i)[3]);
            data[i][4] = String.valueOf(vestimentas.get(i)[4]);
            data[i][5] = String.valueOf(vestimentas.get(i)[5]);
        }
        String[] column = {"id", "nombre", "cantidad", "precio", "empleado", "categoria"};
        this.jt_listar_vestimentas.setModel(new DefaultTableModel(data, column));
    }

    private void listardetallePrenda(int id_vestimenta) {
        ArrayList<Object[]> detallePrenda = new ArrayList<>();
        detallePrenda = (id_vestimenta == 0) ? null : this.nvestimenta.listarDetallePrenda(id_vestimenta);
        int cantidaddetalleprenda = (detallePrenda == null) ? 0 : detallePrenda.size();
        int cantidadagregado = (agregardetallePrenda == null) ? 0 : agregardetallePrenda.size();

        ActualizarPrenda(cantidaddetalleprenda, detallePrenda);

        int x = cantidaddetalleprenda + cantidadagregado;
        System.out.println(x);

        String data[][] = (x != 0) ? new String[x][3] : null;
        int i = 0;
        while (i < cantidaddetalleprenda) {
            data[i][0] = String.valueOf(detallePrenda.get(i)[0]);
            data[i][1] = String.valueOf(detallePrenda.get(i)[1]);
            data[i][2] = String.valueOf(detallePrenda.get(i)[2]);
            i++;
        }
        int j = 0;
        while (j < cantidadagregado) {
            data[i][0] = String.valueOf(agregardetallePrenda.get(j)[0]);
            data[i][1] = String.valueOf(agregardetallePrenda.get(j)[1]);
            data[i][2] = String.valueOf(agregardetallePrenda.get(j)[2]);
            i++;
            j++;
        }
        String[] column = {"prenda", "stock", "color"};
        this.jt_listar_prendas.setModel(new DefaultTableModel(data, column));
    }

    private void cargarEmpleado() {
        ArrayList<Object[]> empleados = new ArrayList<>();
        empleados = this.nempleado.listar();
        for (Object[] empleado : empleados) {
            this.jcb_empleado.addItem(empleado[0] + "-" + empleado[1]);
        }
    }

    private void ActualizarPrenda(int cantidaddetalleprenda, ArrayList<Object[]> detallePrenda) {
        ArrayList<Object[]> vestimentas = new ArrayList<>();
        vestimentas = this.nprenda.listar();
        if (cantidaddetalleprenda != 0) {
            for (Object[] detalle : detallePrenda) {
                String id = detalle[0].toString().split("-")[0];
                int indiceAEliminar = indiceEliminar(id, vestimentas);
                if (indiceAEliminar != -1) {
                    vestimentas.remove(indiceAEliminar);
                }
            }
        }

        for (Object[] agregar : agregardetallePrenda) {
            String id = agregar[0].toString().split("-")[0];
            int indiceAEliminar = indiceEliminar(id, vestimentas);
            if (indiceAEliminar != -1) {
                vestimentas.remove(indiceAEliminar);
            }
        }
        this.jcb_prenda.removeAllItems();
        if (vestimentas.isEmpty()) {
            this.jbt_agregar.setEnabled(false);
            this.jcb_prenda.setEnabled(false);
            this.jtf_color.setEnabled(false);
            this.jsp_stock.setEnabled(false);
        } else {
            for (Object[] vestimenta : vestimentas) {
                this.jcb_prenda.addItem(vestimenta[0] + "-" + vestimenta[1]);
            }
            this.jbt_agregar.setEnabled(true);
            this.jcb_prenda.setEnabled(true);
            this.jtf_color.setEnabled(true);
            this.jsp_stock.setEnabled(true);
        }
    }

    private void cargarCategoria() {
        ArrayList<Object[]> categorias = new ArrayList<>();
        categorias = this.ncategoria.listar();
        for (Object[] empleado : categorias) {
            this.jcb_categoria.addItem(empleado[0] + "-" + empleado[1]);
        }
    }

    private void cargarPrenda() {
        this.jcb_prenda.removeAllItems();
        ArrayList<Object[]> categorias = new ArrayList<>();
        categorias = this.nprenda.listar();
        for (Object[] empleado : categorias) {
            this.jcb_prenda.addItem(empleado[0] + "-" + empleado[1]);
        }
        this.jbt_agregar.setEnabled(true);
        this.jcb_prenda.setEnabled(true);
        this.jtf_color.setEnabled(true);
        this.jsp_stock.setEnabled(true);
    }

    private void limpiar() {
        // Vestimenta
        this.jtf_id.setText("");
        this.jtf_nombre.setText("");
        this.jsp_cantidad.setValue(0);
        this.jsp_precio.setValue(0);
        this.jcb_categoria.setSelectedIndex(0);
        this.jcb_empleado.setSelectedIndex(0);

        //Prendas
        //this.jcb_prenda.setSelectedIndex(0);
        this.jtf_color.setText("");
        this.jsp_stock.setValue(0);

        this.apagarbotonCrear(true);

        //limpiar listas
        this.agregardetallePrenda.clear();
        this.eliminardetallePrenda.clear();
    }

    private void apagarbotonCrear(boolean valor) {
        this.jbt_editar.setEnabled(!valor);
        this.jbt_eliminar.setEnabled(!valor);
        this.jbt_crear.setEnabled(valor);
    }

    private void clearLista() {
        this.agregardetallePrenda.clear();
        this.eliminardetallePrenda.clear();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(PVestimenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PVestimenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PVestimenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PVestimenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PVestimenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbt_agregar;
    private javax.swing.JButton jbt_crear;
    private javax.swing.JButton jbt_editar;
    private javax.swing.JButton jbt_eliminar;
    private javax.swing.JButton jbt_quitar;
    private javax.swing.JComboBox<String> jcb_categoria;
    private javax.swing.JComboBox<String> jcb_empleado;
    private javax.swing.JComboBox<String> jcb_prenda;
    private javax.swing.JSpinner jsp_cantidad;
    private javax.swing.JSpinner jsp_precio;
    private javax.swing.JSpinner jsp_stock;
    private javax.swing.JTable jt_listar_prendas;
    private javax.swing.JTable jt_listar_vestimentas;
    private javax.swing.JTextField jtf_color;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables

}
