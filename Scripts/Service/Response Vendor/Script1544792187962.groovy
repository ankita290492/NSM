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

/*WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://siachen:8007/NSMvendor/')*/

WebUI.setText(findTestObject('Object Repository/Service/Process Ticket/Page_Login Page/input_Vendor platform_userid'), 'vendor01')

WebUI.setEncryptedText(findTestObject('Object Repository/Service/Process Ticket/Page_Login Page/input_Vendor platform_password'), 
    'RfES2L809yyT69vCWLoDzQ==')

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Note Sorting Machine/a_Service'))

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Note Sorting Machine/a_Process Ticket'))

/*WebUI.setText(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/input_Ticket No._ticketNo'), 
    'TICKET32')

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/div_Search'))

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/button_Search'))*/

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/td_TICKET24'))

WebUI.setText(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/textarea_Comments_remarks'), 
    'Test Response flow by vendor')

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/button_Response'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/div_Ticket successfully respon'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))
