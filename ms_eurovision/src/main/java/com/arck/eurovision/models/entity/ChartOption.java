package com.arck.eurovision.models.entity;

import java.util.List;

public class ChartOption {
    private Title title;
    private Tooltip tooltip;
    private Legend legend;
    private Grid grid;
    private Toolbox toolbox;
    private Axis xAxis;
    private Axis yAxis;
    private List<Series> series;
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Tooltip getTooltip() {
		return tooltip;
	}
	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}
	public Legend getLegend() {
		return legend;
	}
	public void setLegend(Legend legend) {
		this.legend = legend;
	}
	public Grid getGrid() {
		return grid;
	}
	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	public Toolbox getToolbox() {
		return toolbox;
	}
	public void setToolbox(Toolbox toolbox) {
		this.toolbox = toolbox;
	}
	public Axis getxAxis() {
		return xAxis;
	}
	public void setxAxis(Axis xAxis) {
		this.xAxis = xAxis;
	}
	public Axis getyAxis() {
		return yAxis;
	}
	public void setyAxis(Axis yAxis) {
		this.yAxis = yAxis;
	}
	public List<Series> getSeries() {
		return series;
	}
	public void setSeries(List<Series> series) {
		this.series = series;
	}
}