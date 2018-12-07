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

/*WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)*/

WebUI.setText(findTestObject('Object Repository/Request_initiate/Page_Login Page/input_Vendor platform_userid'), GlobalVariable.ClName)

WebUI.setEncryptedText(findTestObject('Object Repository/Request_initiate/Page_Login Page/input_Vendor platform_password'), 
    GlobalVariable.ClPwd)

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Request_initiate/Page_Bank Dashboard/span_Procurement Request (1)'))

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Bank Dashboard/a_Authorize'))

/*WebUI.click(findTestObject('Object Repository/Request Authorize/Page_Procurement Request Authorize/button_Authorize'))
WebUI.acceptAlert()*/
WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Initiate/button_List'))

WebUI.switchToWindowTitle('Search')

WebUI.setText(findTestObject('Object Repository/Request_initiate/Page_Search/input_Product Name_Product Nam'), 'product3')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Search/input'))

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Search/td_product1'))

WebUI.switchToWindowTitle('Procurement Request Authorize')

WebUI.click(findTestObject('Object Repository/Request Authorize/Page_Procurement Request Authorize/button_Authorize'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))

