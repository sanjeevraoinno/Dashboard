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

'Mouseover to My Profile '
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/span_My Profile'))

'Verify the Text of My Profile\r\n'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/span_My Profile'), Widget2)

'Verify the text of first name'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Myprofile/div_First')), 'First :')

'Verify the Value of first name'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Ayushmaan')), firstname)

'Verify the text of Last name'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Last')), 'Last :')

'Verify the Value of Last name'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Agarwal')), Lastname)

'Verify the text of Job Desc'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Job Desc')), 'Job Desc :')

'Verify the Value of Job Desc'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Associate Manager - Sales')), 
    JobDesc)

'Verify the text of Manager'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Manager')), 'Manager :')

'Verify the Value of Manager'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Hiral Somaiya')), Manager)

'Verify the text of PDT'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_PDT')), 'PDT :')

'Verify the Value of PDT'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_APGUAR-IN')), PDT)

