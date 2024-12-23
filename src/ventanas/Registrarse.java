/*mel
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

/**
 *
 * @author Jhoel Rivera
 */
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import ventanas.logicaVentanas.Usuario;

public class Registrarse extends javax.swing.JFrame {
 private Login v1;
    /**
     * Creates new form Registrarse
     */
  

    public Registrarse() {
        initComponents();
       inicializarComponentes(); 
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
        panelRound2 = new components.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        UsuarioEnt = new javax.swing.JTextField();
        ContrasenaEnt = new javax.swing.JPasswordField();
        Contrasena2Ent = new javax.swing.JPasswordField();
        RegistrarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        estadoAcceso = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(25);
        panelRound2.setRoundBottomRight(25);
        panelRound2.setRoundTopLeft(25);
        panelRound2.setRoundTopRight(25);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_registrarse/texto registrate.png"))); // NOI18N
        panelRound2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 250, 60));

        UsuarioEnt.setText("Usuario");
        UsuarioEnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuarioEntMousePressed(evt);
            }
        });
        panelRound2.add(UsuarioEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 200, 40));

        ContrasenaEnt.setText("*******");
        ContrasenaEnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContrasenaEntMousePressed(evt);
            }
        });
        panelRound2.add(ContrasenaEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 200, 40));

        Contrasena2Ent.setText("********");
        Contrasena2Ent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Contrasena2EntMousePressed(evt);
            }
        });
        Contrasena2Ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contrasena2EntActionPerformed(evt);
            }
        });
        panelRound2.add(Contrasena2Ent, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 200, 40));

        RegistrarBtn.setBackground(new java.awt.Color(0, 102, 51));
        RegistrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegistrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarBtn.setText("Registrar");
        RegistrarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        RegistrarBtn.setBorderPainted(false);
        RegistrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBtnActionPerformed(evt);
            }
        });
        panelRound2.add(RegistrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_Login/login.png"))); // NOI18N
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 30, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_registrarse/contrasena1.png"))); // NOI18N
        panelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 30, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_registrarse/contrasena1.png"))); // NOI18N
        panelRound2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 30, 40));
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 40, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_registrarse/arrow_back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRound2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        estadoAcceso.setBorder(null);
        estadoAcceso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        estadoAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoAccesoActionPerformed(evt);
            }
        });
        panelRound2.add(estadoAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 200, 50));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "User", "Admin" }));
        panelRound2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 200, 30));

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 370, 460));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Screenshot 2024-11-26 202151.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void inicializarComponentes() { 
            estadoAcceso.setVisible(false);
  
     }

    public static void registrarUsuario(String username, String password, String rol) throws IOException {
             if (verificarUsuarioExistente(username)) {
                       throw new IOException("El usuario ya existe.");       
                  }
              try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
                         writer.write(username + "," + password + "," + rol); 
                         writer.newLine();
                  }
    }

public static boolean verificarUsuarioExistente(String username) throws IOException {
    List<Usuario> usuarios = leerUsuarios();
    for (Usuario usuario : usuarios) {
        if (usuario.getUsername().equals(username)) {
            return true; // El usuario ya existe
        }
    }
    return false; // El usuario no existe
}

