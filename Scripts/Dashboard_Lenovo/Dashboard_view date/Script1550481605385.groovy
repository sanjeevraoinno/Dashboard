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

WebUI.waitForElementClickable(findTestObject('Dashboard_Plan/a_Dashboards'), 5)

'Click the Dashbord option on the screen\r\n'
WebUI.click(findTestObject('Dashboard_Plan/a_Dashboards'))

WebUI.click(findTestObject('Dashboard_view plan/input_View date_form-control n'))

WebUI.clearText(findTestObject('Dashboard_view plan/input_View date_form-control n'))

WebUI.setText(findTestObject('Dashboard_view plan/input_View date_form-control n'), 'Jun 1, 2018')

WebUI.mouseOver(findTestObject('Dashboard_view plan/button_Done'))

WebUI.click(findTestObject('Dashboard_view plan/button_Done'))

