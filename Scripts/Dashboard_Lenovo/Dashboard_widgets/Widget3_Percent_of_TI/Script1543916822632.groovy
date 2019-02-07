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

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_Planfloder/Dashboard_Plan'), [('Plans') : 'Quarterly Leverage Plan-3 Elements-CPS-NA'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_Planfloder/Dashboard_PlanActions'), [('Plans') : 'Quarterly Leverage Plan-3 Elements-CPS-NA'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_date'), [('parDate') : 'June 2018'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_Participant'), [('ParticipantName') : 'Bailey'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Widget1_QTD_CPS_Attainment'), [('Widget1') : 'QTD CPS Attainment'
        , ('wid_Values') : '163.49%'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Widget2_Myprofile'), [('Widget2') : 'My Profile', ('firstname') : 'Bailey'
        , ('Lastname') : 'Wilson', ('JobDesc') : 'Inside Sales Representative', ('Manager') : 'Andrew Lent', ('PDT') : 'NEP115-US'], 
    FailureHandling.STOP_ON_FAILURE)

'Mouseover to Percent of TI'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/span_Percent of TI'))

'Verify the text of Percent of TI'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/span_Percent of TI'), Widget3)

'Verify the Value  of Percent of TI'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Percent_of_TI_value')), Percent_Val)

'Verify the Target  of Percent of TI'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Target_value')), Percent_Target)

'Verify the Achievement  of Percent of TI'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Achivement_val')), Percent_Achievment)

