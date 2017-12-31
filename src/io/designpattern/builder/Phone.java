package io.designpattern.builder;

/**
 * Created by z063407 on 12/29/17.
 */
public class Phone {
	private String frontPanel;
	private String backPanel;
	private String processor;
	private String camera;
	
	public Phone() {
	}
	
	public static class Builder {
		private String frontPanel;
		private String backPanel;
		private String processor;
		private String camera;
		
		private Builder() {
		
		}
	}
	
	public Phone(String frontPanel, String backPanel, String processor, String camera) {
		this.frontPanel = frontPanel;
		this.backPanel = backPanel;
		this.processor = processor;
		this.camera = camera;
	}
	
	public String getFrontPanel() {
		return frontPanel;
	}
	
	public void setFrontPanel(String frontPanel) {
		this.frontPanel = frontPanel;
	}
	
	public String getBackPanel() {
		return backPanel;
	}
	
	public void setBackPanel(String backPanel) {
		this.backPanel = backPanel;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public String getCamera() {
		return camera;
	}
	
	public void setCamera(String camera) {
		this.camera = camera;
	}
}
