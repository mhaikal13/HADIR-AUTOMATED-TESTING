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

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_Bar_Cuti/Button_SubMenu_Cuti'))

WebUI.setText(findTestObject('Sub_Menu_Cuti/Search_Bar_Cuti/input_Search_search'), 'testing cuti')

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_Bar_Cuti/button_Search'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Sub_Menu_Cuti/Search_Bar_Cuti/AKSI_button'), 0)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Sub_Menu_Cuti/Search_Bar_Cuti/button_Reset'))

