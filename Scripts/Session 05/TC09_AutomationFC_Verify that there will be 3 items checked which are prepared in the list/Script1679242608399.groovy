import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Prepare list data'
List<String> lstCheckbox = ["Kidney Disease",
	 "Use a C-PAP machine",
	  "Emotional Disorder"]

'Open browser and navigate to the site'
WebUI.openBrowser("https://automationfc.github.io/multiple-fields/")
WebUI.maximizeWindow()

'Get total number of checkbox'
for (String item in lstCheckbox) {
	WebUI.check(findTestObject('Object Repository/Session 05/chk_CheckboxByText', ['text': item]))
}


'Delay 3s'
WebUI.delay(3)

'Close browser'
WebUI.closeBrowser()


