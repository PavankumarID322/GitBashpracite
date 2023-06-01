package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;



@Listeners(com.actitime.generic.ListenerImplement.class)
public class CustomerModule extends BaseClass {

	
	@Test
	public void createCustomer() {
		Reporter.log("Create is Done",true);
		//Home Page Elements
		HomePage h=new HomePage(driver);
		h.setTaskButton();
		
		//Task Page Elements
		TaskPage tp=new TaskPage(driver);
		tp.getAddNew().click();
		tp.getNewCustomer().click();
		String hdfc="HDFC_001";
		tp.getEnterCustomer().sendKeys(hdfc);
		String desc="Banking Project";
		tp.getCustDesc().sendKeys(desc);
		tp.getSelectbtn().click();
		tp.getOurCompany().click();
		tp.getCreateCustomer().click();
		Reporter.log("completed Create Customer",true);
	}
	
	
}
