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


/*'Open browser and navigate to the Healthcare site'
 WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/")

'Declare getMessage to retrieve Cura text on the FE'
String getMessage = WebUI.getText(findTestObject('Object Repository/msg_Cura'))
println getMessage

int range = -4250000;
println range

String hello = 'Hello world';
println hello*/

'Prepare data to select/ compare/ add/ remove in Hashmap type'
def expectedData = [firstname:"Terry", lastname:"Green", age:"40", city:"Washington FC"]

String selectData = expectedData.get("city")
println selectData

expectedData.replace("age" , "50")
println expectedData

expectedData.put("Status", "Married")
println expectedData

expectedData.remove("lastname")
println expectedData

expectedData.each{println it}

expectedData.eachWithIndex{it, i -> println "$i : $it"}


//TestObject testObj = findTestObject('icon_Social_networking')
//List<WebElement> elements = WebUI.findWebElements(testObj, 10)
//for (int i = 0;  i < elements.size(); ++i) {
//    KeywordUtil.logInfo(elements.get(i).toString())
//}
//
//println elements








