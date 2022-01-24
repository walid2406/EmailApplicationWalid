package com.example.EmailApplicationWalid;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
// @Scope("prototype") ne convient pas avec lifecycle hooks
//so implimant other class such as initilazinBean and DisposobleBean
public class AdvancedSpellChecker implements SpellChecker, InitializingBean, DisposableBean  {




    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            // Determining the Language of the email Message
            // Check grammatical errors in the email Message
            // Check spellings in the email Message
            System.out.println("Checking Spelling using Advanced Spell Checker..");
            System.out.println("Spell Checking Completed!!");


        } else {
            throw new RuntimeException("An exception occurred while checking Spelling");
        }
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Distroyed proprety ok ok walid");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("setting  property after bean is initialised  walid");

    }
}
