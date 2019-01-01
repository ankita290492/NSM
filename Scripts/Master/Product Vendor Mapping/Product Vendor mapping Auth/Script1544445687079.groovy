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

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Bank Dashboard/a_Authorization (1)'))

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Bank Dashboard/a_Product Vendor Mapping Maste (1)'))

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/button_Authorize'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/input_Reject_btnlist (1)'))

WebUI.switchToWindowTitle('Search')

WebUI.setText(findTestObject('Object Repository/Master/Product vendor mapping/Page_Search/input_DESCRIPTION_DESCRIPTION (1)'), 
    'k1')

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Search/input (1)'))

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Search/td_cxcxc'))

WebUI.switchToWindowTitle('Product Vendor Mapping Master')

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/button_Authorize'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Page_Product Vendor Mapping Master/div_Record Authorized successf'))

WebUI.click(findTestObject('Page_Product Vendor Mapping Master/input_Reject_btnclear'))

WebUI.click(findTestObject('Page_Product Vendor Mapping Master/input_Reject_btnclose (1)'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))
'Authorized record update'
WebUI.setText(findTestObject('Object Repository/Central head/Authorize/Page_Login Page/input_Vendor platform_userid'), 'ankita')

WebUI.setEncryptedText(findTestObject('Object Repository/Central head/Authorize/Page_Login Page/input_Vendor platform_password'),
	'0su8JPdqOrtdMpZY9tcdMw==')

WebUI.click(findTestObject('Object Repository/Central head/Authorize/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
	WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Bank Dashboard/a_Masters'))

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Bank Dashboard/a_Product Vendor Mapping Maste'))

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/input_Save_btnlist'))

WebUI.switchToWindowTitle('Search')

WebUI.setText(findTestObject('Object Repository/Master/Product vendor mapping/Page_Search/input_DESCRIPTION_DESCRIPTION'),
	'k1')

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Search/input'))

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Search/td_test'))

WebUI.switchToWindowTitle('Product Vendor Mapping Master')

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/select_ACTIVE INACTIVE'),
	'I', true)

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/button_Save'))


WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))
