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

WebUI.click(findTestObject('Object Repository/Page_Mettre en place contrat credit/a_Acces Crdit Auto'))

WebUI.verifyElementText(findTestObject('Page_Crdit Auto  QSI Conseil/legend_Connectez-vous'), 'Connectez-vous')

WebUI.setText(findTestObject('Object Repository/Page_Mettre en place contrat credit/input_concat(Nom d, , utilisateur)__username'), 
    'gcd')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mettre en place contrat credit/input_Mot de passe__password'), 
    'oA9cdRZTG5bKwKvIkkeDQw==')

WebUI.click(findTestObject('Object Repository/Page_Mettre en place contrat credit/button_Se connecter'))

WebUI.verifyElementText(findTestObject('Page_Crdit Auto  QSI Conseil/h4_Bienvenue sur lapplication Crdit Auto'), 'Bienvenue sur l\'application Crédit Auto')

WebUI.click(findTestObject('Page_Mettre en place contrat credit/a_Credit'))

WebUI.click(findTestObject('Page_Mettre en place contrat credit/a_Creer contrat de credit auto'))

WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/h3_Creation dun contrat de crdit'), 'Création d\'un contrat de crédit')

WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/legend_Simulation dun crdit'), 'Simulation d\'un crédit')

WebUI.setText(findTestObject('Page_Mettre en place contrat credit/input_Montant achat_montantAchats'), '30000')

WebUI.setText(findTestObject('Page_Mettre en place contrat credit/input_Montant credit_montantCredits'), '27000')

WebUI.setText(findTestObject('Page_Mettre en place contrat credit/input_Duree_durees'), '30')

montant_achat = WebUI.getAttribute(findTestObject('Page_Mettre en place contrat credit/input_Montant achat_montantAchats'), 
    'value')

WebUI.verifyGreaterThan(java.lang.Integer.parseInt(montant_achat), 6250)

WebUI.verifyLessThan(java.lang.Integer.parseInt(montant_achat), 50000)

montant_credit = WebUI.getAttribute(findTestObject('Page_Mettre en place contrat credit/input_Montant credit_montantCredits'), 
    'value')

WebUI.verifyGreaterThanOrEqual(java.lang.Integer.parseInt(montant_credit), 0.8 * java.lang.Integer.parseInt(montant_achat))

WebUI.verifyGreaterThan(java.lang.Integer.parseInt(montant_credit), 5000)

WebUI.verifyLessThan(java.lang.Integer.parseInt(montant_credit), 40000)

duree_credit = WebUI.getAttribute(findTestObject('Page_Mettre en place contrat credit/input_Duree_durees'), 'value')

WebUI.verifyGreaterThan(java.lang.Integer.parseInt(duree_credit), 12)

WebUI.verifyLessThan(java.lang.Integer.parseInt(duree_credit), 48)

WebUI.click(findTestObject('Page_Mettre en place contrat credit/button_Calculer credit'))

WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/legend_Nouveau contrat'), 'Nouveau contrat')

WebUI.click(findTestObject('Page_Mettre en place contrat credit/div_Echeancier'))

WebUI.verifyElementPresent(findTestObject('Page_Mettre en place contrat credit/div_Tableau echeances'), 30)

WebUI.click(findTestObject('Page_Mettre en place contrat credit/a_Creer contrat'))

WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/legend_Rechercher un client'), 'Rechercher un client')

WebUI.setText(findTestObject('Page_Mettre en place contrat credit/input_Prenom_firstname'), 'Jean')

WebUI.setText(findTestObject('Page_Mettre en place contrat credit/input_Nom_names'), 'DUCLOS')

prenom_client = WebUI.getAttribute(findTestObject('Page_Mettre en place contrat credit/input_Prenom_firstname'), 'value')

nom_client = WebUI.getAttribute(findTestObject('Page_Mettre en place contrat credit/input_Nom_names'), 'value')

WebUI.click(findTestObject('Page_Mettre en place contrat credit/input_Prenom_btnRechercher'))

WebUI.verifyElementVisible(findTestObject('Page_Mettre en place contrat credit/table_Numero de compte'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent(prenom_client, false)

WebUI.verifyTextPresent(nom_client, false)

WebUI.executeJavaScript('document.querySelector("#customControlValidation2").click()', [])

WebUI.click(findTestObject('Page_Mettre en place contrat credit/button_Valide'))

WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/i_Contrat de credit'), 'Contrat de crédit')

WebUI.verifyTextPresent(prenom_client, false)

WebUI.verifyTextPresent(nom_client, false)

WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/p_Resume du contrat'), 'Résumé du contrat')

WebUI.click(findTestObject('Page_Mettre en place contrat credit/button_Imprime'))

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Mettre en place contrat credit/button_Enregistre'))

WebUI.verifyElementVisible(findTestObject('Page_Mettre en place contrat credit/div_Contrat cree avec succes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Mettre en place contrat credit/a_Deconnexion'))

WebUI.verifyElementPresent(findTestObject('Page_Mettre en place contrat credit/a_Credit Auto'), 30)

WebUI.closeBrowser()

