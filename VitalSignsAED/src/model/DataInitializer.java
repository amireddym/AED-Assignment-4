/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class DataInitializer {
    
    public static System initializeSystem(){
        
        
        //Boston
        //JamaicaPlain
        //Person1
        //VitalSigns(weight,bloodPressure,height,bodyTemperate,pulseRate,respirationRate,oxygenSaturation,createdDate,lastUpdatedDate,createdBy,modifiedBy)
        VitalSigns vsJPPerson1visit1 = new VitalSigns(60.20,90.5,70.5,5.11,38.8,90,19,97.50,new Date(),new Date(),"System","System");
        VitalSigns vsJPPerson1visit2 = new VitalSigns(63.45,99.5,70.8,6.00,37.7,90,18,99.50,new Date(),new Date(),"System","System");
        VitalSigns vsJPPerson1visit3 = new VitalSigns(58.21,89.5,86.5,6.00,39.5,90,18,98.00,new Date(),new Date(),"System","System");

        Encounter jPPerson1Encounter1 = new Encounter(vsJPPerson1visit1,new Date(),new Date(),"System","System");
        Encounter jPPerson1Encounter2 = new Encounter(vsJPPerson1visit2,new Date(),new Date(),"System","System");
        Encounter jPPerson1Encounter3 = new Encounter(vsJPPerson1visit3,new Date(),new Date(),"System","System");

        List<Encounter> jPPerson1Encounters = new ArrayList<Encounter>();
        jPPerson1Encounters.add(jPPerson1Encounter1);
        jPPerson1Encounters.add(jPPerson1Encounter2);
        jPPerson1Encounters.add(jPPerson1Encounter3);
        EncounterHistory jPPerson1encounterHistory = new EncounterHistory(jPPerson1Encounters,new Date(),new Date(),"System","System");
        
        Patient jPPatient1 = new Patient(jPPerson1encounterHistory,new Date(),new Date(),"System","System");
        Person jPPerson1 = new Person("Ronaldo",23.5,Gender.Male,jPPatient1,new Date(),new Date(),"System","System");
        
        //Person2
        VitalSigns vsJPPerson2visit1 = new VitalSigns(65.20,90.5,60.5,5.70,39.8,94,19,95.58,new Date(),new Date(),"System","System");
        VitalSigns vsJPPerson2visit2 = new VitalSigns(64.60,95.5,66.7,5.70,40.5,93,20,97.78,new Date(),new Date(),"System","System");
        VitalSigns vsJPPerson2visit3 = new VitalSigns(66.80,94.5,69.6,5.70,38.3,96,18,99.50,new Date(),new Date(),"System","System");
        
        Encounter jPPerson2Encounter1 = new Encounter(vsJPPerson2visit1,new Date(),new Date(),"System","System");
        Encounter jPPerson2Encounter2 = new Encounter(vsJPPerson2visit2,new Date(),new Date(),"System","System");
        Encounter jPPerson2Encounter3 = new Encounter(vsJPPerson2visit3,new Date(),new Date(),"System","System");

        List<Encounter> jPPerson2Encounters = new ArrayList<>();
        jPPerson2Encounters.add(jPPerson2Encounter1);
        jPPerson2Encounters.add(jPPerson2Encounter2);
        jPPerson2Encounters.add(jPPerson2Encounter3);
        EncounterHistory jPPerson2encounterHistory = new EncounterHistory(jPPerson2Encounters,new Date(),new Date(),"System","System");
       
        Patient jPPatient2 = new Patient(jPPerson2encounterHistory,new Date(),new Date(),"System","System");
        Person jPPerson2 = new Person("Thomas",26.0,Gender.Male,jPPatient2,new Date(),new Date(),"System","System");
        
        List<Person> house1Persons = new ArrayList<>();
        house1Persons.add(jPPerson1);
        house1Persons.add(jPPerson2);
        
        //MissionHill
        //Person1
        VitalSigns vsMHPerson1visit1 = new VitalSigns(55.20,86.5,70.6,5.10,38.8,95,19,97.50,new Date(),new Date(),"System","System");
        Encounter vsPerson1Encounter1 = new Encounter(vsMHPerson1visit1,new Date(),new Date(),"System","System");

        //Person2
        VitalSigns vsMHPerson2visit1 = new VitalSigns(65.20,90.5,74.6,5.70,39.8,94,19,95.58,new Date(),new Date(),"System","System");
        Encounter vsPerson2Encounter1 = new Encounter(vsMHPerson2visit1,new Date(),new Date(),"System","System");
        
        List<Encounter> vsPerson1Encounters = new ArrayList<>();
        vsPerson1Encounters.add(vsPerson1Encounter1);
        
        List<Encounter> vsPerson2Encounters = new ArrayList<>();
        vsPerson2Encounters.add(vsPerson2Encounter1);
        
        EncounterHistory vsPerson1encounterHistory = new EncounterHistory(vsPerson1Encounters,new Date(),new Date(),"System","System");
        EncounterHistory vsPerson2encounterHistory = new EncounterHistory(vsPerson2Encounters,new Date(),new Date(),"System","System");
  
        Patient vsPatient1 = new Patient(vsPerson1encounterHistory,new Date(),new Date(),"System","System");
        Person vsPerson1 = new Person("Ramanathan",23.5,Gender.Male,vsPatient1,new Date(),new Date(),"System","System");

        Patient vsPatient2 = new Patient(vsPerson2encounterHistory,new Date(),new Date(),"System","System");
        Person vsPerson2 = new Person("Sachin",23.5,Gender.Male,vsPatient2,new Date(),new Date(),"System","System"); 
        
        
        List<Person> house2Persons = new ArrayList<>();
        house2Persons.add(vsPerson1);
        house2Persons.add(vsPerson2);
        
        House jPHouse1 = new House("50 EvergreenST",house1Persons,new Date(),new Date(),"System","System");
        List<House> jphouses = new ArrayList<>();
        jphouses.add(jPHouse1);
        
        House mhHouse1 = new House("180 HillsideST",house2Persons,new Date(),new Date(),"System","System");
        List<House> mhhouses = new ArrayList<>();
        mhhouses.add(mhHouse1);
        
        Community jpCommunity = new Community("Jamaica Plain",jphouses, new Date(),new Date(),"System","System");
        Community mhCommunity = new Community("Mission Hill", mhhouses, new Date(),new Date(),"System","System");
        List<Community> jpCommunities = new ArrayList<>();
        jpCommunities.add(jpCommunity);
        jpCommunities.add(mhCommunity);
        
        City bostonCity = new City(CityName.Boston, jpCommunities,  new Date(),new Date(),"System","System");
        
        List<City> cities = new ArrayList<>();
        cities.add(bostonCity);
        
        
        List<Person> parentsList = new ArrayList<>();
        parentsList.add(jPPerson1);
        parentsList.add(jPPerson2);
        parentsList.add(vsPerson1);
        parentsList.add(vsPerson2);
        PersonDirectory personDirectory = new PersonDirectory(parentsList,new Date(),new Date(),"System","System");
        
        List<Patient> patientsList = new ArrayList<>();
        patientsList.add(jPPatient1);
        patientsList.add(jPPatient2);
        patientsList.add(vsPatient1);
        patientsList.add(vsPatient2);
        PatientDirectory patientDirectory = new PatientDirectory(patientsList,new Date(),new Date(),"System","System");
        System system = new System(cities, personDirectory, patientDirectory, new Date(),new Date(),"System","System");
        
        return system;
    }
    
}
