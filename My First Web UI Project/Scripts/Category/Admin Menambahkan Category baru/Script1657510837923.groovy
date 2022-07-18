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

WebUI.click(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_Moot - fgd-22/div_Login_v-overlay__scrim'))

WebUI.click(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_Moot - fgd-22/span_Login'))

WebUI.setText(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_fgd-22 - fgd-22/input_User Name_input-121'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_fgd-22 - fgd-22/input_Password_input-124'), 
    'LD9RRMscN2U6zJ1cyE9daQ==')

WebUI.click(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_fgd-22 - fgd-22/button_Log in'))

WebUI.click(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_fgd-22 - fgd-22/span_Category'))

WebUI.click(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_fgd-22 - fgd-22/div_Admin     admin 1 admin1   Dashboard  C_57eafe'))

WebUI.click(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_fgd-22 - fgd-22/span_Create Category'))

WebUI.setText(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_fgd-22 - fgd-22/textarea_Create Category_input-234'), 
    'testing')

WebUI.setText(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_fgd-22 - fgd-22/textarea_Create Category_input-237'), 
    'bismillah')

WebUI.click(findTestObject('Object Repository/Admin Menambahkan Category baru/Page_fgd-22 - fgd-22/span_Create Category_1'))

WebUI.closeBrowser()

