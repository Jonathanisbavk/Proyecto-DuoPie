
package AA2;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author dickc
 */
public class AA2 extends javax.swing.JFrame {


    
public AA2() {
        initComponents();
}
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        JboxPastel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        JboxExhi = new javax.swing.JComboBox<>();
        JboxPago = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        JboxEntrega = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JboxPorcion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        JboxCake = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        JboxRelleno = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtDedicatoria = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 235, 211));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 153));
        txtNombre.setForeground(new java.awt.Color(255, 204, 153));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 290, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pastel");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(249, 89, 9));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        txtResultado.setBackground(new java.awt.Color(237, 237, 237));
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 250, 440));
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pasteles de Exhibicion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        JboxPastel.setBackground(new java.awt.Color(204, 255, 204));
        JboxPastel.setForeground(new java.awt.Color(204, 255, 102));
        JboxPastel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pasteles de Exhibicion", "Pasteles Tematicos"}));
        JboxPastel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JboxPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JboxPastelActionPerformed(evt);
            }
        });
        jPanel1.add(JboxPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JboxExhi.setBackground(new java.awt.Color(204, 255, 204));
        JboxExhi.setForeground(new java.awt.Color(204, 255, 102));
        JboxExhi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Tres Leches - Precio: S/80.00", "- Torta Selva Negra - Precio: S/75.00", "- Torta de Oreo - Precio: S/70.00"}));
        JboxExhi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(JboxExhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        JboxPago.setBackground(new java.awt.Color(202, 253, 202));
        JboxPago.setForeground(new java.awt.Color(202, 253, 202));
        JboxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta Bancaria", "Billetera Digital"}));
        jPanel1.add(JboxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Metodo de Entrega");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        JboxEntrega.setBackground(new java.awt.Color(202, 253, 202));
        JboxEntrega.setForeground(new java.awt.Color(202, 253, 202));
        JboxEntrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recogo en Tienda", "Delivery"}));
        jPanel1.add(JboxEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Metodo de Pago");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad Porciones");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        JboxPorcion.setBackground(new java.awt.Color(204, 255, 204));
        JboxPorcion.setForeground(new java.awt.Color(204, 255, 102));
        JboxPorcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12 Porciones", "20 Porciones"}));
        JboxPorcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(JboxPorcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de Cake");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        JboxCake.setBackground(new java.awt.Color(204, 255, 204));
        JboxCake.setForeground(new java.awt.Color(204, 255, 102));
        JboxCake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Chocolate", "- Platano", "- Vainilla", "- Avena", "- Zanahoria" }));
        JboxCake.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(JboxCake, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de Relleno");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 40));

        JboxRelleno.setBackground(new java.awt.Color(204, 255, 204));
        JboxRelleno.setForeground(new java.awt.Color(204, 255, 102));
        JboxRelleno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Manjar Blanco Nestle", "- Fudge de la Olla", "- Cream Cheese"}));
        JboxRelleno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(JboxRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dedicatoria");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        txtDedicatoria.setBackground(new java.awt.Color(255, 255, 153));
        txtDedicatoria.setForeground(new java.awt.Color(255, 255, 153));
        jPanel1.add(txtDedicatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 290, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bienvenido a la Pasteleria DuoPie");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 400, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed


        // Obtiene el valor del elemento seleccionado de la lista
        String nombre = txtNombre.getText();
        
        String pastelSeleccionado = (String) JboxPastel.getSelectedItem();       

        String pastelExhibicion = (String) JboxExhi.getSelectedItem();
        
        String metodoPago = (String) JboxPago.getSelectedItem();
       
        String metodoEntrega = (String) JboxEntrega.getSelectedItem();
        
        String porciones = (String) JboxPorcion.getSelectedItem();
        
        String cake = (String) JboxCake.getSelectedItem();
        
        String relleno = (String) JboxRelleno.getSelectedItem();
        
        String dedicatoria = txtDedicatoria.getText();
         // Agrega el valor del elemento seleccionado al campo de texto
         
        if (pastelExhibicion != null){
            txtResultado.setText("\n" + nombre + "\n" + pastelSeleccionado + "\n" + pastelExhibicion + "\n" + metodoPago + "\n"
                    + metodoEntrega + "\n" + porciones + "\n" + cake + "\n" + relleno + "\n" + dedicatoria);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void JboxPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JboxPastelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JboxPastelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AA2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JboxCake;
    private javax.swing.JComboBox<String> JboxEntrega;
    private javax.swing.JComboBox<String> JboxExhi;
    private javax.swing.JComboBox<String> JboxPago;
    private javax.swing.JComboBox<String> JboxPastel;
    private javax.swing.JComboBox<String> JboxPorcion;
    private javax.swing.JComboBox<String> JboxRelleno;
    private javax.swing.JButton btnGuardar;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDedicatoria;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}