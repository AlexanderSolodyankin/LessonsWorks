package Draft.DraftMasterClassThirtExam.Works_get_Classes;

public class DistrActions {

    private static final SimilarText comparisonLine;
    private static final SimilarText similarWords;

    static {
        comparisonLine = new ComparisonLine();
        similarWords = new ComparisinWords();

    }

    public static SimilarText getSimilar(Comparison action){
        switch (action){
            case COMPARISON_LINE: return comparisonLine;
            case SIMILAR_WORDS: return similarWords;
        }
        throw new RuntimeException();
    }
}
