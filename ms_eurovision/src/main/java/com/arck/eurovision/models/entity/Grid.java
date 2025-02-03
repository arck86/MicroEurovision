package com.arck.eurovision.models.entity;

public class Grid {
    private String left;
    private String right;
    private String bottom;
    private boolean containLabel;

    public Grid(String left, String right, String bottom, boolean containLabel) {
        this.left = left;
        this.right = right;
        this.bottom = bottom;
        this.containLabel = containLabel;
    }

	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}

	public String getBottom() {
		return bottom;
	}

	public void setBottom(String bottom) {
		this.bottom = bottom;
	}

	public boolean isContainLabel() {
		return containLabel;
	}

	public void setContainLabel(boolean containLabel) {
		this.containLabel = containLabel;
	}
    
}