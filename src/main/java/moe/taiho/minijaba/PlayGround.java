package moe.taiho.minijaba;

import moe.taiho.minijaba.ast.Goal;
import moe.taiho.minijaba.backend.Interpreter;

import java.io.*;

public class PlayGround {
    static public void main(String[] args) throws IOException {
        Reader reader = new BufferedReader(new FileReader("test.java"));
        //Reader reader = new StringReader("class Main { gg");
        Lexer lexer = new Lexer(reader);
        Parser parser = new Parser(lexer);
        parser.parse();
        Goal goal = parser.getResult();
        Interpreter.Context ctx = new Interpreter.Context(goal);
        //ctx.run();
    }
}