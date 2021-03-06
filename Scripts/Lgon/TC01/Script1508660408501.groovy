import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://opensource.demo.orangehrmlive.com/')

WebUI.click(findTestObject('TC01_OR/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('TC01_OR/Page_OrangeHRM/input_txtUsername'), 'Admin')

WebUI.setText(findTestObject('TC01_OR/Page_OrangeHRM/input_txtPassword'), 'admin')

WebUI.click(findTestObject('TC01_OR/Page_OrangeHRM/input_Submit'))

WebUI.click(findTestObject('TC01_OR/Page_OrangeHRM (1)/img'))

WebUI.setText(findTestObject('TC01_OR/Page_OrangeHRM (2)/input_timeemployeeName'), 'lok')

WebUI.sendKeys(findTestObject('TC01_OR/Page_OrangeHRM (2)/input_timeemployeeName'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('TC01_OR/Page_OrangeHRM (2)/span_Invalid'))

WebUI.verifyElementPresent(findTestObject('TC01_OR/Page_OrangeHRM (2)/span_Invalid'), 0)

WebUI.closeBrowser()

