import java.util.*;
public class stylee
{
	public static void main(String sap[])
	{
		Scanner io=new Scanner(System.in);
		System.out.println("enter a sentence..\ntry to exclude any punctuations>");
		String user=io.nextLine();
		int ki=user.length();
		int j;
        for (j=0;j<=(ki-1);j++) {
        	char tu=user.charAt(j);
        	 if (tu="a" || tu="A") {
        		System.out.println("A\nAA\nAAA\nAAAA\nAAAAA\nAAAAAA\nAA A AA\nAAA A AAA\nAAAA AA AAAA\n");
        	}
        	else  if (tu='b' || tu='B') {
        		System.out.println("BBBBBBB\nBBBB   B\nBBBB  BB\nBBBB  BB\nBBBB  B\nBBBBBBB\nBBBB  B\nBBBB  BB\nBBBB  BB\nBBBB  BB\nBBBB B\nBBBBBBB\n");
        	}
        	else  if (tu='c' || tu='C') {
        		System.out.println("     CCCCC\n  CC        CC\nCC\nCC\n CC\n  CC\n   CC        CC\n      CCCCC\n");
        	}
        	else  if (tu='d' || tu='D') {
        		System.out.println("DDDDD\nD    DD\nD    DD\nD    D\nDDDD\n");
        	}
        	else  if (tu='e' || tu='E') {
        		System.out.println("EEEEE\nE\nE\nEEEE\nEEEEE\n");
        	}
        	else  if (tu='f' || tu='F') {
        		System.out.println("FFFFF\nF\nF\nFFF\nF\nF\nF\n");
        	}
        	else  if (tu='g' || tu='G') {
        		System.out.println("      GG\n   G\nG\nG\n G\n   G  GGGG\n    G            G \n      GGG   G\n                   G\n");
        	}
        	else  if (tu='h' || tu='H') {
        		System.out.println("H            H\nH            H\nHHHHH\nH           H\nH           H\n");
        	}
        	else   if (tu='i' || tu='I') {
        		System.out.println("IIIIII\n     I\n     I\n     I\nIIIIII\n");
        	}
        	else  if (tu='j' || tu='J') {
             System.out.println("JJJJJJJJJJ\n                      J\n                      J\n      J              J\n       JJ          J\n           JJJJ\n");
        	}
        	else  if (tu='k' || tu='K') {
        		System.out.println("K       K\nK     K\nK   K\nKK\nKK\nK   K\nK     K\nK      K\n");
        	}
        	else   if (tu='l' || tu="L") {
        		System.out.println("LL\nLL\nLL\nLL\nLL\nLL\nLL\nLLLLLLL\n");
        	}
        	else  if (tu='m' || tu='M') {
        	    System.out.println("M              M\nMM      MM\nM   MM   M\nM              M\nM              M\nM              M\n");	
        	}
        	else  if (tu='n' || tu='N') {
        		System.out.println("N              N\nNN           N\nN   N        N\nN       N    N\nN          N N\nN              N\n");
        	}
        	else  if (tu='O' || tu='o') {
        		System.out.println("          OO\n      OOOO\n     O           O\n  OO         OO\nOO            OO\n     O          O\n      OOOO\n          OO\n");
        	}
        	else  if (tu='p' || tu='P') {
        		System.out.println("PPPPP\nP           P\nP           P\nP         P\nP     P\nP   P\nP P\nP\nP\nP\nP\n");
        	}
        	else  if (tu='q' || tu='Q') {
        		System.out.println("          QQ\n       Q      Q\n     Q           Q\n  Q                Q\nQ                     Q\n   Q               Q\n      Q    QQQQ\n         Q     Q   Q\n            QQ     Q\n                        Q\n");
        	}
        	else   if(tu='r' || tu='R') {
        		System.out.println("RRRRR\nR             R\nR             R\nR           R\nR RRR\nRR\nR   R\nR     R\nR       R\nR          R\n");
        	}
        	else  if (tu='s' || tu='S') {
        		System.out.println("         SSS\n       S       S\n      S          S\n     S\n        SSSS\n                S\n  S            S\n   S        S\n     SSS\n");
        	}
        	else  if (tu='t' || tu='T') {
        		System.out.println("TTTTTTTTTT\n              T\n              T\n              T\n              T\n              T\n              T\n");
        	}
        	else  if (tu='u' || tu="U") {
        	System.out.println("U            U\nU            U\nU            U\nU            U\nU            U\nU            U\nU            U\n  U        U\n    UUU\n");	
        	}
        	else  if (tu='v' || tu='V') {
        		System.out.println("V                        V\n   V                   V\n      V              V\n         V          V\n            V    V\n              VV\n");
        	}
        	else  if (tu='w' || tu='W') {
        		System.out.println("W                                                     W\n   W                                                W\n      W                  W                   W\n        W            W     W          W\n            W    W             W   W\n                W                     W\n");
        	}
        	else  if (tu='x' || tu='X') {
        		System.out.println("X               X\n   X          X\n     X      X\n       XX\n       XX\n     X     X\n   X         X\nX               X\n");
        	}
        	else  if (tu='y' || tu='Y') {
        		System.out.println("Y            Y\n   Y       Y\n      Y  Y\n        Y\n        Y\n        Y\n");
        	}
        	else  if (tu='z' || tu='Z') {
        		System.out.println("ZZZZZZZZ\n                     Z\n                 Z\n             Z\n          Z\n      Z\nZZZZZZZZ\n");
        	}
        	else{
        		System.out.println("special characters encountered..");
        	}
        	break;
        }
	}
}