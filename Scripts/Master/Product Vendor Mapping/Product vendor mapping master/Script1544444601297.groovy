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

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Bank Dashboard/a_Masters'))

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Bank Dashboard/a_Product Vendor Mapping Maste'))

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/button_Save'))

WebUI.acceptAlert()

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/select_---Select---product1pro'), 
    '18', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/select_---Select---EMBER VENDO'), 
    '7386', true)

WebUI.setText(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/textarea__description'), 
    'test product vendor mapping k1 retest')

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/select_ACTIVE INACTIVE'), 
    'A', true)

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/button_Save'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/div_Product vendor mapping det'))

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/input_Save_btnclear'))

WebUI.click(findTestObject('Object Repository/Master/Product vendor mapping/Page_Product Vendor Mapping Master/input_Update_btnclose'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))
