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

WebUI.click(findTestObject('Object Repository/Login admin dengan data yang kosong/Page_Moot - fgd-22/div_Login_v-overlay__scrim'))

WebUI.click(findTestObject('Object Repository/Login admin dengan data yang kosong/Page_Moot - fgd-22/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Login admin dengan data yang kosong/Page_Moot - fgd-22/span_Login'))

WebUI.click(findTestObject('Object Repository/Login admin dengan data yang kosong/Page_fgd-22 - fgd-22/div_User Name'))

WebUI.click(findTestObject('Object Repository/Login admin dengan data yang kosong/Page_fgd-22 - fgd-22/div_User Nameemail can not be empty Passwor_175eab'))

WebUI.click(findTestObject('Object Repository/Login admin dengan data yang kosong/Page_fgd-22 - fgd-22/span_Log in'))

WebUI.closeBrowser()

