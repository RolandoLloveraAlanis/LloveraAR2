

## ¿QUE ES JAVA THREAD SCHEDULER?
<hr></hr>

<p>Java tiene un "Scheduler", lo que viene siendo una lista de procesos que monitoriza todos los hilos que se están ejecutando en todos los programas y decide cuales deben ejecutarse y cuales deben encontrarse preparados para su ejecución. Hay dos características importantes de los hilos que el scheduler identifica en este proceso de decisión. La primera, que es la más importante, es la prioridad del hilo de ejecución; la segunda, es el indicador de dominio. La regla básica del scheduler es que si solamente hay hilos dominio ejecutándose, la Máquina Virtual Java (JVM) concluirá. Los nuevos hilos heredan la prioridad y el indicador de dominio de los hilos de ejecución que los han creado. El scheduler determina qué hilos deberán ejecutarse comprobando la prioridad de todos ellos, aquellos con prioridad más alta dispondrán del procesador antes de los que tienen prioridad más baja. </p>
<p>El scheduler puede seguir dos patrones, preemptivo y no-preemptivo. Los schedulers preemtivosproporcionan un segmento de tiempo a todos los hilos que están corriendo en el sistema. El Scheduler decide cual será el siguiente hilo a ejecutarse y llama al método resume() para darle vida durante un período fijo de tiempo. Cuando el hilo ha estado en ejecución ese período de tiempo, se llama a suspend() y el siguiente hilo de ejecución en la lista de procesos será relanzado (resume()). Los schedulers no-preemtivos deciden que hilo debe correr y lo ejecutan hasta que concluye. El hilo tiene control total sobre el sistema mientras esté en ejecución. El método yield() es la forma en que un hilo fuerza al scheduler a comenzar la ejecución de otro hilo que esté esperando. Dependiendo del sistema en que esté corriendo Java, el scheduler será de un tipo u otro, preemtivo o no-preemptivo.</p>

<br></br>

