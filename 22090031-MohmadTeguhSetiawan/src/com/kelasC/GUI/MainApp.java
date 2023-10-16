/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelasC.GUI;

import com.kelasC.classes.DatabaseManager;
import java.sql.Connection;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class MainApp extends javax.swing.JFrame {
    private JCheckBox showPasswordCheckbox;
    private DatabaseManager databaseManager;

    
    @SuppressWarnings("unchecked")
    public MainApp() {
        // Inisialisasi DatabaseManager
        databaseManager = new DatabaseManager();
        // Set frame agar berjalan dalam mode layar penuh
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maksimalkan frame
        
        initComponents();

        // Mengambil gambar asli
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/com/kelasC/assets/image/iconlogin.png"));

        // Mendapatkan gambar dari ImageIcon
        Image originalImage = originalIcon.getImage();

        // Mengubah ukuran gambar
        int newWidth = 500; // Ganti dengan lebar yang diinginkan
        int newHeight = 500; // Ganti dengan tinggi yang diinginkan
        Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        // Mengatur gambar yang sudah diperkecil ke JLabel
        jLabel1.setIcon(new ImageIcon(scaledImage));

        // Menengahkan gambar horizontal dan vertikal
        jLabel1.setHorizontalAlignment(JLabel.CENTER);
        jLabel1.setVerticalAlignment(JLabel.CENTER);
        
        // Listener untuk JCheckBox1
        jCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jCheckBox1ActionPerformed(e);
            }
        });

        // Listener untuk UserNameLogin
        UserNameLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserNameLoginActionPerformed(e);
            }
        });
        // Membuat JCheckBox dan menambahkannya ke panel
        showPasswordCheckbox = new JCheckBox("Tampilkan Kata Sandi");
        showPasswordCheckbox.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (showPasswordCheckbox.isSelected()) {
                jPasswordField1.setEchoChar((char) 0); // Menampilkan teks biasa
            } else {
                jPasswordField1.setEchoChar('*'); // Kembali ke karakter pengganti kata sandi (biasanya '*')
            }
        }
        });

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UserNameLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelasC/assets/image/iconlogin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Masuk Akun");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Jika Anda sudah mempunyai akun, Anda dapat login");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("dengan alamat email dan kata sandi Anda.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Alamat Email Atau Username");

        UserNameLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameLoginActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Kata Sandi");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Tampilkan Kata Sandi");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("MASUK");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(UserNameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserNameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameLoginActionPerformed
        // Handler untuk event ketika tombol "Enter" ditekan di komponen UserNameLogin
        String username = UserNameLogin.getText();
        String password = new String(jPasswordField1.getPassword()); // Mendapatkan kata sandi

        // Di sini, Anda dapat memproses username dan password sesuai dengan kebutuhan aplikasi Anda
        // Misalnya, Anda dapat melakukan verifikasi login atau mengeksekusi tindakan lain.
    }//GEN-LAST:event_UserNameLoginActionPerformed
    // TODO add your handling code here:



    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
// Cek apakah kotak centang dicentang
        if (jCheckBox1.isSelected()) {
            // Jika dicentang, ubah karakteristik teks menjadi teks biasa
            jPasswordField1.setEchoChar((char) 0); // Mengubah karakter pengganti ke karakter kosong
        } else {
            // Jika tidak dicentang, kembalikan karakteristik teks ke karakter sandi
            jPasswordField1.setEchoChar('\u25CF'); // Mengembalikan karakter pengganti ke karakter sandi (biasanya berbentuk lingkaran hitam)
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

    }//GEN-LAST:event_jPasswordField1ActionPerformed
    public void someMethod() {
    Connection connection = databaseManager.getConnection();
    // Gunakan koneksi untuk berinteraksi dengan database
    // ...
    }

    // Di metode untuk menutup koneksi saat aplikasi ditutup
    public void closeApp() {
        databaseManager.closeConnection();
    }

    

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UserNameLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPanel panelLogin;
    // End of variables declaration//GEN-END:variables
}
