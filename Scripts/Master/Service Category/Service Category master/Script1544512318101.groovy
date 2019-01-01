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

'Negative Value Record'
WebUI.setText(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/input__serviceCategoryName'),
	'   @@')

WebUI.setText(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/textarea__description'),
	'   ###')

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/select_ACTIVE INACTIVE'),
	'A', true)

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/button_Save'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/input_Update_btnclear'))

'Positive Value Record'
WebUI.setText(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/input__serviceCategoryName'), 
    'k1')

WebUI.setText(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/textarea__description'), 
    'k1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/select_ACTIVE INACTIVE'), 
    'A', true)

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/button_Save'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/div_Service details saved Succ'))

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/input_Update_btnclear'))

WebUI.click(findTestObject('Object Repository/Master/Service Category/Page_Service Category Master/input_Save_btnclose'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))
