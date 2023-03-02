package exercitiu12;

import java.util.List;

public class MetingRoom {

    List<Training> trainingList;

//    public MetingRoom(List<Training>trainingList){
//        this.trainingList=trainingList;
//    }
//
//    public void conductTrainig(){
//        for (Training training : trainingList){
//        training.conductTrainig();
//
//        }
//
//    }
    public void MetingRoom(Training training){
        training.conductTrainig();
    }

}
