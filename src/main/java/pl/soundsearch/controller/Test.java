package pl.soundsearch.controller;

import java.text.DateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;

public class Test extends CustomDateEditor {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println(text);
		super.setAsText(text);
	}

	@Override
	public String getAsText() {
		System.out.println("BlaBla");
		// TODO Auto-generated method stub
		return super.getAsText();
	}

	public Test(DateFormat dateFormat, boolean allowEmpty) {
		super(dateFormat, allowEmpty);
		// TODO Auto-generated constructor stub
	}
	

}
