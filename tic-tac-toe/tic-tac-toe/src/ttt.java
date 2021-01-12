import java.util.Scanner;
import java.util.Random;

public class ttt {
	
	//private static char a[][];
	public static void main(String[]args)
	{
		String a[][]= new String[3][3];
		
		
		Scanner scan= new Scanner(System.in);
		Random rand= new Random();
		
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t!!! THIS IS A TIC-TAC-TOE GAME !!! ");
		System.out.println("*********************************************************************************");  //instructions
		System.out.println("");
		System.out.println("\t   |   |   ");
		System.out.println("\t00 |01 | 02 ");
		System.out.println("\t   |   |   ");
		System.out.println("\t------------");
		System.out.println("\t   |   |   ");
		System.out.println("\t10 |11  |12 ");
		System.out.println("\t   |   |   ");
		System.out.println("\t-------------");
		System.out.println("\t   |   |   ");
		System.out.println("\t20 |21 | 22 ");
		System.out.println("\t   |   |   ");
		System.out.println("");
		System.out.println("");
		System.out.println("\tyou have to mark cross (X) by telling the position (row column)");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	//**********************************************************************************************************************************************************************************	
		System.out.println("COMPUTER's turn");
		System.out.println("");
		int row=rand.nextInt(3);
		int col=rand.nextInt(3);
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				
				if(i==row && j==col){
					a[i][j]="O";
				}
				else
					{
					a[i][j]=" ";
					}
				
				System.out.print(" |"+a[i][j]+" ");
				
				
			}
			
			System.out.println("");
		}
		
		System.out.println("");
		
