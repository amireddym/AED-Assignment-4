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
import model.VitalSigns;
import model.System;

/**
 *
 * @author manojreddy
 */
public class VitalSignsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignsJPanel
     */
    
    private JPanel displayJPanel;
    private System system;
    private VitalSigns vitalSigns;
    
    public VitalSignsJPanel(JPanel displayJPanel, System system, VitalSigns vitalSigns) {
        this.displayJPanel=displayJPanel;
        this.system=system;
        this.vitalSigns=vitalSigns;
        initComponents();
        displayData(vitalSigns);
    }
    
    private void displayData(VitalSigns vitalSigns){
        
        weightJTextField.setText(String.valueOf(vitalSigns.getWeight()));
        bloodPressureJTextField.setText(String.valueOf(vitalSigns.getBloodPressure()));
        heightJTextField.setText(String.valueOf(vitalSigns.getHeight()));
        bodyTemperatureJTextField.setText(String.valueOf(vitalSigns.getBodyTemperate()));
        pulseRateJTextField.setText(String.valueOf(vitalSigns.getPulseRate()));
        respirationRateJTextField.setText(String.valueOf(vitalSigns.getRespirationRate()));
        oxygenSaturationJTextField.setText(String.valueOf(vitalSigns.getOxygenSaturation()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vitalSignsJLabel = new javax.swing.JLabel();
        weightJLabel = new javax.swing.JLabel();
        weightJTextField = new javax.swing.JTextField();
        bloodPressureJLabel = new javax.swing.JLabel();
        bloodPressureJTextField = new javax.swing.JTextField();
        heightJLabel = new javax.swing.JLabel();
        bodyTemperatureJLabel = new javax.swing.JLabel();
        pulseRateJLabel = new javax.swing.JLabel();
        respirationRateJLabel = new javax.swing.JLabel();
        oxygenSaturationJLabel = new javax.swing.JLabel();
        heightJTextField = new javax.swing.JTextField();
        bodyTemperatureJTextField = new javax.swing.JTextField();
        pulseRateJTextField = new javax.swing.JTextField();
        respirationRateJTextField = new javax.swing.JTextField();
        oxygenSaturationJTextField = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        vitalSignsJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        vitalSignsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vitalSignsJLabel.setText("Vital Signs");

        weightJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        weightJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        weightJLabel.setText("Weight :");

        bloodPressureJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bloodPressureJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bloodPressureJLabel.setText("Blood Pressure :");

        heightJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        heightJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heightJLabel.setText("Height :");

        bodyTemperatureJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bodyTemperatureJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bodyTemperatureJLabel.setText("Body Temperature :");

        pulseRateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        pulseRateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pulseRateJLabel.setText("Pulse Rate :");

        respirationRateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        respirationRateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        respirationRateJLabel.setText("Respiration Rate :");

        oxygenSaturationJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        oxygenSaturationJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        oxygenSaturationJLabel.setText("Oxygen Saturation :");

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
                        .addGap(23, 23, 23)
                        .addComponent(backJButton)
                        .addGap(61, 61, 61)
                        .addComponent(vitalSignsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bloodPressureJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pulseRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(respirationRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(weightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bodyTemperatureJLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(oxygenSaturationJLabel)))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bodyTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pulseRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respirationRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oxygenSaturationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(updateJButton)))
                .addContainerGap(265, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bloodPressureJLabel, bodyTemperatureJLabel, heightJLabel, oxygenSaturationJLabel, pulseRateJLabel, respirationRateJLabel, weightJLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitalSignsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodPressureJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyTemperatureJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bodyTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulseRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulseRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respirationRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respirationRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oxygenSaturationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oxygenSaturationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(updateJButton)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        EncounterHistoryJPanel encounterHistoryJPanel = (EncounterHistoryJPanel) component;
        encounterHistoryJPanel.populateEncounterHistoryTable();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        
        vitalSigns.setBloodPressure(Double.valueOf(bloodPressureJTextField.getText()));
        vitalSigns.setBodyTemperate(Double.valueOf(bodyTemperatureJTextField.getText()));
        vitalSigns.setHeight(Double.valueOf(heightJTextField.getText()));
        vitalSigns.setOxygenSaturation(Double.valueOf(oxygenSaturationJTextField.getText()));
        vitalSigns.setPulseRate(Integer.valueOf(pulseRateJTextField.getText()));
        vitalSigns.setRespirationRate(Integer.valueOf(respirationRateJTextField.getText()));
        vitalSigns.setWeight(Double.valueOf(weightJTextField.getText()));
        vitalSigns.setLastUpdatedDate(new Date());
        
        JOptionPane.showMessageDialog(this, "Successfully updated the Vital Signs");
        
        
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void resetData(){
        
        bloodPressureJTextField.setText("");
        bodyTemperatureJTextField.setText("");
        heightJTextField.setText("");
        oxygenSaturationJTextField.setText("");
        pulseRateJTextField.setText("");
        respirationRateJTextField.setText("");
        weightJTextField.setText("");
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel bloodPressureJLabel;
    private javax.swing.JTextField bloodPressureJTextField;
    private javax.swing.JLabel bodyTemperatureJLabel;
    private javax.swing.JTextField bodyTemperatureJTextField;
    private javax.swing.JLabel heightJLabel;
    private javax.swing.JTextField heightJTextField;
    private javax.swing.JLabel oxygenSaturationJLabel;
    private javax.swing.JTextField oxygenSaturationJTextField;
    private javax.swing.JLabel pulseRateJLabel;
    private javax.swing.JTextField pulseRateJTextField;
    private javax.swing.JLabel respirationRateJLabel;
    private javax.swing.JTextField respirationRateJTextField;
    private javax.swing.JButton updateJButton;
    private javax.swing.JLabel vitalSignsJLabel;
    private javax.swing.JLabel weightJLabel;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}