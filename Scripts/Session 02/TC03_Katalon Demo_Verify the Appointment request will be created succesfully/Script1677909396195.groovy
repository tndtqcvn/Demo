import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the Healthcare site'
WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/profile.php#login")
WebUI.maximizeWindow()

'Input Username and Password'
WebUI.setText(findTestObject('Session 01/txt_Username'),username)
WebUI.setEncryptedText(findTestObject('Session 01/txt_Password'),password)

'Click on Login button'
WebUI.click(findTestObject('Session 01/btn_Login'))

'Verify button Book Appointment is present'
WebUI.verifyElementPresent(findTestObject('Session 01/btn_BookAppointment'),2)

'Input value for Facility, Apply for hospital, Healthcare program'
WebUI.click(findTestObject('Session 02/ddl_Facility'))
WebUI.check(findTestObject('Session 02/chk_ApplyHospital'))
WebUI.click(findTestObject('Session 02/radio_Healthcare'))

'Declare todayDate to retrieve current date'
Date todayDate = new Date();
def todayFormatted = todayDate.format("MM/dd/yyyy");

WebUI.setText(findTestObject('Session 02/txt_VisitDate'), todayFormatted)

'Input value for Comment'
WebUI.setText(findTestObject('Session 02/txt_Comment'), "Demo testing in Healthcare application - Book a new appointment")

'Click Book Appointment button'
WebUI.click(findTestObject('Session 01/btn_BookAppointment'))

'Verify Appointment Confirmation is present'
WebUI.verifyTextPresent("Appointment Confirmation", false)

'Delay 2s'
WebUI.delay(2)

'Close browser'
WebUI.closeBrowser()















