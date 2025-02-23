Taller de Programación 

Juan Manuel Diosa Ríos 

 

 

PARTE TEORICA 

 

¿Cuáles son los tipos de datos primitivos en java? 

R// Los tipos de datos primitivos en Java son:  

byte: Un entero de 8 bits, con un rango de -128 a 127 

short: Un entero de 16 bits, con un rango de -32,768 a 32,767 

int: Un entero de 32 bits, con un rango de -2^31 a 2^31-1 

long: Un entero de 64 bits, con un rango de -2^63 a 2^63-1 

float: Un número en coma flotante de precisión simple de 32 bits 

double: Un número en coma flotante de precisión doble de 64 bits 

char: Un solo carácter de 16 bits, que representa caracteres Unicode 

boolean: Representa un valor de verdad, true o false 

Los tipos de datos primitivos son los tipos de datos originales de un lenguaje de programación. Se utilizan para crear variables y asignarles números, caracteres o valores lógicos individuales 

 

¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en java? 

R// Las estructuras de control de flujo if, else, switch y bucles en Java permiten tomar decisiones y repetir acciones, lo que es fundamental para que un programa pueda reaccionar a distintas situaciones.  

Estructuras if-else  

Se utilizan para tomar decisiones basadas en un valor preexistente, si la condición booleana es verdadera, el programa toma un camino, si la condición booleana es falsa, el programa toma otro camino. 

Estructuras switch 

Se puede usar para ejecutar todo el código que encuentre hasta que se termine o hasta que se encuentre un break. El programa saltará a la etiqueta que corresponda al valor que se le dio al switch.  

Estructuras bucles  

Permiten repetir una o varias líneas de código de forma repetitiva. Se pueden repetir las instrucciones de una estructura de bucle hasta que una condición sea True o False. 

Importancia de las estructuras de control de flujo 

Son elementos fundamentales en la construcción de programas dinámicos y adaptables. Permiten modificar el flujo de ejecución de las instrucciones de un programa. Son las encargadas de controlar el flujo de un programa. 

 

¿Por qué es importante usar nombres significativos para variables y métodos? 

 

R// 

Claridad y comprensión 

Un buen nombre describe qué hace o qué representa la variable o método. 

Facilita la lectura del código sin necesidad de comentarios adicionales. 

 

Mantenibilidad 

Si el código es fácil de entender, otros desarrolladores (o tú en el futuro) podrán modificarlo sin esfuerzo. 

Nombres claros reducen el riesgo de cometer errores al hacer cambios. 

 

Facilita la depuración 

Si surge un error, es más fácil identificar el problema si los nombres reflejan bien su propósito. 

 

Evita confusiones y malos entendidos 

Nombres genéricos como temp, data, value pueden ser ambiguos. 

Es mejor ser descriptivo y preciso. 

 

 

 

Facilita el trabajo en equipo 

Un código con nombres claros es más fácil de compartir y entender sin necesidad de explicaciones extra. 

 

 

¿Qué es la Programación Orientada a Objetos (POO)? 

 

R//  

La programación orientada a objetos (POO) es un modelo de programación que organiza el código en torno a objetos, en lugar de funciones y lógica.  

Características de la POO Permite reutilizar el código, Es más fácil detectar errores, Es más flexible y adaptable a nuevas situaciones, Permite crear programas eficientes, Es más sencilla de mantener.  

 

Cómo funciona la POO  

Se crean clases, que son plantillas para la creación de objetos 

Los objetos son estructuras de datos con comportamiento asociado 

Las clases pueden heredar atributos de una superclase 

Los objetos pueden tener un tipo o clase asociado 

Las clases pueden contener funciones llamadas métodos 

Lenguajes de programación orientados a objetos  

Java, C++, PHP, Python, Ruby, ADA. 

 

Ventajas de la POO  

Ayuda a pensar en objetos en lugar de en la lógica pura de los programas 

Permite estructurar un programa de software en piezas simples y reutilizables 

