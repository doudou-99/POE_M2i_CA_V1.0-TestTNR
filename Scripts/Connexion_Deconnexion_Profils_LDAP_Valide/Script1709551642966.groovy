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

WebUI.navigateToUrl('http://credit-auto.qsiconseil.ma/')

WebUI.click(findTestObject('Object Repository/Page_Crdit Auto  QSI Conseil/a_Accs Crdit Auto'))

WebUI.verifyElementText(findTestObject('Page_Crdit Auto  QSI Conseil/legend_Connectez-vous'), 'Connectez-vous')

WebUI.setText(findTestObject('Object Repository/Page_Crdit Auto  QSI Conseil/input_concat(Nom d, , utilisateur)__username'), 
    user)

WebUI.setMaskedText(findTestObject('Object Repository/Page_Crdit Auto  QSI Conseil/input_Mot de passe__password'), password)

WebUI.click(findTestObject('Object Repository/Page_Crdit Auto  QSI Conseil/button_Se connecter'))

WebUI.verifyElementText(findTestObject('Page_Crdit Auto  QSI Conseil/h4_Bienvenue sur lapplication Crdit Auto'), 'Bienvenue sur l\'application Crédit Auto')

WebUI.waitForElementClickable(findTestObject('Page_Crdit Auto  QSI Conseil/a_Dconnexion'), 30)

WebUI.click(findTestObject('Object Repository/Page_Crdit Auto  QSI Conseil/a_Dconnexion'))

WebUI.verifyElementPresent(findTestObject('Page_Crdit Auto  QSI Conseil/a_Accs Crdit Auto'), 0)

WebUI.closeBrowser()

