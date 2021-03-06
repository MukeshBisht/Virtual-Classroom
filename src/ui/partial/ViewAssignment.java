/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.partial;

import dal.Database;
import entity.CurrentUser;
import entity.User;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import ui.Assignment;
import utility.FileSelector;

/**
 *
 * @author sagar
 */
public class ViewAssignment extends javax.swing.JPanel {

    /**
     * Creates new form AssignmentView
     */
    private Assignment parent;
    private JFileChooser fileChooser;
    
    private Database db;
    
    public ViewAssignment() {
        initComponents();
    }
    
    public ViewAssignment(Assignment parent) {
        this ();
        this.parent = parent;
        fileChooser = new JFileChooser();
        
        setSubjects();
        
    }
    
    private void setSubjects(){
        
        User user = CurrentUser.getCurrentUser().getUser();
        
        ArrayList <String> subjects = db.getAllSubjects(user.getUsername());
        
        
        for (String s : subjects){
            subjectComboBox.addItem(s);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        filePathField = new javax.swing.JTextField();
        chooseFileButton1 = new javax.swing.JButton();
        viewAssignmentPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        subjectComboBox = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        submitFilePath = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        chooseFileButton2 = new javax.swing.JButton();

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(33, 137, 212));
        jButton3.setText("Upload");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel26.setForeground(java.awt.Color.white);
        jLabel26.setText("Upload Assignment");

        filePathField.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        chooseFileButton1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        chooseFileButton1.setForeground(new java.awt.Color(33, 137, 212));
        chooseFileButton1.setText("Choose File");
        chooseFileButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        chooseFileButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileButton1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(33, 137, 212));

        viewAssignmentPanel.setBackground(new java.awt.Color(33, 137, 212));

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel21.setForeground(java.awt.Color.white);
        jLabel21.setText("Subject");

        subjectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Any Subject" }));

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(38, 34, 4));
        jLabel22.setText("Select your course and subject to view their Assignment");

        jButton5.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(33, 137, 212));
        jButton5.setText("View Assignment");
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewAssignmentPanelLayout = new javax.swing.GroupLayout(viewAssignmentPanel);
        viewAssignmentPanel.setLayout(viewAssignmentPanelLayout);
        viewAssignmentPanelLayout.setHorizontalGroup(
            viewAssignmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAssignmentPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(viewAssignmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewAssignmentPanelLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel22))
        );
        viewAssignmentPanelLayout.setVerticalGroup(
            viewAssignmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAssignmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(viewAssignmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(33, 137, 212));

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(69, 68, 60));
        jLabel24.setText("Upload/Submit your assigment here");

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel25.setForeground(java.awt.Color.white);
        jLabel25.setText("Last Submission Date :");

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel27.setForeground(java.awt.Color.white);
        jLabel27.setText("Upload Assignment    :");

        submitFilePath.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(33, 137, 212));
        jButton4.setText("Submit");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("Wed 21/04/2018");

        chooseFileButton2.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        chooseFileButton2.setForeground(new java.awt.Color(33, 137, 212));
        chooseFileButton2.setText("Choose File");
        chooseFileButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        chooseFileButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(submitFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chooseFileButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseFileButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(viewAssignmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewAssignmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chooseFileButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileButton1ActionPerformed

        fileChooser.addChoosableFileFilter( FileSelector.getFileFillter(".pdf"));

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION ){
            File file = fileChooser.getSelectedFile();
            filePathField.setText( file.getAbsolutePath());

        }

        try {
            parent.openpdf(filePathField.getText());
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_chooseFileButton1ActionPerformed

    private void chooseFileButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileButton2ActionPerformed

        fileChooser.addChoosableFileFilter( FileSelector.getFileFillter(".pdf"));

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION ){
            File file = fileChooser.getSelectedFile();
            filePathField.setText( file.getAbsolutePath());

        }

        try {
            parent.openpdf(filePathField.getText());
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_chooseFileButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Object[] data = db.getAssignment(subjectComboBox.getSelectedItem().toString());
        
        InputStream input = (InputStream) data[0];
        Date submissionDate = (Date) data[1];
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String path = submitFilePath.getText();
        
        File file = new File (path);
        
        //db.submitAssingment (file , username);
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseFileButton1;
    private javax.swing.JButton chooseFileButton2;
    private javax.swing.JTextField filePathField;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> subjectComboBox;
    private javax.swing.JTextField submitFilePath;
    private javax.swing.JPanel viewAssignmentPanel;
    // End of variables declaration//GEN-END:variables
}
