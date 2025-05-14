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

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/Button_Menu_Laporan'))

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/Button_Submenu_Kehadiran'))

WebUI.delay(4)

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/Button_Callender_StartDate'))

WebUI.selectOptionByValue(findTestObject('Element_Kehadiran_Cuti/Select_Month_Startdate'), '4', true)

WebUI.selectOptionByValue(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/Select_Year'), '2024', true)

WebUI.click(findTestObject('Element_Kehadiran_Cuti/Page_HADIR/button_StartDate'))

//WebUI.click(findTestObject('Element_Kehadiran_Cuti/button_callender_enddate'))
WebUI.selectOptionByValue(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/Select_Month_Startdate'), '3', true)

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/span_JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember204520442043204220412040203920382037203620352034203320322031203020292028202720262025202420232022202120202019201820172016201520142013201220112'))

WebUI.selectOptionByValue(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/select_enddate_year'), '2025', true)

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/Button_enddate'))

WebUI.executeJavaScript('window.scrollTo(0, 200)', [])

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/button_save'))

WebUI.executeJavaScript('window.scrollTo(0,-200)', [])

WebUI.click(findTestObject('Element_Kehadiran_Cuti/button_filter'))

WebUI.setText(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/input_departemen'), 'AMEX')

WebUI.waitForElementVisible(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/option_AMEX'), 4)

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/option_AMEX'))

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_By_Fillter_Page/button_Terapkan'))

WebUI.click(findTestObject('Sub_Menu_Kehadiran/Search_Bar_Page/button_Search'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.executeJavaScript('window.scrollTo(0, 4000)', [])

