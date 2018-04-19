/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dal.Database;
import entity.CurrentUser;
import entity.User;
import entity.UserType;
import factory.View;
import factory.ViewFactory;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import ui.partial.UploadAssignment;
import ui.partial.ViewAssignment;
import virtaulclassroom.IChangeView;

/**
 *
 * @author sagar
 */
public class Assignment extends javax.swing.JPanel {

    /**
     * Creates new form Assignment
     */
    
    IChangeView parent;
    Database db;
    
    public Assignment() {
        
        initComponents();
        setPanel ();
        jScrollPane1.getViewport().setBackground(new Color(33,137,212));
    }
    
    public Assignment (IChangeView parent ){
        this();
        this.parent = parent;
    }
    
    private void setPanel (){
        User user = CurrentUser.getCurrentUser().getUser();
        
        if (user.getType() == UserType.FACULTY) {
            jPanel1.add (new UploadAssignment(this) , BorderLayout.NORTH);
        }
        else if (user.getType() == UserType.STUDENT) {
            jPanel1.add (new ViewAssignment(this) , BorderLayout.NORTH);
        }
        System.out.println (user.getUsername() + " and "+ user.getType());
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        AssignmentBody = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 137, 212));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportBorder(null);
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setHorizontalScrollBar(null);

        AssignmentBody.setBackground(new java.awt.Color(33, 137, 212));

        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);

        jPanel1.setBackground(new java.awt.Color(33, 137, 212));
        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout AssignmentBodyLayout = new javax.swing.GroupLayout(AssignmentBody);
        AssignmentBody.setLayout(AssignmentBodyLayout);
        AssignmentBodyLayout.setHorizontalGroup(
            AssignmentBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AssignmentBodyLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                .addGap(227, 227, 227))
            .addGroup(AssignmentBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AssignmentBodyLayout.setVerticalGroup(
            AssignmentBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssignmentBodyLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jScrollPane2.setViewportView(AssignmentBody);

        jPanel4.setBackground(java.awt.Color.lightGray);
        jPanel4.setForeground(new java.awt.Color(33, 137, 212));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(33, 137, 212));
        jLabel12.setText("Virtual Classroom");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(382, 382, 382)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(317, 317, 317))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        parent.requestView(ViewFactory.getView (parent, View.Home));
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AssignmentBody;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

 
    public void openpdf(String file) throws Exception{
   
        SwingController control = new SwingController();
        SwingViewBuilder builder = new SwingViewBuilder( control );
        
        JPanel panel = builder.buildViewerPanel();
        
        ComponentKeyBinding.install( control, panel );

        control.getDocumentViewController().setAnnotationCallback(
                 new org.icepdf.ri.common.MyAnnotationCallback(
                 control.getDocumentViewController()));
        
        control.openDocument(file);
        
        jScrollPane1.setViewportView(panel);  
        
       
    }
   
}