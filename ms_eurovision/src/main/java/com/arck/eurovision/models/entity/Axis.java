package com.arck.eurovision.models.entity;

import java.util.List;

public class Axis {
    private String type;
    private boolean boundaryGap;
    private List<String> data;

    public Axis(String type, boolean boundaryGap, List<String> data) {
        this.type = type;
        this.boundaryGap = boundaryGap;
        this.data = data;
    }

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isBoundaryGap() {
		return boundaryGap;
	}
	public void setBoundaryGap(boolean boundaryGap) {
		this.boundaryGap = boundaryGap;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
    
}
