/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.ThietBi;

/**
 *
 * @author PC
 */
public class SuaThietBi extends javax.swing.JDialog {

    /**
     * Creates new form SuaCaTryuc
     */
    private TrangChuAdmin home;

    public SuaThietBi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);      
        initComponents();
        this.setLocationRelativeTo(null);
        home = (TrangChuAdmin) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BoQua = new javax.swing.JButton();
        SuaPhongHoc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTenTB = new javax.swing.JTextField();
        txtMaTB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNamSX = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSoHD = new javax.swing.JTextField();
        txtSoLoi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTenPhong = new javax.swing.JTextField();
        boxLoaiThietBi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Sửa thiết bị");

        BoQua.setText("Bỏ qua");
        BoQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoQuaActionPerformed(evt);
            }
        });

        SuaPhongHoc.setText("Lưu");
        SuaPhongHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaPhongHocActionPerformed(evt);
            }
        });

        jLabel6.setText("Loại thiết bị:");

        jLabel7.setText("Mã thiết bị:");

        jLabel2.setText("Tên thiết bị:");

        jLabel8.setText("Số hoạt động:");

        jLabel9.setText("Số lỗi");

        jLabel5.setText("Năm sản xuất:");

        jLabel10.setText("Tên phòng: ");

        boxLoaiThietBi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Màn hình", "Case máy tính", "Chuột ", "Bàn phím", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(txtTenTB, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(txtMaTB, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(txtSoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(boxLoaiThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SuaPhongHoc))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(56, 56, 56)
                                            .addComponent(BoQua))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(txtNamSX, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(boxLoaiThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSoHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SuaPhongHoc)
                    .addComponent(BoQua))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoQuaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BoQuaActionPerformed

    private void SuaPhongHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaPhongHocActionPerformed
        // TODO add your handling code here:
        String maTB, tenTB, loaiTB;
        
        int soHD, soLoi, namSX, tenPhong;
        maTB = txtMaTB.getText();
        tenTB = txtTenTB.getText();
        loaiTB = boxLoaiThietBi.getSelectedItem().toString();
        soHD = Integer.valueOf(txtSoHD.getText());
        soLoi = Integer.valueOf(txtSoLoi.getText());
        namSX = Integer.valueOf(txtNamSX.getText());
        tenPhong = Integer.valueOf(txtTenPhong.getText());
        
        boolean isOk = true;
        if (maTB.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Ma thiet bi khong de trong!");
            isOk = false;
        } else if (tenTB.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Ten thiet bi khong de trong!");
            isOk = false;
        }else if (loaiTB.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Loai thiet bi khong de trong!");
            isOk = false;
        } else if ((soHD > 40) && (soHD < 0)) {
            JOptionPane.showMessageDialog(rootPane, "Số lượng tb hoat dong không được lớn hơn 40!");
            isOk = false;
        }else if (soLoi > 40) {
            JOptionPane.showMessageDialog(rootPane, "Số lượng tb loi không được lớn hơn 40!");
            isOk = false;
        }else if (namSX < 2018) {
            JOptionPane.showMessageDialog(rootPane, "Năm sản xuất cần phải lớn hơn 2018");
            isOk = false;
        }
        /*int x = 0;
        try{
            x = Integer.parseInt(soLuongMay);
        }catch(Exception e){
            System.out.println("so luong may khong hop le");
        }
        int y = 0;
        try{
            y = Integer.parseInt(CoSo);
        }catch(Exception e){
            System.out.println("Co so khong hop le");
        }*/
        if (isOk) {
            ThietBi th = new ThietBi( maTB,  tenTB,  loaiTB,  soHD,  soLoi,  namSX, tenPhong);
            home.suaPhongHoc(th);
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công!");
            this.dispose();
        }
    }//GEN-LAST:event_SuaPhongHocActionPerformed

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
            java.util.logging.Logger.getLogger(SuaThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaThietBi dialog = new SuaThietBi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoQua;
    private javax.swing.JButton SuaPhongHoc;
    private javax.swing.JComboBox<String> boxLoaiThietBi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtMaTB;
    private javax.swing.JTextField txtNamSX;
    private javax.swing.JTextField txtSoHD;
    private javax.swing.JTextField txtSoLoi;
    private javax.swing.JTextField txtTenPhong;
    private javax.swing.JTextField txtTenTB;
    // End of variables declaration//GEN-END:variables

    public void setSuaThietBi(ThietBi ph) {
        txtMaTB.setText(ph.getMaTB());
        txtTenTB.setText(ph.getTenTB());
         boxLoaiThietBi.setSelectedItem(ph.getLoaiTB());
        txtSoHD.setText(String.valueOf(ph.getSoHoatDong()));
        txtSoLoi.setText(String.valueOf(ph.getSoLoi())); 
        txtNamSX.setText(String.valueOf(0));
        txtTenPhong.setText(String.valueOf(ph.getTenPhong()));
    }
}
