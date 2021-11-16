import java.util.*;
public class styl{
	public static void main(String f[]){
		Scanner nrt=new Scanner(System.in);//success....
		System.out.println("enter a sentence");//working.....
		String str=nrt.nextLine();
		int len=str.length();
		for(int i=0;i<len;i++){
			char ch=str.charAt(i);
			System.out.println("---------------------------------------------------------------------------------");
			switch(ch){
				case 'a':
				case 'A':
				  System.out.println("    A\n    AA\n   A A\n  AA  AA\n AAAAAAA\n AA    AA\nAA    AAA");
				  break;
				case 'b':
				case 'B':
				  System.out.println("BBBBBBB\nBBBB   B\nBBBB  BB\nBBBB  BB\nBBBB  B\nBBBBBBB\nBBBB  B\nBBBB  BB\nBBBB  BB\nBBBB  BB\nBBBB B\nBBBBB\n");
				  break;
			    case 'c':
			    case 'C':
			      System.out.println("     CCCCC\n  CC        CC\nCC\nCC\n CC\n  CC\n   CC        CC\n      CCCCC\n");
			      break;
			    case 'd':
			    case 'D':
			      System.out.println("DDDDD\nD    DD\nD    DD\nD    D\nDDDD\n");
			      break;
			    case 'e':
			    case 'E':
			      System.out.println("EEEEE\nE\nE\nEEEE\nE\nE\nEEEEE\n");
			      break;
			    case 'f':
			    case 'F':
			      System.out.println("FFFFF\nF\nF\nFFF\nF\nF\nF\n");
			      break;
			    case 'g':
			    case 'G':
			      System.out.println("      GG\n   G\nG\nG\n G\n   G  GGGG\n    G         G \n      GGG   G\n                 G\n");
			      break;
			    case 'h':
			    case 'H':
			       System.out.println("H      H\nH      H\nHHHHHHH\nH     H\nH     H\n");
			       break;
			    case 'i':
			    case 'I':
			       System.out.println("IIIIII\n   I\n   I\n   I\nIIIIII\n");
			       break;
			    case 'j':
			    case 'J':
			    System.out.println("JJJJJJJJJ\n       J\n       J\n       J\n       J\nJ     J\nJJ    JJ\nJJJ   JJ\n  JJJJ ");
			       break;
			    case 'k':
			    case 'K':
			       System.out.println("K       K\nK     K\nK   K\nKK\nKK\nK   K\nK     K\nK      K\n");
			       break;
			    case 'l':
			    case 'L':
			       System.out.println("LL\nLL\nLL\nLL\nLL\nLL\nLL\nLLLLLLL\n");
			       break;
			    case 'M':
			    case 'm':
	        	   System.out.println("M              M\nM  M     MMM M\nM     MM       M\nM              M\nM              M\nM              M\n");
	        	   break;	
	        	case 'n':
	        	case 'N':
	        	   System.out.println("N            N\nNN           N\nN   N        N\nN       N    N\nN          N N\nN            N\n");
	        	   break;
                case 'o':
                case 'O':
                   System.out.println("       OO\n      OOOO\n     O        O\n  OO         OO\nOO            OO\n O          O\n      OOOO\n       OO\n");
                   break;
                case 'p':
                case 'P':
                   System.out.println("PPPPP\nP       P\nP       P\nP         P\nP     P\nP   P\nP P\nP\nP\nP\nP\n");
                   break;
                case 'q':
                case 'Q':
                   System.out.println("          QQ\n       Q      Q\n     Q           Q\n  Q                Q\nQ                     Q\n   Q               Q\n      Q    QQQQ\n         Q     Q   Q\n            QQ     Q\n                        Q\n");
                   break;
                case 'r':
                case 'R':
                   System.out.println("RRRRR\nR      R\nR        R\nR      R\nR RRR\nRR\nR   R\nR     R\nR       R\nR          R\n");
                   break;
                case 's':
                case 'S':
                   System.out.println("         SSS\n       S     S\n      S      S\n     S\n        SSSSSS\n             S\n  S          S\n   S        S\n     SSSSS\n");
                   break;
                case 't':
                case 'T':
                   System.out.println("TTTTTTTTTT\n    T\n     T\n     T\n     T\n     T\n     T\n");
                   break;
                case 'u':
                case 'U':
                   System.out.println("U            U\nU            U\nU            U\nU            U\nU            U\nU            U\nU            U\n  U        U\n    UUU\n");
                   break;
                case 'v':
                case 'V':
                   System.out.println("V                        V\n  V                   V\n   V              V\n       V          V\n          V    V\n              VV\n");
                   break;
                case 'w':
                case 'W':
                   System.out.println("W                                                     W\n W                                                W\n      W                  W                   W\n        W            W     W          W\n            W    W             W   W\n                W                     W\n");
                   break;
                case 'x':
                case 'X':
                   System.out.println("X               X\n   X          X\n     X      X\n       XX\n       XX\n     X     X\n   X         X\nX               X\n");
                   break;
                case 'y':
                case 'Y':
                   System.out.println("Y            Y\n   Y       Y\n      Y  Y\n        Y\n        Y\n        Y\n");
                   break;
                case 'z':
                case 'Z':
                   System.out.println("ZZZZZZ\n     Z\n    Z  \n   Z   \n  Z    \n Z    \nZZZZZZ");
                   break;
                default:
                System.out.println("special Characters encountered....");
			}
			nrt.close();
		}
	}
}