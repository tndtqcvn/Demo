import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the Demo Cura site'
WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/profile.php#login")
WebUI.maximizeWindow()

'Input Username and password'
WebUI.setText(findTestObject('Object Repository/txt_Username'), username)
WebUI.setEncryptedText(findTestObject('Object Repository/txt_Password'), password)

'Click Login button'
WebUI.click(findTestObject('Object Repository/btn_Login'))

'Verify Appointment button is visible'
WebUI.verifyElementPresent(findTestObject('Object Repository/btn_BookAppointment'), 3)

'Delay 2s'
WebUI.delay(2)

WebUI.closeBrowser()