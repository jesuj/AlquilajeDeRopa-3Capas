package Presentacion;

import Negocio.NCliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oni
 */
public class PCliente extends javax.swing.JFrame {
    
    private int id;
    private String nombre;
    private String ci;
    private String telefono;
    private String fecha_nacimiento;
    private String sexo;
    private String direccion;
    
    private NCliente ncliente;
    
    /**
     * Creates new form PCliente
     */
    public PCliente() {
        initComponents();
        this.ncliente= new NCliente();
        this.listar();
        this.apagarbotonCrear(true);
        this.jtf_id.setEditable(false);
        this.jtf_id.setEnabled(false);
        this.setSize(761,456);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_listar = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcb_sexo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_direccion = new javax.swing.JTextArea();
        jbt_crear = new javax.swing.JButton();
        jbt_editar = new javax.swing.JButton();
        jbt_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_ci = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jdc_facha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_listar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "ci", "telefono", "birthday", "sexo", "direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_listar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jt_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_listarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_listar);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 470, 310));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jtf_id.setBorder(null);
        jPanel1.add(jtf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 70, 22));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/limpiar.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 30, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 20));

        jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("sexo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, 20));

        jcb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));
        jPanel1.add(jcb_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("direccion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, -1));

        jta_direccion.setColumns(20);
        jta_direccion.setRows(5);
        jScrollPane1.setViewportView(jta_direccion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 180, 120));

        jbt_crear.setText("Crear");
        jbt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_crearActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jbt_editar.setText("Editar");
        jbt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_editarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jbt_eliminar.setText("Eliminar");
        jbt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 740, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("CI:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 20, 20));

        jtf_ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_ciActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, -1));

        jtf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("birthday:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("telefono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 20));

        jdc_facha.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jdc_facha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_listarMouseClicked
        int rowSelected = this.jt_listar.getSelectedRow();
        this.jtf_id.setText(this.jt_listar.getValueAt(rowSelected, 0).toString());
        this.jtf_nombre.setText(this.jt_listar.getValueAt(rowSelected, 1).toString());
        this.jtf_ci.setText(this.jt_listar.getValueAt(rowSelected, 2).toString());
        this.jtf_telefono.setText(this.jt_listar.getValueAt(rowSelected, 3).toString());
        String fecha =this.jt_listar.getValueAt(rowSelected, 4).toString();
        try {
            this.jdc_facha.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(fecha));
        } catch (ParseException ex) {
            Logger.getLogger(PCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jcb_sexo.setSelectedIndex(this.setSexo(this.jt_listar.getValueAt(rowSelected, 5).toString()));
        this.jta_direccion.setText(this.jt_listar.getValueAt(rowSelected, 6).toString());
        this.apagarbotonCrear(false);
    }//GEN-LAST:event_jt_listarMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.jtf_id.setText("");
        this.apagarbotonCrear(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreActionPerformed

    private void jbt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_crearActionPerformed
        this.nombre = this.jtf_nombre.getText();
        this.ci = this.jtf_ci.getText();
        this.telefono = this.jtf_telefono.getText();
        this.fecha_nacimiento = this.jdc_facha.getDate().toString();
        this.sexo = this.getSexo();
        this.direccion = this.jta_direccion.getText();
        this.crear();
    }//GEN-LAST:event_jbt_crearActionPerformed

    private void jbt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_editarActionPerformed
        // TODO add your handling code here:
        this.id = Integer.valueOf(this.jtf_id.getText());
        this.nombre = this.jtf_nombre.getText();
        this.ci = this.jtf_ci.getText();
        this.telefono = this.jtf_telefono.getText();
        this.fecha_nacimiento = this.jdc_facha.getDate().toString();
        this.sexo = this.getSexo();
        this.direccion = this.jta_direccion.getText();
        this.editar();
    }//GEN-LAST:event_jbt_editarActionPerformed

    private void jbt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_eliminarActionPerformed
        this.id = Integer.valueOf(this.jtf_id.getText());
        this.eliminar();
    }//GEN-LAST:event_jbt_eliminarActionPerformed

    private void jtf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_telefonoActionPerformed

    private void jtf_ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_ciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_ciActionPerformed

    
    private void crear() {
        if (this.ncliente.crear(this.nombre,this.ci, this.telefono,this.fecha_nacimiento,this.sexo,this.direccion)){
            JOptionPane.showMessageDialog(null, "Se Inserto Correctamente", "Crear", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Insertar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void eliminar() {
        if (this.ncliente.eliminar(this.id)){
            JOptionPane.showMessageDialog(null, "Se Elimino correctamente", "Eliminacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Eliminar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void editar() {
        if (this.ncliente.editar(this.id, this.nombre,this.ci, this.telefono,this.fecha_nacimiento,this.sexo,this.direccion)){
            JOptionPane.showMessageDialog(null, "Se Edito Correctamen", "Edicion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Editar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void listar() {
        ArrayList<Object[]> clientes = new ArrayList<>();
        clientes = this.ncliente.listar();
        String data[][]= (clientes.size() != 0)? new String[clientes.size()][clientes.get(0).length]:null ;
            for (int i = 0; i < clientes.size(); i++) {
                data[i][0] = String.valueOf(clientes.get(i)[0]);
                data[i][1] = String.valueOf(clientes.get(i)[1]);
                data[i][2] = String.valueOf(clientes.get(i)[2]);
                data[i][3] = String.valueOf(clientes.get(i)[3]);
                data[i][4] = String.valueOf(clientes.get(i)[4]);
                data[i][5] = String.valueOf(clientes.get(i)[5]);
                data[i][6] = String.valueOf(clientes.get(i)[6]);
            }
            String[] column = {"id", "nombre","ci","telefono","birthday","sexo","direccion"};
            this.jt_listar.setModel(new DefaultTableModel(data, column));
    }

    private void limpiar() {
        this.jtf_id.setText("");
        this.jtf_nombre.setText("");
        this.jtf_ci.setText("");
        this.jtf_telefono.setText("");
        this.jdc_facha.setDate(null);
        this.jcb_sexo.setSelectedIndex(0);
        this.jta_direccion.setText("");
        this.apagarbotonCrear(true);
    }
    
    private void apagarbotonCrear(boolean valor){
        this.jbt_editar.setEnabled(!valor);
        this.jbt_eliminar.setEnabled(!valor);
        this.jbt_crear.setEnabled(valor);
    }
    
    private String getSexo(){
        switch(this.jcb_sexo.getSelectedItem().toString()){
            case "MASCULINO":
                return "'MAS'";
            case "FEMENINO":
                return "'FEM'";
        }
        return "'MAS'";
    }
    
    private int setSexo(String valor){
        switch(valor){
            case "MAS":
                return 0;
            case "FEM":
                return 1;
        }
        return 0;
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
            java.util.logging.Logger.getLogger(PCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbt_crear;
    private javax.swing.JButton jbt_editar;
    private javax.swing.JButton jbt_eliminar;
    private javax.swing.JComboBox<String> jcb_sexo;
    private com.toedter.calendar.JDateChooser jdc_facha;
    private javax.swing.JTable jt_listar;
    private javax.swing.JTextArea jta_direccion;
    private javax.swing.JTextField jtf_ci;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
