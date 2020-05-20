package ITPM.logic;


import ITPM.logic.model.CustomFile;
import ITPM.logic.model.FileRead;

//reading file
public interface FileReadService {
	
	public void openFile(FileRead file, CustomFile fileobj);
	public void readFile(FileRead file, CustomFile fileobj);
	public void closeFile(FileRead file);
        public void readContent(String content, CustomFile file);
	
}
