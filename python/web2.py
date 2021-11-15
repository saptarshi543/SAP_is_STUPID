"""working...
success...."""
from selenium import webdriver
import webbrowser
import time
def delay():
    time.sleep(3)
DRIVER_PATH='E:/dap/msedgedriver.exe'
driver=webdriver.Edge(executable_path=DRIVER_PATH)
driver.get('https://www.apple.com/in/')
driver.find_element_by_xpath('//*[@id="ac-globalnav"]/div/ul[2]/li[2]/a').click()#mac
delay()
driver.find_element_by_xpath('//*[@id="ac-globalnav"]/div/ul[2]/li[7]/a').click()#music
delay()
driver.find_element_by_xpath('//*[@id="ac-gn-firstfocus"]').click()
delay()
driver.find_element_by_xpath('//*[@id="ac-globalnav"]/div/ul[2]/li[4]/a').click()
print("done...")