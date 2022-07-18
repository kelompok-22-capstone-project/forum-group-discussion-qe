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

WebUI.click(findTestObject('Object Repository/Pengguna ingin mendaftarkan akun dengan data yang valid/Page_Moot - fgd-22/span_Register'))

WebUI.setText(findTestObject('Object Repository/Pengguna ingin mendaftarkan akun dengan data yang valid/Page_fgd-22 - fgd-22/input_Email_input-95'), 
    'yonda3008@gmail.com')

WebUI.setText(findTestObject('Object Repository/Pengguna ingin mendaftarkan akun dengan data yang valid/Page_fgd-22 - fgd-22/input_Display Name_input-98'), 
    'yonda')

WebUI.click(findTestObject('Object Repository/Pengguna ingin mendaftarkan akun dengan data yang valid/Page_fgd-22 - fgd-22/div_Username'))

WebUI.setText(findTestObject('Object Repository/Pengguna ingin mendaftarkan akun dengan data yang valid/Page_fgd-22 - fgd-22/input_Username_input-101'), 
    'yonda')

WebUI.click(findTestObject('Object Repository/Pengguna ingin mendaftarkan akun dengan data yang valid/Page_fgd-22 - fgd-22/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Pengguna ingin mendaftarkan akun dengan data yang valid/Page_fgd-22 - fgd-22/input_Password_input-104'), 
    'HbDQh84U2haW7ukWow6shw==')

WebUI.click(findTestObject('Object Repository/Pengguna ingin mendaftarkan akun dengan data yang valid/Page_fgd-22 - fgd-22/span_Register'))

WebUI.click(findTestObject('Object Repository/Pengguna ingin mendaftarkan akun dengan data yang valid/Page_fgd-22 - fgd-22/span_Register'))

WebUI.closeBrowser()

