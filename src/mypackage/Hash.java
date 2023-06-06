package mypackage;

public class Hash {

	public static int fromString(String busca) {
		
        final int prime = 31;
        int hash = 0;
        
        for (int i = 0; i < busca.length(); i++) {
            hash = prime * hash + busca.charAt(i);
        }
        
        hash ^= (hash >>> 20) ^ (hash >>> 12);
        hash ^= (hash >>> 7) ^ (hash >>> 4);
        
        return hash;
	}

	public static int fromInt(int numero) {
		int hash = 0;

		while (numero != 0) {
			int digit = numero % 10; // Obtém o dígito menos significativo do número
			hash = hash + digit; // Adiciona o dígito ao hash

			numero = numero / 10; // Remove o dígito menos significativo do número
			hash = hash * 10; // Multiplica o hash por 10
		}

		return hash;
	}

	public static int fromFloat(float numero) {
		// Converte o número float para sua representação binária
		int hash = Float.floatToIntBits(numero);
		
        // Aplica uma série de operações de hash
        hash = hash * 31 + (hash >>> 16);
        hash = hash ^ (hash << 3);
        hash = hash + (hash >>> 5);
        hash = hash ^ (hash << 4);
        hash = hash * 2057 ^ (hash >>> 11);
        
		return hash;
	}
}
