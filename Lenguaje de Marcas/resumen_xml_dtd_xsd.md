<!-- Esto es un comentario -->

<!-- La estructura de un XML es la siguiente: -->

<?xml version="1.0" encoding="UTF-8"?>
<!-- AQUI LA VALIDACIÓN DTD O XSD-->
<root>
    <elemento1 atributo1="valor" atributo2=123>
        <elemento2>
            Información
        </elemento2>
        </Elemento_Vacío>
    </elemento1>
</root>

<!-- Para que un XML sea válido, debemos crear un archivo que se encargue de eso. En este caso podemos usar DTD o XML-SCHEMAS. -->

```xml

<!-- DTD -->

    <!-- Declaración de DTD: -->

<!-- DTD Interno: -->
<!DOCTYPE elemento_root [
<!-- DTD -->
]>

<!-- DTD Externo Local: -->
<!DOCTYPE elemento_root SYSTEM "path/archivo.dtd">

<!-- DTD Externo Publico: -->
<!DOCTYPE elemento_root PUBLIC "id-público" "URL/archivo.dtd">

<!-- Los elementos de un DTD son los siguientes: -->


    <!-- ELEMENTOS -->

<!ELEMENT elemento contenido> <!-- Declaración de elementos -->

<!-- El "contenido" de un elemento pueden ser: -->
 
<!-- Otro elemento: -->
<!ELEMENT elementoPadre elementoHijo>

<!-- Conjunto de elementos: -->
<!ELEMENT elementoPadre (hijo1, hijo2, hijo3)>

<!-- Información: -->
<!ELEMENT elementoPadre (#PCDATA)>

<!-- Nada: -->
<!ELEMENT elementoPadre EMPTY>

<!-- Mixto (Elementos y Datos): -->
<!ELEMENT elementoPadre ANY>

<!-- Además, los elementos hijos pueden ser de diferentes cardinalidades. Por defecto, un elemento hijo aparece obligatoriamente solo 1 vez. -->

elemento? <!-- 0/1 Aparición -->
elemento+ <!-- 1/N Apariciónes -->
elemento* <!-- 0/N Apariciónes -->
elemento <!-- 1 Aparición -->

<!-- También pueden existir elementos de elección. En el siguiente caso debe aparecer siempre 1 solo elemento de los siguientes, pero nunca ambos a la vez: -->

elemento1 | elemento2

<!-- También podemos utilizar cardinalidades y elecciones simultaneamente. En el siguiente ejemplo pueden aparecer:

elemento1 (1 vez o más, mientras no aparezca el elemento 2, 3 ni 4)
elemento2 (0 o 1 vez, mientras no aparezca el elemento 1, 3 ni 4)
elemento3 (1 vez, siempre junto al elemento 4, mientras no aparezcan elementos 1 o 2.)
elemento4 (ninguna, 1 o muchas veces, siempre junto al elemento 3, mientras no aparezcan elementos 1 o 2)
-->

(elemento1+ | elemento2?) | (elemento3, elemento4*)

    <!-- ATRIBUTOS -->

<!ATTLIST elemento atributo tipo "valorPorDefecto" #Propiedad> <!-- Declaración de atributos -->

    <!-- Tipos de atributos: -->

<!-- El tipo "CDATA" implica datos como números o caracteres. -->
<!ATTLIST elemento atributo CDATA>

<!-- El tipo "elección" implica datos limitados a unos casos especificos. -->
<!ATTLIST elemento atributo (España|Italia)>

<!-- El tipo "ID" implica un identificador único (empieza por letra): -->
<!ATTLIST elemento atributo ID #IMPLIED>

<!-- El tipo "IDREF" implica referencias a IDs de otros elementos. -->
<!ATTLIST elemento atributo IDREF>

<!-- El tipo "NMTOKEN" implica datos como números o caracteres o símbolos. -->
<!ATTLIST elemento atributo NMTOKEN>

    <!-- Propiedades de Atributos: -->

<!-- Atributos con valor fijo: -->
<!ATTLIST elemento atributo tipo #FIXED "valorFijo">

<!-- Atributos con valor obligatorio: -->
<!ATTLIST elemento atributo tipo #REQUIRED>

<!-- Atributos con valor opcional: -->
<!ATTLIST elemento atributo tipo #IMPLIED>
```
```xsd
<!-- XML-SCHEMAS (XSD) -->

<!-- XML-SCHEMAS es un espacio de nombres XML que restringe un XML. -->

    <!-- Para declarar y enlazar un XSD debemos hacer lo siguiente: -->

<!-- En el XML -->
<?xml version="1.0" encoding="UTF-8"?>
<elementoRoot xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="path/archivo.xsd">
<!-- Contenido XML -->


<!-- En el XSD: -->
<?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" elementFormDefault="qualified">
    <!-- Contenido XSD -->
</xs:schema>


    <!-- ELEMENTOS -->

<!-- Los elementos de un XSD son los siguientes: -->

<!-- Elementos Simple (NO TIENEN HIJOS NI ATRIBUTOS) -->
<xs:element name="nombreElemento" type="xs:tipoPrimitivo"/>
<!-- Los tipos primitivos principales son los siguientes: -->
<xs:string>
<xs:integer>
<xs:float>
<xs:double>
<xs:boolean>
<xs:decimal>
<xs:date>
<xs:time>
<xs:dateTime>
<xs:positiveInteger>

<!-- Elementos Complejos (PUEDEN TENER HIJOS Y ATRIBUTOS) -->
<xs:element name="elementoPadre">
    <xs:complexType>
        <xs:all>
            <xs:element name="elementoHijo1" type="xs:tipoPrimitivo"/>
            <xs:element name="elementoHijo2" type="xs:tipoPrimitivo"/>
        </xs:all>
    </xs:complexType>
</xs:element>

    <!-- Un complexType puede contener: -->
 
 <!-- "<xs:all>" pueden aparecer los elementos indicados sin orden especifico -->
<xs:all>
    <xs:element name="elementoHijo1" type="xs:tipoPrimitivo"/>
    <xs:element name="elementoHijo2" type="xs:tipoPrimitivo"/>
</xs:all>

 <!-- "<xs:sequence>" pueden aparecer los elementos indicados en el orden en el que se declaran -->
<xs:sequence>
    <xs:element name="elementoHijo1" type="xs:tipoPrimitivo"/>
    <xs:element name="elementoHijo2" type="xs:tipoPrimitivo"/>
</xs:sequence>

 <!-- "<xs:choice>" puede aparecer solo uno de los elementos declarados -->
<xs:choice>
    <xs:element name="elementoHijo1" type="xs:tipoPrimitivo"/>
    <xs:element name="elementoHijo2" type="xs:tipoPrimitivo"/>
</xs:choice>


<!-- Un elemento complejo puede tener hijos que también son elementos complejos: -->
<xs:element name="elementoPadre">
    <xs:complexType>
        <xs:all>
            <xs:element name="elementoHijo1" type="xs:tipoPrimitivo"/>
            <xs:element name="elementoHijo2">
                <xs:complexType>
                    <xs:sequence>
                        <xs:element name="elementoHijo2.1" type="xs:tipoPrimitivo"/>
                    </xs:sequence>
                </xs:complexType>
            <xs:element>
        </xs:all>
    </xs:complexType>
</xs:element>

    <!-- simpleType -->

<!-- Podemos definir simpleType y limitarlos con "xs:restriction" -->

<!-- Un simpleType puede tener una longitud fija -->
<xs:element name="clave">
    <xs:simpleType>
        <xs:restriction base="xs:string">
            <xs:length value="12"/>
        </xs:restriction>
    </xs:simpleType>
</xs:element>

<!-- Un simpleType complejo puede tener 1 valor a elección de varios -->
<xs:element name="color">
    <xs:simpleType>
        <xs:restriction base="xs:string">
            <xs:enumeration value="verde"/>
            <xs:enumeration value="amarillo"/>
            <xs:enumeration value="rojo"/>
        </xs:restriction>
    </xs:simpleType>
</xs:element>

<!-- "xs:maxInclusive" El valor debe ser <= al indicado. -->
<!-- "xs:maxExclusive" El valor debe ser < al indicado. -->
<!-- "xs:minInclusive" El valor debe ser >= al indicado. -->
<!-- "xs:minExclusive" El valor debe ser > al indicado. -->
<xs:element name="numero">
    <xs:simpleType>
        <xs:restriction base="xs:string">
            <!-- "numero" debe contener valores <= a 2 -->
            <xs:maxInclusive value="2">
        </xs:restriction>
    </xs:simpleType>
</xs:element>

<!-- Un simpleType complejo puede tener un patrón a seguir -->
<xs:element name="letra">
    <xs:simpleType>
        <xs:restriction base="xs:string">
            <xs:pattern value="[a-z]"/>
        </xs:restriction>
    </xs:simpleType>
</xs:element>

<!-- Los patrones posibles son:

    [A-Z a-z] Letra.
    [A-Z] Letra mayúscula.
    [a-z] Letra minúscula.
    [0-9] Dígitos decimales.
    \D Cualquier carácter excepto un dígito del 0 al 9.
    (A) Cadena que coincide con A.
    A | B Cadena que es igual a la cadena A o a la B.
    AB Cadena que es la concatenación de las cadenas A y B.
    A? Cero o una vez la cadena A.
    A+ Una o más veces la cadena A.
    A* Cero o más veces la cadena A.
    [abcd] Alguno de los caracteres que están entre corchetes.
    [^abcd] Cualquier carácter que no esté entre corchetes.
    \t Tabulador.

 -->

    <!-- Propiedades de elementos -->

<!-- La cardinalidad de un elemento es, por defecto, 1 ocurrencia. Podemos fijar el mínimo y máximo de ocurrencias permitidas de la siguiente forma -->
<xs:element name="elemento" type="xs:tipoPrimitivo" minOccurs="0" maxOccurs="4"/>

<!-- Si queremos que el máximo no tenga límites, aplicamos "unbounded" -->
<xs:element name="elemento" type="xs:tipoPrimitivo" maxOccurs="unbounded"/>

<!-- Un elemento puede tener un valor fijo: -->
<xs:element name="elemento" type="xs:string" fixed="Adrián Borio"/>

<!-- Un elemento puede tener un valor por defecto: -->
<xs:element name="elemento" type="xs:integer" default="33"/>

<!-- Un elemento complejo puede tener valores mixtos. Al usar "mixed", el atributo complejo endrá tantos posibles valores de texto, como elementos: -->

<!-- XSD -->
<xsd:element name="confirmacionPedido">
    <xsd:complexType mixed=”true”>
        <xsd:sequence>
            <xsd:element name=”intro” type=”xsd:string”/>
            <xsd:element name=”nombre” type=”xsd:string”/>
            <xsd:element name=”fecha” type=”xsd:string”/>
            <xsd:element name=”titulo” type=”xsd:string”/>
        </xsd:sequence>
    </xsd:complexType>
</xsd:element>

<!-- XML -->
<!-- A continuación podemos ver 4 elementos y 4 cadenas de texto -->
<confimacionPedido>
    <intro>Para:</intro>
    <nombre>Antonio Lara</nombre>
    Confirmamos que con fecha
    <fecha>24-01-2005</fecha>
    hemos recibido su pedido de
    <titulo>Raices</titulo>
    . Su título será enviado en 2 días hábiles desde la recepción del pedido.Gracias, Ediciones Aranda.
</confimacionPedido>

    <!-- ATRIBUTOS -->

<!-- Declaración de atributos: -->
<xs:attribute name="atributo" type="tipo"/>

<!-- Un atributo debe ir siempre dentro de un "complexType" y siempre es de tipo simple o primitivo: -->
<xs:element name="alumno">
    <xs:complexType>
        <xs:attribute name="dni" type="xs:string"/>
    </xs:complexType>
<xs:element>

    <!-- Propiedades de Atributos: -->

<!-- Un aributo puede tener las siguientes propiedades: -->

<!-- "use" puede tomar el valor "requiered" (debe aparecer) o "optional" (no es necesario que aparezca). -->
<xs:element name="alumno">
    <xs:complexType>
        <xs:attribute name="dni" type="xs:string" use="required"/>
    </xs:complexType>
<xs:element>

<!-- "default" tendrá un valor por defecto. -->
<xs:element name="alumno">
    <xs:complexType>
        <xs:attribute name="nacionalidad" type="xs:string" default="Española"/>
    </xs:complexType>
<xs:element>

<!-- "fixed" tendrá un valor fijo. -->
<xs:element name="alumno">
    <xs:complexType>
        <xs:attribute name="intituto" type="xs:string" fixed="Jesus Marín"/>
    </xs:complexType>
<xs:element>
```