package Decoratorfactory;

public class DecoratorFactory {

    private static DecoratorFactory dF;

    private  DecoratorFactory(){}

    public static DecoratorFactory getInstance(){
        if(dF==null){
            dF= new DecoratorFactory();
        }
        return dF;
    }
}
