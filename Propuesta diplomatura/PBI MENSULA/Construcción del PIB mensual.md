# Construcción del PIB mensual a partir de series trimestrales

## Objetivo
Obtener una serie de **PIB mensual** a partir de información **trimestral oficial**, para poder calcular indicadores como la **Presión Tributaria (% del PIB)** en frecuencia mensual.

Dado que el PIB no se publica oficialmente en frecuencia mensual, el procedimiento implica una **distribución temporal del valor trimestral**.

---

## 1️⃣ Lectura del archivo fuente

Se parte de un archivo Excel descargado de una fuente oficial, que contiene las **series trimestrales de oferta y demanda globales**.

El archivo posee:
- Filas de encabezado no estructuradas
- Años y trimestres distribuidos en columnas
- Indicadores económicos en las filas

Por lo tanto, no puede leerse directamente como una tabla “tidy”.

---

## 2️⃣ Identificación de la fila correspondiente al PIB

Se localiza la fila que contiene el indicador **“Producto Interno Bruto”**, que será la base del análisis.

Este paso permite:
- Evitar depender de posiciones fijas
- Hacer el proceso reproducible ante cambios futuros del archivo

---

## 3️⃣ Reconstrucción de la serie trimestral

A partir de la fila del PIB:

- Se recorren las columnas del archivo
- Se extraen:
  - Año
  - Trimestre
  - Valor del PIB trimestral
- Se construye una tabla estructurada con el formato:

| anio | trimestre | pib_trimestral |
|------|----------|----------------|

Este formato es clave para poder realizar transformaciones posteriores.

---

## 4️⃣ Validación de la serie trimestral

Antes de avanzar, se realizan controles básicos:

- Cada año debe tener **hasta 4 trimestres**
- El último año puede tener menos trimestres (serie incompleta)
- No deben existir duplicados año–trimestre

Esto garantiza la coherencia temporal de los datos.

---

## 5️⃣ Conversión de PIB trimestral a PIB mensual

Dado que no existe PIB mensual oficial, se adopta el siguiente **supuesto metodológico**:

> El valor del PIB trimestral se distribuye de forma **uniforme** entre los tres meses que componen el trimestre.

Por ejemplo:
- Trimestre 1 → enero, febrero, marzo
- Trimestre 2 → abril, mayo, junio
- Trimestre 3 → julio, agosto, septiembre
- Trimestre 4 → octubre, noviembre, diciembre

Cada mes recibe:
\[
PIB_{mensual} = \frac{PIB_{trimestral}}{3}
\]

Este criterio es ampliamente utilizado en análisis fiscales y macroeconómicos cuando se requiere compatibilizar frecuencias.

---

## 6️⃣ Generación de la tabla mensual

Luego de la expansión trimestral → mensual, se obtiene una tabla con la siguiente estructura:

| fecha       | anio | mes | pib_mensual |
|-------------|------|-----|-------------|
| 2004-01-01  | 2004 | 1   | ...         |
| 2004-02-01  | 2004 | 2   | ...         |
| 2004-03-01  | 2004 | 3   | ...         |

La columna `fecha` se construye para facilitar:
- Gráficos temporales
- Uniones con otras series mensuales
- Integración con herramientas de BI

---

## 7️⃣ Resultado final

El resultado es una **serie de PIB mensual estimado**, consistente y documentada, lista para:

- Calcular Presión Tributaria mensual
- Integrarse con datos de recaudación
- Exportarse a CSV o conectarse a Power BI

---

## Nota metodológica

La conversión de una serie trimestral a mensual implica una **aproximación estadística**.  
Los resultados deben interpretarse como una **estimación de alta frecuencia**, no como un dato oficial mensual.


# Cálculo de la Presión Tributaria Mensual (% del PIB)

## Objetivo
Calcular la **Presión Tributaria mensual**, definida como el cociente entre la **recaudación tributaria** y el **Producto Interno Bruto**, expresado como porcentaje.

El cálculo se realiza en frecuencia mensual, utilizando:
- Recaudación mensual observada
- PIB mensual estimado a partir de series trimestrales

---

## 8️⃣ Definición conceptual

La **Presión Tributaria** mide el peso de los impuestos sobre la actividad económica y se define como:

\[
Presión\ Tributaria = \frac{Recaudación}{PIB} \times 100
\]

En este caso:
- La recaudación está medida en **valores corrientes mensuales**
- El PIB mensual es una **estimación**, obtenida por distribución del PIB trimestral

---

## 9️⃣ Preparación de la serie de recaudación

La serie de recaudación debe cumplir las siguientes condiciones:

- Frecuencia: mensual
- Variables mínimas:
  - año
  - mes
  - recaudación total
- Tipos de datos correctamente definidos

Estructura esperada:

| anio | mes | recaudacion |
|------|-----|-------------|
| 2004 | 1   | ...         |
| 2004 | 2   | ...         |

---

## 🔟 Unión de las bases PIB y recaudación

Para calcular la presión tributaria, se realiza una unión (*merge*) entre:

- PIB mensual estimado
- Recaudación mensual

La clave de unión es:
- `anio`
- `mes`

Esta unión asegura que ambos valores correspondan al mismo período temporal.

---

## 1️⃣1️⃣ Cálculo de la Presión Tributaria mensual

Una vez unificadas las bases, se calcula el indicador:

\[
Presión\ Tributaria_{mensual} = \frac{Recaudación_{mensual}}{PIB_{mensual}} \times 100
\]

El resultado se expresa como **porcentaje del PIB**.

---

## 1️⃣2️⃣ Validaciones del resultado

Antes de analizar o visualizar la serie, se realizan controles básicos:

- No deben existir valores nulos en:
  - PIB mensual
  - Recaudación
- La presión tributaria no debe presentar:
  - valores infinitos
  - valores negativos
- La serie debe ser temporalmente continua

Estas validaciones garantizan la calidad del indicador construido.

---

## 1️⃣3️⃣ Dataset final

El dataset resultante tiene la siguiente estructura:

| fecha       | anio | mes | recaudacion | pib_mensual | presion_tributaria |
|-------------|------|-----|-------------|-------------|--------------------|
| 2004-01-01  | 2004 | 1   | ...         | ...         | ...                |

Este dataset está listo para:
- Análisis exploratorio
- Visualizaciones
- Exportación a CSV
- Conexión directa con herramientas de BI (Power BI, Tableau, etc.)

---

## Nota metodológica final

La Presión Tributaria mensual obtenida en este trabajo debe interpretarse como un **indicador aproximado**, dado que:

- El PIB mensual no es un dato oficial
- Se asume una distribución uniforme intra–trimestre
- No se capturan variaciones estacionales dentro del trimestre

Aun así, el indicador es **válido y consistente** para:
- análisis de corto plazo
- comparaciones temporales
- estudios fiscales de alta frecuencia