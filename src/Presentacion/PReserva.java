package Presentacion;

import Negocio.NCategoria;
import Negocio.NCliente;
import Negocio.NEmpleado;
import Negocio.NPrenda;
import Negocio.NReserva;
import Negocio.NVestimenta;
import Negocio.State.Estado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oni
 */
public class PReserva extends javax.swing.JFrame {

    private int id;
    private String titulo;
    private String garantia;
    private String fechaInicio;
    private String fechaFin;
    private String estado;

    private int id_cliente;

    private NCliente ncliente;

    private NVestimenta nvestimenta;

    private NReserva nreserva;
    private ArrayList<Object[]> agregardetalleReserva;
    private ArrayList<Object[]> eliminardetalleReserva;

    //Patron Estado
    private Estado patronEstado;
    /**
     * Creates new form PVestimenta
     */
    public PReserva() {
        initComponents();
        this.jtf_id.setEditable(false);
        this.jtf_id.setEnabled(false);

        this.ncliente = new NCliente();
        this.nvestimenta = new NVestimenta();

        this.nreserva = new NReserva();

        this.cargarCliente();
        this.cargarVestimenta();

        this.agregardetalleReserva = new ArrayList();
        this.eliminardetalleReserva = new ArrayList<>();

        this.listar();
        this.jtf_id.setText("");
        
        this.patronEstado = new Estado();
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
        jl_limpiador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_garantia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcb_cliente = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_listar_reserva = new javax.swing.JTable();
        jcb_estado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jdc_fachaFin = new com.toedter.calendar.JDateChooser();
        jdc_fachaInicio = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jtf_titulo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jsp_cantidad = new javax.swing.JSpinner();
        jcb_vestimenta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jbt_agregar = new javax.swing.JButton();
        jbt_quitar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_listar_vestimenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbt_crear.setText("Crear");
        jbt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_crearActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jbt_editar.setText("Editar");
        jbt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_editarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        jbt_eliminar.setText("Eliminar");
        jbt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Reserva"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jtf_id.setBorder(null);
        jPanel2.add(jtf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 70, 22));

        jl_limpiador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_limpiador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/limpiar.png"))); // NOI18N
        jl_limpiador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jl_limpiador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_limpiadorMouseClicked(evt);
            }
        });
        jPanel2.add(jl_limpiador, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("garantia:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 20));

        jtf_garantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_garantiaActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_garantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("fechaInicio:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 70, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("fechaFin:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 60, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Cliente:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jPanel2.add(jcb_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 190, -1));

        jt_listar_reserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "cliente", "titulo", "garantia", "fechaInicio", "fechaFin", "estado"
            }
        ));
        jt_listar_reserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jt_listar_reserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_listar_reservaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_listar_reserva);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 510, 180));

        jcb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENRESERVA", "ENTREGADO", "REVISION", "DEVUELTO" }));
        jcb_estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb_estadoMouseClicked(evt);
            }
        });
        jcb_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_estadoActionPerformed(evt);
            }
        });
        jPanel2.add(jcb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 190, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("estado:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jdc_fachaFin.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(jdc_fachaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 140, 30));

        jdc_fachaInicio.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(jdc_fachaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 140, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("titulo:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, 20));

        jtf_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tituloActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 510, 360));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("detalleReserva"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Cantidad:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 20));

        jsp_cantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel3.add(jsp_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 90, -1));

        jPanel3.add(jcb_vestimenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Vestimenta:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

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

        jt_listar_vestimenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "vestimenta", "cantidad"
            }
        ));
        jt_listar_vestimenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jt_listar_vestimenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_listar_vestimentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_listar_vestimenta);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 310, 190));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 310, 360));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reserva");
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

    private void jl_limpiadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_limpiadorMouseClicked
        // TODO add your handling code here:
        this.jtf_id.setText("");
        this.apagarbotonCrear(true);
        String[] column = {"prenda", "stock", "color"};
        this.jt_listar_vestimenta.setModel(new DefaultTableModel(null, column));
        this.cargarVestimenta();
        this.patronEstado = new Estado();
    }//GEN-LAST:event_jl_limpiadorMouseClicked

    private void jtf_garantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_garantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_garantiaActionPerformed

    private void jbt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_crearActionPerformed
        this.titulo = this.jtf_titulo.getText();
        this.garantia = this.jtf_garantia.getText();
        this.fechaInicio = this.jdc_fachaInicio.getDate().toString();
        this.fechaFin = this.jdc_fachaFin.getDate().toString();
        
