package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class CreateLeadsPage extends Annotation {

	
	public CreateLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "createLeadForm_companyName")
	WebElement eleCompanyName;
	
	@FindBy(id = "createLeadForm_firstName")
	WebElement eleFirstName;
	
	@FindBy(id = "createLeadForm_lastName")
	WebElement eleLastName;
	
	@FindBy(id = "createLeadForm_primaryPhoneNumber")
	WebElement elephonenumber;
	
	@FindBy(id = "createLeadForm_primaryEmail")
	WebElement eleemail;
	
	@FindBy(className = "smallSubmit")
	WebElement submit;
	@FindBy(className = "errorList")
	WebElement errormessage;
	
	public CreateLeadsPage companyname(String cname)
	{
		
		type(eleCompanyName,cname);
		return this;
		
	}
	
	public CreateLeadsPage firstname(String fname)
	{
		
		type(eleFirstName,fname);
		return this;
		
	}
	public CreateLeadsPage lastname(String lname)
	{
		
		type(eleLastName,lname);
		return this;
		
	}
	public CreateLeadsPage phonenumber(String pnumber)
	{
		
		type(elephonenumber,pnumber);
		return this;
		
	}
	
	public CreateLeadsPage email(String emailid)
	{
		
		type(eleemail,emailid);
		return this;
		
	}
	
	public ViewLeadPage submit()
	{
		click(submit);
		return new ViewLeadPage();
	}
	public CreateLeadsPage submitfail()
	{
		click(submit);
		return new CreateLeadsPage();
	}
	
	
	public  CreateLeadsPage verifyerrormessage(String exeText)
	{
		verifyExactText(errormessage,exeText);
		return new CreateLeadsPage();
	}

}
