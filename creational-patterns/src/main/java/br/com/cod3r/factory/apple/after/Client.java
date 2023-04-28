package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.model.*;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = client.orderIPhone("X", "standart");
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = client.orderIPhone("11", "highEnd");
		System.out.println(iPhone2);
	}

	public IPhone orderIPhone(String generation, String level){
		IPhone device = null;

		if (generation.equals("X")) {
			if (level.equals("standart")) {
				device = new IPhoneX();
			} else if (level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if (generation.equals("11")) {
			if (level.equals("standart")) {
				device = new IPhone11();
			} else if (level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}
}