Previene el acceso no deseado a los datos 

 

 

 

 

¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos? 

 

Encapsulamiento 

Protege los datos dentro de un objeto y controla su acceso. 

Se logra mediante modificadores de acceso (public, private, protected). 

 

 

Herencia 

Permite que una clase derive características de otra, promoviendo la reutilización de código. 

 

Polimorfismo 

Permite que diferentes clases usen el mismo método con distintos comportamientos. 

 

Abstracción 

Oculta los detalles innecesarios y muestra solo lo esencial.  

Se usa con clases y métodos abstractos. 

 

 

¿Qué es la herencia en POO y cómo se utiliza en Java? 

R// La herencia es un mecanismo de la Programación Orientada a Objetos (POO) que permite que una clase adquiera los atributos y métodos de otra. Su propósito principal es promover la reutilización de código y facilitar la extensibilidad del software. 

 

En términos simples, una clase hija (subclase) hereda de una clase padre (superclase), adquiriendo sus características y pudiendo agregar o modificar comportamientos. 

 

¿Cómo se usa la herencia en Java? 

En Java, la herencia se implementa usando la palabra clave extends. 

 

 

¿Qué son los modificadores de acceso y cuáles son los más comunes en Java? 

R// Los modificadores de acceso en Java son palabras clave que controlan la visibilidad y el alcance de clases, métodos y atributos dentro de un programa. Permiten definir qué partes del código pueden acceder a ciertas variables o funciones, lo que mejora la seguridad y encapsulación del código. 

 

Tipos de Modificadores de Acceso en Java 

- private (Privado) 

 

Solo es accesible dentro de la misma clase. 

Se usa para ocultar datos y evitar que sean modificados directamente desde fuera. 

Ideal para atributos que solo deben ser manipulados mediante métodos internos. 

 

- (Sin modificador) default (Por defecto o de paquete) 

 

Permite el acceso solo dentro del mismo paquete (grupo de clases relacionadas). 

No se puede acceder desde clases que estén en otros paquetes. 

Útil para funciones o atributos que solo deben ser usados dentro de un módulo específico. 

 

- protected (Protegido) 

 

Permite el acceso dentro del mismo paquete y también desde subclases en otros paquetes. 

Es útil cuando una clase base quiere que sus clases hijas puedan modificar ciertos datos, pero sin hacerlo completamente público. 

 

- public (Público) 

 

Accesible desde cualquier parte del programa. 

Se usa en métodos y clases que deben ser visibles y utilizados por todo el código sin restricciones. 

 

 

¿Qué es una variable de entorno y por qué son importantes para Java o la 

programación en general? 

 

R// Una variable de entorno es un valor clave almacenado en el sistema operativo que influye en el comportamiento de los programas. Estas variables permiten a los programas acceder a información del sistema sin que los valores estén codificados directamente en el software. 

 

 

Importancia de las Variables de Entorno en Java y la Programación 

 

Configuración del Entorno de Desarrollo 

 

En Java, es necesario configurar variables como JAVA_HOME y PATH para que el sistema pueda encontrar el JDK (Java Development Kit) y ejecutar comandos como java o javac. 

Sin estas variables, los comandos de Java no funcionarían en la terminal o línea de comandos. 

 

Seguridad y Flexibilidad 

 

Permiten almacenar credenciales sensibles, como claves API o contraseñas de bases de datos, sin escribirlas en el código fuente. 

Esto mejora la seguridad, ya que evita exponer información confidencial en archivos del proyecto. 

 

Configuración de Aplicaciones 

 

Muchos programas y frameworks (como Spring Boot) usan variables de entorno para definir configuraciones dinámicas, como conexiones a bases de datos o puertos de servidor. 

 

Compatibilidad entre Entornos 

 

Facilitan la ejecución del mismo código en distintos entornos (desarrollo, pruebas, producción) sin modificar el código fuente. 

Por ejemplo, se puede usar una variable APP_ENV para que el sistema sepa si debe ejecutarse en modo desarrollo o modo producción. 
