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

/*'Mouseover to Percent of TI'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/span_Percent of TI'))

'Verify the text of Percent of TI'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/span_Percent of TI'), Widget3)
*/

TestObject Percentobj = new TestObject('Dynamic object')

String percentobj1 = Widget3

String percent_xpath = ('//*[normalize-space(text()) and normalize-space(.)="'+ percentobj1) +'"]'

Percentobj.addProperty('xpath', ConditionType.EQUALS, percent_xpath)

Thread.sleep(2000)

String percent_text = WebUI.getText(Percentobj)
'Mouseover on to Percent of TI'
WebUI.mouseOver(Percentobj)
'Verify the Text of Percent of TI'
WebUI.verifyEqual(WebUI.getText(Percentobj), Widget3)



'Verify the Value  of Percent of TI'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Percent_of_TI_value')), Percent_Val)

'Verify the Target  of Percent of TI'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Target_value')), Percent_Target)

'Verify the Achievement  of Percent of TI'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Achivement_val')), Percent_Achievment)

