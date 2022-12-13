package arrayListADT;

public class MainArrayList {

	public static void main(String[] args) {
		ArrayList peces = new ArrayList();
		System.out.println("Peces que puedes tener en un acuario de 20 litros");
		peces.add("Beta");
		peces.add("Guppy");
		peces.add("Dorado");
		peces.add("Luna");
		peces.add("Angel");
		/*for (int i = 1; i <= 100; i++) {
			peces.add("acuario" + i);
		}*/
		for (int i = 0; i < peces.getSize(); i++) {
			System.out.println(peces.get(i));
		}
		System.out.println(peces.getSize());
		peces.remove(3);
		System.out.println(peces.get(3));
		System.out.println(peces.getSize());
	}
}
