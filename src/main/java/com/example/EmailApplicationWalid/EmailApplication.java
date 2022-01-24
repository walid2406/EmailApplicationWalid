package com.example.EmailApplicationWalid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class EmailApplication {

    public static void main(String[] args) {

        //****1  et 2 en utilisant constructor injection

       /*   1*****injection en utilisant un fichier xml
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        EmailClient emailClient=applicationContext.getBean("emailClient",EmailClient.class);*/

        //2********* en utilisant une classe de configuration par annotation Bean
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        EmailClient emailClient=applicationContext.getBean("emailClient",EmailClient.class);

        //******************* en utilisant setter injection *********************
        // modification de la AppConfig bean creation de emailClient





//  injection moyennant le constructeur        EmailClient emailClient=new EmailClient(new BasicSpellChecker());
        emailClient.sendEmail("first message");
        emailClient.sendEmail("second message");
        System.out.println("oooooooooo");


        // Bean Scopes affichage des scopes
        AdvancedSpellChecker advancedSpellChecker = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
        System.out.println(advancedSpellChecker);
        AdvancedSpellChecker advancedSpellChecker1 = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
        System.out.println(advancedSpellChecker1);

        ((AnnotationConfigApplicationContext) applicationContext).registerShutdownHook();


    }

}
