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

WebUI.click(findTestObject('Top Banner/Account Option'))

WebUI.click(findTestObject('Top Banner/Register Option'))

WebUI.setText(findTestObject('Register Page/First Name text box'), 'Tester')

WebUI.setText(findTestObject('Register Page/Last Name text box'), 'McTest')

'Create a a unique value'
String emailPrefix = System.currentTimeMillis().toString()

'Populating unique email address'
WebUI.setText(findTestObject('Register Page/Email Address text box'), emailPrefix + '@email.com')

WebUI.setEncryptedText(findTestObject('Register Page/Password text box'), 'p4y+y39Ir5MSxNs1t5lTZQ==')

WebUI.setEncryptedText(findTestObject('Register Page/Confirm Password text box'), 'p4y+y39Ir5MSxNs1t5lTZQ==')

WebUI.click(findTestObject('Register Page/Register button'))

WebUI.verifyElementPresent(findTestObject('My Dashboard/Change Password Link'), 0)

WebUI.verifyTextPresent(emailPrefix + '@email.com', false)

