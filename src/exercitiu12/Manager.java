package exercitiu12;

public class Manager extends Employee implements Interview,Training{


    @Override
    public void conductInterview() {
        System.out.println("Manager conduce un interview. ");

    }

    @Override
    public void conductTrainig() {
        System.out.println("Manager conduce un trening. ");

    }
}
