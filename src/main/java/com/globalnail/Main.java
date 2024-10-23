package com.globalnail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        Câu lệnh này báo với máy ảo java có 1 tool bên ngoài
//        tên là chromedriver.exe sẽ được import vào máy ảo,
//        với tên gọi là webdriver.chrome.driver
//        đây là cách 1 loạt class nằm trong file chromedriver.exe
//        Sẽ được selenium gọi

        WebDriver myBrowser = new C;

    }
}