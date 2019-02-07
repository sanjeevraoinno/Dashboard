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

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('null'), [('Plans') : 'Quarterly Leverage Plan-3 Elements-CPS-NA'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_Planfloder/Dashboard_PlanActions'), [('Plans') : 'Quarterly Leverage Plan-3 Elements-CPS-NA'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_date'), [('parDate') : 'June 2018'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_Participant'), [('ParticipantName') : 'Bailey'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Widget1_QTD_CPS_Attainment'), [('Widget1') : 'QTD CPS Attainment'
        , ('wid_Values') : '163.49%'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('null'), [('Widget2') : 'My Profile'
        , ('firstname') : 'Bailey', ('Lastname') : 'Wilson', ('JobDesc') : 'Inside Sales Representative', ('Manager') : 'Andrew Lent'
        , ('PDT') : 'NEP115-US'], FailureHandling.STOP_ON_FAILURE)

'Mouseover to Percent of TI'
WebUI.mouseOver(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/span_Percent of TI'))

'Verify the text of Percent of TI'
WebUI.verifyElementText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/span_Percent of TI'), Widget3)

'Verify the Value  of Percent of TI'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Percent_of_TI_value')), Percent_Val)

'Verify the Target  of Percent of TI'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Target_value')), Percent_Target)

'Verify the Achievement  of Percent of TI'
WebUI.verifyEqual(WebUI.getText(findTestObject('Dashboard_Widgets/Dashboard_Percent_of_TI/Achivement_val')), Percent_Achievment)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Widget4_Element_1_Attainment'), [('Element1_val') : '169.69%'
        , ('Element_quota') : '$12,178,000.00', ('Element_attainment') : '$20,665,034.00', ('Widget4') : 'Element 1 Attainment'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Widget5_Element_2_attainment'), [('valElement2') : '177.60%'
        , ('Quota2') : '$2,415,000.00', ('Attainment2') : '$4,289,048.00', ('Widget5') : 'Element 2 Attainment'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Widget6_Element_3_Attainment'), [('ValElement3') : '122.88%'
        , ('Quota3') : '$1,564,000.00', ('Attainment3') : '$1,921,846.00', ('widget6') : 'Element 3 Attainment'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Widget7_attainment and quota/Widget7_1_QTD_CPSandELEMENT1DATA'), 
    [('widget7') : 'Attainment and Quota by Quarter', ('QuarterPeriods') : '1Q19', ('QTDCPS') : '163.49%', ('QtdCpsTxt') : 'QTD CPS'
        , ('Quota1') : '12,178,000.00', ('Element1attainment') : '20,665,034.00', ('Percentageofelementone') : '169.69%'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Widget7_attainment and quota/Widget7_2_Element2val'), 
    [('Element2attainment') : '4,289,048.00', ('PercentageofElementtwo') : '177.60%', ('Quota2') : '2,415,000.00'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Widget7_attainment and quota/Widget7_3_Element3Val'), 
    [('Element3attainment') : '1,921,846.00', ('PercentageofElementthree') : '122.88%', ('Quota3') : '1,564,000.00'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard_Lenovo/Dashboard_widgets/Widget8_currentyearpayments'), [('widget8') : 'Current Year Payments'], 
    FailureHandling.STOP_ON_FAILURE)

