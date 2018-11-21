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

WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Attainment and Quota by Q'))

WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Attainment and Quota by Q'), 
    'Attainment and Quota by Quarter')

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/YearlyPeriods')), 
    QuarterPeriods)

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Element Quota')), 
    Quota1)

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Element1 Attainment')), 
    Element1attainment)

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Percentage of Element1 attainment')), 
    Percentageofelementone)

