import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the Healthcare site'
WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/profile.php#login")

'Input Username and Password'
WebUI.setText(findTestObject('Object Repository/txt_Username'),username)
WebUI.setEncryptedText(findTestObject('Object Repository/txt_Password'),password)

'Click on Login button'
WebUI.click(findTestObject('Object Repository/btn_Login'))

'Verify button Book Appointment is present'
WebUI.verifyElementPresent(findTestObject('Object Repository/btn_BookAppointment'),2)

'Close browser'
WebUI.closeBrowser()