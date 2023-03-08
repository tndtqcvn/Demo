import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://demo.guru99.com/V4/')
WebUI.maximizeWindow()

'Click Here hyperlink'
WebUI.click(findTestObject('Object Repository/Session 04/lnk_Here'))

'Input Email ID'
WebUI.setText(findTestObject('Object Repository/Session 04/txt_EmailID'), "truongkatalon@gmail.com")

'Click Submit button'
WebUI.click(findTestObject('Object Repository/Session 04/btn_Submit'))

'Declare username and password to retrieve value in the FE'
String get_Username = WebUI.getText(findTestObject('Object Repository/Session 04/lbl_UserID'))
String get_Password = WebUI.getText(findTestObject('Object Repository/Session 04/lbl_Password'))

WebUI.navigateToUrl('https://demo.guru99.com/V4/')

'Input value which is retrieved from above step'
WebUI.setText(findTestObject('Object Repository/Session 04/txt_UserID'), get_Username)
WebUI.setText(findTestObject('Object Repository/Session 04/txt_Password'), get_Password)

'Click Login button'
WebUI.click(findTestObject('Object Repository/Session 04/btn_Login'))

'Verify Welcome To Manager message is displayed'
WebUI.verifyElementText(findTestObject('Object Repository/Session 04/msg_WelcomeMessage'), "Welcome To Manager's Page of Guru99 Bank")

'Delay 2s'
WebUI.delay(2)

WebUI.closeBrowser()