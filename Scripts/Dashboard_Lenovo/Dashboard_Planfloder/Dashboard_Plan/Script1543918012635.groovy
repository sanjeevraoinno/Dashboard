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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

//WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_login'), [:], FailureHandling.STOP_ON_FAILURE)
Thread.sleep(3000)

'Click the Dashbord option on the screen\r\n'
WebUI.click(findTestObject('Dashboard_Plan/a_Dashboards'))

WebUI.delay(1)

'Click on the Text box'
WebUI.click(findTestObject('Dashboard_Plan/input_Search_form-control ng-p'))

//span[normalize-space(text())=plans] -- dynamic xpath for the plan in table.
'Providing the Plan Name in the Text Box'
WebUI.setText(findTestObject('Dashboard_Plan/input_Search_form-control ng-p'), Plans)

CustomKeywords.'globalkeywords.record.RecordNotFound'()

TestObject myobj = new TestObject('Dynamic Boject')

String plansearch = Plans

String xpath = ('//span[normalize-space(text())="' + plansearch) + '"]'

//String xpath = '//div[@id="' + dynamicId + '"]'
//myobj.addProperty("xpath", ConditionType.EQUALS, xpath)
myobj.addProperty('xpath', ConditionType.EQUALS, xpath)

Thread.sleep(2000)

'Click the Plan'
WebUI.click(myobj)

