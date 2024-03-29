/*********************************************************************************
 * Clase que define los simbolos que conforman los programas MiniLeng
 *
 * Fichero:    Simbolo.java
 * Fecha:      1/4/2021
 * Version:    v2.0
 * Asignatura: Procesadores de Lenguajes, curso 2020-2021
 **********************************************************************************/

package tabla_simbolos;

import java.util.ArrayList;

public class Simbolo {

	// Representa el tipo de simbolo
	public enum Tipo_simbolo {
		PROGRAMA, VARIABLE, ACCION, PARAMETRO
	};

	// Representa el tipo de variable
	public enum Tipo_variable {
		DESCONOCIDO, ENTERO, BOOLEANO, CHAR, CADENA
	};

	// Representa la clase de los parámetros en las acciones
	public enum Clase_parametro {
		VAL, REF
	};

	/////////////////////////////
	// Atributos del simbolo //
	/////////////////////////////

	String nombre;
	Integer nivel; // Nivel en el que se ha declarado el simbolo (primer nivel = 0)
	Integer dir; // Direccion del simbolo
	Integer tamano; // 0 si no es vector, sino tamano del vector

	Tipo_simbolo tipo;
	Tipo_variable variable;
	Clase_parametro parametro;
	
	Integer linea;
	Integer columna;

	ArrayList<Simbolo> lista_parametros; // Lista de simbolos que representan los parametros de una accion
	
	Boolean usado;

	// Getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Tipo_simbolo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo_simbolo tipo) {
		this.tipo = tipo;
	}

	public Tipo_variable getVariable() {
		return variable;
	}

	public void setVariable(Tipo_variable variable) {
		this.variable = variable;
	}

	public Clase_parametro getParametro() {
		return parametro;
	}

	public void setParametro(Clase_parametro parametro) {
		this.parametro = parametro;
	}

	public ArrayList<Simbolo> getListaParametros() {
		return lista_parametros;
	}

	public void setListaParametros(ArrayList<Simbolo> lista_parametros) {
		this.lista_parametros = lista_parametros;
	}

	public void addParametro(Simbolo parametro) {
		this.lista_parametros.add(parametro);
	}

	public int getDir() {
		return dir;
	}

	public void setDir(Integer dir) {
		this.dir = dir;
	}
	
	public void setTamano(Integer tamano) {
		this.tamano = tamano;
	}
	
	public Integer getTamano() {
		return tamano;
	}
	
	public void setUsado(Boolean usado) {
		this.usado = usado;
	}
	
	public Boolean getUsado() {
		return usado;
	}

	// Metodos para construir los tipos de imbolos

	// Configura los campos del simbolo correspondientes a un programa
	public void introducir_programa(String nombre, int nivel, int dir, int linea, int columna) {
		this.nombre = nombre;
		this.tipo = Tipo_simbolo.PROGRAMA;
		this.nivel = nivel;
		this.linea = linea;
		this.columna = columna;
		usado = true;
	}

	// Configura los campos del simbolo correspondiente a una variable
	public void introducir_variable(String nombre, Tipo_variable tipo_var, int nivel, int dir, int tamano, int linea, int columna) {
		this.nombre = nombre;
		this.tipo = Tipo_simbolo.VARIABLE;
		this.variable = tipo_var;
		this.nivel = nivel;
		this.dir = dir;
		this.tamano = tamano;
		this.linea = linea;
		this.columna = columna;
		usado = false;
	}

	// Configura los campos del simbolo correspondiente a una accion
	public void introducir_accion(String nombre, int nivel, int dir, int linea, int columna) {
		this.nombre = nombre;
		this.tipo = Tipo_simbolo.ACCION;
		this.lista_parametros = new ArrayList<Simbolo>();
		this.nivel = nivel;
		this.dir = dir;
		this.linea = linea;
		this.columna = columna;
		usado = false;
	}

	public Integer getLinea() {
		return linea;
	}

	public void setLinea(Integer linea) {
		this.linea = linea;
	}

	public Integer getColumna() {
		return columna;
	}

	public void setColumna(Integer columna) {
		this.columna = columna;
	}

	// Configura los campos del simbolo correspondiente a un parametro
	public void introducir_parametro(String nombre, Tipo_variable tipo_var, Clase_parametro clase_param, int nivel,
			int dir, int tamano, int linea, int columna) {
		this.nombre = nombre;
		this.tipo = Tipo_simbolo.PARAMETRO;
		this.variable = tipo_var;
		this.parametro = clase_param;
		this.nivel = nivel;
		this.dir = dir;
		this.tamano = tamano;
		this.linea = linea;
		this.columna = columna;
		usado = false;
	}

	// Comprobadores del tipo de simbolo

	public Boolean ES_PROGRAMA() {
		return tipo == Tipo_simbolo.PROGRAMA;
	}

	public Boolean ES_VARIABLE() {
		return tipo == Tipo_simbolo.VARIABLE;
	}

	public Boolean ES_ACCION() {
		return tipo == Tipo_simbolo.ACCION;
	}

	public Boolean ES_PARAMETRO() {
		return tipo == Tipo_simbolo.PARAMETRO;
	}

	public Boolean ES_VALOR() {
		return (tipo == Tipo_simbolo.PARAMETRO) && (parametro == Clase_parametro.VAL);
	}

	public Boolean ES_REFERENCIA() {
		return (tipo == Tipo_simbolo.PARAMETRO) && (parametro == Clase_parametro.REF);
	}

	public Boolean es_asignable() {
		return this.ES_VARIABLE() || this.ES_REFERENCIA();
	}

	// Funcion toString()

	public String getVariableString() {
		String res = "";
		switch (variable) {
		case DESCONOCIDO:
			res = "DESCONOCIDO";
			break;
		case ENTERO:
			res = "ENTERO";
			break;
		case BOOLEANO:
			res = "BOOLEANO";
			break;
		case CHAR:
			res = "CHAR";
			break;
		case CADENA:
			res = "CADENA";
			break;
		}
		return res;
	}

	public String getParametroString() {
		String res = "";
		switch (parametro) {
		case VAL:
			res = "VAL";
			break;
		case REF:
			res = "REF";
			break;
		}
		return res;
	}

	@Override
	public String toString() {
		String res;

		String nombre = this.nombre;
		if (tamano != null && tamano>0) {
			nombre += "[" + tamano + "]";
		}

		switch (tipo) {
		case PROGRAMA:
			res = String.format("%-25s %s [%d, -]", "PROGRAMA:", nombre, nivel);
			break;

		case VARIABLE:
			res = String.format("%-25s %s [%d, %d]", "VARIABLE " + getVariableString() + ":", nombre, nivel, dir);
			break;

		case ACCION:
			String signatura = nombre + "(";
			boolean primero = true;
			for (Simbolo par : lista_parametros) {
				if (primero) {
					primero = false;
				} else {
					signatura += ", ";
				}
				signatura += par.nombre;
			}
			signatura += ")";
			res = String.format("%-25s %s [%d, %d]", "ACCION:", signatura, nivel, dir);
			break;

		case PARAMETRO:
			res = String.format("%-25s %s [%d, %d]",
					"PARAMETRO " + getParametroString() + " " + getVariableString() + ":", nombre, nivel, dir);
			break;

		default:
			res = String.format("%-25s %s [%d, %d]", "SIMBOLO DESCONOCIDO", nombre, nivel, dir);
			break;
		}

		return res;
	}
}
