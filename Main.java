import java.util.Scanner; //Import untuk input

public class Main extends Konv {
    //Mengunakan Constructor untuk menyimpan data
    public static void main(String[] args) {
        Scanner objek_suhu = new Scanner(System.in);

        //Memasukan input suhu ke dalam variable
        float suhu;
        System.out.print("Masukan suhu celcius : ");
        suhu = objek_suhu.nextFloat();

        int pilih_menu=0;
        do{
            pilih_menu = daftarMenu();
            if (pilih_menu == 1){
                //Memanggil Kelas Konv untuk konversi
                Main convert = new Main();
                convert.hitung(suhu);
            }
            else if (pilih_menu == 2){
                System.out.print("Masukan suhu celcius : ");
                suhu = objek_suhu.nextFloat();
            }
            else if (pilih_menu == 3){
                System.exit(0);
            }
            else{
                System.out.println("Input salah!");
            }
        }while (pilih_menu != 3);


    }

    public static int daftarMenu(){
        System.out.println("1. Lihat hasil konversi\n2. Edit data suhu\n3. Exit\n");
        Scanner objek_menu = new Scanner(System.in);
        System.out.print("=> ");
        int answer = objek_menu.nextInt();

        return answer;
    }
}

//Kelas Konversi untuk mengonversi
class Konv{
    //Method untuk perhitungan setiap suhu
    void hitung(double suhu) {
        double celcius = suhu;
        double reamur = (4.0 * suhu) / 5.0;
        double fahrenheit = ((9.0 * suhu) / 5.0) + 32.0;
        double kelvin = suhu + (double) 27315 / 100;

        System.out.println("Reamur     : " + reamur);
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Kelvin     : " + kelvin);
        System.out.println("Celcius    : " + suhu);

        if (suhu >= 100) {
            System.out.println("Air Mendidih");
        } else if (suhu <= 0) {
            System.out.println("Air Membeku");
        } else {
            System.out.println("Air Tidak Membeku maupun Mendidih");
        }
    }
}