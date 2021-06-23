package Draft.DraftMasterClassThirtExam.Works_get_Classes;

import java.io.FileNotFoundException;
import java.util.List;

public class outTEXT {
    public static void main(String[] args) throws FileNotFoundException {
        ReadFile readFile = new FileSetReader();
        List<String> input = readFile.getLocalFile("input.txt");
        List<String> patterns = readFile.getLocalFile("patterns.txt");
        SimilarText comparison = DistrActions.getSimilar(Comparison.COMPARISON_LINE);
        System.out.println("Проверка на похожие строки: " + comparison.getSimilarText(input, patterns));
        comparison = DistrActions.getSimilar(Comparison.SIMILAR_WORDS);
        System.out.println("Проверка на похожие слова: " + comparison.getSimilarText(input, patterns));


    }
}
