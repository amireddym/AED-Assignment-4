/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author manojreddy
 */
public enum Gender {
    
    Male,Female;
    
    public static List<String> getGenderList(){
       
        return Stream.of(Gender.values()).map(Gender::name).collect(Collectors.toList());
    }
    
    public static String[] getGenderArray() {
        
        return Arrays.stream(Gender.values()).map(Gender::name).toArray(String[]::new);
    }
    
}
