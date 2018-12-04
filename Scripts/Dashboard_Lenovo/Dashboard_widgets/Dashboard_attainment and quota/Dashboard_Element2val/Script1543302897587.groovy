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

'Verify Quota2 Text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/td_Element 2 Quota')), 
    'Element 2 Quota')

'Verify quota2 Value'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/Quota2val')), 
    Quota2)

'Verify Attainment2 Text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/td_Element 2 Attainment')), 
    'Element 2 Attainment')

'Verify Attainment2 Value'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/attainment2val')), 
    Element2attainment)

'Verify Attainment2percentage text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/td_Element 2 AttainmentPercentage')), 
    'Element 2 Attainment %')

'Verify Attainment2percentage Value'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Attainment_and_quota_by _Quarter/percentage2attainmentvalue')), 
    PercentageofElementtwo)