//*************************************************************************************************************************************************************************************		
		
		System.out.println("");
		System.out.println("your turn");
		System.out.println("");
		System.out.println("enter the position where you wanted to enter X (row  column)");
		
		int row0= scan.nextInt();
		int col0= scan.nextInt();

		System.out.println("");
		System.out.println("");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(i==row0 && j==col0){
					a[i][j]="X";
				}

				else if(i==row && j==col){
					a[i][j]="O";
				}
				
				else
					{
					a[i][j]=" ";
					}
				
				System.out.print(" |"+a[i][j]+" ");
				
			}
			System.out.println("");
			}
		
		System.out.println("");
		
		//******************************************************************************************************************************************************************************
		
		System.out.println("");
		System.out.println("Computer's turn");
		
		
		int arow=rand.nextInt(3);
		int acol=rand.nextInt(3);
		if(a[arow][acol]=="X" || a[arow][acol]=="O")
		{
			++arow;
			if(arow>2){
				arow=arow-2;
				if(arow<0){
					arow=arow+3;
				}
			}
				if(a[arow][acol]=="X" || a[arow][acol]=="O")
				{
					++acol;
					if(acol>2){
						acol=acol-2;
						if(acol<0){
							acol=acol+3;
						}
				}
			}
			
		}
		
		System.out.println("");
		System.out.println("");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(i==row0 && j==col0){
					a[i][j]="X";
				}

				else if(i==row && j==col){
					a[i][j]="O";
				}
				else if(i==arow && j==acol){
					a[i][j]="O";
				}
				
				
				else
					{
					a[i][j]=" ";
					}
				
				System.out.print(" |"+a[i][j]+" ");
				
			}
			System.out.println("");
			}
		System.out.println("");
		
		//***************************************************************************************************************************************************************

		System.out.println("");
		System.out.println("your turn");
		System.out.println("");
		System.out.println("enter the position where you wanted to enter X (row  column)");
		
		int row1= scan.nextInt();
		int col1= scan.nextInt();
		System.out.println("");
		System.out.println("");
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(i==row0 && j==col0){
					a[i][j]="X";
				}
		
				else if(i==row1 && j==col1){
					a[i][j]="X";
				}

				else if(i==row && j==col){
					a[i][j]="O";
				}
				else if(i==arow && j==acol){
					a[i][j]="O";
				}
				
				
				else
					{
					a[i][j]=" ";
					}
				
				System.out.print(" |"+a[i][j]+" ");
				
			}
			System.out.println("");
			}
		System.out.println("");
		
		//***************************************************************************************************************************************************************
		

		System.out.println("");
		System.out.println("Computer's turn");
		int brow=rand.nextInt(3);
		int bcol=rand.nextInt(3);
		if(a[brow][bcol]=="X" || a[brow][bcol]=="O")
		{
			
			brow=brow+1;
				if(brow>2){
					brow=brow-2;
				}
				
					if(a[brow][bcol]=="X" || a[brow][bcol]=="O")
					{
						bcol=bcol+1;
						if(bcol>2){
							bcol=bcol-2;
						}
						if(a[brow][bcol]=="X" || a[brow][bcol]=="O"){
							brow=brow+1;
							if(brow>2){
								brow=brow-2;
							}
							bcol=bcol+1;
							if(bcol>2){
								bcol=bcol-2;
							}
							if(a[brow][bcol]=="X" || a[brow][bcol]=="O"){
								brow=brow+2;
								if(brow>2){
									brow=brow-3;
								}
								bcol=bcol+2;
								if(bcol>2){
									bcol=bcol-3;
								}
								if(a[brow][bcol]=="X" || a[brow][bcol]=="O"){
									System.out.println("");
									System.out.println("COMPUTER SKIPS....");
									System.out.println("");
								}
							}
							
						}
				}
				
			
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(i==row0 && j==col0){
					a[i][j]="X";
				}
		
				else if(i==row1 && j==col1){
					a[i][j]="X";
				}

				else if(i==row && j==col){
					a[i][j]="O";
				}
				else if(i==arow && j==acol){
					a[i][j]="O";
				}
				else if(i==brow && j==bcol){
					a[i][j]="O";
				}
				
				
				else
					{
					a[i][j]=" ";
					}
				
				System.out.print(" |"+a[i][j]+" ");
				
			}
			System.out.println("");
			}
		System.out.println("");
		
		//*************************************************************************************************************************************************************************
		
		System.out.println("");
		System.out.println("your turn");
		System.out.println("");
		System.out.println("enter the position where you wanted to enter X (row  column)");
		
		int row2= scan.nextInt();
		int col2= scan.nextInt();
		System.out.println("");
		System.out.println("");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(i==row0 && j==col0){
					a[i][j]="X";
				}
		
				else if(i==row1 && j==col1){
					a[i][j]="X";
				}
				else if(i==row2 && j==col2){
					a[i][j]="X";
				}

				else if(i==row && j==col){
					a[i][j]="O";
				}
				else if(i==arow && j==acol){
					a[i][j]="O";
				}
				else if(i==brow && j==bcol){
					a[i][j]="O";
				}
				
				
				else
					{
					a[i][j]=" ";
					}
				
				System.out.print(" |"+a[i][j]+" ");
				
			}
			System.out.println("");
			}
		System.out.println("");
		
	
			
		
		//***************************************************************************************************************************************************************
		System.out.println("");
		System.out.println("Computer's turn");
		int crow=rand.nextInt(3);
		int ccol=rand.nextInt(3);
		
		if(a[crow][ccol]=="X" || a[crow][ccol]=="O")
		{
			
			crow=crow+1;
				if(crow>2){
					crow=crow-2;
				}
				
					if(a[crow][ccol]=="X" || a[crow][ccol]=="O")
					{
						ccol=ccol+1;
						if(ccol>2){
							ccol=ccol-2;
						}
						if(a[crow][ccol]=="X" || a[crow][ccol]=="O"){
							crow=crow+1;
							if(crow>2){
								crow=crow-2;
							}
							ccol=ccol+1;
							if(ccol>2){
								ccol=ccol-2;
							}
							if(a[crow][ccol]=="X" || a[crow][ccol]=="O"){
								crow=crow+2;
								if(crow>2){
									crow=crow-3;
								}
								ccol=ccol+2;
								if(ccol>2){
									ccol=ccol-3;
								}
								if(a[crow][ccol]=="X" || a[crow][ccol]=="O"){
									System.out.println("");
									System.out.println("COMPUTER SKIPS....");
									System.out.println("");
								}
							}
							
						}
				}
				
			
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(i==row0 && j==col0){
					a[i][j]="X";
				}
		
				else if(i==row1 && j==col1){
					a[i][j]="X";
				}
				else if(i==row2 && j==col2){
					a[i][j]="X";
				}

				else if(i==row && j==col){
					a[i][j]="O";
				}
				else if(i==arow && j==acol){
					a[i][j]="O";
				}
				else if(i==brow && j==bcol){
					a[i][j]="O";
				}
				else if(i==crow && j==ccol){
					a[i][j]="O";
				}
				
				
				else
					{
					a[i][j]=" ";
					}
				
				System.out.print(" |"+a[i][j]+" ");
				
			}
			System.out.println("");
			}
		System.out.println("");
		
		
		//***************************************************************************************************************************************************************
		
		/*int crow =0;
		int ccol=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i][j]==" "){
					 ccol=j;
					crow=i;
					a[crow][ccol]="O";
					break;
				}
				break;
			}
			break;
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(" |"+a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		//********************************************************************************************************************************************************************
		*/
		System.out.println("");
		System.out.println("your turn");
		System.out.println("");
		System.out.println("enter the position where you wanted to enter X (row  column)");

		int row3= scan.nextInt();
		int col3= scan.nextInt();
		System.out.println("");
		System.out.println("");
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(i==row0 && j==col0){
					a[i][j]="X";
				}
		
				else if(i==row1 && j==col1){
					a[i][j]="X";
				}
				else if(i==row2 && j==col2){
					a[i][j]="X";
				}
				else if(i==row3 && j==col3){
					a[i][j]="X";
				}

				else if(i==row && j==col){
					a[i][j]="O";
				}
				else if(i==arow && j==acol){
					a[i][j]="O";
				}
				else if(i==brow && j==bcol){
					a[i][j]="O";
				}
				else if(i==crow && j==ccol){
					a[i][j]="O";
				}
				
				
				else
					{
					a[i][j]=" ";
					}
				
				System.out.print(" |"+a[i][j]+" ");
				
			}
			System.out.println("");
			}
		System.out.println("");
		
		
		//***************************************************************************************************************************************************************

		System.out.println("");
		System.out.println("Computer's turn");
		
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(a[i][j]== " " ){
					a[i][j]= "O";
				}
				
				System.out.print(" |"+a[i][j]+" ");
				
			}
			System.out.println("");
			}
		System.out.println("");
		System.out.println("********************************************************************************");
		System.out.println("");
		if(a[0][0]=="X" && a[0][1]=="X" && a[0][2]=="X" ){
			System.out.println("");
			System.out.println("CONGRATULATIONS.....YOU WON!!!");
		}
		else if(a[1][0]=="X" && a[1][1]=="X" && a[1][2]=="X" ){
			System.out.println("");
			System.out.println("CONGRATULATIONS.....YOU WON!!!");
		}
		else if(a[2][0]=="X" && a[2][1]=="X" && a[2][2]=="X" ){
			System.out.println("");
			System.out.println("CONGRATULATIONS.....YOU WON!!!");
		}
		
		else if(a[0][0]=="X" && a[1][0]=="X" && a[2][0]=="X" ){
			System.out.println("");
			System.out.println("CONGRATULATIONS.....YOU WON!!!");
		}
		else if(a[0][1]=="X" && a[1][1]=="X" && a[2][1]=="X" ){
			System.out.println("");
			System.out.println("CONGRATULATIONS.....YOU WON!!!");
		}
		else if(a[0][2]=="X" && a[1][2]=="X" && a[2][2]=="X" ){
			System.out.println("");
			System.out.println("CONGRATULATIONS.....YOU WON!!!");
		}
		else if(a[0][0]=="X" && a[1][1]=="X" && a[2][2]=="X" ){
			System.out.println("");
			System.out.println("CONGRATULATIONS.....YOU WON!!!");
		}
		else if(a[0][2]=="X" && a[1][1]=="X" && a[2][0]=="X" ){
			System.out.println("");
			System.out.println("CONGRATULATIONS.....YOU WON!!!");
		}
		
		
		
		else if(a[0][0]=="O" && a[0][1]=="O" && a[0][2]=="O" ){
			System.out.println("");
			System.out.println("HARD LUCK!!!.......COMPUTER WON");
		}
		else if(a[1][0]=="O" && a[1][1]=="O" && a[1][2]=="O" ){
			System.out.println("");
			System.out.println("HARD LUCK!!!.......COMPUTER WON");
		}
		else if(a[2][0]=="O" && a[2][1]=="O" && a[2][2]=="O" ){
			System.out.println("");
			System.out.println("HARD LUCK!!!.......COMPUTER WON");
		}
		else if(a[0][0]=="0" && a[0][1]=="O" && a[0][2]=="O" ){
			System.out.println("");
			System.out.println("HARD LUCK!!!.......COMPUTER WON");
		}
		else if(a[0][0]=="O" && a[1][0]=="O" && a[2][0]=="O" ){
			System.out.println("");
			System.out.println("HARD LUCK!!!.......COMPUTER WON");
		}
		else if(a[0][1]=="O" && a[1][1]=="O" && a[2][1]=="O" ){
			System.out.println("");
			System.out.println("HARD LUCK!!!.......COMPUTER WON");
		}
		else if(a[0][2]=="O" && a[1][2]=="O" && a[2][2]=="O" ){
			System.out.println("");
			System.out.println("HARD LUCK!!!.......COMPUTER WON");
		}
		else if(a[0][0]=="O" && a[1][1]=="O" && a[2][2]=="O" ){
			System.out.println("");
			System.out.println("HARD LUCK!!!.......COMPUTER WON");
		}
		else if(a[0][2]=="O" && a[1][1]=="O" && a[2][0]=="O" ){
			System.out.println("");
			System.out.println("HARD LUCK!!!.......COMPUTER WON");
		}
		else
		{
			System.out.println("");
			System.out.println("THE MATCH ENDS IN A DRAW!!!");
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("THANKS FOR PLAYING  \t\t developer : ADITYA SINGH");
	}
    //thanks alot folks...this is it ...go home!!//
	

}
