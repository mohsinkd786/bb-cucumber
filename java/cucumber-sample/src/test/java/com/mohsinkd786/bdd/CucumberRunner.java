package com.mohsinkd786.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:features" }, glue = { "com.mohsinkd786.bdd" })
public class CucumberRunner {
}