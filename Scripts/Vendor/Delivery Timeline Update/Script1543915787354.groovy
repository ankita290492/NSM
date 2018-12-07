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

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input_From_fromDate'), 'Sat Dec 01 2018')

WebUI.executeJavaScript('document.getElementById("datepicker1").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input_To_toDate'), 'Tue Dec 04 2018')

WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/button_Show'))

WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/td_AXISNSM9660'))

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input__actualdeliveredperson'), 
    '111@@@@')

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input_Goods Received By (Branc'), 
    '123^%^%')

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input_Delivered By_deliveredBy'), 
    '112@!3')

WebUI.executeJavaScript('document.getElementById("datepicker4").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input__datepicker4'), 'Wed Dec 05 2018')

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/textarea_Remarks_delivryremark'), 
    '454@#$')

WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/i__fa fa-paperclip'))

WebUI.switchToWindowTitle('Attachments')

WebUI.uploadFile(findTestObject('Object Repository/Request_initiate/attachment/Page_Procurement Request Attachment/input_Choose more files_files0'),
	'C:\\Users\\ankita\\Desktop\\retest\\data.txt')

WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Attachments/button_Attach'))

WebUI.switchToWindowTitle('Delivery Timeline')

WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/button_Submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Vendor/Accept/Page_Delivery Timeline/input_Submit_btn btn-primary b'))*/

'Positive Value'

//WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Vendor Platform/span_Delivery Timeline'))

WebUI.executeJavaScript('document.getElementById("datepicker").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input_From_fromDate'), 'Sat Dec 01 2018')

WebUI.executeJavaScript('document.getElementById("datepicker1").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input_To_toDate'), 'Tue Dec 04 2018')

WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/button_Show'))

WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/td_AXISNSM9660'))

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input__actualdeliveredperson'),
	'QA')

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input_Goods Received By (Branc'),
	'QA')

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input_Delivered By_deliveredBy'),
	'QA')

WebUI.executeJavaScript('document.getElementById("datepicker4").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input__datepicker4'), 'Wed Dec 05 2018')

WebUI.sendKeys(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/input__datepicker4'),Keys.chord(Keys.TAB))
	
WebUI.setText(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/textarea_Remarks_delivryremark'),
	'QA')

WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/i__fa fa-paperclip'))

WebUI.switchToWindowTitle('Attachments')

WebUI.uploadFile(findTestObject('Object Repository/Request_initiate/attachment/Page_Procurement Request Attachment/input_Choose more files_files0'),
	'C:\\Users\\ankita\\Desktop\\retest\\data.txt')

WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Attachments/button_Attach'))

WebUI.switchToWindowTitle('Delivery Timeline')

WebUI.click(findTestObject('Object Repository/Vendor/timeline update/Page_Delivery Timeline/button_Submit'))

WebUI.acceptAlert()


WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))