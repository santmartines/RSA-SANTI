/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.math.BigInteger;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author vic
 */

public class INTERFAZ extends javax.swing.JFrame {
    
    private final int tamprimo;

    private BigInteger p, q, n;
    private BigInteger fi;
    private BigInteger e, d;

    public INTERFAZ() {
        initComponents();
        
        // Inicialización de RSA y mostrar las claves
        tamprimo = 512; // Tamaño de clave
        generarPrimos();
        generarClaves();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RESULTADO = new javax.swing.JTextArea();
        cifrar_btn = new javax.swing.JButton();
        descifrar_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CLAVES = new javax.swing.JTextArea();
        TEXTO = new javax.swing.JTextField();
        copiar_btn = new javax.swing.JButton();
        mostrar_claves = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(112, 128, 102));
        jPanel1.setForeground(new java.awt.Color(237, 227, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(605, 400));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 229, 215));
        jLabel1.setText("INGRESA EL TEXTO A CIFRAR / DESCIFRAR");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(227, 229, 215));
        jLabel2.setText("RESULTADO");

        RESULTADO.setBackground(new java.awt.Color(143, 160, 128));
        RESULTADO.setColumns(20);
        RESULTADO.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        RESULTADO.setForeground(new java.awt.Color(255, 255, 255));
        RESULTADO.setRows(5);
        jScrollPane1.setViewportView(RESULTADO);

        cifrar_btn.setBackground(new java.awt.Color(143, 160, 128));
        cifrar_btn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        cifrar_btn.setForeground(new java.awt.Color(255, 255, 255));
        cifrar_btn.setText("Cifrar");
        cifrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifrar_btnActionPerformed(evt);
            }
        });

        descifrar_btn.setBackground(new java.awt.Color(143, 160, 128));
        descifrar_btn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        descifrar_btn.setForeground(new java.awt.Color(255, 255, 255));
        descifrar_btn.setText("Descifrar");
        descifrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descifrar_btnActionPerformed(evt);
            }
        });

        CLAVES.setBackground(new java.awt.Color(143, 160, 128));
        CLAVES.setColumns(20);
        CLAVES.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        CLAVES.setForeground(new java.awt.Color(255, 255, 255));
        CLAVES.setRows(5);
        jScrollPane2.setViewportView(CLAVES);

        TEXTO.setBackground(new java.awt.Color(143, 160, 128));
        TEXTO.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        TEXTO.setForeground(new java.awt.Color(255, 255, 255));
        TEXTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTOActionPerformed(evt);
            }
        });

        copiar_btn.setBackground(new java.awt.Color(143, 160, 128));
        copiar_btn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        copiar_btn.setForeground(new java.awt.Color(255, 255, 255));
        copiar_btn.setText("Copiar");
        copiar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiar_btnActionPerformed(evt);
            }
        });

        mostrar_claves.setBackground(new java.awt.Color(112, 128, 102));
        mostrar_claves.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mostrar_claves.setForeground(new java.awt.Color(227, 229, 215));
        mostrar_claves.setText("MOSTRAR CLAVES");
        mostrar_claves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_clavesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TEXTO, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cifrar_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descifrar_btn, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(copiar_btn)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(mostrar_claves)))))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cifrar_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descifrar_btn))
                    .addComponent(TEXTO, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(copiar_btn)
                    .addComponent(mostrar_claves))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void cifrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifrar_btnActionPerformed
        // TODO add your handling code here:
        String txt = TEXTO.getText();

        if (txt == null || txt.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un valor.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cifrar();
        }
    }//GEN-LAST:event_cifrar_btnActionPerformed

    private void descifrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descifrar_btnActionPerformed
        // TODO add your handling code here:
        String txt = TEXTO.getText();

        if (txt == null || txt.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un valor.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            descifrar();
        }
    }//GEN-LAST:event_descifrar_btnActionPerformed

    private void TEXTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXTOActionPerformed

    private void copiar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiar_btnActionPerformed
        // TODO add your handling code here:
        String txtresultado = RESULTADO.getText();
        TEXTO.setText(txtresultado);
    }//GEN-LAST:event_copiar_btnActionPerformed

    private void mostrar_clavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_clavesActionPerformed
        // TODO add your handling code here:
        // Verifica si el JCheckBox mostrar_claves está seleccionado
        if (mostrar_claves.isSelected()) {
            // Si el JCheckBox está seleccionado, muestra las claves en el TextArea
            CLAVES.setText("Clave pública (e, n): (" + e + ", " + n + ")\n" +
                "Clave privada (d, n): (" + d + ", " + n + ")");
        } else {
            // Si el JCheckBox no está seleccionado, limpia el contenido del TextArea
            CLAVES.setText("");
        }
    }//GEN-LAST:event_mostrar_clavesActionPerformed

    private void generarPrimos() {
        p = new BigInteger(tamprimo, 10, new Random());
        do q = new BigInteger(tamprimo, 10, new Random());
        while(q.compareTo(p) == 0);
    }

    private void generarClaves() {
        n = p.multiply(q);
        fi = p.subtract(BigInteger.valueOf(1)).multiply(q.subtract(BigInteger.valueOf(1)));

        do e = new BigInteger(2 * tamprimo, new Random());
            while ((e.compareTo(fi) != -1) || (e.gcd(fi).compareTo(BigInteger.valueOf(1)) != 0));

        d = e.modInverse(fi);
    }
    
    private void cifrar() {
        String mensaje = TEXTO.getText();
        BigInteger[] cifrado = cifrarMensaje(mensaje);
        StringBuilder resultado = new StringBuilder();
        for (BigInteger c : cifrado) {
            resultado.append(c.toString()).append(" ");
        }
        RESULTADO.setText(resultado.toString());
    }
    
    private void descifrar() {
        String[] ciphertextStr = TEXTO.getText().split(" ");
        BigInteger[] ciphertext = new BigInteger[ciphertextStr.length];
        for (int i = 0; i < ciphertextStr.length; i++) {
            ciphertext[i] = new BigInteger(ciphertextStr[i]);
        }
        String decryptedMessage = descifrarMensaje(ciphertext);
        RESULTADO.setText(decryptedMessage);
    }

    private BigInteger[] cifrarMensaje(String mensaje) {
        byte[] temp = new byte[1];
        byte[] digitos = mensaje.getBytes();
        
        BigInteger[] bigdigitos = new BigInteger[digitos.length];
        
        //iterar con el mensaje para cifrarlo
        for (int i = 0; i < bigdigitos.length; i++) {
            temp[0] = digitos[i];
            bigdigitos[i] = new BigInteger(temp);
        }
        
        BigInteger[] cifrado = new BigInteger[bigdigitos.length];
        
        for (int i = 0; i < bigdigitos.length; i++) {
            //aplico la formula  C = M^e mod n
            cifrado[i] = bigdigitos[i].modPow(e, n);
        }
        return cifrado;
    }

    private String descifrarMensaje(BigInteger[] cifrado) {
        BigInteger[] descifrado = new BigInteger[cifrado.length];
        
        //iterar con el mensaje para descifrarlo
        for (int i = 0; i < descifrado.length; i++) {
            descifrado[i] = cifrado[i].modPow(d, n);
        }
        
        char[] charArray = new char[descifrado.length];
        
        for (int i = 0; i < charArray.length; i++) {
            //vamos a unir todos los caracteres
            charArray[i] = (char)(descifrado[i].intValue());
        }
        return new String(charArray);
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
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new INTERFAZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CLAVES;
    private javax.swing.JTextArea RESULTADO;
    private javax.swing.JTextField TEXTO;
    private javax.swing.JButton cifrar_btn;
    private javax.swing.JButton copiar_btn;
    private javax.swing.JButton descifrar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox mostrar_claves;
    // End of variables declaration//GEN-END:variables
}
