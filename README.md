Ejercicio 17 - Generador Central de Números de Atención

Explicación del programa

En este ejercicio se creó una clase llamada GeneradorTurnos que aplica el patrón Singleton para centralizar la emisión consecutiva de números de atención en el hospital, evitando números repetidos entre las diferentes terminales y sin utilizar librerías externas ni imports.
La clase cuenta con:
- Una variable estática privada llamada instancia.
- Atributos privados para el contador (ultimoNumero), arreglos para el historial (numeros y terminales) y un control de total.
- Un constructor privado que inicializa los valores por defecto.
- Un método estático público llamado getInstancia() que devuelve siempre la misma referencia única.
- Métodos públicos para generar números consecutivos registrando su terminal de origen, consultar el último número sin incrementar el contador y mostrar el historial completo.

Luego, dentro del método main, se simulan las tres terminales obteniendo referencias al Singleton:
GeneradorTurnos terminal1 = GeneradorTurnos.getInstancia();
GeneradorTurnos terminal2 = GeneradorTurnos.getInstancia();
GeneradorTurnos terminal3 = GeneradorTurnos.getInstancia();

Finalmente, se utilizó System.out.println() para comprobar que todas las terminales comparten la misma instancia, simular 20 solicitudes alternadas de forma secuencial sin duplicados, consultar el último número y desplegar el historial.

Lógica utilizada

La lógica del programa consiste en:
- Restringir la creación de objetos externos mediante un constructor privado.
- Controlar el acceso global a través de getInstancia() asegurando que todas las terminales interactúen con el mismo contador centralizado.
- Almacenar de forma protegida cada número emitido junto con la identificación de la terminal solicitante.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Es la misma instancia en las 3 terminales?: true
Simulando 20 solicitudes alternadas...

Número emitido: 1 (Solicitado por: Terminal-1)
Número emitido: 2 (Solicitado por: Terminal-2)
Número emitido: 3 (Solicitado por: Terminal-3)
Número emitido: 4 (Solicitado por: Terminal-1)
...
Número emitido: 20 (Solicitado por: Terminal-2)

Último número emitido (sin incrementar contador): 20

--- Historial de Números Entregados ---
Número: 1 - Terminal: Terminal-1
Número: 2 - Terminal: Terminal-2
...
Número: 20 - Terminal: Terminal-2

Captura de pantalla

<img width="682" height="745" alt="image" src="https://github.com/user-attachments/assets/57cc8884-72f7-47e3-83e2-56142abe5ed8" />
<img width="648" height="720" alt="image" src="https://github.com/user-attachments/assets/efaf0446-47e9-4ee7-814e-5a39d0e6f28a" />

