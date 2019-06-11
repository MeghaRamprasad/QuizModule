import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://snapshotstaging.havasstaging.com/india/en')

WebUI.click(findTestObject('Quiz/QuizObjects/button_Take quiz'))

for(i=0;i<8;i++)
{
	//WebUI.click(findTestObject('Quiz/QuizObjects/Answer1'))
	//WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
	//Checking = WebUI.getText('Quiz/QuizObjects/Question1')
	Checking = WebUI.getText(findTestObject('Quiz/QuizObjects/Question1'))
	if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question1', Question1))) 
	//WebUI.verifyElementText(Checking, Question1)
		{ 
			WebUI.click(findTestObject('Quiz/QuizObjects/Answer1'))
		
		WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
		} 
	else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question2', Question2)))
		{ 
			WebUI.click(findTestObject('Quiz/QuizObjects/Answer2'))
			
			WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
		
		}
	 else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question3', Question3)))
	 	{
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer1'))
			 
			 WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
		 
		 }
	 else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question4', Question4)))
		 {
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer2'))
			 
			 WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
		 
		 }
	else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question5', Question5)))
		 {
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer1'))
			 
			 WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
		 
		 }
	else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question6', Question6)))
		 {
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer2'))
			 
			 WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
		 
		 }
	else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question7', Question7)))
	 	{
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer1'))
			 
			 WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
		 
		 } 
	else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question8', Question8)))
	 	{
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer2'))
			 WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
					 
		 } 
	else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question9', Question9)))
		 {
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer1'))
			 WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
					 
		 }
	else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question10', Question10)))
		 {
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer2'))
			 WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
					 
		 }
	else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question11', Question11)))
		 {
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer1'))
			 WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
					 
		 }
	else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question12', Question12)))
		 {
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer2'))
			 WebUI.click(findTestObject('Quiz/QuizObjects/button_NEXT            SHOW RESULTS'))
					 
		 }
	else if (WebUI.verifyElementText(findTestObject('Quiz/QuizObjects/Question13', Question13)))
		 {
			 WebUI.click(findTestObject('Quiz/QuizObjects/Answer1'))
		 }
		 
}

WebUI.click(findTestObject('Quiz/QuizObjects/div_BACK                      NEXT            SHOW RESULTS'))

