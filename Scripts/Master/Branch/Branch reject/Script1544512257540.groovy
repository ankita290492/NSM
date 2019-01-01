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

WebUI.navigateToUrl('http://siachen:8007/NSMvendor/')*/

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Login Page/input_Vendor platform_userid'), 'shweta')

WebUI.setEncryptedText(findTestObject('Object Repository/Master/Vendor master/Page_Login Page/input_Vendor platform_password'),
	'srQVvDx37Y0E0mUMJ65a3A==')

WebUI.click(findTestObject('Object Repository/Master/Vendor master/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
	WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Bank Dashboard/span_Authorization'))

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Bank Dashboard/a_Branch Master (1)'))

/*WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Reject'))

WebUI.acceptAlert()*/

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_List (1)'))

WebUI.switchToWindowTitle('Search')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Search/input_Branch Name_Branch Name (1)'), 'k2')

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Search/input (1)'))

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Search/td_QA'))

WebUI.switchToWindowTitle('Branch Master')

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Reject'))
WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/textarea__rejectReason'), 'test reject flow')

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Reject'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/div_Record Rejected successful'))

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Clear (1)'))

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Close (1)'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))
'Check rejected record'
WebUI.setText(findTestObject('Object Repository/Central head/Authorize/Page_Login Page/input_Vendor platform_userid'), 'ankita')

WebUI.setEncryptedText(findTestObject('Object Repository/Central head/Authorize/Page_Login Page/input_Vendor platform_password'),
	'0su8JPdqOrtdMpZY9tcdMw==')

WebUI.click(findTestObject('Object Repository/Central head/Authorize/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
	WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Bank Dashboard/span_Masters'))

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Bank Dashboard/a_Branch Master'))

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_List'))
 
 WebUI.switchToWindowTitle('Search')
 
 WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Search/input_Branch Name_Branch Name'), 'k2')
 
 WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Search/input'))
 
 WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Search/td_FIRST BRANCH'))
 
 WebUI.switchToWindowTitle('Branch Master')
 
 CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/select_---Select---ACTIVEINACT'))
 
 WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Clear'))
 
 WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Close'))
 
 WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))
 
 WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))
 
 WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))
