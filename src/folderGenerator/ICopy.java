package folderGenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class ICopy implements Copy{
	

	public void copyFilePath(File in,File out) throws Exception {
		
		FileChannel input = null;
		FileChannel output = null;
		
		try {
			input = new FileInputStream(in).getChannel();
			output = new FileInputStream(out).getChannel();
			
			output.transferFrom(input, 0, input.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			input.close();
			output.close();
		}
		
	}
}
