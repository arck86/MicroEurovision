package com.arck.eurovision.models.entity;

import java.util.List;

public class Series {
    private String name;
    private String type;
    private String stack;
    private List<Integer> data;

    public Series(String name, String type, String stack, List<Integer> data) {
        this.name = name;
        this.type = type;
        this.stack = stack;
        this.data = data;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}
    
    
}