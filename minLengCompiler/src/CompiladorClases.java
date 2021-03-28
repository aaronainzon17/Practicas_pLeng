/* Generated By:JavaCC: Do not edit this line. CompiladorClases.java */
public class CompiladorClases implements CompiladorClasesConstants {
  public static void main(String args []) throws ParseException
  {
    CompiladorClases parser = new CompiladorClases(System.in);
    System.out.println("Leyendo de la entrada est\u00e1ndar...");
    try {
        CompiladorClases.programa();
        System.out.println("Analizado correctamente");
    }
    catch (TokenMgrError e) {
                //Error l�xico
                System.out.println("Error lexico");
        }
        catch (ParseException e) {
                //Error sint�ctico
                System.out.println("Error sintactico");
        }
        catch (Error e) {
        System.out.println("Se ha producido un error inesperado");
        System.out.println(e.getMessage());
        }
  }

// ANALIZADOR SINTACTICO

/**
*	En la parte superior de cada funcion se ha puesto
*	la notacion de la regla en BNF por si sirve de ayuda
*/


//programa ::= <tPROGRAMA> <tIDENTIFICADOR> ";" declaracion_variables declaracion_acciones bloque_sentencias
  static final public void programa() throws ParseException {
  Token t = null;
    jj_consume_token(tPROGRAMA);
    t = jj_consume_token(tIDENTIFICADOR);
          System.out.println("Identificador del programa: " + t.image);
    jj_consume_token(tFIN_SENTENCIA);
    declaracion_variables();
    declaracion_acciones();
    bloque_sentencias();
  }

//declaracion_variables ::= ( declaracion ";" )*
  static final public void declaracion_variables() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tENTERO:
      case tBOOLEANO:
      case tCARACTER:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      declaracion();
      jj_consume_token(tFIN_SENTENCIA);
    }
  }

//declaracion ::= tipo_variables identificadores
  static final public void declaracion() throws ParseException {
    tipo_variables();
    identificadores();
  }

//tipo_variables ::= <tENTERO> | <tCARACTER> | <tBOOLEANO>
  static final public void tipo_variables() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tENTERO:
      jj_consume_token(tENTERO);
      break;
    case tCARACTER:
      jj_consume_token(tCARACTER);
      break;
    case tBOOLEANO:
      jj_consume_token(tBOOLEANO);
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//identificadores ::= <tIDENTIFICADOR> ( "," <tIDENTIFICADOR> )*
  static final public void identificadores() throws ParseException {
    jj_consume_token(tIDENTIFICADOR);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tSEPARADOR:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      jj_consume_token(tSEPARADOR);
      jj_consume_token(tIDENTIFICADOR);
    }
  }

//declaracion_acciones ::= ( declaracion_accion )*
  static final public void declaracion_acciones() throws ParseException {
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tACCION:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      declaracion_accion();
    }
  }

//declaracion_accion ::= cabecera_accion ";" declaracion_variables declaracion_acciones bloque_sentencias
  static final public void declaracion_accion() throws ParseException {
    cabecera_accion();
    jj_consume_token(tFIN_SENTENCIA);
    declaracion_variables();
    declaracion_acciones();
    bloque_sentencias();
  }

//cabecera_accion ::= <tACCION> <tIDENTIFICADOR> parametros_formales
  static final public void cabecera_accion() throws ParseException {
    jj_consume_token(tACCION);
    jj_consume_token(tIDENTIFICADOR);
    parametros_formales();
  }

//parametros_formales ::= ...
  static final public void parametros_formales() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tPAR_IZQ:
      jj_consume_token(tPAR_IZQ);
      parametros();
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tFIN_SENTENCIA:
          ;
          break;
        default:
          jj_la1[4] = jj_gen;
          break label_4;
        }
        jj_consume_token(tFIN_SENTENCIA);
        parametros();
      }
      jj_consume_token(tPAR_DER);
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
  }

//lista_parametros ::= (< tIDENTIFICADOR > ",")* < tIDENTIFICADOR >
  static final public void lista_parametros() throws ParseException {
    jj_consume_token(tIDENTIFICADOR);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tSEPARADOR:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_5;
      }
      jj_consume_token(tSEPARADOR);
      jj_consume_token(tIDENTIFICADOR);
    }
  }

//parametros ::= clase_parametros tipo_variables lista_parametros
  static final public void parametros() throws ParseException {
    clase_parametros();
    tipo_variables();
    lista_parametros();
  }

