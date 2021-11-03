/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class BloodPressureStatusHelper {
    
    public static boolean isPersonAbnormal(Person person, boolean onlyLatest){
        
        if(person.getPatient()!=null && person.getPatient().getEncounterHistory()!=null && person.getPatient().getEncounterHistory().getEncounters()!=null) {
        
            List<Encounter> encounters = person.getPatient().getEncounterHistory().getEncounters();
            List<VitalSigns> vitalSigns = new ArrayList<>();
            for(Encounter encounter:encounters){
                vitalSigns.add(encounter.getVitalSigns());
            }
            
            if(onlyLatest){
                Collections.sort(vitalSigns);
                VitalSigns vitalSign = vitalSigns.get(0);
                if(person.getGender().name().equalsIgnoreCase(Gender.Male.name())) {
                    if(Double.compare(person.getAge(),21) < 0 || Double.compare(person.getAge(),65) > 0){
                        return false;
                    } 
                    if(Double.compare(person.getAge(),21) >= 0  && Double.compare(person.getAge(),25) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),122.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),118.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),80.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),76.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }

                    if(Double.compare(person.getAge(),26) >= 0  && Double.compare(person.getAge(),30) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),121.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),117.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),78.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),74.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }
              
                    if(Double.compare(person.getAge(),31) >= 0  && Double.compare(person.getAge(),35) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),116.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),112.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),77.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),73.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }

                    if(Double.compare(person.getAge(),36) >= 0  && Double.compare(person.getAge(),40) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),122.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),118.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),77.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),73.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }                    

                    if(Double.compare(person.getAge(),41) >= 0  && Double.compare(person.getAge(),45) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),117.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),113.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),80.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),76.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }                    

                    if(Double.compare(person.getAge(),46) >= 0  && Double.compare(person.getAge(),50) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),121.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),117.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),82.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),78.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }                    
                    
                    if(Double.compare(person.getAge(),51) >= 0  && Double.compare(person.getAge(),55) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),127.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),123.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),82.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),78.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }

                    if(Double.compare(person.getAge(),56) >= 0  && Double.compare(person.getAge(),60) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),131.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),127.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),81.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),77.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }

                    if(Double.compare(person.getAge(),61) >= 0  && Double.compare(person.getAge(),65) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),145.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),141.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),78.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),74.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }   
                    
                }else{
                    
                    if(Double.compare(person.getAge(),21) < 0 || Double.compare(person.getAge(),65) > 0){
                        return false;
                    }
                    
                    if(Double.compare(person.getAge(),21) >= 0  && Double.compare(person.getAge(),25) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),117.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),113.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),72.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),68.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }

                    if(Double.compare(person.getAge(),26) >= 0  && Double.compare(person.getAge(),30) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),115.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),111.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),73.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),69.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }
              
                    if(Double.compare(person.getAge(),31) >= 0  && Double.compare(person.getAge(),35) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),113.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),108.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),74.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),70.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }

                    if(Double.compare(person.getAge(),36) >= 0  && Double.compare(person.getAge(),40) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),114.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),110.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),76.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),72.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }                    

                    if(Double.compare(person.getAge(),41) >= 0  && Double.compare(person.getAge(),45) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),118.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),114.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),75.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),71.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }                    

                    if(Double.compare(person.getAge(),46) >= 0  && Double.compare(person.getAge(),50) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),126.0) < 0 && Double.compare(vitalSign.getSysBloodPressure(),122.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),80.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),76.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }                    
                    
                    if(Double.compare(person.getAge(),51) >= 0  && Double.compare(person.getAge(),55) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),124.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),120.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),76.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),72.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }

                    if(Double.compare(person.getAge(),56) >= 0  && Double.compare(person.getAge(),60) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),134.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),130.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),80.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),76.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }

                    if(Double.compare(person.getAge(),61) >= 0  && Double.compare(person.getAge(),65) <= 0){
                        if(Double.compare(vitalSign.getSysBloodPressure(),132.5) < 0 && Double.compare(vitalSign.getSysBloodPressure(),128.5) > 0 
                                && Double.compare(vitalSign.getDiaBloodPressure(),79.5) < 0 && Double.compare(vitalSign.getDiaBloodPressure(),75.5) > 0){
                            return false;
                        }else{
                            return true;
                        }
                    }                    
                    
                }
            }else{
                return true;
            }
            
        }
        return false;
    }

}
