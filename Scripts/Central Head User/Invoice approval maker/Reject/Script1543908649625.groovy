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

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Login Page/input_Vendor platform_userid'), 'ankita')

WebUI.setEncryptedText(findTestObject('Object Repository/Invoice approval maker/Page_Login Page/input_Vendor platform_password'), 
    '0su8JPdqOrtdMpZY9tcdMw==')

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Login Page/input_Vendor platform_btnlogin'))

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Bank Dashboard/a_Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Bank Dashboard/a_Approval Maker'))

WebUI.executeJavaScript('document.getElementById("datepicker").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input_From_fromDate'), 'Sat Dec 01 2018')

WebUI.executeJavaScript('document.getElementById("datepicker1").removeAttribute("readonly")', null)

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/input_To_toDate'), 'Tue Dec 04 2018')

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/button_Show'))

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Invoice Approval/td_AXISNSM9659'))

WebUI.click(findTestObject('Object Repository/Central head/Reject/Page_Invoice Approval/button_Reject'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Central head/Reject/Page_Invoice Approval/textarea_Reject Reason_rejectr'), 
    'LOREM IPSUM DOLOR SIT AMET, CONSECTETUER ADIPISCING ELIT. AENEAN COMMODO LIGULA EGET DOLOR. AENEAN MASSA. CUM SOCIIS NATOQUE PENATIBUS ET MAGNIS DIS PARTURIENT MONTES, NASCETUR RIDICULUS MUS. DONEC QUAM FELIS, ULTRICIES NEC, PELLENTESQUE EU, PRETIUM QUIS, SEM. NULLA CONSEQUAT MASSA QUIS ENIM. DONEC PEDE JUSTO, FRINGILLA VEL, ALIQUET NEC, VULPUTATE EGET, ARCU. IN ENIM JUSTO, RHONCUS UT, IMPERDIET A, VENENATIS VITAE, JUSTO. NULLAM DICTUM FELIS EU PEDE MOLLIS PRETIUM. INTEGER TINCIDUNT. CRAS DAPIBUS. VIVAMUS ELEMENTUM SEMPER NISI. AENEAN VULPUTATE ELEIFEND TELLUS. AENEAN LEO LIGULA, PORTTITOR EU, CONSEQUAT VITAE, ELEIFEND AC, ENIM. ALIQUAM LOREM ANTE, DAPIBUS IN, VIVERRA QUIS, FEUGIAT A, TELLUS. PHASELLUS VIVERRA NULLA UT METUS VARIUS LAOREET. QUISQUE RUTRUM. AENEAN IMPERDIET. ETIAM ULTRICIES NISI VEL AUGUE. CURABITUR ULLAMCORPER ULTRICIES NISI. NAM EGET DUI. ETIAM RHONCUS. MAECENAS TEMPUS, TELLUS EGET CONDIMENTUM RHONCUS, SEM QUAM SEMPER LIBERO, SIT AMET ADIPISCING SEM NEQUE SED IPSUM. N')

WebUI.click(findTestObject('Object Repository/Central head/Reject/Page_Invoice Approval/button_Reject'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))

WebUI.setText(findTestObject('Object Repository/Invoice approval maker/Page_Login Page/input_Vendor platform_userid'), GlobalVariable.VndName)

WebUI.setEncryptedText(findTestObject('Object Repository/Invoice approval maker/Page_Login Page/input_Vendor platform_password'), 
    GlobalVariable.VndPwd)

WebUI.click(findTestObject('Object Repository/Invoice approval maker/Page_Login Page/input_Vendor platform_btnlogin'))

AlertPresent = WebUI.waitForAlert(5)

if (AlertPresent == true) {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Vendor Platform/a_Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Vendor Platform/a_Initiate'))

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Invoice Initiation/button_Show'))

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Invoice Initiation/td_AXISNSM9590'))

WebUI.getWindowTitle()

//WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Invoice Initiation/button_Submit'))
//WebUI.acceptAlert()
WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Invoice Initiation/i__fa fa-paperclip'))

WebUI.switchToWindowTitle('Attachments')

WebUI.uploadFile(findTestObject('Object Repository/Vendor/Invoice_initiate/Page_Attachments/input_Choose more files_files0'), 
    'C:\\Users\\ankita\\Desktop\\retest\\data.txt')

WebUI.click(findTestObject('Object Repository/Request_initiate/Page_Procurement Request Attachment/button_Attach'))

WebUI.delay(3)

WebUI.switchToWindowTitle('Invoice Initiation')

WebUI.click(findTestObject('Object Repository/Invoice_initiate/Page_Invoice Initiation/button_Submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/span_Harshada'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Bank Dashboard/b_Logout'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Logout Page/a_Login'))

WebUI.callTestCase(findTestCase('Central Head User/Invoice approval maker/Confirm'), [:], FailureHandling.CONTINUE_ON_FAILURE)