//clase_parametros ::= <tVAL> | <tREF>
  static final public void clase_parametros() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tVAL:
      jj_consume_token(tVAL);
      break;
    case tREF:
      jj_consume_token(tREF);
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//bloque_sentencias ::= <tPRINCIPIO> lista_sentencias <tFIN>
  static final public void bloque_sentencias() throws ParseException {
    jj_consume_token(tPRINCIPIO);
    lista_sentencias();
    jj_consume_token(tFIN);
  }

//lista_sentencias	 ::= (sentencia())+
  static final public void lista_sentencias() throws ParseException {
    label_6:
    while (true) {
      sentencia();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tSI:
      case tMQ:
      case tESCRIBIR:
      case tLEER:
      case tIDENTIFICADOR:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_6;
      }
    }
  }

//sentencia ::= leer ";" | escribir ";" | asignacion | invocacion_accion | seleccion | mientras_que
  static final public void sentencia() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tLEER:
      leer();
      jj_consume_token(tFIN_SENTENCIA);
      break;
    case tESCRIBIR:
      escribir();
      jj_consume_token(tFIN_SENTENCIA);
      break;
    case tIDENTIFICADOR:
      jj_consume_token(tIDENTIFICADOR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tOPAS:
        asignacion();
        break;
      case tPAR_IZQ:
        invocacion_accion();
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case tSI:
      seleccion();
      break;
    case tMQ:
      mientras_que();
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//leer ::= <tLEER> "(" lista_asignables ")"
  static final public void leer() throws ParseException {
    jj_consume_token(tLEER);
    jj_consume_token(tPAR_IZQ);
    lista_asignables();
    jj_consume_token(tPAR_DER);
  }

//lista_asignables ::= lista_parameteros()
  static final public void lista_asignables() throws ParseException {
    lista_parametros();
  }

//escribir ::= <tESCRIBIR> "(" lista_escribibles ")"
  static final public void escribir() throws ParseException {
    jj_consume_token(tESCRIBIR);
    jj_consume_token(tPAR_IZQ);
    lista_escribibles();
    jj_consume_token(tPAR_DER);
  }

//lista_escribibles ::= ...
  static final public void lista_escribibles() throws ParseException {
    factor();
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tSEPARADOR:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_7;
      }
      jj_consume_token(tSEPARADOR);
      factor();
    }
  }

//asignacion ::= <tIDENTIFICADOR> <tOPAS> expresion ";"
  static final public void asignacion() throws ParseException {
    jj_consume_token(tOPAS);
    expresion();
    jj_consume_token(tFIN_SENTENCIA);
  }

//invocacion_accion ::= <tIDENTIFICADOR> argumentos ";"
  static final public void invocacion_accion() throws ParseException {
    argumentos();
    jj_consume_token(tFIN_SENTENCIA);
  }

//mientras_que ::= <tMQ> expresion lista_sentencias <tFMQ>
  static final public void mientras_que() throws ParseException {
    jj_consume_token(tMQ);
    expresion();
    lista_sentencias();
    jj_consume_token(tFMQ);
  }

//seleccion ::= ...
  static final public void seleccion() throws ParseException {
    jj_consume_token(tSI);
    expresion();
    lista_sentencias();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tSI_NO:
      jj_consume_token(tSI_NO);
      lista_sentencias();
      break;
    default:
      jj_la1[12] = jj_gen;
      ;
    }
    jj_consume_token(tFSI);
  }

//argumentos ::= "(" ( lista_expresiones )? ")"
  static final public void argumentos() throws ParseException {
    jj_consume_token(tPAR_IZQ);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tSUMA:
    case tRESTA:
    case tNOT:
    case tENTACAR:
    case tCARAENT:
    case tVALOR_ENTERO:
    case tTRUE:
    case tFALSE:
    case tIDENTIFICADOR:
    case tCONSTCHAR:
    case tCONSTCAD:
    case tPAR_IZQ:
      lista_expresiones();
      break;
    default:
      jj_la1[13] = jj_gen;
      ;
    }
    jj_consume_token(tPAR_DER);
  }

//lista_expresiones ::= ...
  static final public void lista_expresiones() throws ParseException {
    label_8:
    while (true) {
      expresion();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tSUMA:
      case tRESTA:
      case tNOT:
      case tENTACAR:
      case tCARAENT:
      case tVALOR_ENTERO:
      case tTRUE:
      case tFALSE:
      case tIDENTIFICADOR:
      case tCONSTCHAR:
      case tCONSTCAD:
      case tPAR_IZQ:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_8;
      }
    }
  }

