package it.stiglianostudio.scadenziario.cucumber.stepdefs;

import it.stiglianostudio.scadenziario.ScadenziarioApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ScadenziarioApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
