package com.arck.eurovision.models.entity;

public class Title {
    private String text;

    public Title(String text) {
        this.text = text;
    }

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
