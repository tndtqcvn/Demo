import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.main.CustomKeywordDelegatingMetaClass
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open browser and navigate to the site'
WebUI.openBrowser("https://atlassian.design/components/tooltip/examples")
WebUI.maximizeWindow()

'Hover on button to get Xpath of button'
WebUI.mouseOver(findTestObject('Object Repository/Session 04/btn_HoverOverMe'))

'Verify Hello Word is present'
WebUI.verifyElementText(findTestObject('Object Repository/Session 04/Tt_Hello'), "Hello World")

'Declare backgroundColor to get CSS Value of Hover Over Me button'
String backgroundColor = WebUI.getCSSValue(findTestObject('Object Repository/Session 04/btn_HoverOverMe'), "background")

'Convert RGB color to Hexa'
String convertBackgroundcolor = CustomKeywords.'Common.convertRGBAToHex'(backgroundColor)

'Verify actual color = expected color'
WebUI.verifyEqual(convertBackgroundcolor, "#0065ff")

'Delay 2s'
WebUI.delay(2)

'CLose browser'
WebUI.closeBrowser()


