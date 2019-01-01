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

'Negative Value'
WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Bank Dashboard/span_Masters'))

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Bank Dashboard/a_Branch Master'))

/*WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Save'))
WebUI.acceptAlert()
WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__branchName'), '     ')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/textarea__branchAddress'), '       ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/select_---Select---BRANCHCLUST'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/select_---Select---ACTIVEINACT'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/select_---Select---NORTHEASTWE'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__solId'), '      ')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__managerEmpId'), '     ')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__managerName'), '   @111')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__managerMobileNo'), '98745')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__managerEmailId'), 'qa@tes')

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Save'))
WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Clear'))*/

'Positive Value record'

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__branchName'), 'k2')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/textarea__branchAddress'), 'k1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/select_---Select---BRANCHCLUST'),
	'01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/select_---Select---ACTIVEINACT'),
	'A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/select_---Select---NORTHEASTWE'),
	'EAST', true)

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__solId'), 'k123456')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__managerEmpId'), 'k123456')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__managerName'), 'k')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__managerMobileNo'), '9874561230')

WebUI.setText(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/input__managerEmailId'), 'k@test.com')

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Save'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/div_Branch details saved succe'))

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Clear'))

WebUI.click(findTestObject('Object Repository/Master/Branch Master/Page_Branch Master/button_Close'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))