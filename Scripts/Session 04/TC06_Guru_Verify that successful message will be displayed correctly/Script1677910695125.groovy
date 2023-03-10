import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://demo.guru99.com/V4/')
WebUI.maximizeWindow()

'Click Here hyperlink'
WebUI.click(findTestObject('Object Repository/Session 04/lnk_Here'))

'Input Email ID'
WebUI.setText(findTestObject('Object Repository/Session 04/txt_EmailID'), "truongkatalon@gmail.com")

'Click Submit button'
WebUI.click(findTestObject('Object Repository/Session 04/btn_Submit'))

'Declare username and password to retrieve value in the FE'
String get_Username = WebUI.getText(findTestObject('Object Repository/Session 04/lbl_UserID'))
String get_Password = WebUI.getText(findTestObject('Object Repository/Session 04/lbl_Password'))

WebUI.navigateToUrl('https://demo.guru99.com/V4/')

'Input value which is retrieved from above step'
WebUI.setText(findTestObject('Object Repository/Session 04/txt_UserID'), get_Username)
WebUI.setText(findTestObject('Object Repository/Session 04/txt_Password'), get_Password)

'Click Login button'
WebUI.click(findTestObject('Object Repository/Session 04/btn_Login'))

'Verify Welcome To Manager message is displayed'
WebUI.verifyElementText(findTestObject('Object Repository/Session 04/msg_WelcomeMessage'), "Welcome To Manager's Page of Guru99 Bank")

'Delay 2s'
WebUI.delay(2)

'Close browser'
WebUI.closeBrowser()