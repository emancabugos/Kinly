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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('Utilities/Homepage/textlink_BE A SELLER'), 0)

if (WebUI.verifyElementPresent(findTestObject('Utilities/Accept Cookies/a_Accept Cookies'), 3, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('Utilities/Accept Cookies/a_Accept Cookies'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('Utilities/Homepage/textlink_BE A SELLER'), 0)
}

WebUI.click(findTestObject('Utilities/Homepage/textlink_BE A SELLER'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Login/textbox_username'), 0)

WebUI.setText(findTestObject('Utilities/Login/textbox_username'), GlobalVariable.CustomMerchant)

WebUI.setText(findTestObject('Utilities/Login/textbox_password'), GlobalVariable.CustomPass)

WebUI.click(findTestObject('Utilities/Login/button_login-submit'), FailureHandling.STOP_ON_FAILURE)

