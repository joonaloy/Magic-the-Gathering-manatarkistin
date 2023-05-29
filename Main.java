import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(HasEnoughMana("RRR","2RR"));
        System.out.println(HasEnoughMana("UUUU","2RU"));
        System.out.println(HasEnoughMana("GRGRG","3GR"));
        System.out.println(HasEnoughMana("RRRRRRRRRRRRRRRRRRRR","20"));
        System.out.println(HasEnoughMana("BB","2"));
        System.out.println(HasEnoughMana("WBRGU","WBRGU"));
        System.out.println(HasEnoughMana("C","C"));
        System.out.println(HasEnoughMana("RRUUGG","3RUG"));
    }
    static boolean HasEnoughMana(String Manapool, String Manacost){
        List<String> W = new ArrayList<>();
        List<String> U = new ArrayList<>();
        List<String> B = new ArrayList<>();
        List<String> R = new ArrayList<>();
        List<String> G = new ArrayList<>();
        List<String> C = new ArrayList<>();

        List<String>costW = new ArrayList<>();
        List<String> costU = new ArrayList<>();
        List<String> costB = new ArrayList<>();
        List<String> costR = new ArrayList<>();
        List<String> costG = new ArrayList<>();
        List<String> costC = new ArrayList<>();
        int costnum = 0;

        for (int i = 0; i<Manapool.length();i++){
            String tempmika;
            tempmika = Manapool.substring(i,i+1);
            switch (tempmika){
                case "W":
                    W.add(tempmika);
                    break;
                case "U":
                    U.add(tempmika);
                    break;
                case "B":
                    B.add(tempmika);
                    break;
                case "R":
                    R.add(tempmika);
                    break;
                case "G":
                    G.add(tempmika);
                    break;
                case "C":
                    C.add(tempmika);
                    break;
            }
        }
        boolean enaa = true;
        int throwawaynum = 0;
        String costnumstring = "";

        for (int i = 0; i<Manacost.length();i++){
            String tempmika;
            tempmika = Manacost.substring(i,i+1);
            if(enaa){
                try {
                    throwawaynum+=(Integer.parseInt(tempmika));
                    costnumstring = costnumstring+tempmika;
                } catch (NumberFormatException e){
                    enaa = false;
                }
            }
            switch (tempmika){
                case "W":
                    costW.add(tempmika);
                    break;
                case "U":
                    costU.add(tempmika);
                    break;
                case "B":
                    costB.add(tempmika);
                    break;
                case "R":
                    costR.add(tempmika);
                    break;
                case "G":
                    costG.add(tempmika);
                    break;
                case "C":
                    costC.add(tempmika);
                    break;
            }
        }
        try{
            costnum+=(Integer.parseInt(costnumstring));
        }catch (Exception e){
            costnum=0;
        }

        int Wsize = W.size();
        int Usize = U.size();
        int Bsize = B.size();
        int Rsize = R.size();
        int Gsize = G.size();
        int Csize = C.size();
        int CostWsize = costW.size();
        int CostUsize = costU.size();
        int CostBsize = costB.size();
        int CostRsize = costR.size();
        int CostGsize = costG.size();
        int CostCsize = costC.size();

        Wsize-=CostWsize;
        if(Wsize<-1){
            return false;
        }Usize-=CostUsize;
        if(Usize<-1){
            return false;
        }Bsize-=CostBsize;
        if(Bsize<-1){
            return false;
        }Rsize-=CostRsize;
        if(Rsize<-1){
            return false;
        }Gsize-=CostGsize;
        if(Gsize<-1){
            return false;
        }Csize-=CostCsize;
        if(Csize<-1){
            return false;
        }
        int loput = (Wsize+Usize+Bsize+Rsize+Gsize+Csize);
        if(loput>=costnum){
            return true;
        }else{
            return false;
        }
    }
}