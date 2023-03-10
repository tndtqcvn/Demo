import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the site'
WebUI.openBrowser("https://the-internet.herokuapp.com/login")
WebUI.maximizeWindow()

'Input username and password'
WebUI.setText(findTestObject('Session 03/txt_Username04'), username)
WebUI.setEncryptedText(findTestObject('Session 03/txt_Password04'), password)

'Click Submit button'
WebUI.click(findTestObject('Session 03/btn_Submit04'))

'Verify the Welcome message is present'
WebUI.verifyTextPresent("Welcome to the Secure Area. When you are done click logout below.", false)

'Delay 2s'
WebUI.delay(2)

'Close Browser'
WebUI.closeBrowser()
