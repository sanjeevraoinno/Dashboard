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

/*'Mouseover to Element 3 Attainment'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Element_3_Attainment/span_Element 3 Attainment'))

'Verify the Text of Element 3 Attainment\r\n'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Element_3_Attainment/span_Element 3 Attainment'), widget6)
*/

TestObject Element3obj = new TestObject('Dynamic object')

String element3obj1 = widget6

String element3_xpath = ('//*[normalize-space(text()) and normalize-space(.)="'+ element3obj1) +'"]'

Element3obj.addProperty('xpath', ConditionType.EQUALS, element3_xpath)

Thread.sleep(2000)

String element3_text = WebUI.getText(Element3obj)
'Mouseover on to Element 3 Attainment'
WebUI.mouseOver(Element3obj)
'Verify the Text of Element 3 Attainment'
WebUI.verifyEqual(WebUI.getText(Element3obj), widget6)



'Verify the Value  of Element 3 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_3_Attainment/Element3val')), ValElement3)

'Verify the Quota  of Element 3 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_3_Attainment/Quota3_val')), Quota3)

'Verify the Attainment  of Element 3 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_3_Attainment/Attainment3_val')), Attainment3)

