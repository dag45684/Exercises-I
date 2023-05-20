package rnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

//Clase. Tambien lo conoces como objeto. Normalmente lo defines en otro archivo
//Te lo creo como ejemplo para que lo veas abajo, y para que te acuerdes de sus movidas
//Acuerdate que esto te sirve para almacenar como un unico objeto un conjunto de variables de distintos TIPOS 
//que despues puedes utilizar en colecciones, o averiguar lo que te interese con sus get() y set()
class Objeto {
	
	//Atributos. Lo que define un objeto. Puede contener otros objetos, colecciones(intenta evitarlo), e incluso a si mismo(tambien evitalo si puedes)
	//puedes darles valores directamente
	int ruedas=4;
	char contaminacion;
	String nombre;
	ArrayList<Objeto> modelosViejos;
	
	//Constructor. Entre parentesis lo que recibe, que coincide en orden y tipo con lo que 
	//tienes que poner cuando haces un "... = new Objeto(.......);". Puede haber varios incluso puede haber uno vacio
	public Objeto(char contaminacion, String nombre) {
		this.nombre=nombre;
		this.contaminacion=contaminacion;
	}
	
	//Aqui defines los metodos. Puedes hacer lo que quieras en ellos, acuerdate de hacer return del mismo TIPO que pones en el metodo. 
	//Si no quieres devolver nada, solo quieres que realice una accion, usa void
	public void setRuedas(int n) {
		this.ruedas=n; //Acuerdate del uso del this. Siempre que vayas a cambiar una propiedad del objeto en el que estas, usa this.
		//sin return
	}
	
	public int ruedastriple( ) {
		int triple = ruedas * 3;
		return triple;
	}
	
}

public class Nu {

	public static void main(String[] args) throws IOException {
		
		//Tipos primitivos
		int i = 1;
		char c = 'c';
		double d = 1.2345d; // acuerdate de poner las d en los double y las f en los float
		float f = 3.9f;
		boolean b = false;
		String s = "hola"; //En realidad es un objeto, no te confundas con esto
		
		//Tipos primitivos cuando necesitas que sean objetos
		Integer a = 1;
		Character ch = 'a';
		Double db = 2.3456d;
		Boolean bo = true;
		
		//Objetos
		Objeto obj = new Objeto('g', "Holi");
		
		//Bucles
		for (int indice=0; indice<3; i++) { //Ten en cuenta lo que pasa si empiezas en 0.
			System.out.println("Hola Nu");
		}
		
		while (b) { //solo corre mientras el parentesis sea cierto (b==false aqui).
			System.out.println("Esto no imprime");
			// Para salir de ellos pon condiciones que hagan que el parentesis sea false, o usa un break;
		}
		
		//Cosas que sueles usar
		//Esto solo es inicializar. Luego puedes comprobar lo que haga cada uno 
		//poniendo su NOMBRE, un punto, y mirando la lista de opciones que te ensena eclipse.
		//Tanto para cosas raras como para colecciones. Si tienes alguna duda de que metodo se usa PIDELE LA DOCU A JULIO
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in); //puedes cambiar system in por un string que quieras analizar, por ejemplo. 
		int random = (int) (Math.random() * 100) + 1; // multiplica por (numero maximo - numero minimo) y sumale numero minimo despues. Pon bien los parentesis.
		int leerNumero = Integer.parseInt(br.readLine()); //Si no metes un numero te peta el programa. 
		//Puedes usar un string en lugar del buffered reader
		//simplemente te convierte un string a numero
		
		//Colecciones
		//arrays. Sustituye int por el TIPO que quieras. Necesitas darle un tamano, 10 en este caso
		int[] arr = new int[10];
		
		//ArrayList. Parecido al Array, pero no necesitas saber un tamano. Solo admite objetos.
		ArrayList<Integer> arli = new ArrayList<>();
		
		//Map. Como un diccionario, tienes una clave por la que buscas, y esa clave puede tener almacenado lo que quieras
		//ya sean ints, objetos, o incluso otras colecciones. P.ej. tu clave es un char a y su contenido es un arraylist de palabras que empiezan por a
		Map<Integer, String> mapaSencillito = new HashMap<>(); //como es un hash, estara desordenado
		Map<Character, ArrayList<String> > mapaComplicadete = new TreeMap<>(); //como es un tree, estara ordenado
		
		//Sets. Cuando no quieres que los valores se puedan repetir. 
		//Si hay un valor identico a otro, no lo mete, pero tampoco rompe el programa
		Set<String> hs = new HashSet<>(); 
		
		//Pilas(Stack) y colas(Queue)
		Stack<Integer> stk = new Stack<>(); //la pila de libros. Lo ultimo que hayas puesto, es lo primero que sale.
		Queue<Integer> que = new LinkedList<>(); //la cola del super. Lo ultimo que hayas metido, es lo ultimo que sale. NO uses PriorityQueue.
		
		//Llamar a un metodo. Acuerdate que si no es void, tienes que ASIGNARSELO A ALGO, no puedes poner solo la llamada
		double resultado = calcularCosas(4, 6);
		//Cuando llamas a metodos DE OBJETOS recuerda que primero tienes que nombrar al objeto y poner un punto.
		obj.setRuedas(999);
		
		//hacer algo con todas las cosas de una coleccion
		arli.forEach( e -> System.out.println(e)); //PorCada e(lemento) de arli, haz esto -> en este caso sysout de e(lemento), pero puedes hacer cosas mas dificiles
		
		//pijadas que te fallan
		
		//renovar el valor de algo. Este codigo ES VALIDO
		int yay = 100;
		yay += 20; //suma 20
		yay = yay + (yay/2); //ahora yay vale su valor anterior + la mitad de su valor anterior (280).
		
		//Restar porcentaje: multiplicas por cero coma y el porcentaje a restar
		double me = 100 * 0.25f;
		
		//Sumar porcentaje: multiplicas por uno coma y el porcentaje a sumar
		double ma = 100 * 1.39f;
		
		//declara las cosas ANTES de necesitarlas y FUERA de los bucles si no quieres que desaparezcan
		//cuando haces un if, si quieres comparar dos cosas, usa DOS IGUALES. Un solo igual, asigna valores.
		int mi=0; //declaracion antes del if
		if (me == ma) { //comparacion
			mi = 1; //asignacion
		}
		System.out.println(mi);

	}
		
		//Metodos. Trozos de codigo que te interesa poder ejecutar. Tienen que ir FUERA del main(String args[])
	public static double calcularCosas (int a, int b) {
		double c = Math.pow(a, 2); //potencias. Primer numero elevado al segundo
		double d = Math.sqrt(b); //raices cuadradas.
		return c + d;
	}

}
