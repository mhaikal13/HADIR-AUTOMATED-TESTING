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

WebUI.executeJavaScript('window.scrollTo(5000, 0)', [])

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_Bar_Page/button_Reset'))

WebUI.setText(findTestObject('Sub_Menu_Kehadiran/input_manual_data/input_Start Date_MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-b52kj1'), 
    '01 Apr 2025')

WebUI.delay(2)

WebUI.setText(findTestObject('Sub_Menu_Kehadiran/input_manual_data/input_Start Date_MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-b52kj1'), 
    '29 Apr 2025')

WebUI.click(findTestObject('Element_Kehadiran_Cuti/button_filter'))

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/input_departemen'))

WebUI.sendKeys(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/input_departemen'), 'sysmex')

WebUI.waitForElementVisible(findTestObject('Sub_Menu_Kehadiran/input_manual_data/li_Sysmex'), 5)

WebUI.click(findTestObject('Sub_Menu_Kehadiran/input_manual_data/li_Sysmex'))

WebUI.waitForElementVisible(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/button_Terapkan'), 2)

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/button_Terapkan'))

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_Bar_Page/button_Search'))

