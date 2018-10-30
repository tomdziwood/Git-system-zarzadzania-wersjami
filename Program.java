public class Hello{
	//metoda nic nie zwraca
	public void metoda1(){
		System.out.println("Ta metoda nic nie zwraca");
	}

	public int trzy(){
		return 3; // ta metoda zwraca liczbę 3
	}

	public int suma(int a, int b){
		return a+b;  //ta metoda zwraca sumę dwóch parametrów
	}
	
  public static void main(String[] args){
    System.out.print("Hello World");
  }
}