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

WebUI.verifyElementPresent(findTestObject('Checkout/Shipping Information/Use Billing Address element'), 0)

WebUI.selectOptionByIndex(findTestObject('Checkout/Shipping Information/Shipping Address Option dropdown'), '1')

WebUI.clearText(findTestObject('Checkout/Shipping Information/First Name text field'))

WebUI.setText(findTestObject('Checkout/Shipping Information/First Name text field'), 'OtherTester')

WebUI.clearText(findTestObject('Checkout/Shipping Information/Last Name text field'))

WebUI.setText(findTestObject('Checkout/Shipping Information/Last Name text field'), 'Awesome')

WebUI.clearText(findTestObject('Checkout/Shipping Information/Company text field'))

WebUI.setText(findTestObject('Checkout/Shipping Information/Company text field'), 'GreatTestCo')

WebUI.clearText(findTestObject('Checkout/Shipping Information/Address text field'))

WebUI.setText(findTestObject('Checkout/Shipping Information/Address text field'), 'TesterTown')

WebUI.clearText(findTestObject('Checkout/Shipping Information/Address 2 text field'))

WebUI.setText(findTestObject('Checkout/Shipping Information/Address 2 text field'), 'Test')

WebUI.selectOptionByValue(findTestObject('Checkout/Shipping Information/Country dropdown'), 'IE', true)

WebUI.clearText(findTestObject('Checkout/Shipping Information/City text field'))

WebUI.setText(findTestObject('Checkout/Shipping Information/City text field'), 'Dublin')

WebUI.clearText(findTestObject('Checkout/Shipping Information/State Province text field'))

WebUI.setText(findTestObject('Checkout/Shipping Information/State Province text field'), 'Dublin')

WebUI.clearText(findTestObject('Checkout/Shipping Information/ZIP Postal code'))

WebUI.setText(findTestObject('Checkout/Shipping Information/ZIP Postal code'), 'D4')

WebUI.clearText(findTestObject('Checkout/Shipping Information/Telephone'))

WebUI.setText(findTestObject('Checkout/Shipping Information/Telephone'), '0850632054')

WebUI.clearText(findTestObject('Checkout/Shipping Information/Fax'))

WebUI.setText(findTestObject('Checkout/Shipping Information/Fax'), '01234567')

WebUI.click(findTestObject('Checkout/Shipping Information/Use Billing Address check button'))

WebUI.click(findTestObject('Checkout/Shipping Information/Continue button'))

