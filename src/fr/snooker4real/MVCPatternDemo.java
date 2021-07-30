package fr.snooker4real;

import fr.snooker4real.controller.PlanteController;
import fr.snooker4real.model.Plante;
import fr.snooker4real.view.PlanteView;

public class MVCPatternDemo {

    public static void main(String[] args) {
        // récupérer les informations de la plante en fonction de son numero de roll dans la base de donnée
        Plante plante = retrivePlanteFromDatabase();

        // Creer une vue : pour écrire les détails sur la console
        PlanteView view = new PlanteView();

        PlanteController controller = new PlanteController(plante, view);

        controller.updateView();

        // Mise à jour du model de BDD
        controller.setPlanteName("Cactus");
        controller.updateView();
    }

    private static Plante retrivePlanteFromDatabase() {
        Plante plante = new Plante();
        plante.setName("Cactus");
        plante.setRollNo("1");
        return plante;
    }
}
