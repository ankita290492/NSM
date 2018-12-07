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

WebUI.click(findTestObject('Request_initiate/Page_Bank Dashboard/span_Procurement Request (1)'))

WebUI.click(findTestObject('Request_initiate/Page_Bank Dashboard/a_Initiate'))

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/button_Save'))

WebUI.acceptAlert()

'Positive Value'
WebUI.selectOptionByValue(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/select_--Select--product1produ'), 
    '13', true)

WebUI.setText(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/input__fromBundleRange'), 
    '50')

WebUI.setText(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/input__toBundleRange'), 
    '1000')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/i_Attachments_fa fa-paperclip'))

WebUI.switchToWindowTitle('Procurement Request Attachments')

WebUI.uploadFile(findTestObject('Object Repository/Request_initiate/attachment/Page_Procurement Request Attachment/input_Choose more files_files0'), 
    'C:\\Users\\ankita\\Desktop\\retest\\data.txt')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Attachment/button_Attach'))

WebUI.switchToWindowTitle('Procurement Request Initiate')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/button_Save'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Request_initiate/Success Msg Highlight/Page_Procurement Request Initiate/div_Record has been saved succ'))

/*WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/button_List'))

WebUI.switchToWindowTitle('Search')

WebUI.setText(findTestObject('Object Repository/Request_initiate/Page_Search/input_Product Name_Product Nam'), 'product1')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Search/input'))

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Search/td_product1'))

WebUI.switchToWindowTitle('Procurement Request Initiate')*/
WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/button_Clear'))

/*'Negative Value'
WebUI.selectOptionByValue(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/select_--Select--product1produ'), 
    '13', true)

WebUI.setText(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/input__fromBundleRange'), 
    'as!@#$')

WebUI.setText(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/input__toBundleRange'), 
    'as!@#$')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/i_Attachments_fa fa-paperclip'))

WebUI.switchToWindowTitle('Procurement Request Attachments')

WebUI.uploadFile(findTestObject('Object Repository/Request_initiate/attachment/Page_Procurement Request Attachment/input_Choose more files_files0'), 
    'C:\\Users\\ankita\\Desktop\\retest\\data.txt')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Attachment/button_Attach'))

WebUI.switchToWindowTitle('Procurement Request Initiate')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/button_Save'))

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/button_Clear'))

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/button_Close'))

WebUI.click(findTestObject('Request_initiate/Page_Bank Dashboard/span_Procurement Request (1)'))

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Bank Dashboard/a_Authorize'))

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/button_List'))

WebUI.switchToWindowTitle('Search')

WebUI.setText(findTestObject('Object Repository/Request_initiate/Page_Search/input_Product Name_Product Nam'), 'product1')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Search/input'))

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Search/td_product1'))

WebUI.switchToWindowTitle('Procurement Request Authorize')*/
WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))

