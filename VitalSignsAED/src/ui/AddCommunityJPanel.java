/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.City;
import model.Community;

/**
 *
 * @author manojreddy
 */
public class AddCommunityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCommunityJPanel
     */
    
    private JPanel displayJPanel;
    private City city;
    
    
    public AddCommunityJPanel(JPanel displayJPanel, City city) {
        this.displayJPanel=displayJPanel;
        this.city=city;
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

        addCommunityJLabel = new javax.swing.JLabel();
        communityNameJLabel = new javax.swing.JLabel();
        communityNameJTextField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        addCommunityJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addCommunityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCommunityJLabel.setText("Add New Community");

        communityNameJLabel.setText("Community Name :");

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
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
                            .addComponent(addCommunityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(communityNameJLabel)
                                .addGap(18, 18, 18)
                                .addComponent(communityNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(addJButton)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCommunityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityNameJLabel)
                    .addComponent(communityNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(addJButton)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        
        String communityName = communityNameJTextField.getText();
        if(communityName.matches("^[a-zA-Z ]+$")){
            Community community = new Community(communityName,null,new Date(), new Date(), "System", "System");
            if(city.getCommunities()==null){
                city.setCommunities(new ArrayList<>());
                city.getCommunities().add(community);
            }else{
                city.getCommunities().add(community);
            }
            JOptionPane.showMessageDialog(this, "Successfully Saved");
            communityNameJTextField.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Not Saved. Please check the proper Type");
        }
    }//GEN-LAST:event_addJButtonActionPerformed

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
    private javax.swing.JLabel addCommunityJLabel;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel communityNameJLabel;
    private javax.swing.JTextField communityNameJTextField;
    // End of variables declaration//GEN-END:variables
}
