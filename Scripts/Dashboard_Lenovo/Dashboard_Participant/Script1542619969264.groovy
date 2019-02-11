import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.waitForElementNotClickable(findTestObject('Dashboard_Date/span_Please enter at least 3 c'), 10)

'Click on the Text box'
WebUI.click(findTestObject('Dashboard_Date/span_Please enter at least 3 c'))

'Providing participant name'
WebUI.setText(findTestObject('Dashboard_Date/input_Please enter at least 3'), ParticipantName)

WebUI.delay(10)

Robot robot = new Robot()

'Select and click date'
robot.keyPress(KeyEvent.VK_ENTER)

Thread.sleep(2000)

'Select and click date'
robot.keyRelease(KeyEvent.VK_ENTER)

boolean ParticipantName

try {
    part = WebUI.waitForElementPresent(findTestObject('Dashboard_Widgets/Dashboard_QTD_CPS_Attainment/span_QTD CPS Attainment'), 
        5)

    if (part == false) {
        KeywordUtil.markFailed('Participant not Found')

        KeywordLogger log = new KeywordLogger()

        log.logInfo('Participant Your are searching is not available')
    }
}
catch (Exception e) {
} 

