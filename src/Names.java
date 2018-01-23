import java.util.Arrays;

public class Names {

    public static void main(String[] args) {
        String[] name = new String[3];
        name [0]= "Zofia";
        name [1]= "Paula";
        name [2]= "Ola";
        System.out.println(name[0]+", "+name[1]+", "+name[2]);

        String arrayString = Arrays.toString(name);
        System.out.println(arrayString);
    }
}
