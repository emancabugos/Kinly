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

WebUI.comment('Address')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Onboarding/Payment Acceptance/button_Link Account'), 0)

WebUI.click(findTestObject('MERCHANT/Onboarding/Payment Acceptance/button_Link Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Onboarding/Payment Acceptance/textlink_Skip'), 0)

WebUI.click(findTestObject('MERCHANT/Onboarding/Payment Acceptance/textlink_Skip'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Onboarding/Payment Acceptance/Payment Popup/textlabel_what currency'), 
    0)

WebUI.click(findTestObject('MERCHANT/Onboarding/Payment Acceptance/Payment Popup/button_USD'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('MERCHANT/Onboarding/Payment Acceptance/button_save'), 0)

WebUI.click(findTestObject('MERCHANT/Onboarding/Payment Acceptance/button_save'), FailureHandling.STOP_ON_FAILURE)

