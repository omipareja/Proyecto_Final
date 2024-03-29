/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.CardLayout;

/**
 *
 * @author gianlucasorem
 */
public class Frm_principal extends javax.swing.JFrame implements PatronesDiseño.PrincipalVisitador{

    /**
     * Creates new form Frm_principal
     */
    public Frm_principal() {
        initComponents();
        setLocationRelativeTo(null);
        
        pnl_buttons_admon2.setVisitador(this);
        pnl_buttons_empleado1.setVisitador(this);
        pnl_crea_tareas1.setVisitador(this);
        pnl_asignar_personas1.setVisitador(this);
        pnl_ver_empleados1.setVisitador(this);
        pnl_crear_empleados2.setVisitador(this);
        pnl_crear_proyecto2.setVisitador(this);
        pnl_consultar_proyectos1.setVisitador(this);
        pnl_buttons_ingresar1.setVisitador(this);
        panel_ingresar_id1.setVisitador(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pnl_principal = new javax.swing.JPanel();
        pnl_administrador1 = new vista.pnl_administrador();
        pnl_crea_tareas1 = new vista.pnl_crea_tareas();
        pnl_asignar_personas1 = new vista.pnl_asignar_personas();
        pnl_ver_empleados1 = new vista.pnl_ver_empleados();
        pnl_crear_empleados2 = new vista.pnl_crear_empleados();
        pnl_crear_proyecto2 = new vista.pnl_crear_proyecto();
        pnl_consultar_proyectos1 = new vista.pnl_consultar_proyectos();
        panel_ingresar_id1 = new vista.panel_ingresar_id();
        pnl_buttons = new javax.swing.JPanel();
        pnl_buttons_admon2 = new vista.pnl_buttons_admon();
        pnl_buttons_empleado1 = new vista.pnl_buttons_empleado();
        pnl_buttons_ingresar1 = new vista.pnl_buttons_ingresar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Empleado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Administrador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pnl_principal.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pnl_administrador1Layout = new javax.swing.GroupLayout(pnl_administrador1);
        pnl_administrador1.setLayout(pnl_administrador1Layout);
        pnl_administrador1Layout.setHorizontalGroup(
            pnl_administrador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );
        pnl_administrador1Layout.setVerticalGroup(
            pnl_administrador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        pnl_principal.add(pnl_administrador1, "PanelVacio");
        pnl_principal.add(pnl_crea_tareas1, "CrearTareas");
        pnl_principal.add(pnl_asignar_personas1, "AsignarPersonas");
        pnl_principal.add(pnl_ver_empleados1, "VerEmpleados");
        pnl_principal.add(pnl_crear_empleados2, "CrearEmpleados");
        pnl_principal.add(pnl_crear_proyecto2, "CrearProyecto");
        pnl_principal.add(pnl_consultar_proyectos1, "ConsultarProyectos");
        pnl_principal.add(panel_ingresar_id1, "IngresarID");

        pnl_buttons.setLayout(new java.awt.CardLayout());
        pnl_buttons.add(pnl_buttons_admon2, "BotonesAdmon");
        pnl_buttons.add(pnl_buttons_empleado1, "BotonesEmpleado");
        pnl_buttons.add(pnl_buttons_ingresar1, "BotonesIngresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    cambiarTarjeta("BotonesIngresar");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    cambiarTarjeta("BotonesAdmon");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private vista.panel_ingresar_id panel_ingresar_id1;
    private vista.pnl_administrador pnl_administrador1;
    private vista.pnl_asignar_personas pnl_asignar_personas1;
    private javax.swing.JPanel pnl_buttons;
    private vista.pnl_buttons_admon pnl_buttons_admon2;
    private vista.pnl_buttons_empleado pnl_buttons_empleado1;
    private vista.pnl_buttons_ingresar pnl_buttons_ingresar1;
    private vista.pnl_consultar_proyectos pnl_consultar_proyectos1;
    private vista.pnl_crea_tareas pnl_crea_tareas1;
    private vista.pnl_crear_empleados pnl_crear_empleados2;
    private vista.pnl_crear_proyecto pnl_crear_proyecto2;
    private javax.swing.JPanel pnl_principal;
    private vista.pnl_ver_empleados pnl_ver_empleados1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambiarTarjeta(String tarjeta) {
  ((CardLayout) pnl_buttons.getLayout()).show(pnl_buttons, tarjeta);
    }

    @Override
    public void CambiarTarjetaB(String tarjeta) {
    ((CardLayout) pnl_principal.getLayout()).show(pnl_principal, tarjeta);
    }
}
