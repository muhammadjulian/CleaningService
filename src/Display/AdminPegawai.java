/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Display;

import cleaningservis_DB.dbConnections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */


public class AdminPegawai extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    private DefaultTableModel model;
        
        private void tampil_pegawai(){
        Object[]baris = {"NIK", "Nama", "JK", "Usia","Alamat","telp","ruangan","peralatan"};
        model= new DefaultTableModel(null, baris);
        jTable_pegawai.setModel(model);
        String sql = "select * from pegawai order by NIK asc";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cleaning_service", "root", "");
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String NIK = hasil.getString("NIK");
                String Nama_Pegawai = hasil.getString("Nama_Pegawai");
                String jk = hasil.getString("Jenis_Kelamin");
                String usia = hasil.getString("Usia");
                String Alamat_Pegawai = hasil.getString("Alamat_Pegawai");
                String No_Telp = hasil.getString("No_Telp");
                String[]data = {NIK, Nama_Pegawai, jk, usia, Alamat_Pegawai, No_Telp};
                model.addRow(data);
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }
    public AdminPegawai() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tampil_pegawai();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nik = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_usia = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_telp = new javax.swing.JTextField();
        Radio_laki = new javax.swing.JRadioButton();
        Radio_perempuan = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_pegawai = new javax.swing.JTable();
        jButton_simpan = new javax.swing.JButton();
        jButton_hapus = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        txt_ruang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_peralatan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIk");

        jLabel2.setText("nama");

        jLabel3.setText("Jenis Kelamin");

        jLabel4.setText("Usia");

        jLabel5.setText("alamat");

        jLabel6.setText("No. Telp");

        txt_nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nikActionPerformed(evt);
            }
        });

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        buttonGroup_gender.add(Radio_laki);
        Radio_laki.setText("Laki-Laki");
        Radio_laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_lakiActionPerformed(evt);
            }
        });

        buttonGroup_gender.add(Radio_perempuan);
        Radio_perempuan.setText("Perempuan");
        Radio_perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_perempuanActionPerformed(evt);
            }
        });

        jTable_pegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_pegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_pegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_pegawai);

        jButton_simpan.setText("Simpan");
        jButton_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_simpanActionPerformed(evt);
            }
        });

        jButton_hapus.setText("Hapus");
        jButton_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hapusActionPerformed(evt);
            }
        });

        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        jLabel7.setText("Nama Ruangan");

        jLabel8.setText("Peralatan");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setText("Pegawai");

        jLabel10.setForeground(new java.awt.Color(6, 8, 142));
        jLabel10.setText("Home");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_simpan)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_reset)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_hapus)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_update)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_usia)
                            .addComponent(txt_alamat)
                            .addComponent(txt_telp, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Radio_laki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Radio_perempuan))
                            .addComponent(txt_ruang)
                            .addComponent(txt_peralatan)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(98, 98, 98)
                                .addComponent(txt_nik, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Radio_laki)
                            .addComponent(Radio_perempuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_usia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ruang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_peralatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_hapus)
                            .addComponent(jButton_simpan)
                            .addComponent(jButton_update))
                        .addGap(43, 43, 43)
                        .addComponent(jButton_reset))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nikActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void jButton_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_simpanActionPerformed
     int No_Telp;
            int NIK;
            int Usia;
        
       String Nama_Pegawai="", Jenis_Kelamin= ""; 
        
        NIK = Integer.parseInt(txt_nik.getText());
        Nama_Pegawai = txt_nama.getText();
        Jenis_Kelamin= buttonGroup_gender.getSelection().getActionCommand();
        Usia = Integer.parseInt(txt_usia.getText());
        String Alamat_Pegawai = txt_alamat.getText();
        No_Telp = Integer.parseInt(txt_telp.getText());
        
     
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cleaning_service", "root", "");
            
            String sql = "insert into pegawai values"
                    + "('"+NIK+"'"
                    + ", '"+Nama_Pegawai+"'"
                    + ", '"+Jenis_Kelamin+"'"
                    + ", "+Usia+""
                    + ", '"+Alamat_Pegawai+"'"
                    + ", "+No_Telp+");";
            model.addTableModelListener(jTable_pegawai);
            PreparedStatement stat = (PreparedStatement) conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_pegawai();
            rst();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menyimpan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_simpanActionPerformed

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed

        txt_nik.setText("");
        txt_nama.setText("");
        txt_alamat.setText("");
        txt_telp.setText("");
        txt_usia.setText("");
        buttonGroup_gender.setSelected(null, rootPaneCheckingEnabled);
        buttonGroup_gender.clearSelection();
        txt_ruang.setText("");
        txt_peralatan.setText("");
           // TODO add your handling code here:
    }//GEN-LAST:event_jButton_resetActionPerformed

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
int NIK = Integer.parseInt(txt_nik.getText());
        String Nama_Pegawai= txt_nama.getText();
        String Jenis_Kelamin= buttonGroup_gender.getSelection().getActionCommand();
        int Usia = Integer.parseInt(txt_usia.getText());
        String Alamat_Pegawai= txt_alamat.getText();
        int No_Telp = Integer.parseInt(txt_telp.getText());
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cleaning_service", "root", "");
            String sql = "update pegawai set "
                    + "Nama_Pegawai='"+Nama_Pegawai+"', "
                    + "Jenis_Kelamin='"+Jenis_Kelamin+"', "
                    + "Usia='"+Usia+"', "
                    + "Alamat_Pegawai='"+Alamat_Pegawai+"', "
                    + "No_Telp='"+No_Telp+"'"
                    + " where NIK='"+NIK+"'";
            System.out.println(sql);
            PreparedStatement stat = (PreparedStatement) conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Merubah data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_pegawai();
            rst();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Merubah data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void Radio_lakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_lakiActionPerformed
