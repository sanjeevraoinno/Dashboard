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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint


/*'Mouseover to Current year payments'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashbaoard_currentyearpayments/Current_YearPayments'))

'Verify the text of Current year Payments'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashbaoard_currentyearpayments/Current_YearPayments'), widget8)
*/


TestObject Currentyearobj = new TestObject('Dynamic object')

String currentyearobj1 = widget8

String Currentyear_xpath = ('//*[normalize-space(text()) and normalize-space(.)="'+ currentyearobj1) +'"]'

Currentyearobj.addProperty('xpath', ConditionType.EQUALS, Currentyear_xpath)

Thread.sleep(2000)

String Currentyear_text = WebUI.getText(Currentyearobj)
'Mouseover on to Current year Payments'
WebUI.mouseOver(Currentyearobj)
'Verify the Text of Current year Payments'
WebUI.verifyEqual(WebUI.getText(Currentyearobj), widget8)