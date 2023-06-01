package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustbtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entnewcust;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectbtn;
	
	@FindBy(xpath="//div[@class='searchItemList']/div[5]")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createbtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomer;
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTask;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow selected']")
	private WebElement ourCompanyT;
	
	@FindBy(xpath="//div[@class='emptySelection' and text()='- Select Project -']")
	private WebElement selectProject;
	
	@FindBy(xpath="//div[text()='Sales' and @class='itemRow cpItemRow ' ]")
	private WebElement salesTask;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement taskName;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createTask;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getAddNew() {
		return addNew;
	}
	
	public WebElement getNewCustomer() {
		return newcustbtn;
	}
	
	public WebElement getEnterCustomer() {
		return entnewcust;
	}
	
	public WebElement getCustDesc() {
		return custdesc;
	}
	
	public WebElement getSelectbtn() {
		return selectbtn;
	}
	
	public WebElement getOurCompany() {
		return ourCompany;
	}
	
	public WebElement getSelectProject() {
		return selectProject;
	}
	
	public WebElement getCreateCustomer() {
		return createbtn;
	}
	
	public WebElement getActualCreateCustomer() {
		return actualCustomer;
	}
	
	public WebElement getNewTask() {
		return newTask;
	}
	
	public WebElement getOurCompanyT() {
		return ourCompanyT;
	}
	
	public WebElement getSales() {
		return salesTask;
	}
	
	public WebElement getTaskName() {
		return taskName;
	}
	
	public WebElement getCreateTask() {
		return createTask;
	}
	
	
	
	
	
}
