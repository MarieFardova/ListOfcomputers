import com.engeto.computers.Computer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Computer computer2 = new Computer("ABC", 1.85);//constructor2
        BigDecimal price = new BigDecimal(10.3);

        CreateAndPrintComputer();//extract method - constructor1



        List<Computer> computerList = new ArrayList<>();/*vytvořím ručně seznam*/
        computerList.add(computer2);
        computerList.remove(0);
        computerList.add(new Computer("DEF",2.3));
        for (int i = 0; i<10; i++) {
            computerList.add(new Computer("Počítač" + i, 1.5));
        }
        System.out.println("Počet počítačů v souboru:  " + computerList.size());
        for (Computer computer : computerList) {
            System.out.println(computer.getDescription());
        }
        computerList.clear();


    }

    private static void CreateAndPrintComputer() {
        Computer computer= new Computer("ABC", 1.3, 13.6,
                true, true);//constructor1

        System.out.println(computer.getModel());
        computer.setModel("XYZ");
        System.out.println("POPIS POČÍTAČE: " + computer.getDescription());
    }
}


/*POŘADÍ KODU:
1/ ATRIBUTY = NAME, DATE, WEIGHT,....
2/CONSTRUCTORY = GENERATE CONTRUCTOR
3/ METODY = GETTER + SETTER*/