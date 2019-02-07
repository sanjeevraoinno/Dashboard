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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

'Mouseover to My Profile '
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/span_My Profile'))

'Verify the Text of My Profile\r\n'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/span_My Profile'), Widget2)

'Verify the text of first name'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Myprofile/div_First')), 'First')

'Verify the Value of first name'
TestObject obj1 = new TestObject('Dynamic object')

String fname_search1 = firstname

//String xpath_first_name = ('//*[normalize-space(text()) and normalize-space(.)= "' + search1) + '" ]'


Thread.sleep(6000)

String xpath_firstname_test =' //div/span[contains(text(),"'+ fname_search1 +'")]'

obj1.addProperty('xpath', ConditionType.EQUALS, xpath_firstname_test)

Thread.sleep(2000)

String text = WebUI.getText(obj1)
System.out.println(text)

//Verify first name
'Click the Plan Rep'
WebUI.verifyEqual(WebUI.getText(obj1),firstname )

'Verify the text of Last name'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Last')), 'Last')
'Verify the Value of Last name'
TestObject obj2 = new TestObject('Dynamic object')
String lname_search1 = Lastname

String xpath_lastname_test = ' //div/span[contains(text(),"'+ lname_search1 +'")]'

obj2.addProperty('xpath', ConditionType.EQUALS, xpath_lastname_test)

Thread.sleep(2000)

String Last_text = WebUI.getText(obj2)

WebUI.verifyEqual(WebUI.getText(obj2),Lastname )

'Verify the text of Job Desc'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Job Desc')), 'Job Desc')

'Verify the Value of Job Desc'
TestObject obj3 = new TestObject('Dynamic object')

String job_search3 = JobDesc

String job_desc_xpath3 = ' //div/span[contains(text(),"'+ job_search3 +'")]'

obj3.addProperty('xpath', ConditionType.EQUALS, job_desc_xpath3)
Thread.sleep(2000)
String job_text = WebUI.getText(obj3)

WebUI.verifyEqual(WebUI.getText(obj3), JobDesc)


'Verify the text of Manager'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_Manager')), 'Manager')

'Verify the Value of Manager'
TestObject obj4 = new TestObject('Dynamic object')

String manager_search4 = Manager

String manager_xpath4 = ' //div/span[contains(text(),"'+ manager_search4 +'")]'

obj4.addProperty('xpath', ConditionType.EQUALS, manager_xpath4)

Thread.sleep(2000)
String manager_text = WebUI.getText(obj4)
WebUI.verifyEqual(WebUI.getText(obj4), Manager)

'Verify the text of PDT'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_MyProfile/div_PDT')), 'PDT')

'Verify the Value of PDT'
TestObject obj5 = new TestObject('Dynamic object')

String pdt_search5 = PDT

String pdt_xpath5 = ' //div/span[contains(text(),"'+ pdt_search5 +'")]'

obj5.addProperty('xpath', ConditionType.EQUALS, pdt_xpath5 )
Thread.sleep(2000)
String pdt_text = WebUI.getText(obj5)
WebUI.verifyEqual(WebUI.getText(obj5), PDT)


