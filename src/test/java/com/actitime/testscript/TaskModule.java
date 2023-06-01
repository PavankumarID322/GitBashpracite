package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;

public class TaskModule extends BaseClass{
	
	@Test
	public void createTask() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.setTaskButton();
	
		TaskPage t=new TaskPage(driver);
		t.getAddNew().click();
		t.getNewTask().click();
		t.getOurCompanyT().click();
		
		Thread.sleep(4000);
		t.getSelectProject().click();
		Thread.sleep(4000);
		t.getSales().click();
		t.getTaskName().sendKeys("Banking");
		t.getCreateTask().click();
		Reporter.log("Completed Create Task",true);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
