/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Usuarios() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        contrasenaTextField = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        rolComboBox1 = new javax.swing.JComboBox<>();
        crearUsuarioButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Footlight MT Light", 1, 48)); // NOI18N
        jTextField1.setText("Usuarios");
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 50));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(38, 128, 112));
        jTextField4.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Datos");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 770, 30));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField12.setText("Nombres y Apellidos");
        jTextField12.setBorder(null);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, -1));

        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 680, -1));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField8.setText("Rol de Usuario");
        jTextField8.setBorder(null);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, -1));

        contrasenaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(contrasenaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 330, -1));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField10.setText("Contrasena");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, -1));

        rolComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        rolComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(rolComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 250, 30));

        crearUsuarioButton.setBackground(new java.awt.Color(0, 102, 51));
        crearUsuarioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crearUsuarioButton.setForeground(new java.awt.Color(255, 255, 255));
        crearUsuarioButton.setText("Crear Usuario");
        crearUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(crearUsuarioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 820, 570));

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 40));

        jButton2.setText("Usuarios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        jButton3.setText("Crear Tarea");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, 40));

        jButton4.setText("Lista de Tareas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 40));

        jButton8.setText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        jButton5.setText("Historial");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 210, 40));

        jButton6.setText("Lista de Usuarios");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Screenshot 2024-11-26 202151.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-640, -10, 1150, 630));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Screenshot 2024-11-26 202151.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, 100, 1000, 510));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Screenshot 2024-11-26 202151.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 610));

        jButton7.setText("Usuarios");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VentanaAdmin homeVentana = new VentanaAdmin(variablesGlobales.getAdminUsername());
        homeVentana.setVisible(true);
        this.dispose(); // Opcional
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CrearTarea crearTarea = new CrearTarea();
        crearTarea.setVisible(true);
        this.dispose(); // Opcional
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ListaDeTarea listaTarea = new ListaDeTarea();
        listaTarea.setVisible(true);
        this.dispose(); // Opcional
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Historial historialVentana = new Historial();
        historialVentana.setVisible(true);
        this.dispose(); // Opcional
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void crearUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioButtonActionPerformed
     // Obtener datos de los campos
        String nombre = nombreTextField.getText().trim();
        String contrasena = contrasenaTextField.getText().trim();
        String rol = (String) rolComboBox1.getSelectedItem();

        // Validar campos
        String mensajeValidacion = validarCampos(nombre, contrasena, rol);
        if (!mensajeValidacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajeValidacion, "Advertencia", JOptionPane.WARNING_MESSAGE);
            return; // Detener el flujo si hay campos vacíos
        }

        // Verificar si el usuario ya existe
        if (verificarCredenciales(nombre, contrasena, rol)) {
            JOptionPane.showMessageDialog(this, "El usuario con este nombre y rol ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener el flujo si ya existe
        }

        // Si pasa las validaciones, guardar usuario
        guardarUsuario(nombre, contrasena, rol);

        // Limpiar campos después de guardar
        nombreTextField.setText("");
        contrasenaTextField.setText("");
        rolComboBox1.setSelectedIndex(0);
    }

    private String validarCampos(String nombre, String contrasena, String rol) {
        if (nombre.isEmpty() && contrasena.isEmpty()) {
            return "Por favor, complete todos los campos antes de continuar";
        } else if (nombre.isEmpty()) {
            return "El campo 'Nombre' está vacío";
        } else if (contrasena.isEmpty()) {
            return "El campo 'Contraseña' está vacío";
        } else if (rol.isEmpty()) {
            return "El campo 'Rol' está vacío";
        }
        return "";
    }

    private void guardarUsuario(String nombre, String contrasena, String rol) {
        // Verificar si el usuario ya existe
        if (verificarCredenciales(nombre, contrasena, rol)) {
            JOptionPane.showMessageDialog(null, 
                "El usuario con este nombre y rol ya existe.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return; // Detenemos el flujo si ya existe
        }

        // Si no existe, guardar en el archivo
        guardarEnArchivo(nombre, contrasena, rol);
        JOptionPane.showMessageDialog(null, 
            "Usuario creado exitosamente: " + nombre, 
            "Éxito", 
            JOptionPane.INFORMATION_MESSAGE);
    }

    private void guardarEnArchivo(String nombre, String contrasena, String rol) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            writer.write(nombre + "," + contrasena + "," + rol);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean verificarCredenciales(String nombre, String contrasena, String rol) {
        try (Scanner scanner = new Scanner(new java.io.File("usuarios.txt"))) {
            while (scanner.hasNextLine()) {
                String[] usuario = scanner.nextLine().split(",");
                if (usuario[0].equalsIgnoreCase(nombre) && usuario[1].equals(contrasena) && usuario[2].equalsIgnoreCase(rol)) {
                    return true; // Usuario encontrado
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Usuario no encontrado
    
    }//GEN-LAST:event_crearUsuarioButtonActionPerformed

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void contrasenaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaTextFieldActionPerformed

    private void rolComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolComboBox1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ListaDeUsuarios listaUsuarios = new ListaDeUsuarios();
        listaUsuarios.setVisible(true);
        this.dispose(); // Opcional
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Login loginVentana = new Login();
        loginVentana.setVisible(true); // Muestra la ventana de inicio de sesión
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton8ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contrasenaTextField;
    private javax.swing.JButton crearUsuarioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JComboBox<String> rolComboBox1;
    // End of variables declaration//GEN-END:variables
}
