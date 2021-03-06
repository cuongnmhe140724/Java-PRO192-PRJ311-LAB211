
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Minh Thanh
 */
public class MainForm extends javax.swing.JFrame {

    Thread changeColorTextBackground;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        initThread_ColorBackground();

    }

    public void changeColor() {
        Color x = txtText.getBackground();
//        while (boxRed.isSelected() || boxBlue.isSelected() 
//             || boxYellow.isSelected()|| boxMageta.isSelected()
//             || boxCyan.isSelected() || boxPink.isSelected()){            
//            
//        }
        if (rdoBackground.isSelected()) {
            if (boxRed.isSelected()) {
                x = Color.RED;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setBackground(x);
            if (boxBlue.isSelected()) {
                x = Color.BLUE;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setBackground(x);
            if (boxYellow.isSelected()) {
                x = Color.YELLOW;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setBackground(x);
            if (boxMageta.isSelected()) {
                x = Color.MAGENTA;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setBackground(x);
            if (boxCyan.isSelected()) {
                x = Color.CYAN;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setBackground(x);
            if (boxPink.isSelected()) {
                x = Color.PINK;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setBackground(x);
        }
//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
        if (rdoText.isSelected()) {
            if (boxRed.isSelected()) {
                x = Color.RED;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setForeground(x);
            if (boxBlue.isSelected()) {
                x = Color.BLUE;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setForeground(x);
            if (boxYellow.isSelected()) {
                x = Color.YELLOW;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setForeground(x);
            if (boxMageta.isSelected()) {
                x = Color.MAGENTA;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setForeground(x);
            if (boxCyan.isSelected()) {
                x = Color.CYAN;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setForeground(x);
            if (boxPink.isSelected()) {
                x = Color.PINK;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            txtText.setForeground(x);
        }

    }

    public void initThread_ColorBackground() {
        changeColorTextBackground = new Thread() {
            @Override
            public void run() {
                while (true) {
                    changeColor();
                }
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        boxRed = new javax.swing.JCheckBox();
        boxBlue = new javax.swing.JCheckBox();
        boxYellow = new javax.swing.JCheckBox();
        boxMageta = new javax.swing.JCheckBox();
        boxCyan = new javax.swing.JCheckBox();
        boxPink = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtText = new javax.swing.JTextArea();
        rdoText = new javax.swing.JRadioButton();
        rdoBackground = new javax.swing.JRadioButton();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 124));
        jLabel1.setText("Text or background blinking between selected colors");

        boxRed.setText("Red");

        boxBlue.setText("Blue");
        boxBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBlueActionPerformed(evt);
            }
        });

        boxYellow.setText("Yellow");

        boxMageta.setText("Magenta");

        boxCyan.setText("Cyan");

        boxPink.setText("Pink");

        txtText.setColumns(20);
        txtText.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtText.setRows(5);
        txtText.setText("Hello World");
        jScrollPane1.setViewportView(txtText);

        buttonGroup1.add(rdoText);
        rdoText.setText("Text");

        buttonGroup1.add(rdoBackground);
        rdoBackground.setText("Background");

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxPink)
                                    .addComponent(boxCyan)
                                    .addComponent(boxMageta)
                                    .addComponent(boxYellow))
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxRed)
                                    .addComponent(boxBlue))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoBackground)
                                    .addComponent(rdoText))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxRed)
                            .addComponent(btnStart))
                        .addGap(37, 37, 37)
                        .addComponent(boxBlue))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(rdoText)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoBackground)
                            .addComponent(btnStop))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxYellow)
                        .addGap(42, 42, 42)
                        .addComponent(boxMageta)
                        .addGap(42, 42, 42)
                        .addComponent(boxCyan)
                        .addGap(36, 36, 36)
                        .addComponent(boxPink))
                    .addComponent(jScrollPane1))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        if(!changeColorTextBackground.isAlive()){
            changeColorTextBackground.start();
        }else{
            changeColorTextBackground.resume();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void boxBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxBlueActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        changeColorTextBackground.suspend();
    }//GEN-LAST:event_btnStopActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxBlue;
    private javax.swing.JCheckBox boxCyan;
    private javax.swing.JCheckBox boxMageta;
    private javax.swing.JCheckBox boxPink;
    private javax.swing.JCheckBox boxRed;
    private javax.swing.JCheckBox boxYellow;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoBackground;
    private javax.swing.JRadioButton rdoText;
    private javax.swing.JTextArea txtText;
    // End of variables declaration//GEN-END:variables
}
