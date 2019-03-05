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

/*'Mouseover to Element1 Attainment'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Element_1_Attainment/span_Element 1 Attainment'))

'Verify the text of Element 1 attainment'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Element_1_Attainment/span_Element 1 Attainment'), Widget4)
*/

TestObject Element1obj = new TestObject('Dynamic object')

String element1obj1 = Widget4

String element1_xpath = ('//*[normalize-space(text()) and normalize-space(.)="'+ element1obj1) +'"]'

Element1obj.addProperty('xpath', ConditionType.EQUALS, element1_xpath)

Thread.sleep(2000)

String element1_text = WebUI.getText(Element1obj)
'Mouseover on to Element 1 attainment'
WebUI.mouseOver(Element1obj)
'Verify the Text of Element 1 attainment'
WebUI.verifyEqual(WebUI.getText(Element1obj), Widget4)

'Verify the Value  of Element 1 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_1_Attainment/Element1_val')), Element1_val)


'Verify the quota  of Element 1 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_1_Attainment/Quota_val')), Element_quota)

'Verify the Attainmnet  of Element 1 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_1_Attainment/Attainment_val')), Element_attainment)

