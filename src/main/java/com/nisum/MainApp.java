package com.nisum;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-servlet.xml");

        System.out.println("\n--- Constructor Injection ---");
        TextEditor editor = context.getBean("textEditorConstructor", TextEditor.class);
        editor.spellCheck();

        System.out.println("\n--- Setter Injection ---");
        TextEditor editor2 = context.getBean("textEditorSetter", TextEditor.class);
        editor2.spellCheck();
    }
}
