package com.arck.eurovision.models.entity;

import java.util.Map;

public class Toolbox {
    private Map<String, String> feature;

    public Toolbox(Map<String, String> feature) {
        this.feature = feature;
    }
	public Map<String, String> getFeature() {
		return feature;
	}
	public void setFeature(Map<String, String> feature) {
		this.feature = feature;
	}
    
}