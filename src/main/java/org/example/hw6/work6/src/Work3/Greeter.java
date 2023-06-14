package org.example.hw6.work6.src.Work3;

// Два метода в одном классе.

public class Greeter extends SetFormality{

    public String greet() {
        switch (this.formality) {
            case "formal":
                return "Good evening, sir.";
            case "casual":
                return "Sup bro?";
            case "intimate":
                return "Hello Darling!";
            default:
                return "Hello.";
        }
    }

}

abstract class SetFormality{
    String formality;

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
