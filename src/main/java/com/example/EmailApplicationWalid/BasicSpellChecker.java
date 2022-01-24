package com.example.EmailApplicationWalid;

import org.springframework.stereotype.Component;

@Component
//@Primary
class BasicSpellChecker implements SpellChecker {



    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking spelling using BasicSpellChecker..."+emailMessage);
            System.out.println("Spell Checking Completed!!"+emailMessage);
        } else {
            throw new RuntimeException("An exception occurred " +
                    "while checking Spelling");
        }
    }


}
