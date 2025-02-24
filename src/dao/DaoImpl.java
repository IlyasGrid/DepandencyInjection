package dao;

public class DaoImpl implements IDao{
    public double getData() {
        System.out.println("DaoImpl.getData()");
        return 100;
    }
}
