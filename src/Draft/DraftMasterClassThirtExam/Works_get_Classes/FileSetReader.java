package Draft.DraftMasterClassThirtExam.Works_get_Classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSetReader implements ReadFile{


    @Override
    public List<String> getLocalFile(String nameFile) throws FileNotFoundException {
        FileReader reader = new FileReader(nameFile);
        Scanner sc = new Scanner(reader);
        ArrayList<String> fileText = new ArrayList<>();
        while(sc.hasNext()){
            fileText.add(sc.nextLine());
        }
        return fileText;
    }
}
