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

WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/span_Percent of TI'))

WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/span_Percent of TI'), Widget3)

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Percent_of_TI_value')), Percent_Val)

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Target_value')), Percent_Target)

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Achivement_val')), Percent_Achievment)

