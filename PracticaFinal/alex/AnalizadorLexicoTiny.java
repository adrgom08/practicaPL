// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: ALexico.l

package alex;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class AnalizadorLexicoTiny {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\10\0\2\1\1\2\2\0\1\1\22\0\1\1\1\3"+
    "\1\0\1\4\1\0\1\5\1\6\1\0\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\11\20"+
    "\1\21\1\22\1\23\1\24\1\25\2\0\1\26\1\27"+
    "\1\30\1\27\1\31\3\27\1\32\2\27\1\33\6\27"+
    "\1\34\1\35\1\36\1\27\1\37\3\27\1\40\1\0"+
    "\1\41\1\0\1\42\1\0\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\27\1\54\1\55"+
    "\1\56\1\57\1\60\1\61\1\27\1\62\1\63\1\64"+
    "\1\65\1\66\1\67\1\27\1\70\1\27\1\71\1\72"+
    "\1\73\u0182\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\2\16"+
    "\1\1\1\17\1\20\1\1\1\21\2\22\1\23\1\24"+
    "\16\22\1\25\1\1\1\26\1\27\1\30\1\31\1\2"+
    "\1\32\1\33\1\34\1\35\24\22\1\36\10\22\1\37"+
    "\3\22\1\40\2\22\1\41\4\22\1\42\3\22\1\43"+
    "\6\22\1\44\1\45\4\22\1\46\3\22\1\47\11\22"+
    "\1\50\2\22\1\51\3\22\1\52\1\22\1\53\7\22"+
    "\1\54\2\22\1\55\5\22\1\56\3\22\1\57\1\22"+
    "\1\60\4\22\1\61\1\62\1\22\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\74\0\74\0\170\0\74\0\74\0\264\0\74"+
    "\0\74\0\74\0\74\0\74\0\360\0\74\0\u012c\0\74"+
    "\0\u0168\0\u01a4\0\74\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0"+
    "\0\74\0\74\0\u030c\0\u0348\0\u0384\0\u03c0\0\u03fc\0\u0438"+
    "\0\u0474\0\u04b0\0\u04ec\0\u0528\0\u0564\0\u05a0\0\u05dc\0\u0618"+
    "\0\74\0\u0654\0\74\0\74\0\74\0\74\0\u0690\0\74"+
    "\0\74\0\74\0\74\0\u06cc\0\u0708\0\u0744\0\u0780\0\u07bc"+
    "\0\u07f8\0\u0834\0\u0870\0\u08ac\0\u08e8\0\u0924\0\u0960\0\u099c"+
    "\0\u09d8\0\u0a14\0\u0a50\0\u0a8c\0\u0ac8\0\u0b04\0\u0b40\0\74"+
    "\0\u0b7c\0\u0bb8\0\u0bf4\0\u0c30\0\u0c6c\0\u0ca8\0\u0ce4\0\u0d20"+
    "\0\u0294\0\u0d5c\0\u0d98\0\u0dd4\0\u0294\0\u0e10\0\u0e4c\0\u0294"+
    "\0\u0e88\0\u0ec4\0\u0f00\0\u0f3c\0\u0294\0\u0f78\0\u0fb4\0\u0ff0"+
    "\0\u0294\0\u102c\0\u1068\0\u10a4\0\u10e0\0\u111c\0\u1158\0\u0294"+
    "\0\u0294\0\u1194\0\u11d0\0\u120c\0\u1248\0\u0294\0\u1284\0\u12c0"+
    "\0\u12fc\0\u0294\0\u1338\0\u1374\0\u13b0\0\u13ec\0\u1428\0\u1464"+
    "\0\u14a0\0\u14dc\0\u1518\0\u0294\0\u1554\0\u1590\0\u0294\0\u15cc"+
    "\0\u1608\0\u1644\0\u0294\0\u1680\0\u0294\0\u16bc\0\u16f8\0\u1734"+
    "\0\u1770\0\u17ac\0\u17e8\0\u1824\0\u0294\0\u1860\0\u189c\0\u0294"+
    "\0\u18d8\0\u1914\0\u1950\0\u198c\0\u19c8\0\u0294\0\u1a04\0\u1a40"+
    "\0\u1a7c\0\u0294\0\u1ab8\0\u0294\0\u1af4\0\u1b30\0\u1b6c\0\u1ba8"+
    "\0\u0294\0\u0294\0\u1be4\0\u0294";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\10\27\1\30\1\27"+
    "\1\31\1\32\1\2\1\27\1\33\1\34\1\35\1\27"+
    "\1\36\1\37\3\27\1\40\1\41\1\42\1\27\1\43"+
    "\1\44\1\45\1\46\1\27\1\47\1\50\1\27\1\51"+
    "\1\52\1\53\120\0\1\54\55\0\1\55\112\0\1\56"+
    "\64\0\1\57\74\0\2\21\77\0\1\60\73\0\1\61"+
    "\73\0\1\62\73\0\1\63\66\0\2\27\5\0\12\27"+
    "\2\0\27\27\22\0\2\27\5\0\6\27\1\64\3\27"+
    "\2\0\27\27\22\0\2\27\5\0\12\27\2\0\16\27"+
    "\1\65\10\27\22\0\2\27\5\0\12\27\2\0\1\27"+
    "\1\66\14\27\1\67\10\27\22\0\2\27\5\0\12\27"+
    "\2\0\5\27\1\70\21\27\22\0\2\27\5\0\12\27"+
    "\2\0\1\27\1\71\7\27\1\72\4\27\1\73\4\27"+
    "\1\74\3\27\22\0\2\27\5\0\12\27\2\0\23\27"+
    "\1\75\3\27\22\0\2\27\5\0\12\27\2\0\5\27"+
    "\1\76\21\27\22\0\2\27\5\0\12\27\2\0\1\27"+
    "\1\77\25\27\22\0\2\27\5\0\12\27\2\0\5\27"+
    "\1\100\15\27\1\101\3\27\22\0\2\27\5\0\12\27"+
    "\2\0\16\27\1\102\10\27\22\0\2\27\5\0\12\27"+
    "\2\0\5\27\1\103\21\27\22\0\2\27\5\0\12\27"+
    "\2\0\22\27\1\104\4\27\22\0\2\27\5\0\12\27"+
    "\2\0\20\27\1\105\6\27\22\0\2\27\5\0\12\27"+
    "\2\0\1\27\1\106\25\27\22\0\2\27\5\0\12\27"+
    "\2\0\20\27\1\107\6\27\75\0\1\110\1\0\2\57"+
    "\1\0\71\57\17\0\2\27\5\0\6\27\1\111\3\27"+
    "\2\0\27\27\22\0\2\27\5\0\12\27\2\0\16\27"+
    "\1\112\10\27\22\0\2\27\5\0\12\27\2\0\13\27"+
    "\1\113\13\27\22\0\2\27\5\0\12\27\2\0\15\27"+
    "\1\114\11\27\22\0\2\27\5\0\12\27\2\0\13\27"+
    "\1\115\13\27\22\0\2\27\5\0\12\27\2\0\13\27"+
    "\1\116\13\27\22\0\2\27\5\0\12\27\2\0\4\27"+
    "\1\117\22\27\22\0\2\27\5\0\12\27\2\0\20\27"+
    "\1\120\6\27\22\0\2\27\5\0\12\27\2\0\15\27"+
    "\1\121\11\27\22\0\2\27\5\0\12\27\2\0\5\27"+
    "\1\122\21\27\22\0\2\27\5\0\12\27\2\0\15\27"+
    "\1\123\11\27\22\0\2\27\5\0\12\27\2\0\11\27"+
    "\1\124\15\27\22\0\2\27\5\0\12\27\2\0\25\27"+
    "\1\125\1\27\22\0\2\27\5\0\12\27\2\0\13\27"+
    "\1\126\13\27\22\0\2\27\5\0\12\27\2\0\11\27"+
    "\1\127\15\27\22\0\2\27\5\0\12\27\2\0\4\27"+
    "\1\130\15\27\1\131\4\27\22\0\2\27\5\0\12\27"+
    "\2\0\1\27\1\132\25\27\22\0\2\27\5\0\12\27"+
    "\2\0\16\27\1\133\4\27\1\134\3\27\22\0\2\27"+
    "\5\0\12\27\2\0\20\27\1\135\6\27\22\0\2\27"+
    "\5\0\12\27\2\0\11\27\1\136\15\27\22\0\2\27"+
    "\5\0\11\27\1\137\2\0\27\27\22\0\2\27\5\0"+
    "\12\27\2\0\13\27\1\140\13\27\22\0\2\27\5\0"+
    "\12\27\2\0\13\27\1\141\13\27\22\0\2\27\5\0"+
    "\12\27\2\0\21\27\1\142\5\27\22\0\2\27\5\0"+
    "\12\27\2\0\5\27\1\143\21\27\22\0\2\27\5\0"+
    "\12\27\2\0\21\27\1\134\5\27\22\0\2\27\5\0"+
    "\3\27\1\144\6\27\2\0\27\27\22\0\2\27\5\0"+
    "\5\27\1\145\4\27\2\0\27\27\22\0\2\27\5\0"+
    "\12\27\2\0\24\27\1\146\2\27\22\0\2\27\5\0"+
    "\4\27\1\147\5\27\2\0\27\27\22\0\2\27\5\0"+
    "\12\27\2\0\15\27\1\150\11\27\22\0\2\27\5\0"+
    "\12\27\2\0\13\27\1\151\13\27\22\0\2\27\5\0"+
    "\12\27\2\0\15\27\1\152\11\27\22\0\2\27\5\0"+
    "\12\27\2\0\23\27\1\153\3\27\22\0\2\27\5\0"+
    "\12\27\2\0\13\27\1\154\13\27\22\0\2\27\5\0"+
    "\12\27\2\0\22\27\1\155\4\27\22\0\2\27\5\0"+
    "\12\27\2\0\5\27\1\156\21\27\22\0\2\27\5\0"+
    "\12\27\2\0\22\27\1\157\4\27\22\0\2\27\5\0"+
    "\12\27\2\0\10\27\1\160\16\27\22\0\2\27\5\0"+
    "\6\27\1\161\3\27\2\0\27\27\22\0\2\27\5\0"+
    "\12\27\2\0\22\27\1\162\4\27\22\0\2\27\5\0"+
    "\12\27\2\0\22\27\1\163\4\27\22\0\2\27\5\0"+
    "\12\27\2\0\13\27\1\164\13\27\22\0\2\27\5\0"+
    "\12\27\2\0\5\27\1\165\21\27\22\0\2\27\5\0"+
    "\1\166\11\27\2\0\27\27\22\0\2\27\5\0\12\27"+
    "\2\0\15\27\1\167\11\27\22\0\2\27\5\0\12\27"+
    "\2\0\22\27\1\170\4\27\22\0\2\27\5\0\12\27"+
    "\2\0\20\27\1\171\6\27\22\0\2\27\5\0\12\27"+
    "\2\0\11\27\1\172\15\27\22\0\2\27\5\0\12\27"+
    "\2\0\21\27\1\173\5\27\22\0\2\27\5\0\12\27"+
    "\2\0\5\27\1\174\21\27\22\0\2\27\5\0\12\27"+
    "\2\0\11\27\1\175\15\27\22\0\2\27\5\0\12\27"+
    "\2\0\10\27\1\176\16\27\22\0\2\27\5\0\12\27"+
    "\2\0\5\27\1\177\21\27\22\0\2\27\5\0\12\27"+
    "\2\0\21\27\1\200\5\27\22\0\2\27\5\0\12\27"+
    "\2\0\22\27\1\201\4\27\22\0\2\27\5\0\12\27"+
    "\2\0\20\27\1\202\6\27\22\0\2\27\5\0\12\27"+
    "\2\0\22\27\1\203\4\27\22\0\2\27\5\0\12\27"+
    "\2\0\5\27\1\204\21\27\22\0\2\27\5\0\12\27"+
    "\2\0\15\27\1\205\11\27\22\0\2\27\5\0\12\27"+
    "\2\0\15\27\1\206\11\27\22\0\2\27\5\0\12\27"+
    "\2\0\12\27\1\207\14\27\22\0\2\27\5\0\12\27"+
    "\2\0\13\27\1\210\13\27\22\0\2\27\5\0\12\27"+
    "\2\0\5\27\1\211\21\27\22\0\2\27\5\0\12\27"+
    "\2\0\5\27\1\212\21\27\22\0\2\27\5\0\12\27"+
    "\2\0\1\27\1\213\25\27\22\0\2\27\5\0\12\27"+
    "\2\0\20\27\1\214\6\27\22\0\2\27\5\0\12\27"+
    "\2\0\20\27\1\215\6\27\22\0\2\27\5\0\7\27"+
    "\1\216\2\27\2\0\27\27\22\0\2\27\5\0\4\27"+
    "\1\217\5\27\2\0\27\27\22\0\2\27\5\0\12\27"+
    "\2\0\5\27\1\220\21\27\22\0\2\27\5\0\12\27"+
    "\2\0\24\27\1\221\2\27\22\0\2\27\5\0\2\27"+
    "\1\222\7\27\2\0\27\27\22\0\2\27\5\0\12\27"+
    "\2\0\20\27\1\223\6\27\22\0\2\27\5\0\12\27"+
    "\2\0\1\27\1\224\25\27\22\0\2\27\5\0\12\27"+
    "\2\0\20\27\1\225\6\27\22\0\2\27\5\0\12\27"+
    "\2\0\6\27\1\226\20\27\22\0\2\27\5\0\12\27"+
    "\2\0\11\27\1\227\15\27\22\0\2\27\5\0\12\27"+
    "\2\0\1\27\1\230\25\27\22\0\2\27\5\0\12\27"+
    "\2\0\11\27\1\231\15\27\22\0\2\27\5\0\12\27"+
    "\2\0\26\27\1\232\22\0\2\27\5\0\12\27\2\0"+
    "\23\27\1\233\3\27\22\0\2\27\5\0\12\27\2\0"+
    "\12\27\1\234\14\27\22\0\2\27\5\0\12\27\2\0"+
    "\21\27\1\235\5\27\22\0\2\27\5\0\12\27\2\0"+
    "\1\27\1\236\25\27\22\0\2\27\5\0\12\27\2\0"+
    "\3\27\1\237\23\27\22\0\2\27\5\0\12\27\2\0"+
    "\22\27\1\240\4\27\22\0\2\27\5\0\12\27\2\0"+
    "\22\27\1\241\4\27\22\0\2\27\5\0\12\27\2\0"+
    "\22\27\1\242\4\27\22\0\2\27\5\0\12\27\2\0"+
    "\20\27\1\243\6\27\22\0\2\27\5\0\12\27\2\0"+
    "\16\27\1\244\10\27\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7200];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\2\11\1\1\5\11\1\1\1\11"+
    "\1\1\1\11\2\1\1\11\5\1\2\11\16\1\1\11"+
    "\1\1\4\11\1\1\4\11\24\1\1\11\134\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  private ALexOperations ops;
  public String lexema() {return yytext();}
  public int fila() {return yyline+1;}
  public int columna() {return yycolumn+1;}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexicoTiny(java.io.Reader in) {
    ops = new ALexOperations(this);
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public UnidadLexica yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          {   return ops.unidadEof();
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { ops.error();
            }
            // fall through
          case 52: break;
          case 2:
            { 
            }
            // fall through
          case 53: break;
          case 3:
            { return ops.unidadNegacion();
            }
            // fall through
          case 54: break;
          case 4:
            { return ops.unidadReferencia();
            }
            // fall through
          case 55: break;
          case 5:
            { return ops.unidadResto();
            }
            // fall through
          case 56: break;
          case 6:
            { return ops.unidadParentesisAbre();
            }
            // fall through
          case 57: break;
          case 7:
            { return ops.unidadParentesisCierra();
            }
            // fall through
          case 58: break;
          case 8:
            { return ops.unidadAsterisco();
            }
            // fall through
          case 59: break;
          case 9:
            { return ops.unidadMas();
            }
            // fall through
          case 60: break;
          case 10:
            { return ops.unidadComa();
            }
            // fall through
          case 61: break;
          case 11:
            { return ops.unidadMenos();
            }
            // fall through
          case 62: break;
          case 12:
            { return ops.unidadPunto();
            }
            // fall through
          case 63: break;
          case 13:
            { return ops.unidadDivision();
            }
            // fall through
          case 64: break;
          case 14:
            { return ops.unidadEntPositivo();
            }
            // fall through
          case 65: break;
          case 15:
            { return ops.unidadPuntoYComa();
            }
            // fall through
          case 66: break;
          case 16:
            { return ops.unidadMenor();
            }
            // fall through
          case 67: break;
          case 17:
            { return ops.unidadMayor();
            }
            // fall through
          case 68: break;
          case 18:
            { return ops.unidadIden();
            }
            // fall through
          case 69: break;
          case 19:
            { return ops.unidadCorcheteAbre();
            }
            // fall through
          case 70: break;
          case 20:
            { return ops.unidadCorcheteCierra();
            }
            // fall through
          case 71: break;
          case 21:
            { return ops.unidadLlaveAbre();
            }
            // fall through
          case 72: break;
          case 22:
            { return ops.unidadLlaveCierra();
            }
            // fall through
          case 73: break;
          case 23:
            { return ops.unidadDistinto();
            }
            // fall through
          case 74: break;
          case 24:
            { return ops.unidadAnd();
            }
            // fall through
          case 75: break;
          case 25:
            { return ops.unidadFlecha();
            }
            // fall through
          case 76: break;
          case 26:
            { return ops.unidadAsignacion();
            }
            // fall through
          case 77: break;
          case 27:
            { return ops.unidadMenorIgual();
            }
            // fall through
          case 78: break;
          case 28:
            { return ops.unidadIgual();
            }
            // fall through
          case 79: break;
          case 29:
            { return ops.unidadMayorIgual();
            }
            // fall through
          case 80: break;
          case 30:
            { return ops.unidadOr();
            }
            // fall through
          case 81: break;
          case 31:
            { return ops.unidadFun();
            }
            // fall through
          case 82: break;
          case 32:
            { return ops.unidadNew();
            }
            // fall through
          case 83: break;
          case 33:
            { return ops.unidadRed();
            }
            // fall through
          case 84: break;
          case 34:
            { return ops.unidadVar();
            }
            // fall through
          case 85: break;
          case 35:
            { return ops.unidadCall();
            }
            // fall through
          case 86: break;
          case 36:
            { return ops.unidadMain();
            }
            // fall through
          case 87: break;
          case 37:
            { return ops.unidadNull();
            }
            // fall through
          case 88: break;
          case 38:
            { return ops.unidadBool();
            }
            // fall through
          case 89: break;
          case 39:
            { return ops.unidadConst();
            }
            // fall through
          case 90: break;
          case 40:
            { return ops.unidadWrite();
            }
            // fall through
          case 91: break;
          case 41:
            { return ops.unidadDelete();
            }
            // fall through
          case 92: break;
          case 42:
            { return ops.unidadLenInt();
            }
            // fall through
          case 93: break;
          case 43:
            { return ops.unidadReturn();
            }
            // fall through
          case 94: break;
          case 44:
            { return ops.unidadPointer();
            }
            // fall through
          case 95: break;
          case 45:
            { return ops.unidadUSSWhile();
            }
            // fall through
          case 96: break;
          case 46:
            { return ops.unidadTrotskIf();
            }
            // fall through
          case 97: break;
          case 47:
            { return ops.unidadGuevArray();
            }
            // fall through
          case 98: break;
          case 48:
            { return ops.unidadBoolShevik();
            }
            // fall through
          case 99: break;
          case 49:
            { return ops.unidadForLetariat();
            }
            // fall through
          case 100: break;
          case 50:
            { return ops.unidadStalinTruct();
            }
            // fall through
          case 101: break;
          case 51:
            { return ops.unidadFidElseCastro();
            }
            // fall through
          case 102: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
