import time
import webbrowser
from selenium import webdriver
def sleep():
	time.sleep(3)
DRIVER_PATH='E:/dap/msedgedriver.exe'
driver=webdriver.Edge(executable_path=DRIVER_PATH)
driver.get('https://account.microsoft.com/account')
sleep()
driver.find_element_by_xpath('//*[@id="signinlinkhero"]').click()#sign in button..
sleep()
email=driver.find_element_by_xpath('//*[@id="i0116"]')#find input text
email.send_keys("ssaapp543@outlook.com")#enter text
sleep()
driver.find_element_by_xpath('//*[@id="idSIButton9"]').click()
sleep()
password=driver.find_element_by_xpath('//*[@id="i0118"]')#find input text
password.send_keys("God almighty")#enter text
driver.find_element_by_xpath('//*[@id="idSIButton9"]').click()
#working...
#success....
#automatically logs in with id and password..