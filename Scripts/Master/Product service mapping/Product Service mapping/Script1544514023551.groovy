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

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Bank Dashboard/a_Masters'))

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Bank Dashboard/a_Product Service Category Map'))

'Negative value'
WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/button_Save'))

WebUI.acceptAlert()

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/select_---Select---product1pro'),
	'0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/select_---Select---TEST SERVIC'),
	'0', true)

WebUI.setText(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/textarea__description'),
	'k1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/select_ACTIVE INACTIVE'),
	'A', true)

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/button_Save'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/input_Save_btnclear'))

'Positive Value'

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/select_---Select---product1pro'), 
    '24', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/select_---Select---TEST SERVIC'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/textarea__description'), 
    'k1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/select_ACTIVE INACTIVE'), 
    'A', true)

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/button_Save'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/div_Product and Service Catego'))

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/input_Save_btnclear'))

WebUI.click(findTestObject('Object Repository/Master/Product service category mapping/Page_Product Service Category Mappi/input_Save_btnclose'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))