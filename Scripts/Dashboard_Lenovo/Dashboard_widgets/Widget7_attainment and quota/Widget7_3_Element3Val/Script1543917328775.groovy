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

'Verify the Quota3 text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/td_Element 3 Quota')), 
    'Element 3 Quota')

'Verify the Quota3 Value'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Quota3')), 
    Quota3)

'Verify the Attainment3 text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/td_Element 3 Attainment')), 
    'Element 3 Attainment')

'Verify the Attainmnet3 Value'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Attainment3val')), 
    Element3attainment)

'Verify the Attainment3 percentage text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/td_Element 3 Attainmentpercentage')), 
    'Element 3 Attainment %')

'Verify the Attainment3percentage Value'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Percentage3attainmentval')), 
    PercentageofElementthree)

