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
public class City extends ModificationInfo{
    
    private CityName cityName;
    
    private List<Community> communities;

    public City(CityName cityName, List<Community> communities, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.cityName=cityName;
        this.communities=communities;
    }
    
    public CityName getCityName() {
        return cityName;
    }

    public void setCityName(CityName cityName) {
        this.cityName = cityName;
    }
    
    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }    

    @Override
    public String toString() {
        return cityName.name();
    }
    
}
