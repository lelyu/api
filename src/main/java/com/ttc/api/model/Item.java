package com.ttc.api.model;
import jakarta.persistence.*;


@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String appName;
    private String appDescription;
    private String appURI;


    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getAppDescription() {
        return appDescription;
    }
    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }
    public String getAppURI() {
        return appURI;
    }
    public void setAppURI(String appURI) {
        this.appURI = appURI;
    }
    
}