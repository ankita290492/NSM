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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Request_initiate/Page_Login Page/input_Vendor platform_userid'), GlobalVariable.BrMakerName)

WebUI.setEncryptedText(findTestObject('Object Repository/Request_initiate/Page_Login Page/input_Vendor platform_password'), 
    GlobalVariable.BrMakerPwd)

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Service/Generate ticket/Page_Bank Dashboard/a_Service'))

WebUI.click(findTestObject('Object Repository/Service/Generate ticket/Page_Bank Dashboard/a_Generate Ticket'))

WebUI.click(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/button_Generate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/button_Clear'))

WebUI.setText(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/input__ticketTitle'), 'test of katalon')

WebUI.selectOptionByValue(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/select_--Select--NSM1HARSHADAH'), 
    '30', true)

WebUI.setText(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/input__productSrNo'), 'nsm09876')

WebUI.setText(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/input__modelNo'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/textarea__description'), 'test nsm generate ticket functionality')

WebUI.click(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/i_Upload Documents_fa fa-paper'))

WebUI.switchToWindowTitle('Service Ticket Attachments')

WebUI.uploadFile(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket Attachments/input_Choose more files_files0'), 
    'D:\\ANKITA\\Projects\\Vendor_Platform\\CBO_2018\\CBO_Refactor_testing\\Empanelment_Q.txt')

WebUI.click(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket Attachments/button_Attach'))

WebUI.switchToWindowTitle('Service Ticket')

WebUI.click(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/div_Upload Documents'))

WebUI.click(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/button_Generate'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/div_Ticket has been generated'))

WebUI.click(findTestObject('Object Repository/Service/Generate ticket/Page_Service Ticket/button_Close'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))

