package com.personal.javaprgrm;

import java.util.EnumSet;

enum Gfg {
	CODE, LEARN, CONTRIBUTE, QUIZ, MCQ 
}

public class EnumSetLearning {

	
	EnumSet<Gfg> set1  = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE,  
            Gfg.LEARN, Gfg.CODE);

	public static void main(String[] args) {
		EnumSetLearning es = new EnumSetLearning();
		System.out.println(es.set1.contains(Gfg.CONTRIBUTE));
	}
}

