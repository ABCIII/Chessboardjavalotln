import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class MethodicalChessboard extends GraphicsProgram {

    
    public void run() {
		drawChessboard();
		drawSquare();
		drawpiece();
		
	}

	public void drawChessboard() {
		GRect R1 = new GRect(200, 200, 50, 50);
		GRect R2 = new GRect(250, 200, 50, 50);
		R2.setFilled(true);
		R2.setFillColor(Color.LIGHT_GRAY);
		GRect R3 = new GRect(300, 200, 50, 50);
		GRect R4 = new GRect(350, 200, 50, 50);
		R4.setFilled(true);
		R4.setFillColor(Color.LIGHT_GRAY);
		GRect R5 = new GRect(400, 200, 50, 50);
		GRect R6 = new GRect(450, 200, 50, 50);
		R6.setFilled(true);
		R6.setFillColor(Color.LIGHT_GRAY);
		GRect R7 = new GRect(500, 200, 50, 50);
		GRect R8 = new GRect(550, 200, 50, 50);
		R8.setFilled(true);
		R8.setFillColor(Color.LIGHT_GRAY);
		GRect R9 = new GRect(200, 250, 50, 50);
		R9.setFilled(true);
		R9.setFillColor(Color.LIGHT_GRAY);
		GRect R10 = new GRect(250, 250, 50, 50);
		GRect R11 = new GRect(300, 250, 50, 50);
		R11.setFilled(true);
		R11.setFillColor(Color.LIGHT_GRAY);
		GRect R12 = new GRect(350, 250, 50, 50);
		GRect R13 = new GRect(400, 250, 50, 50);
		R13.setFilled(true);
		R13.setFillColor(Color.LIGHT_GRAY);
		GRect R14 = new GRect(450, 250, 50, 50);
		GRect R15 = new GRect(500, 250, 50, 50);
		R15.setFilled(true);
		R15.setFillColor(Color.LIGHT_GRAY);
		GRect R16 = new GRect(550, 250, 50, 50);
		GRect R17 = new GRect(200, 300, 50, 50);
		GRect R18 = new GRect(250, 300, 50, 50);
		R18.setFilled(true);
		R18.setFillColor(Color.LIGHT_GRAY);
		GRect R19 = new GRect(300, 300, 50, 50);
		GRect R20 = new GRect(350, 300, 50, 50);
		R20.setFilled(true);
		R20.setFillColor(Color.LIGHT_GRAY);
		GRect R21 = new GRect(400, 300, 50, 50);
		GRect R22 = new GRect(450, 300, 50, 50);
		R22.setFilled(true);
		R22.setFillColor(Color.LIGHT_GRAY);
		GRect R23 = new GRect(500, 300, 50, 50);
		GRect R24 = new GRect(550, 300, 50, 50);
		R24.setFilled(true);
		R24.setFillColor(Color.LIGHT_GRAY);
		GRect R25 = new GRect(200, 350, 50, 50);
		GRect R26 = new GRect(250, 350, 50, 50);
		R25.setFilled(true);
		R25.setFillColor(Color.LIGHT_GRAY);
		GRect R27 = new GRect(300, 350, 50, 50);
		GRect R28 = new GRect(350, 350, 50, 50);
		R27.setFilled(true);
		R27.setFillColor(Color.LIGHT_GRAY);
		GRect R29 = new GRect(400, 350, 50, 50);
		GRect R30 = new GRect(450, 350, 50, 50);
		R29.setFilled(true);
		R29.setFillColor(Color.LIGHT_GRAY);
		GRect R31 = new GRect(500, 350, 50, 50);
		GRect R32 = new GRect(550, 350, 50, 50);
		R31.setFilled(true);
		R31.setFillColor(Color.LIGHT_GRAY);
		GRect R33 = new GRect(200, 400, 50, 50);
		GRect R34 = new GRect(250, 400, 50, 50);
		R34.setFilled(true);
		R34.setFillColor(Color.LIGHT_GRAY);
		GRect R35 = new GRect(300, 400, 50, 50);
		GRect R36 = new GRect(350, 400, 50, 50);
		R36.setFilled(true);
		R36.setFillColor(Color.LIGHT_GRAY);
		GRect R37 = new GRect(400, 400, 50, 50);
		GRect R38 = new GRect(450, 400, 50, 50);
		R38.setFilled(true);
		R38.setFillColor(Color.LIGHT_GRAY);
		GRect R39 = new GRect(500, 400, 50, 50);
		GRect R40 = new GRect(550, 400, 50, 50);
		R40.setFilled(true);
		R40.setFillColor(Color.LIGHT_GRAY);
		GRect R41 = new GRect(200, 450, 50, 50);
		GRect R42 = new GRect(250, 450, 50, 50);
		R41.setFilled(true);
		R41.setFillColor(Color.LIGHT_GRAY);
		GRect R43 = new GRect(300, 450, 50, 50);
		GRect R44 = new GRect(350, 450, 50, 50);
		R43.setFilled(true);
		R43.setFillColor(Color.LIGHT_GRAY);
		GRect R45 = new GRect(400, 450, 50, 50);
		GRect R46 = new GRect(450, 450, 50, 50);
		R45.setFilled(true);
		R45.setFillColor(Color.LIGHT_GRAY);
		GRect R47 = new GRect(500, 450, 50, 50);
		GRect R48 = new GRect(550, 450, 50, 50);
		R47.setFilled(true);
		R47.setFillColor(Color.LIGHT_GRAY);
		GRect R49 = new GRect(200, 500, 50, 50);
		GRect R50 = new GRect(250, 500, 50, 50);
		R50.setFilled(true);
		R50.setFillColor(Color.LIGHT_GRAY);
		GRect R51 = new GRect(300, 500, 50, 50);
		GRect R52 = new GRect(350, 500, 50, 50);
		R52.setFilled(true);
		R52.setFillColor(Color.LIGHT_GRAY);
		GRect R53 = new GRect(400, 500, 50, 50);
		GRect R54 = new GRect(450, 500, 50, 50);
		R54.setFilled(true);
		R54.setFillColor(Color.LIGHT_GRAY);
		GRect R55 = new GRect(500, 500, 50, 50);
		GRect R56 = new GRect(550, 500, 50, 50);
		R56.setFilled(true);
		R56.setFillColor(Color.LIGHT_GRAY);
		GRect R57 = new GRect(200, 550, 50, 50);
		GRect R58 = new GRect(250, 550, 50, 50);
		R57.setFilled(true);
		R57.setFillColor(Color.LIGHT_GRAY);
		GRect R59 = new GRect(300, 550, 50, 50);
		GRect R60 = new GRect(350, 550, 50, 50);
		R59.setFilled(true);
		R59.setFillColor(Color.LIGHT_GRAY);
		GRect R61 = new GRect(400, 550, 50, 50);
		GRect R62 = new GRect(450, 550, 50, 50);
		R61.setFilled(true);
		R61.setFillColor(Color.LIGHT_GRAY);
		GRect R63 = new GRect(500, 550, 50, 50);
		GRect R64 = new GRect(550, 550, 50, 50);
		R63.setFilled(true);
		R63.setFillColor(Color.LIGHT_GRAY);

		add(R1);
		add(R2);
		add(R3);
		add(R4);
		add(R5);
		add(R6);
		add(R7);
		add(R8);
		add(R9);
		add(R10);
		add(R11);
		add(R12);
		add(R13);
		add(R14);
		add(R15);
		add(R16);
		add(R17);
		add(R18);
		add(R19);
		add(R20);
		add(R21);
		add(R22);
		add(R23);
		add(R24);
		add(R25);
		add(R26);
		add(R27);
		add(R28);
		add(R29);
		add(R30);
		add(R31);
		add(R32);
		add(R33);
		add(R34);
		add(R35);
		add(R36);
		add(R37);
		add(R38);
		add(R39);
		add(R40);
		add(R41);
		add(R42);
		add(R43);
		add(R44);
		add(R45);
		add(R46);
		add(R47);
		add(R48);
		add(R49);
		add(R50);
		add(R51);
		add(R52);
		add(R53);
		add(R54);
		add(R55);
		add(R56);
		add(R57);
		add(R58);
		add(R59);
		add(R60);
		add(R61);
		add(R62);
		add(R63);
		add(R64);
	}

	public void drawSquare() {
		add(new GLabel("8", 175, 225));
		add(new GLabel("7", 175, 275));
		add(new GLabel("6", 175, 325));
		add(new GLabel("5", 175, 375));
		add(new GLabel("4", 175, 425));
		add(new GLabel("3", 175, 475));
		add(new GLabel("2", 175, 525));
		add(new GLabel("1", 175, 575));

		add(new GLabel("8", 625, 225));
		add(new GLabel("7", 625, 275));
		add(new GLabel("6", 625, 325));
		add(new GLabel("5", 625, 375));
		add(new GLabel("4", 625, 425));
		add(new GLabel("3", 625, 475));
		add(new GLabel("2", 625, 525));
		add(new GLabel("1", 625, 575));

		add(new GLabel("A", 225, 175));
		add(new GLabel("B", 275, 175));
		add(new GLabel("C", 325, 175));
		add(new GLabel("D", 375, 175));
		add(new GLabel("E", 425, 175));
		add(new GLabel("F", 475, 175));
		add(new GLabel("G", 525, 175));
		add(new GLabel("H", 575, 175));

		add(new GLabel("A", 225, 625));
		add(new GLabel("B", 275, 625));
		add(new GLabel("C", 325, 625));
		add(new GLabel("D", 375, 625));
		add(new GLabel("E", 425, 625));
		add(new GLabel("F", 475, 625));
		add(new GLabel("G", 525, 625));
		add(new GLabel("H", 575, 625));
	}

public void drawpiece() {
	/**
	 * Black Pieces
	 */
	
	//adds Black Pawn
	GLabel F1 = new GLabel("\u265F",210,285);
	F1.setLabel("\u265F");
	F1.setColor(Color.BLACK);
	F1.setFont("SansSerif-35");
	add (F1);
	GLabel F2 = new GLabel("\u265F",260,285);
	F2.setLabel("\u265F");
	F2.setColor(Color.BLACK);
	F2.setFont("SansSerif-35");
	add (F2);
	GLabel F3 = new GLabel("\u265F",310,285);
	F3.setLabel("\u265F");
	F3.setColor(Color.BLACK);
	F3.setFont("SansSerif-35");
	add (F3);
	GLabel F4 = new GLabel("\u265F",360,285);
	F4.setLabel("\u265F");
	F4.setColor(Color.BLACK);
	F4.setFont("SansSerif-35");
	add (F4);
	GLabel F5 = new GLabel("\u265F",410,285);
	F5.setLabel("\u265F");
	F5.setColor(Color.BLACK);
	F5.setFont("SansSerif-35");
	add (F5);
	GLabel F6 = new GLabel("\u265F",460,285);
	F6.setLabel("\u265F");
	F6.setColor(Color.BLACK);
	F6.setFont("SansSerif-35");
	add (F6);
	GLabel F7 = new GLabel("\u265F",510,285);
	F7.setLabel("\u265F");
	F7.setColor(Color.BLACK);
	F7.setFont("SansSerif-35");
	add (F7);
	GLabel F8 = new GLabel("\u265F",560,285);
	F8.setLabel("\u265F");
	F8.setColor(Color.BLACK);
	F8.setFont("SansSerif-35");
	add (F8);
	//adds Black Knights
	GLabel K1 = new GLabel("\u265E",260,235);
	K1.setLabel("\u265E");
	K1.setColor(Color.BLACK);
	K1.setFont("SansSerif-35");
	add (K1);
	GLabel K2 = new GLabel("\u265E",510,235);
	K2.setLabel("\u265E");
	K2.setColor(Color.BLACK);
	K2.setFont("SansSerif-35");
	add (K2);
	//adds Black Bishop
	GLabel B1 = new GLabel("\u265D",310,235);
	B1.setLabel("\u265D");
	B1.setColor(Color.BLACK);
	B1.setFont("SansSerif-35");
	add (B1);
	GLabel B2 = new GLabel("\u265D",460,235);
	B2.setLabel("\u265D");
	B2.setColor(Color.BLACK);
	B2.setFont("SansSerif-35");
	add (B2);
	//adds Black Rook
	GLabel R1 = new GLabel("\u265C",210,235);
	R1.setLabel("\u265C");
	R1.setColor(Color.BLACK);
	R1.setFont("SansSerif-35");
	add (R1);
	GLabel R2 = new GLabel("\u265C",560,235);
	R2.setLabel("\u265C");
	R2.setColor(Color.BLACK);
	R2.setFont("SansSerif-35");
	add (R2);
	//add Black Queen
	GLabel Q1 = new GLabel("\u265B",360,235);
	Q1.setLabel("\u265B");
	Q1.setColor(Color.BLACK);
	Q1.setFont("SansSerif-35");
	add (Q1);
	//add Black King
	GLabel BK1 = new GLabel("\u265A",410,235);
	BK1.setLabel("\u265A");
	BK1.setColor(Color.BLACK);
	BK1.setFont("SansSerif-35");
	add (BK1);
	/** 
	 * White Pieces
	 */
	
	//adds White Pawn
	GLabel P1 = new GLabel("\u2659",210,535);
	P1.setLabel("\u2659");
	P1.setFont("SansSerif-35");
	add (P1);
	GLabel P2 = new GLabel("\u2659",260,535);
	P2.setLabel("\u2659");
	P2.setFont("SansSerif-35");
	add (P2);
	GLabel P3 = new GLabel("\u2659",310,535);
	P3.setLabel("\u2659");
	P3.setFont("SansSerif-35");
	add (P3);
	GLabel P4 = new GLabel("\u2659",360,535);
	P4.setLabel("\u2659");
	P4.setFont("SansSerif-35");
	add (P4);
	GLabel P5 = new GLabel("\u2659",410,535);
	P5.setLabel("\u2659");
	P5.setFont("SansSerif-35");
	add (P5);
	GLabel P6 = new GLabel("\u2659",460,535);
	P6.setLabel("\u2659");
	P6.setFont("SansSerif-35");
	add (P6);
	GLabel P7 = new GLabel("\u2659",510,535);
	P7.setLabel("\u2659");
	P7.setFont("SansSerif-35");
	add (P7);
	GLabel P8 = new GLabel("\u2659",560,535);
	P8.setLabel("\u2659");
	P8.setFont("SansSerif-35");
	add (P8);
	//adds White Knights
	GLabel wK1 = new GLabel("\u2658",260,585);
	wK1.setLabel("\u2658");
	wK1.setFont("SansSerif-35");
	add (wK1);
	GLabel wK2 = new GLabel("\u2658",510,585);
	wK2.setLabel("\u2658");
	wK2.setFont("SansSerif-35");
	add (wK2);
	//adds White Bishop
	GLabel WB1 = new GLabel("\u2657",310,585);
	WB1.setLabel("\u2657");
	WB1.setFont("SansSerif-35");
	add (WB1);
	GLabel WB2 = new GLabel("\u2657",460,585);
	WB2.setLabel("\u2657");
	WB2.setFont("SansSerif-35");
	add (WB2);
	//adds White Rook
	GLabel WR1 = new GLabel("\u2656",210,585);
	WR1.setLabel("\u2656");
	WR1.setFont("SansSerif-35");
	add (WR1);
	GLabel WR2 = new GLabel("\u2656",560,585);
	WR2.setLabel("\u2656");
	WR2.setFont("SansSerif-35");
	add (WR2);
	//add White Queen
	GLabel WQ1 = new GLabel("\u2655",360,585);
	WQ1.setLabel("\u2655");
	WQ1.setFont("SansSerif-35");
	add (WQ1);
	//add White King
	GLabel WK1 = new GLabel("\u2654",410,585);
	WK1.setLabel("\u2654");
	WK1.setFont("SansSerif-35");
	add (WK1);
	}



}

/**
 * Method
 * "drawChessboard();drawLabels();drawpieces();" are my tree selfmade methode. also we used the method run() 
 *Parameter
 *
 *My used Paramethers are Color,Strings and variables
 *
 *Type methodtype: draw -> adds GOjects to Applet variabletypes: string, value 
 *
 *Argument V.setLable("'backslash'uxxxxx") adds Unicodes 
 *
 *Scope and Control statement are used for loops and i dont used any loop in this program.
 *But Scope can be some variables and control statement is eg. " if(Control Statement){} oder auch
 *while(Control statement){...}
 */
