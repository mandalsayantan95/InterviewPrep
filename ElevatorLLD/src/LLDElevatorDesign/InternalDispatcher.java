package LLDElevatorDesign;

import java.util.List;

public class InternalDispatcher {

    List<ElevatorController>  elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitInternalRequest(int floor, ElevatorCar elevatorCar){
    	
    	for(ElevatorController elevatorController : elevatorControllerList) {

            int elevatorID = elevatorController.elevatorCar.id;
            if (elevatorID == elevatorCar.id ){
                elevatorController.submitInternalRequest(floor);
            }
         }
    }
}
