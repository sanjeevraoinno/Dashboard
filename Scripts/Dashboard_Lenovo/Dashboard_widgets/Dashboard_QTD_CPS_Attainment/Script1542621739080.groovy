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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_Plans'), [('Plans') : 'AP Guarantee plan-1 Element'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_date'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_Participant'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_QTD_CPS_Attainment/span_QTD CPS Attainment'))

WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_QTD_CPS_Attainment/span_QTD CPS Attainment'), Widget1)

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_QTD_CPS_Attainment/div_0.00')), wid_Values)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Dashboard_Myprofile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Dashboard_Percent_of_TI'), [('Percent_Val') : '0.00%'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Dashboard_Element_1_Attainment'), [('Element1_val') : '0.00%'], 
    FailureHandling.STOP_ON_FAILURE)

