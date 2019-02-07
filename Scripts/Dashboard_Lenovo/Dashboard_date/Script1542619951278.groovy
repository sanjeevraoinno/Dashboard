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

WebUI.waitForElementVisible(findTestObject('Dashboard_Date/span_Select period'), 5)

'Click on the Date Option\r\n'
WebUI.click(findTestObject('Dashboard_Date/span_Select period'))

WebUI.waitForElementClickable(findTestObject('Dashboard_Date/Input_of_date'), 5)

'Click on Date Text box'
WebUI.click(findTestObject('Dashboard_Date/Input_of_date'))

WebUI.delay(2)

'Provide the Date in the Text Box\r\n'
WebUI.setText(findTestObject('Dashboard_Date/Input_of_date'), parDate)

CustomKeywords.'globalkeywords.record.RecordNotFound'()

Robot robot = new Robot()

'Select and click date'
robot.keyPress(KeyEvent.VK_ENTER)

Thread.sleep(2000)

'Select and click date'
robot.keyRelease(KeyEvent.VK_ENTER)

not_run: WebUI.click(findTestObject('demo/a_June 2018'))

