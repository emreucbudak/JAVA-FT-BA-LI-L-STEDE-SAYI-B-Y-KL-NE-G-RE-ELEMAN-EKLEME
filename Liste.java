package yeni1;

public class Liste {
	Bagli on = null;
	Bagli arka = null;
	void elemanEkle(int a) {
		Bagli eleman = new Bagli();
		eleman.veri = a;
		if(on==null) {
			on = eleman;
			arka = eleman;
		}
		else if (eleman.veri>arka.veri) {
			arka.next = eleman;
			arka = eleman;
			eleman.prev = arka;
		}
		else {
			Bagli ref = on;
			while (ref!= null) {
				if(eleman.veri>ref.veri) {
					ref = ref.next;
				}
				else {
					if(eleman.veri<on.veri) {
						eleman.next = on;
						on.prev = eleman;
						on = eleman;
					}
					else {
						ref.prev.next = eleman;
						eleman.prev = ref.prev;
						eleman.next = ref;
						ref.prev = eleman;
						
						System.out.println(eleman.veri);
					}
					break;
				}
			}
		}
	}
	void yazdir() {
		Bagli ref2 = on;
		while(ref2 != null) {
			System.out.println("Girilen Sayı --------->" + ref2.veri);
			ref2 = ref2.next;
		}
	}

}
