/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
 public class PatientDirectory extends ModificationInfo{
    
    private List<Patient> patients;

    public PatientDirectory(List<Patient> patients, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.patients=patients;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    
}
