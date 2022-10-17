package Universitat;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Professor {
    public String name;

    public Professor(String name) {
        this.name = name;
    }

    public int grade_round(int grade) {
        // if(grade > 38 )

        return 0;
    }

    public ArrayList<Integer> get_grades(ArrayList<Integer> grades) {
        ArrayList<Integer> nicht_ausreichende = new ArrayList<>();
        for (int i : grades) {
            if (i < 40){
                nicht_ausreichende.add(i);
            }
        }
        return nicht_ausreichende;
    }

    public float durschnitt(ArrayList<Integer> grades){
        int nr = 0;
        float sum = 0;
        for (int i: grades){
            nr += 1;
            sum += i;
        }
        return nr/sum;
    }

    public ArrayList<Integer> abgerundete(ArrayList<Integer> grades){

    }

    public int max_abgerunndete(ArrayList<Integer> grades){
        int contor = 0;
        ArrayList<Integer> abgerundete = new ArrayList<>();
        for ( int i: grades){
            if(i % 5 == 0 && i > 38){
                abgerundete.add(i);
            }else if ()

        }

    }


}
