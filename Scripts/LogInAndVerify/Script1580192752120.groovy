import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

TestData excelTestData = findTestData('Data Files/TestData')

System.out.println('[Row Count] : ' + excelTestData.getRowNumbers())

System.out.println(excelTestData.getValue(2, 3))

WebUI.openBrowser(excelTestData.getValue(2, 3))

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM_Objects/LogIn'), excelTestData.getValue(3, 3))

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM_Objects/LogPw'), excelTestData.getValue(4, 3))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects/LogInBtn'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/OrangeHRM_Objects/WelAdm'))

//WebUI.waitForElementClickable(findTestObject('Object Repository/OrangeHRM_Objects/WelAdm', 3))

//WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects/WelAdm'))

//WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects/LogOut'))

//WebUI.waitForElementVisible(findTestObject('Object Repository/OrangeHRM_Objects/LogIn'), 4)

