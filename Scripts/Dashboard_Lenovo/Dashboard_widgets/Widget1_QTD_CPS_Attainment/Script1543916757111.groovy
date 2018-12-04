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
import org.stringtemplate.v4.compiler.STParser.ifstat_return as ifstat_return

'Mouseover on to QTD CPS'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_QTD_CPS_Attainment/span_QTD CPS Attainment'))

'Verify the Text of QTD CPS'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_QTD_CPS_Attainment/span_QTD CPS Attainment'), Widget1)

'Verify the value of QTD CPS'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_QTD_CPS_Attainment/QTD_CPS_attainment_value')), 
    wid_Values)

