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

/*'Mouseover on to QTD CPS'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_QTD_CPS_Attainment/span_QTD CPS Attainment'))

'Verify the Text of QTD CPS'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_QTD_CPS_Attainment/span_QTD CPS Attainment'), Widget1)

'Verify the value of QTD CPS'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_QTD_CPS_Attainment/QTD_CPS_attainment_value')), 
    wid_Values)
*/

TestObject QTDobj = new TestObject('Dynamic object')

String qtdobj1 = Widget1

String qtd_xpath = ('//*[normalize-space(text()) and normalize-space(.)="'+ qtdobj1) +'"]'

QTDobj.addProperty('xpath', ConditionType.EQUALS, qtd_xpath)

Thread.sleep(2000)

String qtd_text = WebUI.getText(QTDobj)
'Mouseover on to QTD CPS'
WebUI.mouseOver(QTDobj)
'Verify the Text of QTD CPS'
WebUI.verifyEqual(WebUI.getText(QTDobj), Widget1)


TestObject QTDobj1 = new TestObject('Dynamic object')

String qtdobj2 = Widget1

String qtd1_xpath = ('//*[normalize-space(text()) and normalize-space(.)="'+ qtdobj2) +'"][1]/following::span[1]'

QTDobj1.addProperty('xpath', ConditionType.EQUALS, qtd1_xpath)

Thread.sleep(2000)

String qtd1_text = WebUI.getText(QTDobj1)
'Verify the value of QTD CPS'
WebUI.verifyEqual(WebUI.getText(QTDobj1), wid_Values)



