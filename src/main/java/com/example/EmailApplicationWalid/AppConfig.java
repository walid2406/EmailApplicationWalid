package com.example.EmailApplicationWalid;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    //creation de methode d instanciation
    //add bean annotation
    @Bean("basicSpellChecker")
    BasicSpellChecker createBasicSpellChecker(){
        return new BasicSpellChecker();
    }

    @Bean("advancedSpellChecker")
    AdvancedSpellChecker createAdvancedSpellChecker(){
        return new AdvancedSpellChecker();
    }

    /*@Bean("emailClient")
    EmailClient createEmailClient(){

        // pour injection par constructeur 2 et 1
        return new EmailClient(createAdvancedSpellChecker());
    }
*/

    @Bean("emailClient")
    EmailClient createEmailClient(){

        // pour injection par setter 3
        EmailClient emailClient= new EmailClient();
        //en utilisant set injection
        emailClient.setSpellChecker(createAdvancedSpellChecker());
        return emailClient;
    }



}
