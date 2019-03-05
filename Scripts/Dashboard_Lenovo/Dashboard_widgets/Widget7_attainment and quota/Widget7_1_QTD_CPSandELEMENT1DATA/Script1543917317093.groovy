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
/*
'Mouseover to Attainment and quota by quarter'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Attainment and Quota by Q'))

'Verify the Text of Attainment and quota by quarter'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Attainment and Quota by Q'), 
    widget7)
*/

TestObject Attainmentobj = new TestObject('Dynamic object')

String attainmentobj1 = widget7

String attainment_xpath = ('//*[normalize-space(text()) and normalize-space(.)="'+ attainmentobj1) +'"]'

Attainmentobj.addProperty('xpath', ConditionType.EQUALS, attainment_xpath)

Thread.sleep(2000)

String attainment_text = WebUI.getText(Attainmentobj)
'Mouseover on to Attainment and quota by quarter'
WebUI.mouseOver(Attainmentobj)
'Verify the Text of Attainment and quota by quarter'
WebUI.verifyEqual(WebUI.getText(Attainmentobj), widget7)



'Verify the Yearlyquarter Period'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/YearlyPeriods')), 
    QuarterPeriods)

'Verify the QTD CPS Text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/td_QTD CPS')), 
    QtdCpsTxt)

'Verify QTD CPS Value'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Qtd cps')), 
    QTDCPS)

'Verify Quota1 Text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/td_Element 1 Quota')), 
    'Element 1 Quota')

'Verify Quota1 Value'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Element Quota')), 
    Quota1)

'Verify Attainment1 Text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/td_Element 1 Attainment')), 
    'Element 1 Attainment')

'Verify Attainment1 Value'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Element1 Attainment')), 
    Element1attainment)

'Verify Attainment1percentage Text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/td_Element 1 AttainmentPercentage')), 
    'Element 1 Attainment %')

'Verify Attainment1percentage Value'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Percentage of Element1 attainment')), 
    Percentageofelementone)

