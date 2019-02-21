package Testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.CrmLoginpage;
import Utility.Base;
import excelData.Dataprovider1;

public class Crmlogintest extends Base {
	
	@Test(dataProvider="accessdata",dataProviderClass=Dataprovider1.class)
	public void test1(String usernm,String passwd) {
		
		CrmLoginpage obj=PageFactory.initElements(driver,CrmLoginpage.class);
		
		obj.verifyuser(usernm);
		
		obj.verifypass(passwd);
		
		obj.verifyLogin();
		
	}

}
