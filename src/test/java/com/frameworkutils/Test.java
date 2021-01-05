package com.frameworkutils;

import java.io.IOException;
import java.net.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test extends WebUtilities {


    public static void main(String[] args) throws Exception {
        // Launch The Browser
        WebUtilities.launchBrowser("chrome", "https://www.hyrtutorials.com/");

        Thread.sleep(5000);

        Set<String> brokenLinkUrls = new HashSet<String>();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (WebElement link : links) {
            String linkURL = link.getAttribute("href");
            //Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("hostname", 80));
            URL url = new URL(linkURL);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() != 200) {
                brokenLinkUrls.add(linkURL);
               // System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage());

            }
 //           else {
 //               System.err.println(linkURL + " - " + httpURLConnection.getResponseCode() + " - " + httpURLConnection.getResponseMessage());

                httpURLConnection.disconnect();
                //           }


            }
 //          driver.quit();
        for (String brokenLinkUrl : brokenLinkUrls) {
            System.err.println(brokenLinkUrl);
        }
        }
    }



