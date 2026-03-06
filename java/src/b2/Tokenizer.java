package b2;

import java.util.ArrayList;
import java.util.Arrays;

public class Tokenizer extends Decorator{
    private ArrayList<String> mangChuoi;
    public Tokenizer(Chuoi chuoi) {
        super(chuoi);
    }

    @Override
    public Object print() {
        String[] mangChuoiTinh = chuoi.print().toString().split("[,# :.]");
        mangChuoi = new ArrayList<String>(Arrays.asList(mangChuoiTinh));
        return (ArrayList<String>) mangChuoi;
    }
}
