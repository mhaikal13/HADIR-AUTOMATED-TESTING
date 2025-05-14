import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(2)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Sub_Menu_Cuti/Search_By_Callender_Cuti/Button_Callender_Cuti'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sub_Menu_Cuti/Search_By_Callender_Cuti/Select_Start-EndMonth_Cuti'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sub_Menu_Cuti/Search_By_Callender_Cuti/Select_Start-EndYear_Cuti'), 
    '2024', true)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/button_Date12_Cuti'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sub_Menu_Cuti/Search_By_Callender_Cuti/Select_Start-EndMonth_Cuti'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sub_Menu_Cuti/Search_By_Callender_Cuti/Select_Start-EndYear_Cuti'), 
    '2024', true)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/button_EndDate18_Cuti'))

WebUI.executeJavaScript('window.scrollTo(0,300)', [])

WebUI.delay(2)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/button_save_Cuti'))

WebUI.executeJavaScript('window.scrollTo(0,-300)', [])

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/Button_Filter_Cuti'))

WebUI.setText(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/Input_Unit_Cuti'), 'AMEX')

WebUI.waitForElementVisible(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/li_AMEX MERCHANT'), 7)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/li_AMEX MERCHANT'))

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/button_Terapkan_Cuti'))

WebUI.delay(2)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/button_SearchCuti'))

WebUI.delay(4)

WebUI.executeJavaScript('window.scrollTo(0,700)', [])

WebUI.delay(2)

WebUI.executeJavaScript('window.scrollTo(0,-700)', [])

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Element_Kehadiran_Cuti/Page_HADIR/button_Reset'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sub_Menu_Cuti/Search_By_Callender_Cuti/Button_Callender_Cuti'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sub_Menu_Cuti/Search_By_Callender_Cuti/Select_Start-EndMonth_Cuti'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sub_Menu_Cuti/Search_By_Callender_Cuti/Select_Start-EndYear_Cuti'), 
    '2024', true)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/button_Date1_Cuti'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sub_Menu_Cuti/Search_By_Callender_Cuti/Select_Start-EndMonth_Cuti'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sub_Menu_Cuti/Search_By_Callender_Cuti/Select_Start-EndYear_Cuti'), 
    '2025', true)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/button_EndDate30_Cuti'))

WebUI.executeJavaScript('window.scrollTo(0,300)', [])

WebUI.delay(2)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/button_save2_Cuti'))

WebUI.executeJavaScript('window.scrollTo(0,-300)', [])

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/Button_Filter_Cuti'))

WebUI.delay(4)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/Input_Unit_Cuti'))

WebUI.delay(4)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/Button_DeleteFilter_Cuti'))

WebUI.delay(3)

WebUI.setText(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/Input_Unit_Cuti'), 'sysmex')

WebUI.waitForElementVisible(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/li_Sysmex'), 7)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/li_Sysmex'))

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/button_Terapkan_Cuti'))

WebUI.delay(2)

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_By_Callender_Cuti/button_SearchCuti'))

WebUI.delay(4)

WebUI.executeJavaScript('window.scrollTo(0,700)', [])

WebUI.delay(2)

WebUI.executeJavaScript('window.scrollTo(0,-700)', [])

WebUI.delay(2)

WebUI.click(findTestObject('Element_Kehadiran_Cuti/Page_HADIR/button_Reset'))

