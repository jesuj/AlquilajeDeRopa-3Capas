package Presentacion;

import Negocio.NCategoria;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oni
 */
public class PCategoria extends javax.swing.JFrame {

    private NCategoria ncategoria;

    private int id;
    private String nombre;
    private String descripcion;

    /**
     * Creates new form PCategorias
     */
    public PCategoria() {
        initComponents();
        ncategoria = new NCategoria();
        this.listar();
        this.apagarbotonCrear(true);
        this.jtf_id.setEditable(false);
        this.jtf_id.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_descripcion = new javax.swing.JTextArea();
        jbt_crear = new javax.swing.JButton();
        jbt_editar = new javax.swing.JButton();
        jbt_eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_listar = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Categorias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 740, -1));

        jtf_id.setBorder(null);
        jPanel1.add(jtf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, 22));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 20));

        jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("descripcion :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jta_descripcion.setColumns(20);
        jta_descripcion.setRows(5);
        jScrollPane1.setViewportView(jta_descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 180, 120));

        jbt_crear.setText("Crear");
        jbt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_crearActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jbt_editar.setText("Editar");
        jbt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_editarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jbt_eliminar.setText("Eliminar");
        jbt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jt_listar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        if (jt_listar.getColumnModel().getColumnCount() > 0) {
            jt_listar.getColumnModel().getColumn(0).setMinWidth(50);
            jt_listar.getColumnModel().getColumn(0).setPreferredWidth(40);
            jt_listar.getColumnModel().getColumn(0).setMaxWidth(40);
            jt_listar.getColumnModel().getColumn(1).setResizable(false);
            jt_listar.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 400, 310));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/limpiar.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 30, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreActionPerformed

    private void jbt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_crearActionPerformed
        // TODO add your handling code here:
        this.nombre = this.jtf_nombre.getText();
        this.descripcion = this.jta_descripcion.getText();
        this.crear();
    }//GEN-LAST:event_jbt_crearActionPerformed

    private void jbt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_editarActionPerformed
        // TODO add your handling code here:
        this.id = Integer.valueOf(this.jtf_id.getText());
        this.nombre = this.jtf_nombre.getText();
        this.descripcion = this.jta_descripcion.getText();
        this.editar();
    }//GEN-LAST:event_jbt_editarActionPerformed

    private void jt_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_listarMouseClicked
        // TODO add your handling code here:
        int rowSelected = this.jt_listar.getSelectedRow();
        this.jtf_id.setText(this.jt_listar.getValueAt(rowSelected, 0).toString());
        this.jtf_nombre.setText(this.jt_listar.getValueAt(rowSelected, 1).toString());
        this.jta_descripcion.setText(this.jt_listar.getValueAt(rowSelected, 2).toString());
        this.apagarbotonCrear(false);
    }//GEN-LAST:event_jt_listarMouseClicked

    private void jbt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_eliminarActionPerformed
        this.id = Integer.valueOf(this.jtf_id.getText());
        this.eliminar();
    }//GEN-LAST:event_jbt_eliminarActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.jtf_id.setText("");
        this.apagarbotonCrear(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void crear() {
        if (this.ncategoria.crear(nombre, descripcion)) {
            JOptionPane.showMessageDialog(null, "Se Inserto Correctamente", "Crear", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Insertar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void eliminar() {
        if (this.ncategoria.eliminar(this.id)) {
            JOptionPane.showMessageDialog(null, "Se Elimino correctamente", "Eliminacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Eliminar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void editar() {
        if (this.ncategoria.editar(this.id, this.nombre, this.descripcion)) {
            JOptionPane.showMessageDialog(null, "Se Edito Correctamen", "Edicion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Editar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void listar() {
        ArrayList<Object[]> categorias = new ArrayList<>();
        categorias = ncategoria.listar();
        String data[][] = (categorias.size() != 0) ? new String[categorias.size()][categorias.get(0).length] : null;
        for (int i = 0; i < categorias.size(); i++) {
            data[i][0] = String.valueOf(categorias.get(i)[0]);
            data[i][1] = String.valueOf(categorias.get(i)[1]);
            data[i][2] = String.valueOf(categorias.get(i)[2]);
        }
        String[] column = {"id", "nombre", "descripcion"};
        this.jt_listar.setModel(new DefaultTableModel(data, column));

//        DefaultTableModel model = (DefaultTableModel) this.jt_listar.getModel();
//        for (int i = 0; i < model.getRowCount(); i++) {
//            model.removeRow(i+1);
//        }
//        for (int i = 0; i < categorias.size(); i++) {
//            model.addRow(categorias.get(i));
//        }
    }

    private void limpiar() {
        this.jtf_id.setText("");
        this.jtf_nombre.setText("");
        this.jta_descripcion.setText("");
        this.jbt_editar.setEnabled(false);
        this.jbt_eliminar.setEnabled(false);
        this.jbt_crear.setEnabled(true);
    }

    private void apagarbotonCrear(boolean valor) {
        this.jbt_editar.setEnabled(!valor);
        this.jbt_eliminar.setEnabled(!valor);
        this.jbt_crear.setEnabled(valor);
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
            java.util.logging.Logger.getLogger(PCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbt_crear;
    private javax.swing.JButton jbt_editar;
    private javax.swing.JButton jbt_eliminar;
    private javax.swing.JTable jt_listar;
    private javax.swing.JTextArea jta_descripcion;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables
}
