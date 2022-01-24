package com.example.EmailApplicationWalid;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.EmailApplicationWalid")
public class AppConfig {
/* lors utilisation scan pas de bean seron cree automatiquement


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
* 1/

    @Bean("emailClient")
    EmailClient createEmailClient(){

        // pour injection par setter 3
        EmailClient emailClient= new EmailClient();
        //en utilisant set injection
        emailClient.setSpellChecker(createAdvancedSpellChecker());
        return emailClient;
    }

 */

}
