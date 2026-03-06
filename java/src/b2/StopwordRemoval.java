package b2;

import java.util.ArrayList;
import java.util.Arrays;

public class StopwordRemoval extends Decorator{
    private ArrayList<String> mangChuoi;
    String[] stopWords_ = new String[]{"và", "hoặc", "thì", "mà", "là"};
    private ArrayList<String> stopWords = new ArrayList<>(Arrays.asList(stopWords_));

    public StopwordRemoval(Chuoi chuoi) {
        super(chuoi);
    }

    @Override
    public Object print() {
        mangChuoi = (ArrayList<String>) chuoi.print();
        for (String c : mangChuoi){
            if (stopWords.contains(c))
        }
        return chuoi.print();
    }
}
