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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.delay(3)

'Creating new object'
TestObject myobj1 = new TestObject('Dynamic Boject')

'Providing value for Plansearch'
String plansearch = Plans

'Providing the xpath needed for object\r\n'
String xpath = ('(//*[normalize-space(text()) and normalize-space(.)="' + plansearch) + '"])[2]/following::i[1]'

myobj1.addProperty('xpath', ConditionType.EQUALS, xpath)


Thread.sleep(2000)

'Click the Plan Rep'
WebUI.click(myobj1)

//WebUI.click(findTestObject('Dashboard_Plan/i_plansPreviewbutton'))
'Switch to other window index'
WebUI.switchToWindowIndex(1)

'Waiting for the object to visible'
WebUI.waitForElementVisible(findTestObject('Dashboard_Date/span_Please enter at least 3 c'), 10)

'Click on the text box'
WebUI.click(findTestObject('Dashboard_Date/span_Please enter at least 3 c'))

