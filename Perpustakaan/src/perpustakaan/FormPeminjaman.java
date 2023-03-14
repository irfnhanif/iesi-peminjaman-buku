/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class FormPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FormPeminjaman
     */
    public FormPeminjaman() {
        initComponents();
    }
    
      public void tampilkan() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonPinjam = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtBukuPinjaman = new javax.swing.JTable();
        jButtonKonfirmasi = new javax.swing.JButton();
        jTextFieldJudul = new javax.swing.JTextField();
        jButtonCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBuku = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonPinjam.setText("Pinjam");
        jButtonPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPinjamMouseClicked(evt);
            }
        });
        jButtonPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPinjamActionPerformed(evt);
            }
        });

        jButtonBatal.setText("Batal");
        jButtonBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBatalMouseClicked(evt);
            }
        });
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jtBukuPinjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtBukuPinjaman);

        jButtonKonfirmasi.setText("Konfirmasi");
        jButtonKonfirmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonKonfirmasiMouseClicked(evt);
            }
        });

        jButtonCari.setText("Cari");
        jButtonCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCariMouseClicked(evt);
            }
        });

        jtBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtBuku);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextFieldJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jButtonCari))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonPinjam)
                            .addComponent(jButtonBatal))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonKonfirmasi)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonKonfirmasi))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPinjam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBatal)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPinjamMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPinjamMouseClicked

    private void jButtonBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBatalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBatalMouseClicked

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonKonfirmasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKonfirmasiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonKonfirmasiMouseClicked

    private void jButtonCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCariMouseClicked
        // TODO add your handling code here:
        String judul = jTextFieldJudul.getText();
        Perpustakaan.controllerPencarian.cariBuku(judul);
    }//GEN-LAST:event_jButtonCariMouseClicked

    private void jButtonPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPinjamActionPerformed

      public void show(ArrayList<Buku> bukuList) {
        Object[] kolom = { "Judul" };
        DefaultTableModel model = new DefaultTableModel(kolom, 0);
        
        for(Buku buku : bukuList) {
            Object[] baris = { buku.judul };
            model.addRow(baris);
        }
        
        jtBuku.setModel(model);
    }
      
      ArrayList<Buku> bukuList;
      
      public void tambahBuku(Buku buku, int lama) {
          if (lama <= 3) {
            bukuList.add(buku);
          } else {
              DialogUI dialogUI = new DialogUI("Lama peminjaman tidak boleh lebih dari 3 hari");
              dialogUI.pack();
              dialogUI.setLocationRelativeTo(null);
              dialogUI.setVisible(true);
          }
          tampilPinjaman(bukuList);
     } 
      
      public void tampilPinjaman(ArrayList<Buku> bukuList) {
        Object[] kolom = { "Judul" };
        DefaultTableModel model = new DefaultTableModel(kolom, 0);
        
        for(Buku buku : bukuList) {
            Object[] baris = { buku.judul };
            model.addRow(baris);
        }
        
        jtBukuPinjaman.setModel(model);
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonKonfirmasi;
    private javax.swing.JButton jButtonPinjam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldJudul;
    private javax.swing.JTable jtBuku;
    private javax.swing.JTable jtBukuPinjaman;
    // End of variables declaration//GEN-END:variables
}
