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
WebUI.click(findTestObject('Object Repository/Page_Mettre en place contrat credit/a_Acces Crdit Auto'))

'Vérifier que le titre de la page de connexion est dans la page.'
WebUI.verifyElementText(findTestObject('Page_Crdit Auto  QSI Conseil/legend_Connectez-vous'), 'Connectez-vous')

'Saisir le nom d\'utilisateur.'
WebUI.setText(findTestObject('Object Repository/Page_Mettre en place contrat credit/input_concat(Nom d, , utilisateur)__username'), 
    'gcd')

'Saisir le mot de passe de l\'utilisateur.'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mettre en place contrat credit/input_Mot de passe__password'), 
    'oA9cdRZTG5bKwKvIkkeDQw==')

'Cliquer sur le bouton de connexion.'
WebUI.click(findTestObject('Object Repository/Page_Mettre en place contrat credit/button_Se connecter'))

'Vérifier qu\'on est dans la page de bienvenue après la connexion en vérifiant la présence du titre dans la page.'
WebUI.verifyElementText(findTestObject('Page_Crdit Auto  QSI Conseil/h4_Bienvenue sur lapplication Crdit Auto'), 'Bienvenue sur l\'application Crédit Auto')

'Cliquer sur le lien Crédit de la barre de navigation.'
WebUI.click(findTestObject('Page_Mettre en place contrat credit/a_Credit'))

'Cliquer sur le bouton Créer contrat de crédit auto.'
WebUI.click(findTestObject('Page_Mettre en place contrat credit/a_Creer contrat de credit auto'))

'Vérifier que le titre de la page de création de contrat de crédit est dans la page.'
WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/h3_Creation dun contrat de crdit'), 'Création d\'un contrat de crédit')

'Vérifier que le titre du formulaire de simulation de crédit est dans la page de création de contrat de crédit auto.'
WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/legend_Simulation dun crdit'), 'Simulation d\'un crédit')

'Saisir le montant d\'achat.'
WebUI.setText(findTestObject('Page_Mettre en place contrat credit/input_Montant achat_montantAchats'), '30000')

'Saisir le montant de crédit.'
WebUI.setText(findTestObject('Page_Mettre en place contrat credit/input_Montant credit_montantCredits'), '27000')

'Saisir la durée de crédit'
WebUI.setText(findTestObject('Page_Mettre en place contrat credit/input_Duree_durees'), '30')

montant_achat = WebUI.getAttribute(findTestObject('Page_Mettre en place contrat credit/input_Montant achat_montantAchats'), 
    'value')

'Vérifier que le montant d\'achat est plus grand que 6250.'
WebUI.verifyGreaterThan(java.lang.Integer.parseInt(montant_achat), 6250)

'Vérifier que le montant d\'achat est inférieur à 50000.'
WebUI.verifyLessThan(java.lang.Integer.parseInt(montant_achat), 50000)

montant_credit = WebUI.getAttribute(findTestObject('Page_Mettre en place contrat credit/input_Montant credit_montantCredits'), 
    'value')

'Vérifier que le montant de crédit est supérieur ou égal à 80% du montant d\'achat.'
WebUI.verifyGreaterThanOrEqual(java.lang.Integer.parseInt(montant_credit), 0.8 * java.lang.Integer.parseInt(montant_achat))

'Vérifier que le montant de crédit est supérieur à 5000.'
WebUI.verifyGreaterThan(java.lang.Integer.parseInt(montant_credit), 5000)

'Vérifier que le montant de crédit est inférieur à 40000.'
WebUI.verifyLessThan(java.lang.Integer.parseInt(montant_credit), 40000)

duree_credit = WebUI.getAttribute(findTestObject('Page_Mettre en place contrat credit/input_Duree_durees'), 'value')

'Vérifier que la durée de crédit est supérieur à 12.'
WebUI.verifyGreaterThan(java.lang.Integer.parseInt(duree_credit), 12)

'Vérifier que la durée de crédit est inférieur à 48.'
WebUI.verifyLessThan(java.lang.Integer.parseInt(duree_credit), 48)

WebUI.click(findTestObject('Page_Mettre en place contrat credit/button_Calculer credit'))

'Vérifier que le titre du formulaire avec l\'écheancier est égal à "Nouveau contrat".'
WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/legend_Nouveau contrat'), 'Nouveau contrat')

WebUI.click(findTestObject('Page_Mettre en place contrat credit/div_Echeancier'))

'Vérifier que le tableau des écheances est présent dans la page.'
WebUI.verifyElementPresent(findTestObject('Page_Mettre en place contrat credit/div_Tableau echeances'), 30)

WebUI.click(findTestObject('Page_Mettre en place contrat credit/a_Creer contrat'))

'Vérifier que le titre du formulaire de recherche du client est égal à "Rechercher un client".'
WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/legend_Rechercher un client'), 'Rechercher un client')

WebUI.setText(findTestObject('Page_Mettre en place contrat credit/input_Prenom_firstname'), 'Jean')

WebUI.setText(findTestObject('Page_Mettre en place contrat credit/input_Nom_names'), 'DUCLOS')

prenom_client = WebUI.getAttribute(findTestObject('Page_Mettre en place contrat credit/input_Prenom_firstname'), 'value')

nom_client = WebUI.getAttribute(findTestObject('Page_Mettre en place contrat credit/input_Nom_names'), 'value')

WebUI.click(findTestObject('Page_Mettre en place contrat credit/input_Prenom_btnRechercher'))

'Vérifier que le tableau de résultats de recherche du client est visible dans la page.'
WebUI.verifyElementVisible(findTestObject('Page_Mettre en place contrat credit/table_Numero de compte'), FailureHandling.STOP_ON_FAILURE)

'Vérifier que le prenom du client recherché est présent dans la page et plus précisément dans le tableau de résultats.'
WebUI.verifyTextPresent(prenom_client, false)

'Vérifier que le nom du client recherché est présent dans la page et plus précisément dans le tableau de résultats.'
WebUI.verifyTextPresent(nom_client, false)

WebUI.executeJavaScript('document.querySelector("#customControlValidation2").click()', [])

WebUI.click(findTestObject('Page_Mettre en place contrat credit/button_Valide'))

'Vérifier que le titre de recapitulation du contrat est égal à "Contrat de crédit" donc vérifier qu\'on est dans la page de recapitulatif du contrat.'
WebUI.verifyElementText(findTestObject('Page_Mettre en place contrat credit/i_Contrat de credit'), 'Contrat de crédit')

'Vérifier que le prenom du client est dans la page de recapitulatif du contrat.'
WebUI.verifyTextPresent(prenom_client, false)

'Vérifier que le nom du client est dans la page de recapitulatif du contrat.'
WebUI.verifyTextPresent(nom_client, false)

WebUI.click(findTestObject('Page_Mettre en place contrat credit/button_Imprime'))

WebUI.delay(5)

'Elle permet de revenir dans l\'onglet de la page de Crédit Auto après avoir cliqué sur le bouton Imprimer.'
WebUI.switchToWindowIndex(0)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Mettre en place contrat credit/button_Enregistre'))

WebUI.verifyElementVisible(findTestObject('Page_Mettre en place contrat credit/div_Contrat cree avec succes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Mettre en place contrat credit/a_Deconnexion'))

WebUI.verifyElementPresent(findTestObject('Page_Mettre en place contrat credit/a_Credit Auto'), 30)

WebUI.closeBrowser()

