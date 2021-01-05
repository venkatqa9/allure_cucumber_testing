package com.frameworkutils;

import com.github.javafaker.Faker;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Locale;

import com.github.javafaker.Faker;

 public class FakerData {
  private Faker faker;

  public FakerData(){

   faker = new Faker();
  }

  public String getPersonFirstName(){
   return faker.name().firstName();
  }

  public String getPersonLastName(){
   return faker.name().lastName();
  }

  public String getAddress()
  {
   return faker.address().fullAddress();
  }

  public String getEmailAddress(){ return  faker.internet().emailAddress();}



 }