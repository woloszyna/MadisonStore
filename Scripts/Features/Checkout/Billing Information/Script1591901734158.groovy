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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyElementPresent(findTestObject('Checkout/Billing Information/Ship to different address element'), 0)

WebUI.selectOptionByIndex(findTestObject('Checkout/Billing Information/Billing Address option dropdown'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Checkout/Billing Information/First Name text field'))

WebUI.setText(findTestObject('Checkout/Billing Information/First Name text field'), 'Tester')

WebUI.clearText(findTestObject('Checkout/Billing Information/Middle Name text field'))

WebUI.setText(findTestObject('Checkout/Billing Information/Middle Name text field'), 'MiddleName')

WebUI.clearText(findTestObject('Checkout/Billing Information/Last Name text field'))

WebUI.setText(findTestObject('Checkout/Billing Information/Last Name text field'), 'McTest')

WebUI.clearText(findTestObject('Checkout/Billing Information/Company Name text field'))

WebUI.setText(findTestObject('Checkout/Billing Information/Company Name text field'), 'Some Company Co')

WebUI.clearText(findTestObject('Checkout/Billing Information/Address'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Checkout/Billing Information/Address'), 'Testing Street')

WebUI.clearText(findTestObject('Checkout/Billing Information/Street Address 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Checkout/Billing Information/Street Address 2'), 'Testing World')

WebUI.clearText(findTestObject('Checkout/Billing Information/City'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Checkout/Billing Information/City'), 'Dublin')

WebUI.selectOptionByValue(findTestObject('Checkout/Billing Information/Country dropdown'), 'IE', true)

WebUI.clearText(findTestObject('Checkout/Billing Information/State Province'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Checkout/Billing Information/State Province'), 'Dublin')

WebUI.clearText(findTestObject('Checkout/Billing Information/ZIP Postal Code'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Checkout/Billing Information/ZIP Postal Code'), 'D2')

WebUI.setText(findTestObject('Checkout/Billing Information/Telephone'), '0860234023')

WebUI.setText(findTestObject('Checkout/Billing Information/Fax'), '01234567')

WebUI.click(findTestObject('Checkout/Billing Information/Ship to different address radio button'))

WebUI.click(findTestObject('Checkout/Billing Information/Continue button'))

