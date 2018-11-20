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

WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/span_My Profile'))

WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/span_My Profile'), 'My Profile')

CustomKeywords.'globalkeywords.record.RecordNotFound'()

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Myprofile/div_First')), 'First :')

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Ayushmaan')), 'Ayushmaan')

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Last')), 'Last :')

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Agarwal')), 'Agarwal')

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Job Desc')), 'Job Desc :')

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Associate Manager - Sales')), 
    'Associate Manager - Sales')

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Manager')), 'Manager :')

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Hiral Somaiya')), 'Hiral Somaiya')

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_PDT')), 'PDT :')

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_APGUAR-IN')), 'APGUAR-IN')

