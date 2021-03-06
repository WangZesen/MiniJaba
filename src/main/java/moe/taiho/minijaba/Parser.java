/* A Bison parser, made by GNU Bison 3.0.4.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

package moe.taiho.minijaba;
/* First part of user declarations.  */

/* "Parser.java":37  */ /* lalr1.java:91  */

/* "Parser.java":39  */ /* lalr1.java:92  */
/* "%code imports" blocks.  */
/* "Parser.y":9  */ /* lalr1.java:93  */

    import java.util.ArrayList;
    import moe.taiho.minijaba.ast.*;

/* "Parser.java":46  */ /* lalr1.java:93  */

/**
 * A Bison parser, automatically generated from <tt>Parser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class Parser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.0.4";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /**
   * True if verbose error messages are enabled.
   */
  private boolean yyErrorVerbose = true;

  /**
   * Return whether verbose error messages are enabled.
   */
  public final boolean getErrorVerbose() { return yyErrorVerbose; }

  /**
   * Set the verbosity of error messages.
   * @param verbose True to request verbose error messages.
   */
  public final void setErrorVerbose(boolean verbose)
  { yyErrorVerbose = verbose; }



  /**
   * A class defining a pair of positions.  Positions, defined by the
   * <code>Position</code> class, denote a point in the input.
   * Locations represent a part of the input through the beginning
   * and ending positions.
   */
  public class Location {
    /**
     * The first, inclusive, position in the range.
     */
    public Position begin;

    /**
     * The first position beyond the range.
     */
    public Position end;

    /**
     * Create a <code>Location</code> denoting an empty range located at
     * a given point.
     * @param loc The position at which the range is anchored.
     */
    public Location (Position loc) {
      this.begin = this.end = loc;
    }

    /**
     * Create a <code>Location</code> from the endpoints of the range.
     * @param begin The first position included in the range.
     * @param end   The first position beyond the range.
     */
    public Location (Position begin, Position end) {
      this.begin = begin;
      this.end = end;
    }

    /**
     * Print a representation of the location.  For this to be correct,
     * <code>Position</code> should override the <code>equals</code>
     * method.
     */
    public String toString () {
      if (begin.equals (end))
        return begin.toString ();
      else
        return begin.toString () + "-" + end.toString ();
    }
  }



  
  private Location yylloc (YYStack rhs, int n)
  {
    if (n > 0)
      return new Location (rhs.locationAt (n-1).begin, rhs.locationAt (0).end);
    else
      return new Location (rhs.locationAt (0).end);
  }

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>Parser</tt>.
   */
  public interface Lexer {
    /** Token returned by the scanner to signal the end of its input.  */
    public static final int EOF = 0;

/* Tokens.  */
    /** Token number,to be returned by the scanner.  */
    static final int K_CLASS = 258;
    /** Token number,to be returned by the scanner.  */
    static final int K_PUBLIC = 259;
    /** Token number,to be returned by the scanner.  */
    static final int K_STATIC = 260;
    /** Token number,to be returned by the scanner.  */
    static final int K_VOID = 261;
    /** Token number,to be returned by the scanner.  */
    static final int K_MAIN = 262;
    /** Token number,to be returned by the scanner.  */
    static final int K_STRING = 263;
    /** Token number,to be returned by the scanner.  */
    static final int K_EXTENDS = 264;
    /** Token number,to be returned by the scanner.  */
    static final int K_RETURN = 265;
    /** Token number,to be returned by the scanner.  */
    static final int K_INT = 266;
    /** Token number,to be returned by the scanner.  */
    static final int K_BOOLEAN = 267;
    /** Token number,to be returned by the scanner.  */
    static final int K_IF = 268;
    /** Token number,to be returned by the scanner.  */
    static final int K_ELSE = 269;
    /** Token number,to be returned by the scanner.  */
    static final int K_WHILE = 270;
    /** Token number,to be returned by the scanner.  */
    static final int K_PRINTLN = 271;
    /** Token number,to be returned by the scanner.  */
    static final int K_LENGTH = 272;
    /** Token number,to be returned by the scanner.  */
    static final int K_TRUE = 273;
    /** Token number,to be returned by the scanner.  */
    static final int K_FALSE = 274;
    /** Token number,to be returned by the scanner.  */
    static final int K_THIS = 275;
    /** Token number,to be returned by the scanner.  */
    static final int K_NEW = 276;
    /** Token number,to be returned by the scanner.  */
    static final int S_LBRACE = 277;
    /** Token number,to be returned by the scanner.  */
    static final int S_RBRACE = 278;
    /** Token number,to be returned by the scanner.  */
    static final int S_LBRACKET = 279;
    /** Token number,to be returned by the scanner.  */
    static final int S_RBRACKET = 280;
    /** Token number,to be returned by the scanner.  */
    static final int S_LSBRACKET = 281;
    /** Token number,to be returned by the scanner.  */
    static final int S_RSBRACKET = 282;
    /** Token number,to be returned by the scanner.  */
    static final int S_SEMICOLON = 283;
    /** Token number,to be returned by the scanner.  */
    static final int S_COMMA = 284;
    /** Token number,to be returned by the scanner.  */
    static final int S_DOT = 285;
    /** Token number,to be returned by the scanner.  */
    static final int O_ASSIGN = 286;
    /** Token number,to be returned by the scanner.  */
    static final int O_AND = 287;
    /** Token number,to be returned by the scanner.  */
    static final int O_LT = 288;
    /** Token number,to be returned by the scanner.  */
    static final int O_ADD = 289;
    /** Token number,to be returned by the scanner.  */
    static final int O_SUB = 290;
    /** Token number,to be returned by the scanner.  */
    static final int O_MUL = 291;
    /** Token number,to be returned by the scanner.  */
    static final int O_NOT = 292;
    /** Token number,to be returned by the scanner.  */
    static final int INTEGER_LITERAL = 293;
    /** Token number,to be returned by the scanner.  */
    static final int IDENTIFIER = 294;
    /** Token number,to be returned by the scanner.  */
    static final int UNEXPECTED = 295;


    /**
     * Method to retrieve the beginning position of the last scanned token.
     * @return the position at which the last scanned token starts.
     */
    Position getStartPos ();

    /**
     * Method to retrieve the ending position of the last scanned token.
     * @return the first position beyond the last scanned token.
     */
    Position getEndPos ();

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * and beginning/ending positions of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * referring to the given location in a user-defined way.
     *
     * @param loc The location of the element to which the
     *                error message is related
     * @param msg The string for the error message.
     */
     void yyerror (Location loc, String msg);
  }

  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public Parser (Lexer yylexer) 
  {
    
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  /**
   * Print an error message via the lexer.
   * Use a <code>null</code> location.
   * @param msg The error message.
   */
  public final void yyerror (String msg)
  {
    yylexer.yyerror ((Location)null, msg);
  }

  /**
   * Print an error message via the lexer.
   * @param loc The location associated with the message.
   * @param msg The error message.
   */
  public final void yyerror (Location loc, String msg)
  {
    yylexer.yyerror (loc, msg);
  }

  /**
   * Print an error message via the lexer.
   * @param pos The position associated with the message.
   * @param msg The error message.
   */
  public final void yyerror (Position pos, String msg)
  {
    yylexer.yyerror (new Location (pos), msg);
  }

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    private Location[] locStack = new Location[16];
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value                            , Location loc) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;
          
          Location[] newLocStack = new Location[size * 2];
          System.arraycopy (locStack, 0, newLocStack, 0, height);
          locStack = newLocStack;

          Object[] newValueStack = new Object[size * 2];
          System.arraycopy (valueStack, 0, newValueStack, 0, height);
          valueStack = newValueStack;

          size *= 2;
        }

      stateStack[height] = state;
      locStack[height] = loc;
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        java.util.Arrays.fill (locStack, height - num + 1, height + 1, null);
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Location locationAt (int i) {
      return locStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
          out.print (' ');
          out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yy_lr_goto_state_ (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - yyntokens_] + yystate;
    if (0 <= yyr && yyr <= yylast_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - yyntokens_];
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    Location yyloc = yylloc (yystack, yylen);

    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
          case 2:
  if (yyn == 2)
    /* "Parser.y":95  */ /* lalr1.java:489  */
    { result = new Goal(((MainClassDecl)(yystack.valueAt (2-(1)))), ((ArrayList<ClassDecl>)(yystack.valueAt (2-(2))))); yyval = result; ((BaseDecl)yyval).setPos((yyloc)); return YYACCEPT; };
  break;
    

  case 3:
  if (yyn == 3)
    /* "Parser.y":99  */ /* lalr1.java:489  */
    { yyval = new ArrayList<ClassDecl>(); };
  break;
    

  case 4:
  if (yyn == 4)
    /* "Parser.y":100  */ /* lalr1.java:489  */
    { ((ArrayList<ClassDecl>)(yystack.valueAt (2-(1)))).add(((ClassDecl)(yystack.valueAt (2-(2))))); yyval = ((ArrayList<ClassDecl>)(yystack.valueAt (2-(1)))); };
  break;
    

  case 5:
  if (yyn == 5)
    /* "Parser.y":104  */ /* lalr1.java:489  */
    { yyval = new MainClassDecl(((String)(yystack.valueAt (17-(2)))), ((Stmt)(yystack.valueAt (17-(15)))), ((String)(yystack.valueAt (17-(12))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 6:
  if (yyn == 6)
    /* "Parser.y":108  */ /* lalr1.java:489  */
    { yyval= new ClassDecl(((String)(yystack.valueAt (7-(2)))), ((String)(yystack.valueAt (7-(3)))), ((ArrayList<VarDecl>)(yystack.valueAt (7-(5)))), ((ArrayList<MethodDecl>)(yystack.valueAt (7-(6))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 7:
  if (yyn == 7)
    /* "Parser.y":112  */ /* lalr1.java:489  */
    { yyval = null; };
  break;
    

  case 8:
  if (yyn == 8)
    /* "Parser.y":113  */ /* lalr1.java:489  */
    { yyval = ((String)(yystack.valueAt (2-(2)))); };
  break;
    

  case 9:
  if (yyn == 9)
    /* "Parser.y":117  */ /* lalr1.java:489  */
    { yyval = new ArrayList<VarDecl>(); };
  break;
    

  case 10:
  if (yyn == 10)
    /* "Parser.y":118  */ /* lalr1.java:489  */
    { ((ArrayList<VarDecl>)(yystack.valueAt (2-(1)))).add(((VarDecl)(yystack.valueAt (2-(2))))); yyval = ((ArrayList<VarDecl>)(yystack.valueAt (2-(1)))); };
  break;
    

  case 11:
  if (yyn == 11)
    /* "Parser.y":122  */ /* lalr1.java:489  */
    { yyval = new ArrayList<MethodDecl>();; };
  break;
    

  case 12:
  if (yyn == 12)
    /* "Parser.y":123  */ /* lalr1.java:489  */
    { ((ArrayList<MethodDecl>)(yystack.valueAt (2-(1)))).add(((MethodDecl)(yystack.valueAt (2-(2))))); yyval = ((ArrayList<MethodDecl>)(yystack.valueAt (2-(1))));; };
  break;
    

  case 13:
  if (yyn == 13)
    /* "Parser.y":127  */ /* lalr1.java:489  */
    { yyval = new VarDecl(((String)(yystack.valueAt (3-(2)))), ((Type)(yystack.valueAt (3-(1))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 14:
  if (yyn == 14)
    /* "Parser.y":131  */ /* lalr1.java:489  */
    { yyval = new MethodDecl(((String)(yystack.valueAt (13-(3)))), ((Type)(yystack.valueAt (13-(2)))), ((ArrayList<VarDecl>)(yystack.valueAt (13-(5)))), ((ArrayList<VarDecl>)(yystack.valueAt (13-(8)))), ((ArrayList<Stmt>)(yystack.valueAt (13-(9)))), ((Exp)(yystack.valueAt (13-(11))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 15:
  if (yyn == 15)
    /* "Parser.y":135  */ /* lalr1.java:489  */
    { yyval = new ArrayList<VarDecl>(); };
  break;
    

  case 16:
  if (yyn == 16)
    /* "Parser.y":136  */ /* lalr1.java:489  */
    { yyval = ((ArrayList<VarDecl>)(yystack.valueAt (1-(1)))); };
  break;
    

  case 17:
  if (yyn == 17)
    /* "Parser.y":140  */ /* lalr1.java:489  */
    { ArrayList<VarDecl> l = new ArrayList<>(); l.add(((VarDecl)(yystack.valueAt (1-(1))))); yyval = l; };
  break;
    

  case 18:
  if (yyn == 18)
    /* "Parser.y":141  */ /* lalr1.java:489  */
    { ((ArrayList<VarDecl>)(yystack.valueAt (3-(1)))).add(((VarDecl)(yystack.valueAt (3-(3))))); yyval = ((ArrayList<VarDecl>)(yystack.valueAt (3-(1)))); };
  break;
    

  case 19:
  if (yyn == 19)
    /* "Parser.y":145  */ /* lalr1.java:489  */
    { yyval = new VarDecl(((String)(yystack.valueAt (2-(2)))), ((Type)(yystack.valueAt (2-(1))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 20:
  if (yyn == 20)
    /* "Parser.y":149  */ /* lalr1.java:489  */
    { yyval = new ArrayList<Stmt>(); };
  break;
    

  case 21:
  if (yyn == 21)
    /* "Parser.y":150  */ /* lalr1.java:489  */
    { yyval = ((ArrayList<Stmt>)(yystack.valueAt (1-(1)))); };
  break;
    

  case 22:
  if (yyn == 22)
    /* "Parser.y":154  */ /* lalr1.java:489  */
    { ArrayList<Stmt> l = new ArrayList<>(); l.add(((Stmt)(yystack.valueAt (1-(1))))); yyval = l; };
  break;
    

  case 23:
  if (yyn == 23)
    /* "Parser.y":155  */ /* lalr1.java:489  */
    { ((ArrayList<Stmt>)(yystack.valueAt (2-(1)))).add(((Stmt)(yystack.valueAt (2-(2))))); yyval = ((ArrayList<Stmt>)(yystack.valueAt (2-(1)))); };
  break;
    

  case 24:
  if (yyn == 24)
    /* "Parser.y":157  */ /* lalr1.java:489  */
    { yyerror(yystack.locationAt (1-(1)), "syntax error invalid statement"); ArrayList<Stmt> l = new ArrayList<>(); l.add(new InvStmt()); yyval = l; };
  break;
    

  case 25:
  if (yyn == 25)
    /* "Parser.y":158  */ /* lalr1.java:489  */
    { yyerror(yystack.locationAt (2-(2)), "syntax error invalid statement"); ((ArrayList<Stmt>)(yystack.valueAt (2-(1)))).add(new InvStmt()); yyval = ((ArrayList<Stmt>)(yystack.valueAt (2-(1)))); };
  break;
    

  case 26:
  if (yyn == 26)
    /* "Parser.y":162  */ /* lalr1.java:489  */
    { yyval = new IntArrayType(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 27:
  if (yyn == 27)
    /* "Parser.y":163  */ /* lalr1.java:489  */
    { yyval = new BoolType(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 28:
  if (yyn == 28)
    /* "Parser.y":164  */ /* lalr1.java:489  */
    { yyval = new IntType(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 29:
  if (yyn == 29)
    /* "Parser.y":165  */ /* lalr1.java:489  */
    { yyval = new ClassType(((String)(yystack.valueAt (1-(1))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 30:
  if (yyn == 30)
    /* "Parser.y":169  */ /* lalr1.java:489  */
    { yyval = new BlockStmt(((ArrayList<Stmt>)(yystack.valueAt (3-(2))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 31:
  if (yyn == 31)
    /* "Parser.y":170  */ /* lalr1.java:489  */
    { yyval = new IfStmt(((Exp)(yystack.valueAt (7-(3)))), ((Stmt)(yystack.valueAt (7-(5)))), ((Stmt)(yystack.valueAt (7-(7))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 32:
  if (yyn == 32)
    /* "Parser.y":171  */ /* lalr1.java:489  */
    { yyval = new WhileStmt(((Exp)(yystack.valueAt (5-(3)))), ((Stmt)(yystack.valueAt (5-(5))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 33:
  if (yyn == 33)
    /* "Parser.y":172  */ /* lalr1.java:489  */
    { yyval = new PrintlnStmt(((Exp)(yystack.valueAt (5-(3))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 34:
  if (yyn == 34)
    /* "Parser.y":173  */ /* lalr1.java:489  */
    { yyval = new AssignStmt(((String)(yystack.valueAt (4-(1)))), ((Exp)(yystack.valueAt (4-(3))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 35:
  if (yyn == 35)
    /* "Parser.y":174  */ /* lalr1.java:489  */
    { yyval = new ArrayAssignStmt(((String)(yystack.valueAt (7-(1)))), ((Exp)(yystack.valueAt (7-(3)))), ((Exp)(yystack.valueAt (7-(6))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 36:
  if (yyn == 36)
    /* "Parser.y":176  */ /* lalr1.java:489  */
    { yyerror((yyloc), "syntax error if statement required"); yyval = new InvStmt(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 37:
  if (yyn == 37)
    /* "Parser.y":177  */ /* lalr1.java:489  */
    { yyerror((yyloc), "syntax error invalid if statement"); yyval = new InvStmt(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 38:
  if (yyn == 38)
    /* "Parser.y":178  */ /* lalr1.java:489  */
    { yyerror((yyloc), "syntax error invalid while statement"); yyval = new InvStmt(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 39:
  if (yyn == 39)
    /* "Parser.y":179  */ /* lalr1.java:489  */
    { yyerror((yyloc), "syntax error invalid println statement"); yyval = new InvStmt(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 40:
  if (yyn == 40)
    /* "Parser.y":180  */ /* lalr1.java:489  */
    { yyerror((yyloc), "syntax error invalid statement"); yyval = new InvStmt(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 41:
  if (yyn == 41)
    /* "Parser.y":184  */ /* lalr1.java:489  */
    { yyval = new AndExp(((Exp)(yystack.valueAt (3-(1)))), ((Exp)(yystack.valueAt (3-(3))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 42:
  if (yyn == 42)
    /* "Parser.y":185  */ /* lalr1.java:489  */
    { yyval = new LessThanExp(((Exp)(yystack.valueAt (3-(1)))), ((Exp)(yystack.valueAt (3-(3))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 43:
  if (yyn == 43)
    /* "Parser.y":186  */ /* lalr1.java:489  */
    { yyval = new AddExp(((Exp)(yystack.valueAt (3-(1)))), ((Exp)(yystack.valueAt (3-(3))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 44:
  if (yyn == 44)
    /* "Parser.y":187  */ /* lalr1.java:489  */
    { yyval = new SubExp(((Exp)(yystack.valueAt (3-(1)))), ((Exp)(yystack.valueAt (3-(3))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 45:
  if (yyn == 45)
    /* "Parser.y":188  */ /* lalr1.java:489  */
    { yyval = new MulExp(((Exp)(yystack.valueAt (3-(1)))), ((Exp)(yystack.valueAt (3-(3))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 46:
  if (yyn == 46)
    /* "Parser.y":189  */ /* lalr1.java:489  */
    { yyval = new ArrayAccessExp(((Exp)(yystack.valueAt (4-(1)))), ((Exp)(yystack.valueAt (4-(3))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 47:
  if (yyn == 47)
    /* "Parser.y":190  */ /* lalr1.java:489  */
    { yyval = new ArrayLengthExp(((Exp)(yystack.valueAt (3-(1))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 48:
  if (yyn == 48)
    /* "Parser.y":191  */ /* lalr1.java:489  */
    { yyval = new MethodCallExp(((Exp)(yystack.valueAt (6-(1)))), ((String)(yystack.valueAt (6-(3)))), ((ArrayList<Exp>)(yystack.valueAt (6-(5))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 49:
  if (yyn == 49)
    /* "Parser.y":192  */ /* lalr1.java:489  */
    { yyval = new IntLiteralExp(((int)(yystack.valueAt (1-(1))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 50:
  if (yyn == 50)
    /* "Parser.y":193  */ /* lalr1.java:489  */
    { yyval = new TrueExp(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 51:
  if (yyn == 51)
    /* "Parser.y":194  */ /* lalr1.java:489  */
    { yyval = new FalseExp(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 52:
  if (yyn == 52)
    /* "Parser.y":195  */ /* lalr1.java:489  */
    { yyval = new IdentExp(((String)(yystack.valueAt (1-(1))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 53:
  if (yyn == 53)
    /* "Parser.y":196  */ /* lalr1.java:489  */
    { yyval = new ThisExp(); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 54:
  if (yyn == 54)
    /* "Parser.y":197  */ /* lalr1.java:489  */
    { yyval = new ArrayAllocExp(((Exp)(yystack.valueAt (5-(4))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 55:
  if (yyn == 55)
    /* "Parser.y":198  */ /* lalr1.java:489  */
    { yyval = new ObjectAllocExp(((String)(yystack.valueAt (4-(2))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 56:
  if (yyn == 56)
    /* "Parser.y":199  */ /* lalr1.java:489  */
    { yyval = new NotExp(((Exp)(yystack.valueAt (2-(2))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 57:
  if (yyn == 57)
    /* "Parser.y":200  */ /* lalr1.java:489  */
    { yyval = new BracketExp(((Exp)(yystack.valueAt (3-(2))))); ((BaseDecl)yyval).setPos((yyloc)); };
  break;
    

  case 58:
  if (yyn == 58)
    /* "Parser.y":204  */ /* lalr1.java:489  */
    { yyval = new ArrayList<Exp>(); };
  break;
    

  case 59:
  if (yyn == 59)
    /* "Parser.y":205  */ /* lalr1.java:489  */
    { yyval = ((ArrayList<Exp>)(yystack.valueAt (1-(1)))); };
  break;
    

  case 60:
  if (yyn == 60)
    /* "Parser.y":209  */ /* lalr1.java:489  */
    { ArrayList<Exp> l = new ArrayList<Exp>(); l.add(((Exp)(yystack.valueAt (1-(1))))); yyval = l; };
  break;
    

  case 61:
  if (yyn == 61)
    /* "Parser.y":210  */ /* lalr1.java:489  */
    { ((ArrayList<Exp>)(yystack.valueAt (3-(1)))).add(((Exp)(yystack.valueAt (3-(3))))); yyval = ((ArrayList<Exp>)(yystack.valueAt (3-(1)))); };
  break;
    


/* "Parser.java":919  */ /* lalr1.java:489  */
        default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval, yyloc);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    int yystate = yy_lr_goto_state_ (yystack.stateAt (0), yyr1_[yyn]);
    yystack.push (yystate, yyval, yyloc);
    return YYNEWSTATE;
  }


  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
              if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }


  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
                                 Object yyvaluep                                 , Object yylocationp)
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
              + yytname_[yytype] + " ("
              + yylocationp + ": "
              + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }


  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
   public boolean parse () throws java.io.IOException

  {
    /* @$.  */
    Location yyloc;


    /* Lookahead and lookahead in internal form.  */
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;

    /* Error handling.  */
    int yynerrs_ = 0;
    /* The location where the error started.  */
    Location yyerrloc = null;

    /* Location. */
    Location yylloc = new Location (null, null);

    /* Semantic value of the lookahead.  */
    Object yylval = null;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval , yylloc);



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {


            yycdebug ("Reading a token: ");
            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal ();
            yylloc = new Location (yylexer.getStartPos (),
                            yylexer.getEndPos ());

          }

        /* Convert token to internal form.  */
        if (yychar <= Lexer.EOF)
          {
            yychar = yytoken = Lexer.EOF;
            yycdebug ("Now at end of input.\n");
          }
        else
          {
            yytoken = yytranslate_ (yychar);
            yy_symbol_print ("Next token is", yytoken,
                             yylval, yylloc);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
            if (yy_table_value_is_error_ (yyn))
              label = YYERRLAB;
            else
              {
                yyn = -yyn;
                label = YYREDUCE;
              }
          }

        else
          {
            /* Shift the lookahead token.  */
            yy_symbol_print ("Shifting", yytoken,
                             yylval, yylloc);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval, yylloc);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
        yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yylloc, yysyntax_error (yystate, yytoken));
          }

        yyerrloc = yylloc;
        if (yyerrstatus_ == 3)
          {
        /* If just tried and failed to reuse lookahead token after an
         error, discard it.  */

        if (yychar <= Lexer.EOF)
          {
          /* Return failure if at end of input.  */
          if (yychar == Lexer.EOF)
            return false;
          }
        else
            yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:

        yyerrloc = yystack.locationAt (yylen - 1);
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                yyn += yyterror_;
                if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;

            yyerrloc = yystack.locationAt (0);
            yystack.pop ();
            yystate = yystack.stateAt (0);
            if (yydebug > 0)
              yystack.print (yyDebugStream);
          }

        if (label == YYABORT)
            /* Leave the switch.  */
            break;


        /* Muck with the stack to setup for yylloc.  */
        yystack.push (0, null, yylloc);
        yystack.push (0, null, yyerrloc);
        yyloc = yylloc (yystack, 2);
        yystack.pop (2);

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
                         yylval, yyloc);

        yystate = yyn;
        yystack.push (yyn, yylval, yyloc);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (yyErrorVerbose)
      {
        /* There are many possibilities here to consider:
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
        if (tok != yyempty_)
          {
            /* FIXME: This method of building the message is not compatible
               with internationalization.  */
            StringBuffer res =
              new StringBuffer ("syntax error, unexpected ");
            res.append (yytnamerr_ (yytname_[tok]));
            int yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                int yychecklim = yylast_ - yyn + 1;
                int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                int count = 0;
                for (int x = yyxbegin; x < yyxend; ++x)
                  if (yycheck_[x + yyn] == x && x != yyterror_
                      && !yy_table_value_is_error_ (yytable_[x + yyn]))
                    ++count;
                if (count < 5)
                  {
                    count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                      if (yycheck_[x + yyn] == x && x != yyterror_
                          && !yy_table_value_is_error_ (yytable_[x + yyn]))
                        {
                          res.append (count++ == 0 ? ", expecting " : " or ");
                          res.append (yytnamerr_ (yytname_[x]));
                        }
                  }
              }
            return res.toString ();
          }
      }

    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final short yypact_ninf_ = -65;
  private static final short yytable_ninf_ = -22;

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short yypact_[] = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
      15,   -20,    49,   -65,    30,   -65,    62,    63,    31,   -65,
      66,    65,    69,    39,    71,    89,   -65,   -65,    73,    -7,
      95,    78,   -65,   -65,    40,   -65,    67,    82,    80,    -7,
     -65,   -65,    84,    83,   -65,    70,   -65,    74,    90,    97,
      -7,   108,   106,   105,   -65,    93,    76,   120,    -7,   -65,
     116,     9,    76,    13,    19,    72,    38,   123,   -65,   -65,
     -65,   -65,    81,   -65,   -65,    81,   -65,    81,   116,   131,
      12,   -65,    81,    81,   132,    44,   -65,   -65,   -65,    -9,
      81,    81,   -65,   -65,    91,   103,   115,   -65,   116,   -65,
     138,   149,   -65,    38,   133,   130,   134,   127,    20,    76,
      81,   -10,    81,    81,    81,    81,    81,    76,   139,   135,
     -65,    81,    81,   144,   -65,   162,   160,   -65,   154,   215,
      46,   -15,   -15,    20,   -65,   -65,    81,   171,   182,   -65,
      76,   -65,    81,   193,   157,   -65,   -65,   204,   163,   169,
     -65,   -65,   -65,    81,   204
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final byte yydefact_[] = yydefact_init();
  private static final byte[] yydefact_init()
  {
    return new byte[]
    {
       0,     0,     0,     3,     0,     1,     2,     0,     0,     4,
       0,     7,     0,     0,     0,     0,     8,     9,     0,    11,
       0,    28,    27,    29,     0,    10,     0,     0,     0,     0,
       6,    12,     0,     0,    26,     0,    13,     0,     0,     0,
      15,     0,     0,    16,    17,     0,     0,     0,     0,    19,
       0,     0,     0,     0,     0,     0,     0,     0,     9,    18,
      40,    37,     0,    36,    38,     0,    39,     0,    24,     0,
       0,    22,     0,     0,     0,     0,    50,    51,    53,     0,
       0,     0,    49,    52,     0,     0,     0,    30,    25,    23,
       0,     0,     5,    29,     0,     0,     0,     0,    56,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
      34,     0,     0,     0,    57,     0,     0,    47,     0,    41,
      42,    43,    44,    45,    32,    33,     0,     0,     0,    55,
       0,    46,    58,     0,     0,    54,    31,    60,     0,    59,
      35,    14,    48,     0,    61
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
     -65,   -65,   -65,   -65,   -65,   -65,   142,   -65,   -65,   -65,
     -65,   -65,   141,   136,   -65,   -17,   -46,   -64,   -65,   -65
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short yydefgoto_[] = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
      -1,     2,     6,     3,     9,    14,    19,    24,    25,    31,
      42,    43,    44,    69,    70,    26,    71,    84,   138,   139
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final short yytable_[] = yytable_init();
  private static final short[] yytable_init()
  {
    return new short[]
    {
      57,    85,    95,    86,    21,    22,    63,   117,    90,    91,
      61,   100,    35,    88,    64,   101,    97,    98,     1,     4,
      66,   106,   -21,    45,    89,    51,    52,    53,    54,   118,
      96,    45,    23,    62,    55,   -21,   116,    65,   119,   120,
     121,   122,   123,    67,    29,    68,   100,   127,   128,     5,
     101,    56,     7,   115,   -20,    21,    22,    51,    52,    53,
      54,   124,   133,    30,    72,     8,    55,    10,   137,    73,
      11,    12,   100,    68,    13,    15,   101,    50,    16,   144,
     104,   105,   106,    93,   136,    51,    52,    53,    54,    51,
      52,    53,    54,    17,    55,   -20,    18,    20,    55,    76,
      77,    78,    79,    27,    28,    80,    32,    34,    33,    38,
      37,    56,    36,    39,    40,    56,    99,   100,    81,    82,
      83,   101,    41,   102,   103,   104,   105,   106,   107,   100,
      46,    47,    49,   101,    48,   102,   103,   104,   105,   106,
     108,   100,    58,   111,    60,   101,    74,   102,   103,   104,
     105,   106,   114,   100,    87,    92,   112,   101,   113,   102,
     103,   104,   105,   106,   100,   109,   126,   125,   101,   129,
     102,   103,   104,   105,   106,   100,   130,   110,   132,   101,
     141,   102,   103,   104,   105,   106,   100,   131,   142,    59,
     101,     0,   102,   103,   104,   105,   106,   100,   143,   134,
      75,   101,     0,   102,   103,   104,   105,   106,   100,   135,
       0,    94,   101,     0,   102,   103,   104,   105,   106,   100,
       0,   140,     0,   101,     0,   102,   103,   104,   105,   106,
     100,     0,     0,     0,   101,     0,   102,   103,   104,   105,
     106,   100,     0,     0,     0,   101,     0,     0,   103,   104,
     105,   106
    };
  }

private static final short yycheck_[] = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
      46,    65,    11,    67,    11,    12,    52,    17,    72,    73,
       1,    26,    29,     1,     1,    30,    80,    81,     3,    39,
       1,    36,    10,    40,    70,    13,    14,    15,    16,    39,
      39,    48,    39,    24,    22,    23,   100,    24,   102,   103,
     104,   105,   106,    24,     4,     1,    26,   111,   112,     0,
      30,    39,    22,    99,    10,    11,    12,    13,    14,    15,
      16,   107,   126,    23,    26,     3,    22,     4,   132,    31,
      39,     5,    26,     1,     9,     6,    30,     1,    39,   143,
      34,    35,    36,    39,   130,    13,    14,    15,    16,    13,
      14,    15,    16,    22,    22,    23,     7,    24,    22,    18,
      19,    20,    21,     8,    26,    24,    39,    27,    26,    39,
      27,    39,    28,    39,    24,    39,    25,    26,    37,    38,
      39,    30,    25,    32,    33,    34,    35,    36,    25,    26,
      22,    25,    39,    30,    29,    32,    33,    34,    35,    36,
      25,    26,    22,    10,    28,    30,    23,    32,    33,    34,
      35,    36,    25,    26,    23,    23,    26,    30,    24,    32,
      33,    34,    35,    36,    26,    27,    31,    28,    30,    25,
      32,    33,    34,    35,    36,    26,    14,    28,    24,    30,
      23,    32,    33,    34,    35,    36,    26,    27,    25,    48,
      30,    -1,    32,    33,    34,    35,    36,    26,    29,    28,
      58,    30,    -1,    32,    33,    34,    35,    36,    26,    27,
      -1,    75,    30,    -1,    32,    33,    34,    35,    36,    26,
      -1,    28,    -1,    30,    -1,    32,    33,    34,    35,    36,
      26,    -1,    -1,    -1,    30,    -1,    32,    33,    34,    35,
      36,    26,    -1,    -1,    -1,    30,    -1,    -1,    33,    34,
      35,    36
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final byte yystos_[] = yystos_init();
  private static final byte[] yystos_init()
  {
    return new byte[]
    {
       0,     3,    42,    44,    39,     0,    43,    22,     3,    45,
       4,    39,     5,     9,    46,     6,    39,    22,     7,    47,
      24,    11,    12,    39,    48,    49,    56,     8,    26,     4,
      23,    50,    39,    26,    27,    56,    28,    27,    39,    39,
      24,    25,    51,    52,    53,    56,    22,    25,    29,    39,
       1,    13,    14,    15,    16,    22,    39,    57,    22,    53,
      28,     1,    24,    57,     1,    24,     1,    24,     1,    54,
      55,    57,    26,    31,    23,    47,    18,    19,    20,    21,
      24,    37,    38,    39,    58,    58,    58,    23,     1,    57,
      58,    58,    23,    39,    54,    11,    39,    58,    58,    25,
      26,    30,    32,    33,    34,    35,    36,    25,    25,    27,
      28,    10,    26,    24,    25,    57,    58,    17,    39,    58,
      58,    58,    58,    58,    57,    28,    31,    58,    58,    25,
      14,    27,    24,    58,    28,    27,    57,    58,    59,    60,
      28,    23,    25,    29,    58
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte yyr1_[] = yyr1_init();
  private static final byte[] yyr1_init()
  {
    return new byte[]
    {
       0,    41,    42,    43,    43,    44,    45,    46,    46,    47,
      47,    48,    48,    49,    50,    51,    51,    52,    52,    53,
      54,    54,    55,    55,    55,    55,    56,    56,    56,    56,
      57,    57,    57,    57,    57,    57,    57,    57,    57,    57,
      57,    58,    58,    58,    58,    58,    58,    58,    58,    58,
      58,    58,    58,    58,    58,    58,    58,    58,    59,    59,
      60,    60
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte yyr2_[] = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     2,     0,     2,    17,     7,     0,     2,     0,
       2,     0,     2,     3,    13,     0,     1,     1,     3,     2,
       0,     1,     1,     2,     1,     2,     3,     1,     1,     1,
       3,     7,     5,     5,     4,     7,     2,     2,     2,     2,
       2,     3,     3,     3,     3,     3,     4,     3,     6,     1,
       1,     1,     1,     1,     5,     4,     2,     3,     0,     1,
       1,     3
    };
  }

  /* YYTOKEN_NUMBER[YYLEX-NUM] -- Internal symbol number corresponding
      to YYLEX-NUM.  */
  private static final short yytoken_number_[] = yytoken_number_init();
  private static final short[] yytoken_number_init()
  {
    return new short[]
    {
       0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295
    };
  }

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
    {
  "$end", "error", "$undefined", "\"class\"", "\"public\"", "\"static\"",
  "\"void\"", "\"main\"", "\"String\"", "\"extends\"", "\"return\"",
  "\"int\"", "\"boolean\"", "\"if\"", "\"else\"", "\"while\"", "K_PRINTLN",
  "\"length\"", "\"true\"", "\"false\"", "\"this\"", "\"new\"", "\"{\"",
  "\"}\"", "\"(\"", "\")\"", "\"[\"", "\"]\"", "\";\"", "\",\"", "\".\"",
  "\"=\"", "\"&&\"", "\"<\"", "\"+\"", "\"-\"", "\"*\"", "\"!\"",
  "INTEGER_LITERAL", "IDENTIFIER", "UNEXPECTED", "$accept", "goal",
  "classes", "main_class", "class_declaration", "extends", "vars",
  "methods", "var_declaration", "method_declaration", "params",
  "params_nonempty", "param_declaration", "statements",
  "statements_nonempty", "type", "statement", "expression", "args",
  "args_nonempty", null
    };
  }

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] = yyrline_init();
  private static final short[] yyrline_init()
  {
    return new short[]
    {
       0,    95,    95,    99,   100,   104,   108,   112,   113,   117,
     118,   122,   123,   127,   131,   135,   136,   140,   141,   145,
     149,   150,   154,   155,   157,   158,   162,   163,   164,   165,
     169,   170,   171,   172,   173,   174,   176,   177,   178,   179,
     180,   184,   185,   186,   187,   188,   189,   190,   191,   192,
     193,   194,   195,   196,   197,   198,   199,   200,   204,   205,
     209,   210
    };
  }


  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
              + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
                       yystos_[yystack.stateAt(yynrhs - (yyi + 1))],
                       ((yystack.valueAt (yynrhs-(yyi + 1)))),
                       yystack.locationAt (yynrhs-(yyi + 1)));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40
    };
  }

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 251;
  private static final int yynnts_ = 20;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 5;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 41;

  private static final int yyuser_token_number_max_ = 295;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */
/* "Parser.y":14  */ /* lalr1.java:1066  */

    private Goal result = null;
    public Goal getResult() {
        return result;
    }

/* "Parser.java":1686  */ /* lalr1.java:1066  */

}

/* "Parser.y":213  */ /* lalr1.java:1070  */

