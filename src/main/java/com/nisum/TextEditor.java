package com.nisum;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor() {
        System.out.println("TextEditor default constructor called.");
    }

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        System.out.println("TextEditor parameterized constructor called.");
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
