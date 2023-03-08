import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the Healthcare site'
WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/profile.php#login")
WebUI.maximizeWindow()

'Input Username and Password'
WebUI.setText(findTestObject('Object Repository/txt_Username'),username)
WebUI.setEncryptedText(findTestObject('Object Repository/txt_Password'),password)

'Click on Login button'
WebUI.click(findTestObject('Object Repository/btn_Login'))

'Verify button Book Appointment is present'
WebUI.verifyElementPresent(findTestObject('Object Repository/btn_BookAppointment'),2)

'Input value for Facility, Apply for hospital, Healthcare program'
WebUI.click(findTestObject('Object Repository/ddl_Facility'))
WebUI.check(findTestObject('Object Repository/chk_ApplyHospital'))
WebUI.click(findTestObject('Object Repository/radio_Healthcare'))

'Declare todayDate to retrieve current date'
Date todayDate = new Date();
def todayFormatted = todayDate.format("MM/dd/yyyy");

WebUI.setText(findTestObject('Object Repository/txt_VisitDate'), todayFormatted)

'Input value for Comment'
WebUI.setText(findTestObject('Object Repository/txt_Comment'), "Demo testing in Healthcare application - Book a new appointment")

'Click Book Appointment button'
WebUI.click(findTestObject('Object Repository/btn_BookAppointment'))

'Verify Appointment Confirmation is present'
WebUI.verifyTextPresent("Appointment Confirmation", false)

'Delay 2s'
WebUI.delay(2)

'Close browser'
WebUI.closeBrowser()















