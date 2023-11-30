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

WebUI.openBrowser(null)

WebUI.navigateToUrl("https://www.saucedemo.com/")

WebUI.setText(findTestObject('Object Repository/Login/Page_Swag Labs/input_Swag Labs_user-name'), "standard_user")

WebUI.setText(findTestObject('Object Repository/Login/Page_Swag Labs/input_Swag Labs_password'), "secret_sauce")

WebUI.click(findTestObject('Object Repository/Login/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/Page_Swag Labs/div_Swag Labs'), 0)

WebUI.click(findTestObject('Object Repository/Cart/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Swag Labs/a_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/Page_Swag Labs/div_Your Cart'), 0)

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/button_Checkout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Checkout Your Information'), 0)

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_Checkout Your Information_firstName'), "theresia")

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_Checkout Your Information_lastName'), "rumahorbo")

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_Checkout Your Information_postalCode'), "21147")

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_Cancel_continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Checkout Overview'), 0)

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/button_Finish'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Checkout Complete'), 0)

WebUI.closeBrowser()