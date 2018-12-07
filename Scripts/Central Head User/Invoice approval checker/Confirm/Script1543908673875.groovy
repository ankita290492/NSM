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

WebUI.setText(findTestObject('Object Repository/Invoice approval checker/Page_Login Page/input_Vendor platform_userid'), 
    'shweta')

WebUI.setEncryptedText(findTestObject('Object Repository/Invoice approval checker/Page_Login Page/input_Vendor platform_password'), 
    'srQVvDx37Y0E0mUMJ65a3A==')

WebUI.click(findTestObject('Object Repository/Invoice approval checker/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Invoice approval checker/Page_Bank Dashboard/a_Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice approval checker/Page_Bank Dashboard/a_Approval cheker'))

WebUI.executeJavaScript('document.getElementById("datepicker").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input_From_fromDate'), 'Sat Dec 01 2018')

WebUI.executeJavaScript('document.getElementById("datepicker1").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input_To_toDate'), 'Tue Dec 04 2018')

WebUI.click(findTestObject('Object Repository/Invoice approval checker/Page_Invoice Authorization/button_Show'))

WebUI.click(findTestObject('Object Repository/Invoice approval checker/Page_Invoice Authorization/td_HARSHADA'))

WebUI.click(findTestObject('Object Repository/Invoice approval checker/Page_Invoice Authorization/button_Confirm'))

WebUI.acceptAlert()