public static List<Usuario> leerUsuarios() throws IOException {
    List<Usuario> usuarios = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
        String line; 
        while ((line = reader.readLine()) != null)  {
            String[] parts = line.split(","); 
            if (parts.length == 3) {  // Asegúrate de que solo se tienen username y password
                usuarios.add(new Usuario(parts[0], parts[1], parts[2]));  // No usamos el rol
            }
        }
    }
    return usuarios;
}
  private void setV1(Login v1){
       this.v1=v1;
  }
    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
                this.setVisible(false);
                v1.setVisible(true);
                estadoAcceso.setVisible(false);
    }//GEN-LAST:event_VolverBtnActionPerformed
    private void crearArchivoTareas(String username) {
    File archivoTareas = new File(username + ".txt");
    try {
        if (archivoTareas.createNewFile()) {
            System.out.println("Archivo de tareas creado para el usuario: " + username);
        } else {
            System.out.println("El archivo de tareas ya existe para el usuario: " + username);
        }
    } catch (IOException e) {
        e.printStackTrace();
        mostrarMensajeEstado("No se pudo crear el archivo de tareas para el usuario.", false);
    }
}
    private void RegistrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBtnActionPerformed
            String username = UsuarioEnt.getText();
        char[] passwordChars = Contrasena2Ent.getPassword();
        String password = new String(passwordChars);
        String rol = jComboBox1.getSelectedItem().toString();
        
        // Validar que se seleccionó un rol válido
        if (rol.equals("Seleccione una opcion")) {
        mostrarMensajeEstado("Seleccione un rol válido", false);
        return;
        }
        
        
        try {
            // Intentar registrar el usuario sin rol
            registrarUsuario(username, password, rol);

            // Mostrar mensaje de éxito
            mostrarMensajeEstado("¡Usuario registrado exitosamente!", true);
            crearArchivoTareas(username);
            // Limpiar los campos después del registro
            UsuarioEnt.setText("");
            ContrasenaEnt.setText("");
            Contrasena2Ent.setText("");
            jComboBox1.setSelectedIndex(0);
        } catch (IOException e) {
            // Mostrar mensaje de error si el usuario ya existe
            if (e.getMessage().equals("El usuario ya existe.")) {
                mostrarMensajeEstado("El nombre de usuario ya está en uso", false);
            } else {
                e.printStackTrace(); // Imprimir otros errores en consola
            }
        } 
    }//GEN-LAST:event_RegistrarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Login atras =new Login();
        atras.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Contrasena2EntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contrasena2EntActionPerformed
        
    }//GEN-LAST:event_Contrasena2EntActionPerformed

    private void UsuarioEntMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioEntMousePressed
        if (UsuarioEnt.getText().equals("Usuario")) {
            UsuarioEnt.setText("");
            UsuarioEnt.setForeground(Color.black);
        }
        if (String.valueOf(ContrasenaEnt.getPassword()).isEmpty()) {
            ContrasenaEnt.setText("********");
            ContrasenaEnt.setForeground(Color.gray);
        }
        if (String.valueOf(Contrasena2Ent.getPassword()).isEmpty()) {
            Contrasena2Ent.setText("********");
            Contrasena2Ent.setForeground(Color.gray);
        }
    }//GEN-LAST:event_UsuarioEntMousePressed

    private void ContrasenaEntMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContrasenaEntMousePressed
        if (String.valueOf(ContrasenaEnt.getPassword()).equals("********")) {
            ContrasenaEnt.setText("");
            ContrasenaEnt.setForeground(Color.black);
        }
        if (UsuarioEnt.getText().isEmpty()) {
            UsuarioEnt.setText("Usuario");
            UsuarioEnt.setForeground(Color.gray);
        }
        if (String.valueOf(Contrasena2Ent.getPassword()).isEmpty()) {
            Contrasena2Ent.setText("********");
            Contrasena2Ent.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ContrasenaEntMousePressed

    private void Contrasena2EntMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Contrasena2EntMousePressed
         if (String.valueOf(Contrasena2Ent.getPassword()).equals("********")) {
            Contrasena2Ent.setText("");
            Contrasena2Ent.setForeground(Color.black);
        }
        if (UsuarioEnt.getText().isEmpty()) {
            UsuarioEnt.setText("Usuario");
            UsuarioEnt.setForeground(Color.gray);
        }
        if (String.valueOf(ContrasenaEnt.getPassword()).isEmpty()) {
            ContrasenaEnt.setText("********");
            ContrasenaEnt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_Contrasena2EntMousePressed

    private void mostrarMensajeEstado(String mensaje, boolean esExitoso) { 
       
      estadoAcceso.setText("");  // Limpiar cualquier mensaje anterior
    estadoAcceso.setText(mensaje);  // Establecer el mensaje actual
    if (!esExitoso) { 
        estadoAcceso.setForeground(Color.RED);  // Mostrar en rojo si es un error
    } else {
        estadoAcceso.setForeground(Color.GREEN);  // Mostrar en verde si es exitoso
    }
    estadoAcceso.setVisible(true);  // Asegurarse de que el estadoAcceso sea visible
    jPanel1.revalidate();  // Forzar la actualización del panel
    jPanel1.repaint();  // Refrescar la vista
   }
    private void estadoAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoAccesoActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registrarse().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contrasena2Ent;
    private javax.swing.JPasswordField ContrasenaEnt;
    private javax.swing.JButton RegistrarBtn;
    private javax.swing.JTextField UsuarioEnt;
    private javax.swing.JTextField estadoAcceso;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private components.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
