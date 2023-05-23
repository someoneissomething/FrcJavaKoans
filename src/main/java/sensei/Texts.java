package sensei;

import static engine.Localizable.local;

import engine.Local;

public class Texts {

    static final Local<String> IN_5_YEARS_YOU_WILL_BE = 
        local("In 5 years from now, you will be %s.")
        .fr("Dans 5 ans, tu auras %s.");
    static final Local<String> IN_10_YEARS_YOU_WILL_BE = 
        local("In 10 years from now, you will be %s.")
        .fr("Dans 10 ans, tu auras %s.");
    static final Local<String> IN_20_YEARS_YOU_WILL_BE = 
        local("In 20 years from now, you will be %s.")
        .fr("Dans 20 ans, tu auras %s.");
    static final Local<String> YOUR_NAME_IS_AND_YOUR_AGE_IS = 
        local("Your name is %s and your age is %s.")
        .fr("Ton nom est %s et ton âge est %s.");
    static final Local<String> WHAT_IS_YOUR_AGE = 
        local("What is your age?")
        .fr("Quel est ton âge?");
    static final Local<String> YOUR_NAME_IS = 
        local("Your name is:")
        .fr("Ton nom est:");
    static final Local<String> WHAT_IS_YOUR_NAME = 
        local("What is your name?")
        .fr("Quel est ton nom?");

    static final Local<String> POSITIVE = 
        local("positive")
        .fr("positif");
    static final Local<String> NEGATIVE = 
        local("negative")
        .fr("négatif");
    static final Local<String> ZERO = 
        local("zero")
        .fr("zéro");
    static final Local<String> YOU_CHEAT = 
        local("You cheat!")
        .fr("Tu triches!");
    static final Local<String> GOT_EVERYTHING_RIGHT = 
        local("Congratulations! You got everything right!")
        .fr("Bravo, tu as tout bon!");        
    static final Local<String> OOPS = 
        local("Oops!")
        .fr("Ouch!");
    static final Local<String> YOU_FAILED = 
        local("You failed!")
        .fr("Échec!");        
    static final Local<String> YOU_PASS = 
        local("Congratulations! You pass!")
        .fr("Bravo, tu passes!"); 
}
