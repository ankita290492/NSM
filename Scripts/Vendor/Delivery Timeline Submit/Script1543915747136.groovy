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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Login Page/input_Vendor platform_userid'), GlobalVariable.VndName)

WebUI.setEncryptedText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Login Page/input_Vendor platform_password'), 
    GlobalVariable.VndPwd)

WebUI.click(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Vendor Platform/span_Delivery Timeline'))

/*'Negative Value'
WebUI.executeJavaScript('document.getElementById("datepicker").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_From_fromDate'), 'Sat Dec 01 2018')

WebUI.executeJavaScript('document.getElementById("datepicker1").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_To_toDate'), 'Thu Dec 06 2018')

WebUI.click(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/button_Show'))

WebUI.click(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/td_AXISNSM9660'))

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_Serial No._srNo'), '032aaa@!#!$%!%')

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_PO Number_poNo'), '032aaa@!#!$%!%')

WebUI.executeJavaScript('document.getElementById("datepicker3").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input__poDate'), 'Sat Dec 01 2017')

WebUI.executeJavaScript('document.getElementById("datepicker2").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_Date of Delivery_datepic'), 
    'Wed Dec 05 2017')

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input__contactPersonName'), 
    '12233@@@')

WebUI.click(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/button_Submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Vendor/Accept/Page_Delivery Timeline/input_Submit_btn btn-primary b'))*/
//WebUI.click(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Vendor Platform/span_Delivery Timeline'))
'Positive Value'
WebUI.executeJavaScript('document.getElementById("datepicker").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_From_fromDate'), 'Sat Dec 01 2018')

WebUI.executeJavaScript('document.getElementById("datepicker1").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_To_toDate'), 'Thu Dec 06 2018')

WebUI.click(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/button_Show'))

WebUI.click(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/td_AXISNSM9660'))

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_Serial No._srNo'), '0321456789')

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_PO Number_poNo'), '142589637')

WebUI.executeJavaScript('document.getElementById("datepicker3").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input__poDate'), 'Sat Dec 01 2018')

WebUI.executeJavaScript('document.getElementById("datepicker2").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_Date of Delivery_datepic'), 
    'Wed Dec 05 2018')

WebUI.sendKeys(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input_Date of Delivery_datepic'),Keys.chord(Keys.TAB))
	
WebUI.setText(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/input__contactPersonName'), 
    'testing')

WebUI.click(findTestObject('Object Repository/Vendor/Timeline_submit/Page_Delivery Timeline/button_Submit'))

WebUI.acceptAlert()

