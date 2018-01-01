package io.designpattern.builder;

/**
 * Created by z063407 on 12/29/17.
 */
public class BuilderExample {
	
	public static void main(String[] args) {
		Phone onePlus = new Phone();
		onePlus.setCamera("12 MP");
		onePlus.setBackPanel("Sandstone");
		onePlus.setFrontPanel("AMOLED");
		onePlus.setProcessor("Snapdragon 845");
	}
}
