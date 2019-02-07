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

'Opening the Browser'
WebUI.openBrowser('')

'Navigating to Specified Url\r\n'
WebUI.navigateToUrl('https://lnvo-muat.callidusondemand.com/SalesPortal/#!/')

'Maximizing the Browser window'
WebUI.maximizeWindow()

WebUI.delay(5)

'Providing the Input value in the Username Text Box'
WebUI.setText(findTestObject('Dashboard_login/input_username'), 'sapattna')

WebUI.delay(5)

'Providing the Password of the User'
WebUI.setText(findTestObject('Dashboard_login/input_password'), 'Callidus123')

'Click the login button'
WebUI.click(findTestObject('Dashboard_login/button_Login'))

