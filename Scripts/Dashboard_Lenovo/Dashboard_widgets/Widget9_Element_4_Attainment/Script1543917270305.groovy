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

/*'Mouseover to Element 4 Attainment'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Element_4_attainment/span_Element 4 Attainment'))

'Verify the Text of Element 4 Attainment\r\n'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Element_4_attainment/span_Element 4 Attainment'), Widget9)
*/

TestObject Element4obj = new TestObject('Dynamic object')

String element4obj1 = Widget1

String element4_xpath = ('//*[normalize-space(text()) and normalize-space(.)="'+ element4obj1) +'"]'

Element4obj.addProperty('xpath', ConditionType.EQUALS, element4_xpath)

Thread.sleep(2000)

String element4_text = WebUI.getText(Element4obj)
'Mouseover on to Element 4 Attainment'
WebUI.mouseOver(Element4obj)
'Verify the Text of Element 4 Attainment'
WebUI.verifyEqual(WebUI.getText(Element4obj), Widget1)



'Verify the Value  of Element 4 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_4_attainment/Element4val')), Element4val)

'Verify the Quota  of Element 4 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_4_attainment/Quota4_val')), Quota4)

'Verify the Attainment  of Element 4 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_4_attainment/Attainment4_val')), Element4attainment)

