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

'Mouse Over to Element1 Attainment'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Element_1_Attainment/span_Element 1 Attainment'))

'Verify the text of Element 1 attainment'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_1_Attainment/Element1_val')), Element1_val)

'Verification of Element 1 Attainment data'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Element_1_Attainment/span_Element 1 Attainment'), Widget4)

'Verification of Element 1 Attainment data'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_1_Attainment/Quota_val')), Element_quota)

'Verification of Element 1 Attainment data'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Element_1_Attainment/Attainment_val')), Element_attainment)

