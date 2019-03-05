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


/*'Mouseover Element 2 Attainment'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Element2_Attainment/span_Element 2 Attainment'))

'verify the text of Element 2 Attainment'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Element2_Attainment/span_Element 2 Attainment'), Widget5)
*/

TestObject Element2obj = new TestObject('Dynamic object')

String element2obj1 = Widget5

String element2_xpath = ('//*[normalize-space(text()) and normalize-space(.)="'+ element2obj1) +'"]'

Element2obj.addProperty('xpath', ConditionType.EQUALS, element2_xpath)

Thread.sleep(2000)

String element2_text = WebUI.getText(Element2obj)
'Mouseover on to Element 2 Attainment'
WebUI.mouseOver(Element2obj)
'Verify the Text of Element 2 Attainment'
WebUI.verifyEqual(WebUI.getText(Element2obj), Widget5)



'Verify the Value  of Element 2 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element2_Attainment/Quota2_val')), Quota2)

'Verify the Quota  of Element 2 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element2_Attainment/Element2val')), valElement2)

'Verify the Attainment  of Element 2 Attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element2_Attainment/Attainment2_Val')), Attainment2)

