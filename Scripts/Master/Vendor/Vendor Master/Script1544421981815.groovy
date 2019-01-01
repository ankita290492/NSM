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

WebUI.click(findTestObject('Object Repository/Master/Vendor master/Page_Bank Dashboard/a_Masters'))

WebUI.click(findTestObject('Object Repository/Master/Vendor master/Page_Bank Dashboard/a_Vendor Master'))

WebUI.click(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/button_Save (1)'))

WebUI.acceptAlert()

/*'Negative Value'
WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/input__vendorName (1)'), '12211#@@#')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/input__emailId (1)'), 'ankita.nalawad')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/input__mobileNo (1)'), 'assassssss')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/input__panNo (1)'), 'azswe223')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/textarea__description (1)'), '      ')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/input_GST No._gstNo (1)'), '11aaaaa1 ')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/textarea__address (1)'), '    ')

WebUI.click(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/button_Save (1)'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/button_Clear (1)'))*/

'Positive Value'
WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/input__vendorName (1)'), 'k1')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/input__emailId (1)'), 'ankita.nalawade@ember.co.in')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/input__mobileNo (1)'), '0123456789')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/input__panNo (1)'), 'kkkkk2553a')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/textarea__description (1)'), 'K vendr')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/input_GST No._gstNo (1)'), '11kkkkk1122a1z1')

WebUI.setText(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/textarea__address (1)'), 'test k vendor address')

WebUI.click(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/button_Save (1)'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/font_Vendor details saved succ (1)'))

WebUI.click(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/button_Clear (1)'))

WebUI.click(findTestObject('Object Repository/Master/Vendor master/Page_Vendor Master/button_Close'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))