//        this.estado = getEstado(this.jcb_estado.getSelectedIndex());
        this.estado = this.patronEstado.getNombre();
        this.id_cliente = Integer.valueOf(this.jcb_cliente.getSelectedItem().toString().split("-")[0]);
        this.crear();
        String[] column = {"vestimenta", "cantidad"};
        this.jt_listar_vestimenta.setModel(new DefaultTableModel(null, column));
    }//GEN-LAST:event_jbt_crearActionPerformed

    private void jbt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_editarActionPerformed
        // TODO add your handling code here:
        this.id = Integer.valueOf(this.jtf_id.getText());
        this.titulo = this.jtf_titulo.getText();
        this.garantia = this.jtf_garantia.getText();
        this.fechaInicio = this.jdc_fachaInicio.getDate().toString();
        this.fechaFin = this.jdc_fachaFin.getDate().toString();
        
//        this.estado = getEstado(this.jcb_estado.getSelectedIndex());
        this.estado = this.patronEstado.getNombre();
        this.id_cliente = Integer.valueOf(this.jcb_cliente.getSelectedItem().toString().split("-")[0]);
        this.editar();
        String[] column = {"vestimenta", "cantidad"};
        this.jt_listar_vestimenta.setModel(new DefaultTableModel(null, column));
    }//GEN-LAST:event_jbt_editarActionPerformed

    private void jbt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_eliminarActionPerformed
        this.id = Integer.valueOf(this.jtf_id.getText());
        this.eliminar();
        String[] column = {"vestimenta", "cantidad"};
        this.jt_listar_vestimenta.setModel(new DefaultTableModel(null, column));
    }//GEN-LAST:event_jbt_eliminarActionPerformed

    private void jt_listar_vestimentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_listar_vestimentaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jt_listar_vestimentaMouseClicked

    private void jt_listar_reservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_listar_reservaMouseClicked
        // TODO add your handling code here:
        this.clearLista();

        int rowSelected = this.jt_listar_reserva.getSelectedRow();

        this.jtf_id.setText(this.jt_listar_reserva.getValueAt(rowSelected, 0).toString());
        this.jcb_cliente.setSelectedItem(this.jt_listar_reserva.getValueAt(rowSelected, 1).toString());
        this.jtf_titulo.setText(this.jt_listar_reserva.getValueAt(rowSelected, 2).toString());
        this.jtf_garantia.setText(this.jt_listar_reserva.getValueAt(rowSelected, 3).toString());
        String fechaInicio = this.jt_listar_reserva.getValueAt(rowSelected, 4).toString();
        String fechaFin = this.jt_listar_reserva.getValueAt(rowSelected, 5).toString();
        try {
            this.jdc_fachaInicio.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(fechaInicio));
            this.jdc_fachaFin.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(fechaFin));
        } catch (ParseException ex) {
            Logger.getLogger(PCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        String estadoSeleccionado = this.jt_listar_reserva.getValueAt(rowSelected, 6).toString();
        this.jcb_estado.setSelectedItem(estadoSeleccionado);
        this.patronEstado = new Estado(estadoSeleccionado);

        this.apagarbotonCrear(false);

        int id_vestimenta = (this.jtf_id.getText() == "") ? 0 : Integer.valueOf(this.jtf_id.getText());

        listardetalleReserva(id_vestimenta);
    }//GEN-LAST:event_jt_listar_reservaMouseClicked

    private void jbt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_agregarActionPerformed
        //Boton Agregar
        Object[] agregar = {
            this.jcb_vestimenta.getSelectedItem().toString(),
            this.jsp_cantidad.getValue().toString()};

        agregardetalleReserva.add(agregar);

        int id_reserva = (this.jtf_id.getText().isEmpty()) ? 0 : Integer.valueOf(this.jtf_id.getText());
        this.listardetalleReserva(id_reserva);
    }//GEN-LAST:event_jbt_agregarActionPerformed

    private void jbt_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_quitarActionPerformed
        //Boton Quitar
        int rowSelect = this.jt_listar_vestimenta.getSelectedRow();
        Object[] elementoAQuitar = {
            this.jt_listar_vestimenta.getValueAt(rowSelect, 0).toString(),
            this.jt_listar_vestimenta.getValueAt(rowSelect, 1).toString()};

        if (buscarEliminar(agregardetalleReserva, elementoAQuitar)) {
            DefaultTableModel dm = (DefaultTableModel) this.jt_listar_vestimenta.getModel();
            dm.removeRow(rowSelect);
        } else {
            this.eliminardetalleReserva.add(elementoAQuitar);
            DefaultTableModel dm = (DefaultTableModel) this.jt_listar_vestimenta.getModel();
            dm.removeRow(rowSelect);
        }
    }//GEN-LAST:event_jbt_quitarActionPerformed

    private void jtf_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tituloActionPerformed

    private void jcb_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_estadoActionPerformed
        // Patron State
        switch(jcb_estado.getSelectedIndex()){
            case 0:
                this.patronEstado.getEstado().reservar(patronEstado);
                break;
            case 1:
                this.patronEstado.getEstado().entregar(patronEstado);
                break;                
            case 2:
                this.patronEstado.getEstado().revision(patronEstado);
                break;
            case 3:
                this.patronEstado.getEstado().devolucion(patronEstado);
                break;
        }
        
        JOptionPane.showMessageDialog(null,this.patronEstado.getMensaje());
        
    }//GEN-LAST:event_jcb_estadoActionPerformed

    private void jcb_estadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_estadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_estadoMouseClicked

    private boolean buscarEliminar(ArrayList<Object[]> lista, Object[] buscar) {
        String vestimentaBuscar = String.valueOf(buscar[0]);
        String cantidadBuscar = String.valueOf(buscar[1]);
        for (int i = 0; i < lista.size(); i++) {
            String vestimenta = String.valueOf(lista.get(i)[0]);
            String cantidad = String.valueOf(lista.get(i)[1]);
            if (vestimentaBuscar == vestimenta && cantidadBuscar == cantidad) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }

    private void crear() {
        if (this.nreserva.crear(this.id_cliente, this.titulo, this.garantia, this.fechaInicio, this.fechaFin, this.estado, this.agregardetalleReserva)) {
            JOptionPane.showMessageDialog(null, "Se Inserto Correctamente", "Crear", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Insertar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void eliminar() {
        if (this.nreserva.eliminar(this.id)) {
            JOptionPane.showMessageDialog(null, "Se Elimino correctamente", "Eliminacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Eliminar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void editar() {
        if (this.nreserva.editar(this.id, this.id_cliente, this.titulo, this.garantia, this.fechaInicio, this.fechaFin, this.estado, agregardetalleReserva, eliminardetalleReserva)) {
            JOptionPane.showMessageDialog(null, "Se Edito Correctamen", "Edicion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Editar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void listar() {
        ArrayList<Object[]> reservas = new ArrayList<>();
        reservas = this.nreserva.listar();
        String data[][] = (reservas.size() != 0) ? new String[reservas.size()][reservas.get(0).length] : null;
        for (int i = 0; i < reservas.size(); i++) {
            data[i][0] = String.valueOf(reservas.get(i)[0]);
            data[i][1] = String.valueOf(reservas.get(i)[1]);
            data[i][2] = String.valueOf(reservas.get(i)[2]);
            data[i][3] = String.valueOf(reservas.get(i)[3]);
            data[i][4] = String.valueOf(reservas.get(i)[4]);
            data[i][5] = String.valueOf(reservas.get(i)[5]);
            data[i][6] = String.valueOf(reservas.get(i)[6]);
        }
        String[] column = {"id", "cliente", "titulo", "garantia", "fechaInicio", "fechaFin", "estado"};
        this.jt_listar_reserva.setModel(new DefaultTableModel(data, column));
    }

    public int indiceEliminar(String id, ArrayList<Object[]> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (id.equals(lista.get(i)[0].toString())) {
                return i;
            }
        }
        return -1;
    }

    private void listardetalleReserva(int id_reserva) {
        ArrayList<Object[]> detalleReserva = new ArrayList<>();
        detalleReserva = (id_reserva == 0) ? null : this.nreserva.listarDetalleReserva(id_reserva);
        int cantidaddetalleprenda = (detalleReserva == null) ? 0 : detalleReserva.size();
        int cantidadagregado = (agregardetalleReserva == null) ? 0 : agregardetalleReserva.size();

        ActualizarVestimenta(cantidaddetalleprenda, detalleReserva);

        int x = cantidaddetalleprenda + cantidadagregado;
        System.out.println(x);

        String data[][] = (x != 0) ? new String[x][3] : null;
        int i = 0;
        while (i < cantidaddetalleprenda) {
            data[i][0] = String.valueOf(detalleReserva.get(i)[0]);
            data[i][1] = String.valueOf(detalleReserva.get(i)[1]);
            i++;
        }
        int j = 0;
        while (j < cantidadagregado) {
            data[i][0] = String.valueOf(agregardetalleReserva.get(j)[0]);
            data[i][1] = String.valueOf(agregardetalleReserva.get(j)[1]);
            i++;
            j++;
        }
        String[] column = {"vestimenta", "cantidad"};
        this.jt_listar_vestimenta.setModel(new DefaultTableModel(data, column));
    }

    private void ActualizarVestimenta(int cantidaddetalleprenda, ArrayList<Object[]> detalleReserva) {
        ArrayList<Object[]> vestimentas = new ArrayList<>();
        vestimentas = this.nvestimenta.listar();
        if (cantidaddetalleprenda != 0) {
            for (Object[] detalle : detalleReserva) {
                String id = detalle[0].toString().split("-")[0];
                int indiceAEliminar = indiceEliminar(id, vestimentas);
                if (indiceAEliminar != -1) {
                    vestimentas.remove(indiceAEliminar);
                }
            }
        }

        for (Object[] agregar : agregardetalleReserva) {
            String id = agregar[0].toString().split("-")[0];
            int indiceAEliminar = indiceEliminar(id, vestimentas);
            if (indiceAEliminar != -1) {
                vestimentas.remove(indiceAEliminar);
            }
        }
        this.jcb_vestimenta.removeAllItems();
        if (vestimentas.isEmpty()) {
            this.jbt_agregar.setEnabled(false);
            this.jcb_vestimenta.setEnabled(false);
            this.jsp_cantidad.setEnabled(false);
        } else {
            for (Object[] vestimenta : vestimentas) {
                this.jcb_vestimenta.addItem(vestimenta[0] + "-" + vestimenta[1]);
            }
            this.jbt_agregar.setEnabled(true);
            this.jcb_vestimenta.setEnabled(true);
            this.jsp_cantidad.setEnabled(true);
        }
    }

    private void cargarCliente() {
        ArrayList<Object[]> clientes = new ArrayList<>();
        clientes = this.ncliente.listar();
        for (Object[] cliente : clientes) {
            this.jcb_cliente.addItem(cliente[0] + "-" + cliente[1]);
        }
    }

    private void cargarVestimenta() {
        this.jcb_vestimenta.removeAllItems();
        ArrayList<Object[]> vestimentas = new ArrayList<>();
        vestimentas = this.nvestimenta.listar();
        for (Object[] vestimenta : vestimentas) {
            this.jcb_vestimenta.addItem(vestimenta[0] + "-" + vestimenta[1]);
        }
        this.jbt_agregar.setEnabled(true);
        this.jcb_vestimenta.setEnabled(true);
        this.jsp_cantidad.setEnabled(true);
    }

    private void limpiar() {
        // Reserva
        this.jtf_id.setText("");
        this.jtf_titulo.setText("");
        this.jtf_garantia.setText("");
        this.jdc_fachaInicio.setDate(null);
        this.jdc_fachaFin.setDate(null);

        this.jcb_estado.setSelectedIndex(0);
        this.jcb_cliente.setSelectedIndex(0);

        //Vestimenta
        //this.jcb_vestimenta.setSelectedIndex(0);
        this.jsp_cantidad.setValue(0);

        this.apagarbotonCrear(true);

        //limpiar listas
        this.agregardetalleReserva.clear();
        this.eliminardetalleReserva.clear();
    }

    private void apagarbotonCrear(boolean valor) {
        this.jbt_editar.setEnabled(!valor);
        this.jbt_eliminar.setEnabled(!valor);
        this.jbt_crear.setEnabled(valor);
    }

    private void clearLista() {
        this.agregardetalleReserva.clear();
        this.eliminardetalleReserva.clear();
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
            java.util.logging.Logger.getLogger(PReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JComboBox<String> jcb_cliente;
    private javax.swing.JComboBox<String> jcb_estado;
    private javax.swing.JComboBox<String> jcb_vestimenta;
    private com.toedter.calendar.JDateChooser jdc_fachaFin;
    private com.toedter.calendar.JDateChooser jdc_fachaInicio;
    private javax.swing.JLabel jl_limpiador;
    private javax.swing.JSpinner jsp_cantidad;
    private javax.swing.JTable jt_listar_reserva;
    private javax.swing.JTable jt_listar_vestimenta;
    private javax.swing.JTextField jtf_garantia;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_titulo;
    // End of variables declaration//GEN-END:variables


}
