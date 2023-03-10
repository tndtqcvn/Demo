import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the site'
WebUI.openBrowser("https://the-internet.herokuapp.com/login")
WebUI.maximizeWindow()

'Input username and password'
WebUI.setText(findTestObject('Object Repository/txt_Username04'), username)
WebUI.setEncryptedText(findTestObject('Object Repository/txt_Password04'), password)

'Click Submit button'
WebUI.click(findTestObject('Object Repository/btn_Submit04'))

'Verify the Welcome message is present'
WebUI.verifyTextPresent("Welcome to the Secure Area. When you are done click logout below.", false)

'Delay 2s'
WebUI.delay(2)

'Close browser'
WebUI.closeBrowser()
