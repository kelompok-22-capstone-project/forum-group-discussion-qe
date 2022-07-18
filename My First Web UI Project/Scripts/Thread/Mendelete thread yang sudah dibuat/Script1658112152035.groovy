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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://moot-fgd.netlify.app/')

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/div_Login_v-overlay__scrim'))

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/span_Login'))

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/div_User Name'))

WebUI.setText(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/input_User Name_input-208'), 
    'yonda')

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/input_Password_input-211'), 
    'HbDQh84U2haW7ukWow6shw==')

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/span_Log in'))

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/div_Login_v-overlay__scrim'))

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/i_concat(Let, , s Make a thread)_v-icon not_c89c63'))

WebUI.setText(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/textarea_Create Thread_input-410'), 
    'oi')

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/div_Create Thread_v-input__control'))

WebUI.setText(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/textarea_Create Thread_input-413'), 
    'sasimo')

WebUI.selectOptionByValue(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/select_Category                            _ef6040'), 
    'c-GNw', true)

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/span_Save'))

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/div_Login_v-overlay__scrim'))

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/div_yonda                         Testing Olahraga'))

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/span_oi'))

WebUI.click(findTestObject('Object Repository/Mendelete thread yang sudah dibuat/Page_fgd-22 - fgd-22/i_yonda_v-icon notranslate mdi mdi-delete-o_5679e0'))

WebUI.closeBrowser()

