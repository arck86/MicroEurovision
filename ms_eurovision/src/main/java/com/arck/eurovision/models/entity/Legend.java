package com.arck.eurovision.models.entity;

import java.util.List;

public class Legend {
    private List<String> data;

    public Legend(List<String> data) {
        this.data = data;
    }
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
    
}