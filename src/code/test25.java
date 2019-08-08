package code;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/7
 */

public class test25 {
//    from selenium import webdriver
//    from selenium.webdriver.common.action_chains import ActionChains
//    from selenium.webdriver.support.ui import WebDriverWait
//    from selenium.webdriver.common.by import By
//    from selenium.webdriver.support.ui import WebDriverWait
//    from selenium.webdriver.support import expected_conditions as EC
//    from datetime import datetime, timedelta
//    from time import sleep
//import time
//import requests
//import json
//
//
//            EMAIL = "1099538679@qq.com"
//              PASSWORD = "****"
//
//
//            #时间将24小时制乘以2对应。
//            #例如
//#12:00——24；13:30——27
//
//    startTime = 28
//    endTime = 40
//
//            # startTime = 24
//            # endTime = 36
//            #日期
//#Day是抢的日期在本月日历（5*7或者4*7的矩阵）排第几，例如在2019年一月的日历中含有12.31一天，则1.1号就记作2。
//    Day = 13
//            # 今天是7-15
//    EventTitle = "CQQ"
//
//
//    SECONDS_PER_DAY = 24 * 60 * 60
//
//    def doLogin():
//    browser = webdriver.Chrome()
//            browser.get('https://timetreeapp.com/signin')
//            #登录
//    browser.find_element_by_xpath("//input[@placeholder='邮箱地址']").send_keys(EMAIL)
//    browser.find_element_by_xpath("//input[@placeholder='8~32 个字符的密码']").send_keys(PASSWORD)
//    browser.find_element_by_xpath("//input[@value='登陆']").click()
//
//    #选择日期
//            element = WebDriverWait(browser,30).until(EC.presence_of_element_located(
//            (By.XPATH,'//*[@id="root"]/div/div/div[1]/main/div/div[2]/div[2]/div/div[1]/div[2]/div[5]/div[2]/div[3]/div')))
//    day = browser.find_elements_by_class_name('dayCell')[Day-1]
//            # 双击不知道为啥不行
//    # ActionChains(browser).double_click(day).perform()
//    day.click()
//            day.click()
//            browser.find_element_by_css_selector(".more.clickable").click()
//    #取消全天
//            wholeDay = browser.find_elements_by_class_name("inner")[0]
//    wholeDay.click()
//            #EventTitle
//            eventTitle = browser.find_element_by_xpath('//*[@id="root"]/div/div/div[1]/main/div/div[2]/div[2]/div/div[2]/div[2]/span/div/div/div/div[3]/textarea')
//                                                # //*[@id="root"]/div/div/div[1]/main/div/div[2]/div[2]/div[2]/div[2]/div[2]/span/div/div/div/div[3]/textarea
//
//                                                        eventTitle.send_keys(EventTitle)
//            #开始时间
//    browser.find_elements_by_class_name("bottomButton")[0].click()
//    # browser.find_element_by_xpath('//*[@id="root"]/div/div/div[1]/div[2]/div/div/div/div[1]/div[3]/div/div[2]/div[2]/span/div/div/div/div[4]/div[1]/span/div/div/div[2]/a[33]').click()
//    browser.find_elements_by_css_selector(".clickable.row")[startTime].click()
//
//
//    time.sleep(3)
//            #结束时间
//    # browser.find_element_by_xpath('//*[@id="root"]/div/div/div[1]/main/div/div[2]/div[2]/div[2]/div[2]/div[2]/span/div/div/div/div[4]/div[2]/div[2]/div/div')
//
//            browser.find_elements_by_class_name("bottomButton")[1].click()
//    # browser.find_element_by_xpath('//*[@id="root"]/div/div/div[1]/div[2]/div/div/div/div[1]/div[3]/div/div[2]/div[2]/span/div/div/div/div[4]/div[2]/span/div/div/div[2]/a[41]').click()
//    browser.find_elements_by_css_selector(".clickable.row")[endTime].click()
//
//
//    curTime = datetime.now()
//    print("当前时间:%s" % curTime)
//    desTime = curTime.replace(hour=22, minute=59, second=58, microsecond=300000)
//    print("抢AkTa时间:%s" % desTime)
//    leftTime = desTime - curTime
//
//            sleepSecondSave = leftTime.total_seconds()
//    time.sleep(sleepSecondSave)
//
//    finnalSave = browser.find_elements_by_class_name("withChildren")[1]
//            finnalSave.click()
//
//            time.sleep(60)
//            browser.close()
//    print ("今天已经抢了")
//
//
//    def doFirst():
//
//    curTime = datetime.now()
//    print("当前时间:%s" % curTime)
//    loginTime = curTime.replace(hour=22, minute=58, second=0, microsecond=0)
//    print("登录时间:%s" % loginTime)
//
//    delta = loginTime - curTime
//    print(delta)
//
//    sleepSecondLogin = delta.total_seconds()
//            time.sleep(sleepSecondLogin)
//    doLogin()
//
//
//if __name__ == "__main__":
//    doFirst()

}