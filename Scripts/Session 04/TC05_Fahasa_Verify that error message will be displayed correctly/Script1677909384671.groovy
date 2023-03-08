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

'Open browser and navigate to the site'
WebUI.openBrowser("https://www.fahasa.com/customer/account/create")
WebUI.maximizeWindow()

'Click Dang Nhap tab, button Huy'
WebUI.click(findTestObject('Object Repository/Session 04/Tb_DangNhap'))
WebUI.click(findTestObject('Object Repository/Session 04/btn_Huy'))

'Verify button Dang Nhap is disabled'
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Session 04/btn_DangNhap'))

'Input Sdt and Email with invalid credentials'
WebUI.setText(findTestObject('Object Repository/Session 04/txt_Sdt_Email'), '0907445566')
WebUI.setText(findTestObject('Object Repository/Session 04/txt_MatKhau'), 'abctest123')
	
'Click button Dang Nhap'
WebUI.click(findTestObject('Object Repository/Session 04/btn_DangNhap'))

'Verify error message is displayed'
WebUI.verifyElementText(findTestObject('Object Repository/Session 04/msg_SdtMatkhau'), 'Số điện thoại/Email hoặc Mật khẩu sai!')

'Delay 2s'
WebUI.delay(2)

WebUI.closeBrowser()


