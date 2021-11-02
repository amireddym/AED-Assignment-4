/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Community;
import model.System;

/**
 *
 * @author manojreddy
 */
public class ViewCommunityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCommunityJPanel
     */
    private JPanel displayJPanel;
    private System system;
    private Community community;
    
    public ViewCommunityJPanel(JPanel displayJPanel, System system, Community community) {
        this.displayJPanel = displayJPanel;
        this.system = system;
        this.community = community;
        initComponents();
        displayData();
    }
    
    private void displayData() {
        
        communityNameJTextField.setText(community.getCommunityName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewCommunityJLabel = new javax.swing.JLabel();
        communityNameJLabel = new javax.swing.JLabel();
        communityNameJTextField = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        viewCommunityJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewCommunityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewCommunityJLabel.setText("View Community");

        communityNameJLabel.setText("Community Name :");

        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("< < Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewCommunityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(communityNameJLabel)
                                .addGap(18, 18, 18)
                                .addComponent(communityNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(updateJButton)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCommunityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityNameJLabel)
                    .addComponent(communityNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(updateJButton)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:

        community.setCommunityName(communityNameJTextField.getText());
        community.setLastUpdatedDate(new Date());
        JOptionPane.showMessageDialog(this, "Successfully Saved");
        communityNameJTextField.setText("");
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        communityJPanel communityJPanel = (communityJPanel) component;
        communityJPanel.populateTable();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel communityNameJLabel;
    private javax.swing.JTextField communityNameJTextField;
    private javax.swing.JButton updateJButton;
    private javax.swing.JLabel viewCommunityJLabel;
    // End of variables declaration//GEN-END:variables
}
