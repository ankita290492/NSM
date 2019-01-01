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

WebUI.navigateToUrl(GlobalVariable.URL)*/

WebUI.setText(findTestObject('Object Repository/Request_initiate/Page_Login Page/input_Vendor platform_userid'), GlobalVariable.BrMakerName)

WebUI.setEncryptedText(findTestObject('Object Repository/Request_initiate/Page_Login Page/input_Vendor platform_password'), 
    GlobalVariable.BrMakerPwd)

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Bank Dashboard/span_Service'))

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Bank Dashboard/a_Process Ticket'))

/*WebUI.setText(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/input_Ticket No._ticketNo'), 
    'TICKET32')

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/button_Search'))*/

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/td_TICKET24'))

WebUI.setText(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/textarea_Comments_remarks'), 
    'Check Update flow by bank')

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/i_Upload Documents_fa fa-paper'))

WebUI.switchToWindowTitle('Service Ticket Attachments')

WebUI.uploadFile(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket Attachments/input_Choose more files_files0'),
	'D:\\ANKITA\\Projects\\Vendor_Platform\\CBO_2018\\CBO_Refactor_testing\\Empanelment_Q.txt')

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket Attachments/button_Attach'))

WebUI.switchToWindowTitle('Service Ticket')

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/i_View Documents_fa fa-papercl'))

WebUI.switchToWindowTitle('Service Ticket')

WebUI.click(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/button_Update'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Service/Process Ticket/Page_Service Ticket/div_Ticket has been updated su'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))

