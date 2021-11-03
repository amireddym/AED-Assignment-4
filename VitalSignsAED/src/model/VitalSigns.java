/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author manojreddy
 */
public class VitalSigns extends ModificationInfo{
    
    private double weight;
    
    private double sysBloodPressure;
    
    private double diaBloodPressure;
    
    private double height;
    
    private double bodyTemperate;
    
    private int pulseRate;
    
    private int respirationRate;
    
    private double oxygenSaturation;

    public VitalSigns(double weight, double sysBloodPressure, double diaBloodPressure, double height, double bodyTemperate, int pulseRate, int respirationRate, double oxygenSaturation, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.weight = weight;
        this.sysBloodPressure = sysBloodPressure;
        this.diaBloodPressure = diaBloodPressure;
        this.height = height;
        this.bodyTemperate = bodyTemperate;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.oxygenSaturation = oxygenSaturation;
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSysBloodPressure() {
        return sysBloodPressure;
    }

    public void setSysBloodPressure(double sysBloodPressure) {
        this.sysBloodPressure = sysBloodPressure;
    }

    public double getDiaBloodPressure() {
        return diaBloodPressure;
    }

    public void setDiaBloodPressure(double diaBloodPressure) {
        this.diaBloodPressure = diaBloodPressure;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyTemperate() {
        return bodyTemperate;
    }

    public void setBodyTemperate(double bodyTemperate) {
        this.bodyTemperate = bodyTemperate;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public double getOxygenSaturation() {
        return oxygenSaturation;
    }

    public void setOxygenSaturation(double oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }

    @Override
    public String toString() {
        return  String.valueOf(weight);
    }
    
}
