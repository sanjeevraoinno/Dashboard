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

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Dashboard_Widgets/span_Please enter at least 3 c'), 10)

WebUI.click(findTestObject('Dashboard_Widgets/span_Please enter at least 3 c'))

WebUI.click(findTestObject('Dashboard_Widgets/span_Select period'))

WebUI.click(findTestObject('Dashboard_Widgets/input_March 2019_form-control'))

WebUI.delay(10)

WebUI.setText(findTestObject('Dashboard_Widgets/input_March 2019_form-control'), partDate)

WebUI.click(findTestObject('Dashboard_Widgets/a_June 2018'))

WebUI.click(findTestObject('Dashboard_Widgets/span_Please enter at least 3 c'))

WebUI.setText(findTestObject('Dashboard_Widgets/input_Please enter at least 3'), 'Ayush')

WebUI.click(findTestObject('Dashboard_Widgets/a_Ayushmaan Agarwal (00690005)'))

WebUI.mouseOver(findTestObject('Dashboard_Widgets/span_QTD CPS Attainment'))

WebUI.verifyElementText(findTestObject('Dashboard_Widgets/span_QTD CPS Attainment'), Widget1)

WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/div_0.00')), wid_Values)

