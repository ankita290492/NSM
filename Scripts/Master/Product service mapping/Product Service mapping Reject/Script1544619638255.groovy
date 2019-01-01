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

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Login Page/input_Vendor platform_userid'), 'shweta')

WebUI.setEncryptedText(findTestObject('Object Repository/Master/Vendor master/Page_Login Page/input_Vendor platform_password'),
	'srQVvDx37Y0E0mUMJ65a3A==')

WebUI.click(findTestObject('Object Repository/Master/Vendor master/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
	WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/span_Authorization'))

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/a_Product Service Category Map (1)'))

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/button_Reject'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/input_Reject_btnlist'))

WebUI.switchToWindowTitle('Search')

//Object of search need to capture

WebUI.setText('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/textarea__rejectReason', 'Test Reject Flow')

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/input_Reject_btnclear'))

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/input_Reject_btnclose'))

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

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Bank Dashboard/a_Masters'))

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Bank Dashboard/a_Product Service Category Map'))

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/input_Save_btnlist'))

//Search object need to capture

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/select_ACTIVE INACTIVE'))

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/input_Reject_btnclear'))

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/input_Reject_btnclose'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))
