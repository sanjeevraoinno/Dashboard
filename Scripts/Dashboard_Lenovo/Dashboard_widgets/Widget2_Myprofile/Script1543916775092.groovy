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

'Mouseover to My Profile '
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/span_My Profile'))

'Verify the Text of My Profile\r\n'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/span_My Profile'), Widget2)

'Verify the text of first name'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Myprofile/div_First')), 'First')

'Verify the Value of first name'
TestObject obj1 = new TestObject('Dynamic object')

String search1 = firstname

String xpath1 = ('.//*[normalize-space(text()) and normalize-space(.)= "' + search1) + '" ]'

obj1.addProperty('xapth1', ConditionType.EQUALS, xpath1)

Thread.sleep(2000)

'Click the Plan Rep'
WebUI.verifyEqual(WebUI.getText(obj1), search1)

'Verify the text of Last name'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Last')), 'Last')

'Verify the Value of Last name'
TestObject obj2 = new TestObject('Dynamic object')

String search2 = Lastname

String xpath2 = ('.//*[normalize-space(text()) and normalize-space(.)="' + search2) + '"]'

obj2.addProperty('xpath2', ConditionType.EQUALS, xpath2)

obj2.findXpathValue(xpath2)

Thread.sleep(2000)

WebUI.verifyEqual(WebUI.getText(obj2), search2)

'Verify the text of Job Desc'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Job Desc')), 'Job Desc')

'Verify the Value of Job Desc'
TestObject obj3 = new TestObject('Dynamic object')

String search3 = JobDesc

String xpath3 = ('.//*[normalize-space(text()) and normalize-space(.)="' + search3) + '"]'

obj3.addProperty('xpath3', ConditionType.EQUALS, xpath3)

Thread.sleep(2000)

WebUI.verifyEqual(WebUI.getText(obj3), search3)

'Verify the text of Manager'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Manager')), 'Manager')

'Verify the Value of Manager'
TestObject obj4 = new TestObject('Dynamic object')

String search4 = Manager

String xpath4 = ('.//*[normalize-space(text()) and normalize-space(.)="' + search4) + '"]'

obj4.addProperty('', ConditionType.EQUALS, xpath4)

Thread.sleep(2000)

WebUI.verifyEqual(WebUI.getText(obj4), search4)

'Verify the text of PDT'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_PDT')), 'PDT')

'Verify the Value of PDT'
TestObject obj5 = new TestObject('Dynamic object')

String search5 = PDT

String xpath5 = ('.//*[normalize-space(text()) and normalize-space(.)="' + search5) + '"]'

obj5.addProperty('', ConditionType.EQUALS, xpath5)

Thread.sleep(2000)

WebUI.verifyEqual(WebUI.getText(obj5), search5)



