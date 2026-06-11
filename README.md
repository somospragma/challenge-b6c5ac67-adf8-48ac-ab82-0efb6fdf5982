# Implementación de un Sistema de Procesamiento de Eventos Reactivo

En el ámbito de la banca, se requiere un sistema que procese eventos de transacciones financieras provenientes de múltiples fuentes (canales de pago, sistemas de monitoreo, alertas de fraude) y mantenga un alto nivel de resiliencia, escalabilidad y confiabilidad. El sistema debe manejar flujos de eventos de manera eficiente, asegurando que cada evento sea procesado correctamente y que los errores sean manejados de forma adecuada.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del Entorno de Eventos

**Objetivo:** Establecer un entorno que reciba y procese eventos de múltiples fuentes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar y configurar las fuentes de eventos.
- Implementar un mecanismo para recibir y almacenar temporalmente los eventos.

**Entregable:** Entorno configurado que recibe y almacena eventos de múltiples fuentes.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar la ingesta de eventos de diferentes orígenes.
- Piensa en la estructura de datos adecuada para almacenar eventos temporalmente.

</details>

### Fase 2: Procesamiento de Eventos

**Objetivo:** Implementar la lógica para procesar los eventos recibidos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Desarrollar operadores que transformen y filtren los eventos según las necesidades del negocio.
- Asegurar que el procesamiento de eventos sea idempotente y resiliente a fallos.

**Entregable:** Operadores implementados que transforman y filtran eventos, asegurando idempotencia y resiliencia.

<details>
<summary>Pistas de conocimiento</summary>

- Explora diferentes operadores de Project Reactor para transformar y filtrar eventos.
- Considera cómo manejar errores y asegurar la idempotencia en el procesamiento de eventos.

</details>

### Fase 3: Manejo de Errores y Resiliencia

**Objetivo:** Implementar mecanismos para manejar errores y asegurar la resiliencia del sistema.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Desarrollar estrategias para manejar diferentes tipos de errores en el procesamiento de eventos.
- Implementar mecanismos de reintento y retroceso en caso de fallos.
- Asegurar que el sistema pueda recuperarse de fallos sin pérdida de datos.

**Entregable:** Mecanismos implementados para manejar errores, reintentos y recuperación de fallos en el procesamiento de eventos.

<details>
<summary>Pistas de conocimiento</summary>

- Explora diferentes estrategias para manejar errores en flujos de eventos.
- Considera cómo implementar reintentos y retroceso en caso de fallos.
- Piensa en cómo asegurar que el sistema pueda recuperarse de fallos sin pérdida de datos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los operadores de Project Reactor y cómo se utilizan en el procesamiento de eventos?
- **paraQueSirve**: ¿Para qué sirve la idempotencia en el procesamiento de eventos y cómo se asegura?
- **comoSeUsa**: ¿Cómo se implementan mecanismos de reintento y retroceso en el procesamiento de eventos?
- **erroresComunes**: ¿Cuáles son los errores comunes en el procesamiento de eventos y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica asegurar la resiliencia y confiabilidad del sistema en el procesamiento de eventos?

## Criterios de Evaluacion

- Configuración de un entorno que recibe y almacena eventos de múltiples fuentes.
- Implementación de operadores para transformar y filtrar eventos, asegurando idempotencia y resiliencia.
- Desarrollo de mecanismos para manejar errores, reintentos y recuperación de fallos en el procesamiento de eventos.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
