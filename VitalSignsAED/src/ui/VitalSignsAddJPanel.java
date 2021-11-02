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
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.Person;
import model.System;
import model.VitalSigns;

/**
 *
 * @author manojreddy
 */
public class VitalSignsAddJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignsAddJPanel
     */
    
    private JPanel displayJPanel;
    private System system;
    private Person person;
    
    public VitalSignsAddJPanel(JPanel displayJPanel, System system, Person person) {
        this.displayJPanel=displayJPanel;
        this.system=system;
        this.person=person;
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

        heightJLabel = new javax.swing.JLabel();
        bodyTemperatureJLabel = new javax.swing.JLabel();
        pulseRateJLabel = new javax.swing.JLabel();
        respirationRateJLabel = new javax.swing.JLabel();
        oxygenSaturationJLabel = new javax.swing.JLabel();
        heightJTextField = new javax.swing.JTextField();
        addVitalSignsJLabel = new javax.swing.JLabel();
        bodyTemperatureJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        weightJLabel = new javax.swing.JLabel();
        pulseRateJTextField = new javax.swing.JTextField();
        weightJTextField = new javax.swing.JTextField();
        respirationRateJTextField = new javax.swing.JTextField();
        bloodPressureJLabel = new javax.swing.JLabel();
        oxygenSaturationJTextField = new javax.swing.JTextField();
        bloodPressureJTextField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();

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

        addVitalSignsJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        addVitalSignsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addVitalSignsJLabel.setText("Add Vital Signs");

        backJButton.setText("< < Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        weightJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        weightJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        weightJLabel.setText("Weight :");

        bloodPressureJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bloodPressureJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bloodPressureJLabel.setText("Blood Pressure :");

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
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
                        .addComponent(addVitalSignsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(addJButton)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVitalSignsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addJButton)
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

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        
        VitalSigns vitalSigns = new VitalSigns(Double.valueOf(weightJTextField.getText()), Double.valueOf(bloodPressureJTextField.getText()),
        Double.valueOf(heightJTextField.getText()), Double.valueOf(bodyTemperatureJTextField.getText()), Integer.valueOf(pulseRateJTextField.getText()),
        Integer.valueOf(respirationRateJTextField.getText()), Double.valueOf(oxygenSaturationJTextField.getText()), new Date(),
        new Date(), "System", "System");

        Encounter encounter = new Encounter(vitalSigns, new Date(), new Date(), "System", "System");
        
        if(person.getPatient()==null){
            List<Encounter> encounters = new ArrayList<>();
            encounters.add(encounter);
            EncounterHistory encounterHistory = new EncounterHistory(encounters, new Date(), new Date(), "System", "System");
            Patient patient = new Patient(encounterHistory, new Date(), new Date(), "System", "System");
            person.setPatient(patient);
        }else{
            EncounterHistory encounterHistory = person.getPatient().getEncounterHistory();
            encounterHistory.getEncounters().add(encounter);
        }
        
        JOptionPane.showMessageDialog(this, "Successfully Added the Vital Signs");
        resetData();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void resetData() {
        
        weightJTextField.setText("");
        bloodPressureJTextField.setText("");
        heightJTextField.setText("");
        bodyTemperatureJTextField.setText("");
        pulseRateJTextField.setText("");
        respirationRateJTextField.setText("");
        oxygenSaturationJTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel addVitalSignsJLabel;
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
    private javax.swing.JLabel weightJLabel;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
