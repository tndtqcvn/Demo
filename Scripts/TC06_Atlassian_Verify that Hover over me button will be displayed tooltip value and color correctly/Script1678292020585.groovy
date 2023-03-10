import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the site'
WebUI.openBrowser("https://atlassian.design/components/tooltip/examples")
WebUI.maximizeWindow()

'Hover on button to get Xpath of button'
WebUI.mouseOver(findTestObject('Object Repository/btn_HoverOverMe'))

'Verify Hello Word is present'
WebUI.verifyElementText(findTestObject('Object Repository/Tt_Hello'), "Hello World")

'Declare backgroundColor to get CSS Value of Hover Over Me button'
String backgroundColor = WebUI.getCSSValue(findTestObject('Object Repository/btn_HoverOverMe'), "background")

'Convert RGB color to Hexa'
String convertBackgroundcolor = CustomKeywords.'Common.convertRGBAToHex'(backgroundColor)

'Verify actual color = expected color'
WebUI.verifyEqual(convertBackgroundcolor, "#0065ff")

'Delay 2s'
WebUI.delay(2)

'CLose browser'
WebUI.closeBrowser()