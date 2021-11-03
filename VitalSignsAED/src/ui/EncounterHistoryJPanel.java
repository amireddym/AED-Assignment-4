/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Person;
import model.System;
import model.VitalSigns;

/**
 *
 * @author manojreddy
 */
public class EncounterHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterHistoryJPanel
     */
    
    private JPanel displayJPanel;
    private System system;
    private Person person;
    
    public EncounterHistoryJPanel(JPanel displayJpanel, System system, Person person) {
        this.displayJPanel=displayJpanel;
        this.system=system;
        this.person=person;
        initComponents();
        populateEncounterHistoryTable();
    }
    
    public void populateEncounterHistoryTable() {
        
        DefaultTableModel model = (DefaultTableModel) encounterHistoryJTable.getModel();
        model.setRowCount(0);
        
        if(person.getPatient()!=null){
            if(person.getPatient().getEncounterHistory()!=null){
                EncounterHistory encounterHistory = person.getPatient().getEncounterHistory();
                List<Encounter> encounters = encounterHistory.getEncounters();
                if(encounters!=null){
                    for(Encounter encounter:encounters) {

                        Object[] row = new Object[9];
                        row[0]=encounter.getVitalSigns();
                        row[1]=encounter.getVitalSigns().getSysBloodPressure();
                        row[2]=encounter.getVitalSigns().getDiaBloodPressure();
                        row[3]=encounter.getVitalSigns().getHeight();
                        row[4]=encounter.getVitalSigns().getBodyTemperate();
                        row[5]=encounter.getVitalSigns().getPulseRate();
                        row[6]=encounter.getVitalSigns().getRespirationRate();
                        row[7]=encounter.getVitalSigns().getOxygenSaturation();
                        row[8]=formatDate(encounter.getVitalSigns().getCreatedDate());

                        model.addRow(row);
                    }
                }
            }
        }
    }
    
    private String formatDate(Date date){
       
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        encounterHistoryJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        encounterHistoryJLabel = new javax.swing.JLabel();
        deleteJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        viewJButton = new javax.swing.JButton();

        encounterHistoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Weight", "Blood Pressure(Sys)", "Blood Pressure(Ds)", "Height", "Body Temperature", "Pulse Rate", "Respiration Rate", "Oxygen Saturation", "Created On"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(encounterHistoryJTable);

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        encounterHistoryJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        encounterHistoryJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encounterHistoryJLabel.setText(" Encounter History");

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        viewJButton.setText("View/Update");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewJButton)
                        .addGap(2, 2, 2)
                        .addComponent(deleteJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(encounterHistoryJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encounterHistoryJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteJButton)
                    .addComponent(addJButton)
                    .addComponent(viewJButton))
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        CardLayout cardLayout =  (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedIndex  = encounterHistoryJTable.getSelectedRow();
        if(selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to Delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) encounterHistoryJTable.getModel();
        VitalSigns vitalSignsToDelete = (VitalSigns) model.getValueAt(selectedIndex, 0);
        
        EncounterHistory encounterHistory = person.getPatient().getEncounterHistory();
        encounterHistory.setLastUpdatedDate(new Date());
        List<Encounter> encounters = encounterHistory.getEncounters();
        encounters.remove(selectedIndex);
        refreshView();
        
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void refreshView() {
        
        encounterHistoryJTable.setRowSelectionInterval(0,0);
        populateEncounterHistoryTable();
    }
    
    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex  = encounterHistoryJTable.getSelectedRow();
        if(selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to View/Update");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) encounterHistoryJTable.getModel();
        VitalSigns vitalSignsToUpdate = (VitalSigns) model.getValueAt(selectedIndex, 0);
        navigateToVitalSignView(vitalSignsToUpdate);
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        VitalSignsAddJPanel vitalSignsAddJPanel = new VitalSignsAddJPanel(displayJPanel, system, person);
        displayJPanel.add("AddVitalSigns", vitalSignsAddJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void navigateToVitalSignView(VitalSigns vitalSigns) {
        
        VitalSignsJPanel vitalSignsJPanel = new VitalSignsJPanel(displayJPanel, system, vitalSigns);
        displayJPanel.add("ViewVitalSigns",vitalSignsJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JLabel encounterHistoryJLabel;
    private javax.swing.JTable encounterHistoryJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables
}
