/*
Programmer: Mithusan Arulampalam, Zakariya Sohail, Shahmeir
Date: January 21, 2020
Program Name: Start of Year Assessment
* Program Description: This program will assess students based of a
* paragraph they have written
*/

//Imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class teacherPassword extends javax.swing.JFrame {
    //ArrayList
    ArrayList<String> unsortedList = new ArrayList<String>();
    
    ArrayList<String> para = new ArrayList<String>();
    ArrayList<String> lastMark = new ArrayList<String>();
    ArrayList<String> name = new ArrayList<String>();
    
    /**
     * Creates new form teacherPassword
     */
    public teacherPassword() {
        initComponents();
        //Centers This Program
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        passwordInput = new javax.swing.JPasswordField();
        viewPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Passcode to Continue:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Teacher");

        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });

        viewPass.setText("Check to See Password");
        viewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelButton)
                                .addGap(79, 79, 79)
                                .addComponent(continueButton)
                                .addGap(0, 6, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewPass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continueButton)
                    .addComponent(cancelButton))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //Reads Student Data
    public void readData(){
        try {
            Scanner file1 = new Scanner(new File("StudentData.txt"));
            
            while (file1.hasNextLine()) {
                //find next line
                unsortedList.add(file1.nextLine());//Adds Unsorted Data to ArrayList
            }//while (file.hasNextLine()) 
            
            file1.close();

        } catch (FileNotFoundException e) {
            throw new ArithmeticException("Error cannot locate Booklist");
        }
    }
    
    //Sorts Unsorted Arraylist 
    public void sortStudentData(){
        name.add(unsortedList.get(0));
        lastMark.add(unsortedList.get(1));
        para.add(unsortedList.get(2));
        
        int x = 0;
        
        int n = 0;
        int m = 1;
        int p = 2;
        
        while(x != (unsortedList.size() / 3) - 1){
            n = n + 3;
            m = m + 3;
            p = p + 3;
            
            name.add(unsortedList.get(n));
            lastMark.add(unsortedList.get(m));
            para.add(unsortedList.get(p));
            x++;
        }//while(x != (unsortedList.size() / 3) - 1)
        
    }
    
    //Writes Data To Be Used Later Through out Program
    public void writeData(){
        try {
            PrintWriter writer1 = new PrintWriter ("StudentName.txt");
            
            for(int x = 0; x < name.size(); x++){
                writer1.write(name.get(x) + "\r\n");
            }
            writer1.close();
            
            PrintWriter writer2 = new PrintWriter ("StudentMark.txt");
            
            for(int x = 0; x < name.size(); x++){
                writer2.write(lastMark.get(x) + "\r\n");
            }
            writer2.close();
            
            PrintWriter writer3 = new PrintWriter ("StudentParagraph.txt");
            
            for(int x = 0; x < name.size(); x++){
                writer3.write(para.get(x) + "\r\n");
            }
            writer3.close();
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(teacherPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        //Calls Custom Functions
        readData();
        sortStudentData();
        writeData();
        
        //Variables
        String password = "";
        char[] input = passwordInput.getPassword();
        String inputString = String.valueOf(input);
        
        //Try Catch
        try {
            //Gets Teacher Password
            Scanner file = new Scanner(new File("TeacherPassword.txt"));
            
            while (file.hasNextLine()) {
                //find next line
                password = file.nextLine();
            }
            
            file.close();
        } catch (FileNotFoundException e) {
            throw new ArithmeticException("Error cannot locate Password");
        }
        
        //Checks if user inputed correct password
        if (inputString.equals(password)){
           new mainProgram().setVisible(false);
           this.setVisible(false);
           
           new teacherMain().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error! Incorrect Password, Please Try Again");
        }
    }//GEN-LAST:event_continueButtonActionPerformed
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        //Closes this Panel
        this.dispose();
        
        new mainProgram().setVisible(true);//Makes next Panel
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed

    private void viewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPassActionPerformed
        //Makes Password Visible
        if(viewPass.isSelected()){
            passwordInput.setEchoChar((char)0);
        }
        //Hide Password
        else{
            passwordInput.setEchoChar('*');
        }
    }//GEN-LAST:event_viewPassActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(teacherPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacherPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JCheckBox viewPass;
    // End of variables declaration//GEN-END:variables
}
