package b2;

public class ChuoiTho implements Chuoi{
    private String chuoi;
    public ChuoiTho(String chuoi) {
        this.chuoi = chuoi;
    }

    @Override
    public Object print() {
        return (String) chuoi;
    }
}
