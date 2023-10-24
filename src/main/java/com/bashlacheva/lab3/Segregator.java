package main.java.com.bashlacheva.lab3;

import java.util.Collection;
import main.java.com.bashlacheva.lab3.model.*;

public class Segregator {
	
	static void segregate(Collection<? extends Chordata> srcCollection,
						  Collection<? super CommonHedgehog> collection1,
						  Collection<? super Manul> collection2,
						  Collection<? super Lynx> collection3) {
		
		for (Chordata chordata : srcCollection) {
			if (chordata.getClass() == CommonHedgehog.class) {
				collection1.add((CommonHedgehog) chordata);
			}
			else if (chordata.getClass() == Manul.class) {
				collection2.add((Manul) chordata);
			}
			else if (chordata.getClass() == Lynx.class) {
				collection3.add((Lynx) chordata);
			}
		}
	}
}