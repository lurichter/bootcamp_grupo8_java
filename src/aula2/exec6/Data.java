package aula2.exec6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {

    private GregorianCalendar gc = new GregorianCalendar();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Data(String data){
        this.setData(data);
    }

    private boolean ehValida(String data) {
        try {
            GregorianCalendar cal = new GregorianCalendar();
            formatter.setLenient(false);
            cal.setTime(formatter.parse(data));
            return true;
        } catch(ParseException e){
            System.out.println("Informar uma data válida no formato DD/MM/AAAA");
            return false;
        }
    }

    private void setData(String data){
        if (ehValida(data)) {
            try {
                this.gc.setTime(formatter.parse(data));
            } catch(ParseException e){
                e.printStackTrace();
            }
        }
    }

    public void addDay() {
        this.gc.add(Calendar.DAY_OF_YEAR, 1);
    }

    private String formatData() {
        formatter.setCalendar(this.gc);
        return formatter.format(this.gc.getTime());
    }

    @Override
    public String toString() {
        return formatData();
    }
}
