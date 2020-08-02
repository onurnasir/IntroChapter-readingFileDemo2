import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int total=0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\ONUR\\Desktop\\JavaWorks\\readingFileDemo\\src\\sayilar.txt")); //Dosya okumak için javada bu methodu(foksiyon,operasyon) kullanıyoruz.
            String line=null;
            while((line=reader.readLine()) !=null){
                total+=Integer.valueOf(line); // bu satır eğer diyor ki sayilar.txt içeriğinde parametler farklı türde ise onları int çevir ve topla.
            }
            System.out.println("Toplam="+total);
        } catch (FileNotFoundException e) { //Başta FileNotFoundException fırlatmayı yani hatayı fırlatmay
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();

            } catch (Exception exception) {

            }
        }
    }
}
