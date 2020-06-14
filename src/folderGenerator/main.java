package folderGenerator;

import java.io.File;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		String s1 = scn.nextLine();
		int substringflag = s1.lastIndexOf("\\");
		System.err.print(substringflag);
		File in = new File(s1);
		String s2 = s1.substring(0, substringflag);
		File out = new File(s2);
		Copy cp = new ICopy();
		
		cp.copyFilePath(in, out);
	}

}
