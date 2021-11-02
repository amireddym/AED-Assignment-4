/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BloodPressureStatusHelper;
import model.City;
import model.Community;
import model.House;
import model.Person;
import model.System;

/**
 *
 * @author manojreddy
 */
public class TrackJPanel extends javax.swing.JPanel {

    /**
     * Creates new form trackJPanel
     */
    private System system;
    
    public TrackJPanel(System system) {
        this.system = system;
        initComponents();
        initializeData();
        cityjComboBox.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.lang.System.out.println("Event Listened");
                String cityName = (String) cityjComboBox.getSelectedItem();
                communityjComboBox.removeAllItems();
        
                for(City city:system.getCities()) {
                    if(city.getCityName().name().equalsIgnoreCase(cityName)){
               
                        List<Community> communitys = city.getCommunities();
                        if(communitys!=null) {
                            for(Community community:communitys) {
                                communityjComboBox.addItem(community.getCommunityName());
                            }
                        }
                    }
               }
                if(communityjComboBox.getItemCount()>0){
                    communityjComboBox.setSelectedIndex(0);
                }
            }
        });
    }
    
    private void initializeData() {
        
        java.lang.System.out.println("Inside track screen");
        List<City> cities = system.getCities();
        
        for(City city:cities) {
            cityjComboBox.addItem(city.getCityName().name());
        }        
        
        cityjComboBox.setSelectedIndex(0);
                
        for(City city:system.getCities()) {
            if(city.getCityName().name().equalsIgnoreCase(cityjComboBox.getItemAt(0))){
               
                List<Community> communitys = city.getCommunities();
                if(communitys!=null){
                    for(Community community:communitys) {
                        communityjComboBox.addItem(community.getCommunityName());
                    }
                }
            }
        }
        
        communityjComboBox.setSelectedIndex(0);
        
    }
    
    
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerjLabel = new javax.swing.JLabel();
        cityjLabel = new javax.swing.JLabel();
        cityjComboBox = new javax.swing.JComboBox<>();
        communityjLabel = new javax.swing.JLabel();
        communityjComboBox = new javax.swing.JComboBox<>();
        searchjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personsjTable = new javax.swing.JTable();
        onlyLatestjCheckBox = new javax.swing.JCheckBox();
        onlyLatestjLabel = new javax.swing.JLabel();

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Persons with Abnormal Vitals ");

        cityjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityjLabel.setText("City :");

        communityjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        communityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        communityjLabel.setText("Community :");

        searchjButton.setText("Search");
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });

        personsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Person Name", "Age", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personsjTable);

        onlyLatestjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        onlyLatestjLabel.setText("Only Latest");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(communityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(communityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(onlyLatestjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(onlyLatestjCheckBox)
                                .addGap(29, 29, 29)
                                .addComponent(searchjButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(onlyLatestjCheckBox)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cityjLabel)
                        .addComponent(cityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(communityjLabel)
                        .addComponent(communityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchjButton)
                        .addComponent(onlyLatestjLabel)))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        // TODO add your handling code here:
        boolean isOnlyLatest = onlyLatestjCheckBox.isSelected();
        String cityName = (String) cityjComboBox.getSelectedItem();
        if(communityjComboBox.getItemCount()==0){
            JOptionPane.showMessageDialog(this, "No Communities to show People");
            return;
        }
        String communityName = (String) communityjComboBox.getSelectedItem();
        
        for(City city:system.getCities()){
            if(city.getCityName().name().equalsIgnoreCase(cityName)){
                
                for(Community community:city.getCommunities()){
                    if(community.getCommunityName().equalsIgnoreCase(communityName)){
                       
                       if(isOnlyLatest){ 
                           displayPatients(community, true); 
                       }else{
                           displayPatients(community, false);
                       }
                    }
                }
            }
        }
    }//GEN-LAST:event_searchjButtonActionPerformed

    private void displayPatients(Community community,boolean isOnlyLatest) {
         
        List<Person> personsInCommunity = new ArrayList<>();
        if(community.getHouses()!=null){
            for(House house:community.getHouses()){
                personsInCommunity.addAll(house.getPersons());
            }
        }
        
        List<Person> personsToDisplay = new ArrayList<>();
            
        for(Person person:personsInCommunity){
                
            if(BloodPressureStatusHelper.isPersonAbnormal(person, isOnlyLatest)){
                personsToDisplay.add(person);
            }
        }   
        
        displayOnTable(personsToDisplay);
        
    }
    
    private void displayOnTable(List<Person> personsToDisplay) {
        
        DefaultTableModel model = (DefaultTableModel) personsjTable.getModel();
        model.setRowCount(0);
        
        for(Person person : personsToDisplay) {
            
            Object[] row = new Object[3];
            row[0] = person.getName();
            row[1] = person.getAge();
            row[2] = person.getGender().name();
            model.addRow(row);
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cityjComboBox;
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JComboBox<String> communityjComboBox;
    private javax.swing.JLabel communityjLabel;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox onlyLatestjCheckBox;
    private javax.swing.JLabel onlyLatestjLabel;
    private javax.swing.JTable personsjTable;
    private javax.swing.JButton searchjButton;
    // End of variables declaration//GEN-END:variables
}
