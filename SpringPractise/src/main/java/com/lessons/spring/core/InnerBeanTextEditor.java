package com.lessons.spring.core;

public class InnerBeanTextEditor {

	private InnerBeanSpellChecker spellChecker;

	public InnerBeanSpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(InnerBeanSpellChecker spellChecker) {
		System.out.println("Injecting SpellChecker...");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}

