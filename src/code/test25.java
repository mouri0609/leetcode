package code;

/**
 * @Author: Agile����Mouri
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
//            #ʱ�佫24Сʱ�Ƴ���2��Ӧ��
//            #����
//#12:00����24��13:30����27
//
//    startTime = 28
//    endTime = 40
//
//            # startTime = 24
//            # endTime = 36
//            #����
//#Day�����������ڱ���������5*7����4*7�ľ����ŵڼ���������2019��һ�µ������к���12.31һ�죬��1.1�žͼ���2��
//    Day = 13
//            # ������7-15
//    EventTitle = "CQQ"
//
//
//    SECONDS_PER_DAY = 24 * 60 * 60
//
//    def doLogin():
//    browser = webdriver.Chrome()
//            browser.get('https://timetreeapp.com/signin')
//            #��¼
//    browser.find_element_by_xpath("//input[@placeholder='�����ַ']").send_keys(EMAIL)
//    browser.find_element_by_xpath("//input[@placeholder='8~32 ���ַ�������']").send_keys(PASSWORD)
//    browser.find_element_by_xpath("//input[@value='��½']").click()
//
//    #ѡ������
//            element = WebDriverWait(browser,30).until(EC.presence_of_element_located(
//            (By.XPATH,'//*[@id="root"]/div/div/div[1]/main/div/div[2]/div[2]/div/div[1]/div[2]/div[5]/div[2]/div[3]/div')))
//    day = browser.find_elements_by_class_name('dayCell')[Day-1]
//            # ˫����֪��Ϊɶ����
//    # ActionChains(browser).double_click(day).perform()
//    day.click()
//            day.click()
//            browser.find_element_by_css_selector(".more.clickable").click()
//    #ȡ��ȫ��
//            wholeDay = browser.find_elements_by_class_name("inner")[0]
//    wholeDay.click()
//            #EventTitle
//            eventTitle = browser.find_element_by_xpath('//*[@id="root"]/div/div/div[1]/main/div/div[2]/div[2]/div/div[2]/div[2]/span/div/div/div/div[3]/textarea')
//                                                # //*[@id="root"]/div/div/div[1]/main/div/div[2]/div[2]/div[2]/div[2]/div[2]/span/div/div/div/div[3]/textarea
//
//                                                        eventTitle.send_keys(EventTitle)
//            #��ʼʱ��
//    browser.find_elements_by_class_name("bottomButton")[0].click()
//    # browser.find_element_by_xpath('//*[@id="root"]/div/div/div[1]/div[2]/div/div/div/div[1]/div[3]/div/div[2]/div[2]/span/div/div/div/div[4]/div[1]/span/div/div/div[2]/a[33]').click()
//    browser.find_elements_by_css_selector(".clickable.row")[startTime].click()
//
//
//    time.sleep(3)
//            #����ʱ��
//    # browser.find_element_by_xpath('//*[@id="root"]/div/div/div[1]/main/div/div[2]/div[2]/div[2]/div[2]/div[2]/span/div/div/div/div[4]/div[2]/div[2]/div/div')
//
//            browser.find_elements_by_class_name("bottomButton")[1].click()
//    # browser.find_element_by_xpath('//*[@id="root"]/div/div/div[1]/div[2]/div/div/div/div[1]/div[3]/div/div[2]/div[2]/span/div/div/div/div[4]/div[2]/span/div/div/div[2]/a[41]').click()
//    browser.find_elements_by_css_selector(".clickable.row")[endTime].click()
//
//
//    curTime = datetime.now()
//    print("��ǰʱ��:%s" % curTime)
//    desTime = curTime.replace(hour=22, minute=59, second=58, microsecond=300000)
//    print("��AkTaʱ��:%s" % desTime)
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
//    print ("�����Ѿ�����")
//
//
//    def doFirst():
//
//    curTime = datetime.now()
//    print("��ǰʱ��:%s" % curTime)
//    loginTime = curTime.replace(hour=22, minute=58, second=0, microsecond=0)
//    print("��¼ʱ��:%s" % loginTime)
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