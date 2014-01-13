package com.sample.controller;

import java.util.*;

public class SampleModel {

    private Long id;
    private String name;
    
    private List<String> attributes;
    
    public SampleModel() {
    }
    public SampleModel(Long id, String name) {
        this.id = id;
        this.name = name;
        this.attributes = new ArrayList<String>();
    }
    
    public void addAttribute(String attr) {
        this.attributes.add(attr);
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getAttributes() {
        return attributes;
    }
}
