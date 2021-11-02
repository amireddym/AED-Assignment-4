/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author manojreddy
 */
public class BloodPressureStatusHelper {
    
    
    public static boolean isPersonAbnormal(Person person, boolean onlyLatest){
        
        if(person.getAge() >=21 && person.getAge() <=25) {
            return true;
        }
        
        if(onlyLatest){
            
            
        }else{
            
        }
        
        return true;
    }
    
}
