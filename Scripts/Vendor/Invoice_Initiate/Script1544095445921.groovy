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

WebUI.navigateToUrl('http://siachen:8007/NSMvendor/')

WebUI.setText(findTestObject('Object Repository/Invoice_initiate/Page_Login Page/input_Vendor platform_userid'), 'vendor01')

WebUI.setEncryptedText(findTestObject('Object Repository/Invoice_initiate/Page_Login Page/input_Vendor platform_password'), 
    'RfES2L809yyT69vCWLoDzQ==')

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Vendor Platform/a_Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Vendor Platform/a_Initiate'))

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Invoice Initiation/button_Show'))

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Invoice Initiation/td_AXISNSM9590'))
WebUI.getWindowTitle()
//WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Invoice Initiation/button_Submit'))
//WebUI.acceptAlert()
WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Invoice Initiation/i__fa fa-paperclip'))

WebUI.switchToWindowTitle('Attachments')

WebUI.uploadFile(findTestObject('Object Repository/Vendor/Invoice_initiate/Page_Attachments/input_Choose more files_files0'), 
    'C:\\Users\\ankita\\Desktop\\retest\\data.txt')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Attachment/button_Attach'))
WebUI.delay(3)

WebUI.switchToWindowTitle('Invoice Initiation')

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Invoice Initiation/button_Submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))

