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

'Ouvrir le navigateur.'
WebUI.openBrowser('')

'URL du site.'
WebUI.navigateToUrl('http://credit-auto.qsiconseil.ma/')

'Cliquer sur le bouton pour accéder à la page de connexion.'
WebUI.click(findTestObject('Object Repository/Page_Crdit Auto  QSI Conseil/a_Accs Crdit Auto'))

'Vérifier que le titre de la page de connexion est dans la page.'
WebUI.verifyElementText(findTestObject('Page_Crdit Auto  QSI Conseil/legend_Connectez-vous'), 'Connectez-vous')

'Saisir le nom d\'utilisateur.'
WebUI.setText(findTestObject('Object Repository/Page_Crdit Auto  QSI Conseil/input_concat(Nom d, , utilisateur)__username'), 
    user)

'Saisir le mot de passe de l\'utilisateur.'
WebUI.setMaskedText(findTestObject('Object Repository/Page_Crdit Auto  QSI Conseil/input_Mot de passe__password'), password)

'Cliquer sur le bouton de connexion.'
WebUI.click(findTestObject('Object Repository/Page_Crdit Auto  QSI Conseil/button_Se connecter'))

'Vérifier qu\'on est dans la page de bienvenue après la connexion en vérifiant la présence du titre dans la page. '
WebUI.verifyElementText(findTestObject('Page_Crdit Auto  QSI Conseil/h4_Bienvenue sur lapplication Crdit Auto'), 'Bienvenue sur l\'application Crédit Auto')

'Attendre que le bouton de déconnexion soit visible.'
WebUI.waitForElementVisible(findTestObject('Page_Crdit Auto  QSI Conseil/a_Dconnexion'), 60)

'Cliquer sur le bouton de déconnexion.'
WebUI.click(findTestObject('Object Repository/Page_Crdit Auto  QSI Conseil/a_Dconnexion'))

'Vérifier qu\'on a dans la page de début en vérifiant que le bouton Accès Crédit Auto est présent dans la page.'
WebUI.verifyElementPresent(findTestObject('Page_Crdit Auto  QSI Conseil/a_Accs Crdit Auto'), 0)

'Fermer le navigateur.'
WebUI.closeBrowser()

