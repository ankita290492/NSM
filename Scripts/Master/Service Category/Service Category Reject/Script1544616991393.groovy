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
 
WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Bank Dashboard/span_Authorization'))

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Bank Dashboard/a_Service Category Master (1)'))

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/input_Reject_btnlist'))

WebUI.switchToWindowTitle('Search')

WebUI.setText(findTestObject('Object Repository/Master/Service Category/Page_Search/input_SERVICECATEGORYNAME_SERV (1)'),
	'k1')

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Search/input (1)'))

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Search/td_TEST'))

WebUI.switchToWindowTitle('Service Category Master')

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/button_Reject'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/textarea__REJECTREASON'),
	'Test Reject Flow')

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/button_Reject'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))

'Check Rejected Record'

WebUI.setText(findTestObject('Object Repository/Central head/Authorize/Page_Login Page/input_Vendor platform_userid'), 'ankita')

WebUI.setEncryptedText(findTestObject('Object Repository/Central head/Authorize/Page_Login Page/input_Vendor platform_password'),
	'0su8JPdqOrtdMpZY9tcdMw==')

WebUI.click(findTestObject('Object Repository/Central head/Authorize/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
	WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Bank Dashboard/a_Masters'))

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Bank Dashboard/a_Service Category Master'))

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/input_Save_btnlist'))

WebUI.switchToWindowTitle('Search')

WebUI.setText(findTestObject('Object Repository/Master/Service Category/Page_Search/input_SERVICECATEGORYNAME_SERV'), 'k1')

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Search/input'))

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Search/td_TEST SERVICE CATEGORY'))

WebUI.switchToWindowTitle('Service Category Master')

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/select_ACTIVE INACTIVE'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))


