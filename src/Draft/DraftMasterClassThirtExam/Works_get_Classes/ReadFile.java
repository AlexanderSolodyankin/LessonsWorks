package Draft.DraftMasterClassThirtExam.Works_get_Classes;

import java.io.FileNotFoundException;
import java.util.List;

public interface ReadFile {
    List<String> getLocalFile(String nameFile) throws FileNotFoundException;
}
