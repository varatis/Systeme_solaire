public class Planete {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs;
    Atmosphere atmosphere;

    /*Faction faction;  ----------->  POUR LE TEST DE FACTION*/

     int revolution(int angle) {
             int resultat = angle/360;
             return  resultat;
    }

    int rotation(int angle) {
        int resultat = angle/360;
        return  resultat;
    }

    void accueillirVaisseau(int newHuman) {
         totalVisiteurs = totalVisiteurs + newHuman;
    }

    void accueillirVaisseau(String typeVaisseau ) {

         int chasseur = 3;
         int fregate = 12;
         int croiseur = 50;

         if (typeVaisseau == "CHASSEUR") {
             totalVisiteurs = totalVisiteurs + chasseur;

         } else if (typeVaisseau == "FREGATE") {
             totalVisiteurs = totalVisiteurs + fregate;

         } else if (typeVaisseau == "CROISEUR") {
             totalVisiteurs = totalVisiteurs + croiseur;

         }
    }
}


/*
int totalVisiteurs = 0;

void acceuillirVaisseau() {


}
 */

