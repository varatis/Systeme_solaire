public class HelloWorld {
    public static void main(String... args) {

        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "Téllurique";

        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Téllurique";

        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Téllurique";

        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 142984;
        mars.matiere = "Téllurique";

        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";

        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 142984;
        saturne.matiere = "Gazeuse";

        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 142984;
        uranus.matiere = "Gazeuse";

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 142984;
        neptune.matiere = "Gazeuse";

        Planete neuf = new Planete();

        System.out.println(jupiter.nom +" est une planète "+ jupiter.matiere + " avec un diamètre de " + jupiter.diametre + " kilomètres.");
        System.out.println(neuf.nom +" est une planète "+ neuf.matiere + " avec un diamètre de " + neuf.diametre + " kilomètres.");

        System.out.println(neptune.nom + " a effectué " + neptune.revolution(-3542) + " tours autour de son étoile.");
        System.out.println(mars.nom + " a effectué " + mars.revolution(-684) + " tours sur elle-même.");
        System.out.println(venus.nom + " a effectué " + venus.rotation(1250) + " tours sur elle-même.");

        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");
        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est acctuellement de " + mars.totalVisiteurs);

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.argon=0;
        atmosphereUranus.hydrogène=83;
        atmosphereUranus.azote=0;
        atmosphereUranus.dioxydeDeCarbone=0;
        atmosphereUranus.helium=15;
        atmosphereUranus.methane=2.5f;
        atmosphereUranus.sodium=0;
        uranus.atmosphere = atmosphereUranus;

        Atmosphere atmosphereTerre = new Atmosphere();
        atmosphereTerre.argon=8.5f;
        atmosphereTerre.hydrogène=9.5f;
        atmosphereTerre.azote=10.5f;
        atmosphereTerre.dioxydeDeCarbone=11.5f;
        atmosphereTerre.helium=12.5f;
        atmosphereTerre.methane=13.5f;
        atmosphereTerre.sodium=14.5f;
        terre.atmosphere =  atmosphereTerre;

        System.out.println("L'atmosphère de Uranus est composée : ");
        System.out.println("A " + uranus.atmosphere.hydrogène + "% " + "d'hydrogène");
        System.out.println("A " + uranus.atmosphere.argon + "% " + "d'argon");
        System.out.println("A " + uranus.atmosphere.dioxydeDeCarbone + "% " + "de dioxyde de carbone");
        System.out.println("A " + uranus.atmosphere.azote + "% " + "d'azote");
        System.out.println("A " + uranus.atmosphere.helium + "% " + "d'hélium");
        System.out.println("A " + uranus.atmosphere.methane + "% " + "de méthane");
        System.out.println("A " + uranus.atmosphere.sodium + "% " + "de sodium");


        /*--------------------------- TEST AVEC FACTION ------------------------------
        Faction uranusLead = new Faction();
        uranusLead.tripleA = "Alliance";
        uranus.faction = uranusLead;

        Faction terreLead = new Faction();
        terreLead.tripleA = "horde";
        terre.faction = terreLead;


        System.out.println("La faction d'Uranas est L' " + uranus.faction.tripleA);
        System.out.println("La faction de la Terres est la " + terre.faction.tripleA);*/

        int nbPlanetes = 8;
         while (nbPlanetes < 11) {
            switch (nbPlanetes) {
                case 8:
                    System.out.println("Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : " + nbPlanetes);
                    break;
                case 9:
                    System.out.println("Il y a quelques années cependant, elles étaient au nombre de : " + nbPlanetes);
                    break;
                default:
                    System.out.println("Au cours de l'ère moderne, le nombre de planètes n'a jamais été officiellement de : " + nbPlanetes);
            }
            nbPlanetes++;
        }
    }
}