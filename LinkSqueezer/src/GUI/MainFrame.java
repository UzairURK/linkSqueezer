/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;
import linksqueezer.LinkSqueezer;
import linksqueezer.LinkStorage;

/**
 *
 * @author blackrose
 */
public class MainFrame extends javax.swing.JFrame {
    
    private LinkSqueezer linkSqueezer;
    private LinkStorage linkStorage;
    /**
     * Creates new form MainFrame
     */


    public MainFrame(LinkSqueezer linkShortener, LinkStorage linkStorage) {
        this.linkSqueezer = linkSqueezer;
        this.linkStorage = linkStorage;
        initComponents();
    }

    private MainFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        lblLongURL = new javax.swing.JLabel();
        txtLongURL = new javax.swing.JTextField();
        lblAlias = new javax.swing.JLabel();
        txtAlias = new javax.swing.JTextField();
        btnSqueeze = new javax.swing.JButton();
        txtSqueezedURL = new javax.swing.JTextField();
        lblSqueezedURL = new javax.swing.JLabel();
        btnCopyToClipBoard = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        lblHistory = new javax.swing.JLabel();
        btnClearRecord = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblLongURL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLongURL.setText("Long URL");

        txtLongURL.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtLongURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLongURLActionPerformed(evt);
            }
        });

        lblAlias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAlias.setText("Alias/Name");

        txtAlias.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAliasActionPerformed(evt);
            }
        });

        btnSqueeze.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSqueeze.setForeground(new java.awt.Color(51, 204, 0));
        btnSqueeze.setText("Squeeze");
        btnSqueeze.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 0), null, null));
        btnSqueeze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqueezeActionPerformed(evt);
            }
        });

        txtSqueezedURL.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtSqueezedURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSqueezedURLActionPerformed(evt);
            }
        });

        lblSqueezedURL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSqueezedURL.setText("Squeezed URL");

        btnCopyToClipBoard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopyToClipBoard.setForeground(new java.awt.Color(51, 204, 0));
        btnCopyToClipBoard.setText("Copy To Clipboard");
        btnCopyToClipBoard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 0), null, null));
        btnCopyToClipBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyToClipBoardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlias)
                            .addComponent(lblLongURL))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSqueezedURL)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSqueezedURL)
                    .addComponent(txtLongURL)
                    .addComponent(txtAlias))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCopyToClipBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(btnSqueeze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLongURL)
                            .addComponent(txtLongURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlias)
                            .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnSqueeze, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCopyToClipBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSqueezedURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSqueezedURL)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblHistory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S #", "Long URL", "Squeezed URL"
            }
        ));
        tblHistory.setName(""); // NOI18N
        jScrollPane1.setViewportView(tblHistory);
        if (tblHistory.getColumnModel().getColumnCount() > 0) {
            tblHistory.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        lblHistory.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHistory.setText("History");

        btnClearRecord.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClearRecord.setForeground(new java.awt.Color(51, 204, 0));
        btnClearRecord.setText("Clear Record");
        btnClearRecord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 0), null, null));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(lblHistory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(btnClearRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(418, 418, 418))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(lblHistory)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClearRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLongURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLongURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLongURLActionPerformed

    private void txtAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliasActionPerformed

    private void txtSqueezedURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSqueezedURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSqueezedURLActionPerformed

    private void btnSqueezeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqueezeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSqueezeActionPerformed

    private void btnCopyToClipBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyToClipBoardActionPerformed
        // BTN
     String text = txtSqueezedURL.getText(); // Get the text from txtSqueezedURL
    StringSelection selection = new StringSelection(text); // Create a StringSelection object with the text

    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); // Get the system clipboard
    clipboard.setContents(selection, null); // Set the contents of the clipboard to the StringSelection object
     JOptionPane.showMessageDialog(null, "Text Copied"); // Display the pop-up message
    }//GEN-LAST:event_btnCopyToClipBoardActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearRecord;
    private javax.swing.JButton btnCopyToClipBoard;
    private javax.swing.JButton btnSqueeze;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlias;
    private javax.swing.JLabel lblHistory;
    private javax.swing.JLabel lblLongURL;
    private javax.swing.JLabel lblSqueezedURL;
    private javax.swing.JTable tblHistory;
    private javax.swing.JTextField txtAlias;
    private javax.swing.JTextField txtLongURL;
    private javax.swing.JTextField txtSqueezedURL;
    // End of variables declaration//GEN-END:variables
}
