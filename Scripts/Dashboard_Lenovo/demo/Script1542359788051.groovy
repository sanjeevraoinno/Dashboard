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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lnvo-muat.callidusondemand.com/SalesPortal/#!/')

WebUI.setText(findTestObject('Object Repository/Page_Sales Performance Home/input_Username_username'), 'sapattna')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sales Performance Home/input_Password_password'), 'y4ziPFOc8yvbgacOw1TEMg==')

WebUI.click(findTestObject('Object Repository/Page_Sales Performance Home/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Sales Performance Home/span_Dashboards'))

//WebUI.setText(findTestObject('Object Repository/Page_Sales Performance Home/input_Search_form-control ng-p'), 'Q')
WebUI.setText(findTestObject('Object Repository/Page_Sales Performance Home/input_Search_form-control ng-u'), 'Quarterly leverage plan-1')

Thread.sleep(5000)

WebUI.click(findTestObject('Object Repository/Page_Sales Performance Home/span_Quarterly Leverage Plan-1'))

Thread.sleep(5000)

WebUI.click(findTestObject('Object Repository/Page_Sales Performance Home/i_Quarterly Leverage Plan-1 El'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementPresent(findTestObject('Page_Sales Performance Home/span_Please enter at least 3 c'), 10)

WebUI.click(findTestObject('Object Repository/Page_Sales Performance Home/span_Please enter at least 3 c'))

WebUI.click(findTestObject('Object Repository/Page_Sales Performance Home/span_Select period'))

WebUI.setText(findTestObject('Object Repository/Page_Sales Performance Home/input_March 2019_form-control'), 'Jun')

WebUI.click(findTestObject('Object Repository/Page_Sales Performance Home/a_June 2018'))

WebUI.click(findTestObject('Object Repository/Page_Sales Performance Home/span_Please enter at least 3 c'))

WebUI.setText(findTestObject('Object Repository/Page_Sales Performance Home/input_Please enter at least 3'), 'And')

WebUI.click(findTestObject('Object Repository/Page_Sales Performance Home/a_Andrzej Gadki (00647203)'))

WebUI.closeBrowser()


