import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://davidacero.github.io/katalonTrueTest && katalonTrueTest/#"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/katalonTrueTest && katalonTrueTest/')

"Step 2: Click on button 'Shop Now' -> Navigate to page 'katalonTrueTest/#/shop'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_katalonTrueTest/button_shop_now'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalonTrueTest && katalonTrueTest/#?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_katalonTrueTest/button_shop_now'))

"Step 3: Click on button 'Add to cart'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_katalonTrueTest/button_add_to_cart_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalonTrueTest/#/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_katalonTrueTest/button_add_to_cart_1'))

"Step 4: Click on link 'Cart' -> Navigate to page 'katalonTrueTest/#/cart'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_katalonTrueTest/hyperlink_cart'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalonTrueTest/#/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_katalonTrueTest/hyperlink_cart'))

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify Successful Product Addition to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
