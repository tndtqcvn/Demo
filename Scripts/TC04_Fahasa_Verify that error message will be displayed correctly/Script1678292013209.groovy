import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the site'
WebUI.openBrowser("https://www.fahasa.com/customer/account/create")
WebUI.maximizeWindow()

'Click Dang Nhap tab, button Huy'
WebUI.click(findTestObject('Object Repository/Tb_DangNhap'))
WebUI.click(findTestObject('Object Repository/btn_Huy'))

'Verify button Dang Nhap is disabled'
WebUI.verifyElementNotClickable(findTestObject('Object Repository/btn_DangNhap'))

'Input Sdt and Email with invalid credentials'
WebUI.setText(findTestObject('Object Repository/txt_Sdt_Email'), '0907445566')
WebUI.setText(findTestObject('Object Repository/txt_MatKhau'), 'abctest123')
 
'Click button Dang Nhap'
WebUI.click(findTestObject('Object Repository/btn_DangNhap'))

'Verify error message is displayed'
WebUI.verifyElementText(findTestObject('Object Repository/msg_SdtMatkhau'), 'Số điện thoại/Email hoặc Mật khẩu sai!')

'Delay 2s'
WebUI.delay(2)

'Close browser'
WebUI.closeBrowser()



