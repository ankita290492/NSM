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

WebUI.navigateToUrl('http://siachen:8007/NSMvendor/')

WebUI.setText(findTestObject('Object Repository/Vendor/Accept/Page_Login Page/input_Vendor platform_userid'), 'vendor01')

WebUI.setEncryptedText(findTestObject('Object Repository/Vendor/Accept/Page_Login Page/input_Vendor platform_password'), 
    'RfES2L809yyT69vCWLoDzQ==')

WebUI.click(findTestObject('Object Repository/Vendor/Accept/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Vendor/Accept/Page_Vendor Platform/span_Vendor Acceptance'))

WebUI.executeJavaScript('document.getElementById("datepicker").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/Accept/Page_Vendor Acceptance/input_From_fromDate'), 'Sat Dec 01 2018')

WebUI.executeJavaScript('document.getElementById("datepicker2").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/Accept/Page_Vendor Acceptance/input_To_toDate'), 'Tue Dec 06 2018')

WebUI.click(findTestObject('Object Repository/Vendor/Accept/Page_Vendor Acceptance/button_Show'))

WebUI.click(findTestObject('Object Repository/Vendor/Accept/Page_Vendor Acceptance/td_HARSHADA'))

WebUI.click(findTestObject('Object Repository/Vendor/Accept/Page_Vendor Acceptance/button_Accept'))

WebUI.acceptAlert()

/*WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))*/