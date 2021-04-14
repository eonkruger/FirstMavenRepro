package com.org.firstMavenProject;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("New branch");
		//declare and instantiate of the object and variable
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//Now commit and push the changes to github
	}
}