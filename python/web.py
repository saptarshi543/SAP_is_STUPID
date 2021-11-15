import webbrowser
from selenium import webdriver
DRIVER_PATH='E:\dap\msedgedriver.exe'
driver=webdriver.Edge(executable_path=DRIVER_PATH)
driver.get('https://www.programiz.com/')
driver.find_element_by_xpath('/html/body/main/header/nav/div/div/div[2]/a[2]').click()
#working.........
#success...........
#it opens edge web browser and goes to programmiz 
#then it automatically clicks on examples...