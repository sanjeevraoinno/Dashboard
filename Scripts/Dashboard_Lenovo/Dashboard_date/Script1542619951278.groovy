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

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Dashboard_Date/span_Please enter at least 3 c'), 10)

WebUI.click(findTestObject('Dashboard_Date/span_Please enter at least 3 c'))

WebUI.delay(10)

WebUI.click(findTestObject('Dashboard_Date/span_Select period'))

WebUI.delay(10)

WebUI.click(findTestObject('Dashboard_Date/input_March 2019_form-control'))

WebUI.delay(10)

WebUI.setText(findTestObject('Dashboard_Date/input_March 2019_form-control'), parDate)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_ENTER)

Thread.sleep(2000)

robot.keyRelease(KeyEvent.VK_ENTER)

not_run: WebUI.click(findTestObject('demo/a_June 2018'))

