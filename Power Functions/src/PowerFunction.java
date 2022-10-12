/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mithusan Arulampalam
 *///Uses a customized function as well as the Math.pow function to displays a listing of powers.

import java.util.ArrayList;
public class PowerFunction extends javax.swing.JFrame {

    /**
     * Creates new form PowerFunction
     */
    public PowerFunction() {
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

        TitleLabel = new javax.swing.JLabel();
        TerryCrews = new javax.swing.JLabel();
        BaseLabel = new javax.swing.JLabel();
        ExponentLabel = new javax.swing.JLabel();
        BaseInput = new javax.swing.JTextField();
        ExponentInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        Quit = new javax.swing.JButton();
        Calculate = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 0, 0));
        TitleLabel.setText("Power!");

        TerryCrews.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c4b.jpg"))); // NOI18N

        BaseLabel.setText("Enter the Base:");

        ExponentLabel.setText("Enter the Exponent:");

        BaseInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaseInputActionPerformed(evt);
            }
        });

        ExponentInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExponentInputActionPerformed(evt);
            }
        });

        Output.setColumns(20);
        Output.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Output.setRows(5);
        jScrollPane1.setViewportView(Output);

        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BaseLabel)
                                    .addComponent(ExponentLabel))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BaseInput, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(ExponentInput))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Calculate))
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TitleLabel)
                                .addGap(27, 27, 27)
                                .addComponent(TerryCrews))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TerryCrews))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TitleLabel)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaseLabel)
                    .addComponent(BaseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calculate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExponentLabel)
                    .addComponent(ExponentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void BaseInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaseInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BaseInputActionPerformed

    private void ExponentInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExponentInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExponentInputActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        //Closes the program
        this.dispose();
    }//GEN-LAST:event_QuitActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        try{//Try Catch
            //Initallizes Variables
            int base = Integer.parseInt(BaseInput.getText());//Base Number
            int exponent = Integer.parseInt(ExponentInput.getText());//Exponent Number
            ArrayList<String> answer = new ArrayList<>();//Arraylist
            
            //For Loop
            for (int i = 1; i <= exponent; i++){//Loops based on exponent > exponent = 4 then loops 4 times
                //Calculation
                double power = Math.pow(base, i);
                
                //Output
                answer.add(base + " to the exponent " + i + " = " + Double.toString(power));
            }
            
            //Provides an alternative to String Class for Arraylist
            StringBuilder sb = new StringBuilder();
            for(String s : answer){//for loop
                sb.append(s);
                sb.append("\n");//Spaces the List
            }
            
            //Output
            Output.setText(sb.toString());
        }
        catch(NumberFormatException e){//Checks if user input wrong format > Must be Int
            //Error Output
            Output.setText("Please Input in Correct Format!");
        }
    }//GEN-LAST:event_CalculateActionPerformed

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
            java.util.logging.Logger.getLogger(PowerFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PowerFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PowerFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PowerFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PowerFunction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BaseInput;
    private javax.swing.JLabel BaseLabel;
    private javax.swing.JButton Calculate;
    private javax.swing.JTextField ExponentInput;
    private javax.swing.JLabel ExponentLabel;
    private javax.swing.JTextArea Output;
    private javax.swing.JButton Quit;
    private javax.swing.JLabel TerryCrews;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}