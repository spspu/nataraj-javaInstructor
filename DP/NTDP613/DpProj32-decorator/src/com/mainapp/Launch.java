package com.mainapp;

import com.mainapp.components.ButterScotchIceCream;
import com.mainapp.components.IceCream;
import com.mainapp.decorator.ChocoChipsDecorator;
import com.mainapp.decorator.DryFruitDecorator;
import com.mainapp.decorator.HoneyDecorator;

public class Launch {
	
	public static void main(String[] args) {
		System.out.println("====== Case1: Eating plain ButterScotchIceCream ========);");
		IceCream cream=new ButterScotchIceCream();
		cream.prepare();
		
		System.out.println("====== Case2: Eating honey ButterScotchIceCream ========);");
		IceCream cream1=new HoneyDecorator(new ButterScotchIceCream());
		cream1.prepare();
		
		System.out.println("====== Case3: Eating Dryfruit honey ButterScotchIceCream ========);");
		IceCream cream2=new ChocoChipsDecorator(new DryFruitDecorator(new HoneyDecorator(new ButterScotchIceCream())));
		cream2.prepare();
	}
}
