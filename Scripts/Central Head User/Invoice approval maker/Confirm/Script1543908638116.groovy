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

WebUI.navigateToUrl('http://siachen:8007/NSMvendor/')

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Login Page/input_Vendor platform_userid'), 'ankita')

WebUI.setEncryptedText(findTestObject('Object Repository/Invoice approval maker/Page_Login Page/input_Vendor platform_password'), 
    '0su8JPdqOrtdMpZY9tcdMw==')

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Login Page/input_Vendor platform_btnlogin'))
AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
	WebUI.acceptAlert()
}

/*'Negative Value'
WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Bank Dashboard/a_Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Bank Dashboard/a_Approval Maker'))

WebUI.executeJavaScript('document.getElementById("datepicker").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input_From_fromDate'), 'Sat Dec 01 2018')

WebUI.executeJavaScript('document.getElementById("datepicker1").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input_To_toDate'), 'Tue Dec 04 2018')

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/button_Show'))

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/td_AXISNSM9659'))

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input__invoiceNo'), 'aq@@@1111')

WebUI.executeJavaScript('document.getElementById("invoiceDate").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input__invoiceDate'), 'Mon Jan 01 2017')

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input__invoiceAmount'), 'asss@#@')

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input__invoiceDeductedAmount'), 
    'aaa@#$')

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/div_Request InitiatorRequest N'))


WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/button_Confirm'))

WebUI.acceptAlert()*/

'Positive Value'
WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Bank Dashboard/a_Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Bank Dashboard/a_Approval Maker'))

WebUI.executeJavaScript('document.getElementById("datepicker").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input_From_fromDate'), 'Sat Dec 01 2018')

WebUI.executeJavaScript('document.getElementById("datepicker1").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input_To_toDate'), 'Tue Dec 04 2018')

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/button_Show'))

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/td_AXISNSM9659'))

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input__invoiceNo'), '09874561231')

WebUI.executeJavaScript('document.getElementById("invoiceDate").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input__invoiceDate'), 'Mon Jan 01 2018')

WebUI.sendKeys(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input__invoiceDate'),Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input__invoiceAmount'), '1000000')

WebUI.sendKeys(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input__invoiceDeductedAmount'),Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input__invoiceDeductedAmount'),
	'500')

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/div_Request InitiatorRequest N'))


WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/button_Confirm'))

WebUI.acceptAlert()


WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))