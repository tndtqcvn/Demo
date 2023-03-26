import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the site'
WebUI.openBrowser("https://automationfc.github.io/multiple-fields/")
WebUI.maximizeWindow()

'Get total number of checkbox'
int total = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Session 05/chk_AllItem'), 30).size()

'Get random items in the list'
List<String> lstRandom = CustomKeywords.'Common.getRandom'(total, 5)

'Using For loop to random check 5 items in the list'
for (String items in lstRandom) {
	WebUI.check(findTestObject('Object Repository/Session 05/chk_CheckboxByIndex', ['index': items]))
}

'Delay 3s'
WebUI.delay(3)

'Close browser'
WebUI.closeBrowser()