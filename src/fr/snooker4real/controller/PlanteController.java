package fr.snooker4real.controller;

import fr.snooker4real.model.Plante;
import fr.snooker4real.view.PlanteView;

public class PlanteController {
    private Plante plante;
    private PlanteView view;

    public PlanteController(Plante plante, PlanteView view){
        this.plante = plante;
        this.view = view;
    }

    public void setPlanteName(String name){
        plante.setName(name);
    }

    public String getPlanteName(){
        return  plante.getName();
    }
    public void setPlanteRollNo(String rollNo){
        plante.setRollNo(rollNo);
    }
    public String getPlanteRollNo(){
        return  plante.getRollNo();
    }

    public  void updateView(){
        view.printPlanteDetails(plante.getName(), plante.getRollNo());
    }
}
