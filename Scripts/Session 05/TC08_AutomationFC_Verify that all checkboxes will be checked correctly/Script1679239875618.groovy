import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the site'
WebUI.openBrowser("https://automationfc.github.io/multiple-fields/")
WebUI.maximizeWindow()

'Get total number of checkbox'
int total = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Session 05/chk_AllItem'), 30).size()

'Using For loop to check all checkboxes with Index'
for (i = 1; i <= total; i++){
	WebUI.check(findTestObject('Session 05/chk_CheckboxByIndex', ['index':i]))	
}

'Delay 2s'
WebUI.delay(2)

'Using For loop to uncheck all checkboxes with Index'
for (i = 1; i <= total; i++){
	WebUI.uncheck(findTestObject('Session 05/chk_CheckboxByIndex', ['index':i]))
}

'Close browser'
WebUI.closeBrowser()


