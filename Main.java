import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TOIMII AINOSTAAN JOS NUMERO ON ENSIMMÄISENÄ MANACOSTISSA
        /*System.out.println(HasEnoughMana("--TÄHÄN MANAPOOL--","--TÄHÄN MANACOST--"));*/
    }
    static boolean HasEnoughMana(String Manapool, String Manacost){
        //mana listat
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
        //manapoolin lajitteleminen listoihin
        for (int i = 0; i<Manapool.length();i++){
            //tempmika on väliaikainen substring joka menee manapool ja manacost stringien läpi
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
        //enaa on boolean joka kertoo onko numeroita enää jäljellä
        boolean enaa = true;
        //throwawaynumia käytetään parseintissä joka testaa onko merkki numero vai kirjain
        int throwawaynum = 0;
        //jos merkki on numero se lisätään stringinä costnumstringiin joka parseintitään myöhemmin
        String costnumstring = "";

        for (int i = 0; i<Manacost.length();i++){
            String tempmika;
            tempmika = Manacost.substring(i,i+1);
            if(enaa){
                try {
                    //jos parseint onnistuu se lisätään costnumstringiin
                    throwawaynum+=(Integer.parseInt(tempmika));
                    costnumstring = costnumstring+tempmika;
                } catch (NumberFormatException e){
                    //jos se epäonnistuu tiedetään että on enää kirjaimia jäljellä
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
            //yritetään parsettaa costnumstring
            costnum+=(Integer.parseInt(costnumstring));
        }catch (Exception e){
            //jos epäonnistuu costnumstring on tyhjä joten costnum on 0
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
        //tarkistetaan onko manapool suurempi kuin manacost
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
        //jos on, tarkistetaan onko kaikki loppu manapool suurempi kuin costnum
        int loput = (Wsize+Usize+Bsize+Rsize+Gsize+Csize);
        if(loput>=costnum){
            return true;
        }else{
            return false;
        }
    }
}
