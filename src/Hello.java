public class Hello { 
	 public static void main(String[] args) {
		 //inteiros
		 
	        // Variável do tipo int: Armazena números inteiros de 32 bits
	        int varInt = 10;
	        System.out.println("Variável do tipo int: Utilizada para armazenar números inteiros, como contadores, índices, ou valores inteiros em geral. Pode representar valores positivos e negativos. Evite usar int quando a precisão for crítica ou quando precisar de números inteiros muito grandes ou muito pequenos.");

	        // Variável do tipo long: Armazena números inteiros maiores de 64 bits
	        long varLong = 999999999999999L;
	        System.out.println("Variável do tipo long: Semelhante ao int, mas é usado quando se precisa de um espaço maior para armazenar números inteiros muito grandes. Use long quando int não for suficiente para a faixa de valores que você precisa representar.");

	        // Variável do tipo short: Armazena números inteiros de 16 bits
	        short varShort = 3000;
	        System.out.println("Variável do tipo short: Utilizada para economizar espaço de armazenamento quando você sabe que os valores armazenados serão pequenos. No entanto, tenha cuidado, pois valores maiores do que 32.767 podem causar estouro. Normalmente, é mais comum usar int para números inteiros.");

	        // Variável do tipo byte: Armazena números inteiros pequenos de 8 bits
	        byte varByte = 127;
	        System.out.println("Variável do tipo byte: Usada quando a economia de espaço é crítica e você tem certeza de que os valores serão muito pequenos. Pode ser útil, por exemplo, para armazenar dados binários. No entanto, como o intervalo é limitado (-128 a 127), tenha cuidado ao usá-lo para outros fins.");
	        
	        // Variável do tipo float: Armazena números de ponto flutuante de 32 bits
	        float varFloat = 39.00f;
	        System.out.println("Variável do tipo float: Usada para representar números de ponto flutuante com uma precisão moderada. Útil para economizar memória ao armazenar números decimais não muito grandes. Não é apropriada para precisão crítica, como cálculos financeiros.");

	        // Variável do tipo double: Armazena números de ponto flutuante de 64 bits
	        double varDouble = 3.2435435243523;
	        System.out.println("Variável do tipo double: Usada para representar números de ponto flutuante com alta precisão. É o tipo de ponto flutuante padrão em Java e é adequado para a maioria das aplicações que envolvem cálculos com números decimais.");

	        // Variável do tipo boolean: Armazena valores booleanos (true ou false)
	        boolean varBool; 
	        if (varFloat > 40.00f) {
	            varBool = true;
	            System.out.println(varBool);
	        } else {
	            varBool = false;
	            System.out.println(varBool);
	        }

	        // Variável do tipo char: Armazena um único caractere Unicode
	        char varChar = 'b';
	        System.out.println("Variável do tipo char: Usada para representar caracteres individuais. É limitada a um único caractere e é útil quando se precisa armazenar ou manipular caracteres em um programa.");

	        // Variável do tipo String: Armazena uma sequência de caracteres
	        String varString = "eu gosto de café";
	        System.out.println("Variável do tipo String: Usada para representar sequências de caracteres. É amplamente utilizada para manipular texto em Java e é flexível para trabalhar com cadeias de caracteres de diferentes tamanhos e conteúdos.");
	    }
	}

