package Atividade;


public class media {
public static void main(String[] args){
    
    float Media897 =  (8+9+7)/ 3;
    float Media456 =  (4+5+6)/ 3;
    float SomaMedia = Media456 + Media897;
    float Media = SomaMedia/2;

    System.out.printf("Media de 8 + 9 + 7: %.2f\n", Media897);
    System.out.printf("Media de 4 + 5 + 6: %.2f\n", Media456);
    System.out.printf("Soma das médias: %.2f\n", SomaMedia);
    System.out.printf("Médias das médias: %.2f\n", Media);


}
}
