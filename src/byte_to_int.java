public class byte_to_int {
    public static void main (String [] args){
        byte x = 15; // получаем число в byte
        int i;
        int z;
        i = x << 1; // перевод в int  и сдвиг влево
        z=i>>1; // сдвигом вправо возвращаем предыдущее значение
        System.out.println("Число в byte = " + x);
       // System.out.println(i);
        System.out.println("Число в int = " + z);
    }



}
