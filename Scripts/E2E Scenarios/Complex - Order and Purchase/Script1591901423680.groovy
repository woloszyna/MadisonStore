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

WebUI.callTestCase(findTestCase('Supporting Actions/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Features/Order'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Features/Login for Order'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Features/Checkout/Billing Information'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Features/Checkout/Shipping Information'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Features/Checkout/Shipping Method'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Features/Checkout/Payment Information'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Features/Checkout/Order Review'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Features/Order Confirmation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Supporting Actions/Take Screenshot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Features/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Supporting Actions/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

