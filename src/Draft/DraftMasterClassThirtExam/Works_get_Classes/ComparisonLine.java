package Draft.DraftMasterClassThirtExam.Works_get_Classes;

import java.util.ArrayList;
import java.util.List;

public class ComparisonLine implements SimilarText{
    @Override
    public List<String> getSimilarText(List<String> input, List<String> patterns) {

        List<String> outText = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < patterns.size(); j++) {
                if(input.get(i).equals(patterns.get(j))){
                    outText.add(input.get(i));
                }
            }
        }

        return outText;
    }
}
