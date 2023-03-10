import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the Healthcare site'
WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/profile.php#login")
WebUI.maximizeWindow()

'Input Username and Password'
WebUI.setText(findTestObject('txt_Username'),username)
WebUI.setEncryptedText(findTestObject('txt_Password'),password)

'Click on Login button'
WebUI.click(findTestObject('btn_Login'))

'Verify button Book Appointment is present'
WebUI.verifyElementPresent(findTestObject('btn_BookAppointment'),2)

'Delay 2s'
WebUI.delay(2)

'Close browser'
WebUI.closeBrowser()