buttonGroup_gender.add(Radio_laki);
Radio_laki.add("L", this);
// TODO add your handling code here:
    }//GEN-LAST:event_Radio_lakiActionPerformed

    private void Radio_perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_perempuanActionPerformed
buttonGroup_gender.add(Radio_perempuan);
Radio_perempuan.add("P", this);
// TODO add your handling code here:
    }//GEN-LAST:event_Radio_perempuanActionPerformed

    private void jTable_pegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_pegawaiMouseClicked
 int TP = jTable_pegawai.getSelectedRow();
        
        txt_nik.setText(jTable_pegawai.getValueAt(TP, 0).toString());
        txt_nama.setText(jTable_pegawai.getValueAt(TP, 1).toString());
        buttonGroup_gender.equals(jTable_pegawai.getValueAt(TP, 2).toString());
        txt_usia.setText(jTable_pegawai.getValueAt(TP, 3).toString());
        txt_alamat.setText(jTable_pegawai.getValueAt(TP, 4).toString());  
        txt_telp.setText(jTable_pegawai.getValueAt(TP, 5).toString());        
// TODO add your handling code here:
    }//GEN-LAST:event_jTable_pegawaiMouseClicked

    private void jButton_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hapusActionPerformed
 int NIK=0;
        NIK = Integer.parseInt(txt_nik.getText());
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cleaning_service", "root", "");
            String sql = "delete from pegawai where NIK='"+NIK+"'";
            PreparedStatement stat = (PreparedStatement) conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menghapus data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_pegawai();
            rst();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menghapus data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_hapusActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.dispose();
        AwalAdmin admin = new AwalAdmin();
        admin.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked
 
    private void rst(){
       txt_nik.setText("");
        txt_nama.setText("");
        txt_alamat.setText("");
        txt_telp.setText("");
        txt_usia.setText("");
        buttonGroup_gender.setSelected(null, rootPaneCheckingEnabled);
        buttonGroup_gender.clearSelection();
        txt_ruang.setText("");
        txt_peralatan.setText("");
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
            java.util.logging.Logger.getLogger(AdminPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Radio_laki;
    private javax.swing.JRadioButton Radio_perempuan;
    private javax.swing.ButtonGroup buttonGroup_gender;
    private javax.swing.JButton jButton_hapus;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JButton jButton_simpan;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable jTable_pegawai;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nik;
    private javax.swing.JTextField txt_peralatan;
    private javax.swing.JTextField txt_ruang;
    private javax.swing.JTextField txt_telp;
    private javax.swing.JTextField txt_usia;
    // End of variables declaration//GEN-END:variables
}