//expresion ::= ...
  static final public void expresion() throws ParseException {
    expresion_simple();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tMAYOR:
    case tMENOR:
    case tIGUAL:
    case tMAI:
    case tMEI:
    case tNI:
      operador_relacional();
      expresion_simple();
      break;
    default:
      jj_la1[15] = jj_gen;
      ;
    }
  }

//operador_relacional ::= ...
  static final public void operador_relacional() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tMAYOR:
      jj_consume_token(tMAYOR);
      break;
    case tMENOR:
      jj_consume_token(tMENOR);
      break;
    case tIGUAL:
      jj_consume_token(tIGUAL);
      break;
    case tMAI:
      jj_consume_token(tMAI);
      break;
    case tMEI:
      jj_consume_token(tMEI);
      break;
    case tNI:
      jj_consume_token(tNI);
      break;
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//expresion_simple ::= ...
  static final public void expresion_simple() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tSUMA:
    case tRESTA:
      signo();
      break;
    default:
      jj_la1[17] = jj_gen;
      ;
    }
    termino();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tSUMA:
      case tRESTA:
      case tOR:
        ;
        break;
      default:
        jj_la1[18] = jj_gen;
        break label_9;
      }
      operador_aditivo();
      termino();
    }
  }

//operador_aditivo ::= ...
  static final public void signo() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tSUMA:
      jj_consume_token(tSUMA);
      break;
    case tRESTA:
      jj_consume_token(tRESTA);
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void operador_aditivo() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tOR:
      jj_consume_token(tOR);
      break;
    case tSUMA:
      jj_consume_token(tSUMA);
      break;
    case tRESTA:
      jj_consume_token(tRESTA);
      break;
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//termino ::= ...
  static final public void termino() throws ParseException {
    factor();
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tDIV:
      case tMULT:
      case tAND:
      case tMOD:
        ;
        break;
      default:
        jj_la1[21] = jj_gen;
        break label_10;
      }
      operador_multiplicativo();
      factor();
    }
  }

//operador_multiplicativo ::= ...
  static final public void operador_multiplicativo() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tMULT:
      jj_consume_token(tMULT);
      break;
    case tDIV:
      jj_consume_token(tDIV);
      break;
    case tMOD:
      jj_consume_token(tMOD);
      break;
    case tAND:
      jj_consume_token(tAND);
      break;
    default:
      jj_la1[22] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void factor() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case tNOT:
      jj_consume_token(tNOT);
      factor();
      break;
    case tPAR_IZQ:
      jj_consume_token(tPAR_IZQ);
      expresion();
      jj_consume_token(tPAR_DER);
      break;
    case tENTACAR:
      jj_consume_token(tENTACAR);
      jj_consume_token(tPAR_IZQ);
      expresion();
      jj_consume_token(tPAR_DER);
      break;
    case tCARAENT:
      jj_consume_token(tCARAENT);
      jj_consume_token(tPAR_IZQ);
      expresion();
      jj_consume_token(tPAR_DER);
      break;
    case tIDENTIFICADOR:
      jj_consume_token(tIDENTIFICADOR);
      break;
    case tVALOR_ENTERO:
      jj_consume_token(tVALOR_ENTERO);
      break;
    case tCONSTCHAR:
      jj_consume_token(tCONSTCHAR);
      break;
    case tCONSTCAD:
      jj_consume_token(tCONSTCAD);
      break;
    case tTRUE:
      jj_consume_token(tTRUE);
      break;
    case tFALSE:
      jj_consume_token(tFALSE);
      break;
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CompiladorClasesTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[24];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1c000000,0x1c000000,0x200000,0x80000,0x100000,0x0,0x200000,0x60000,0x8800,0x0,0x8800,0x200000,0x2000,0x80c00000,0x80c00000,0x0,0x0,0xc00000,0x40c00000,0xc00000,0x40c00000,0x23000000,0x23000000,0x80000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x200000,0x0,0x0,0x40300,0x200040,0x40300,0x0,0x0,0x3f8c00,0x3f8c00,0x3f,0x3f,0x0,0x0,0x0,0x0,0x80,0x80,0x3f8c00,};
   }

  /** Constructor with InputStream. */
  public CompiladorClases(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public CompiladorClases(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CompiladorClasesTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public CompiladorClases(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CompiladorClasesTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public CompiladorClases(CompiladorClasesTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CompiladorClasesTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[55];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 24; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 55; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
