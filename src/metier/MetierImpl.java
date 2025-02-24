package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl() {
    }
//    dynamic injection
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

// static injection
//    public void setDao(IDao dao) {
//        this.dao = dao ;
//    }

    public double calcul() {
        System.out.println("MetierImpl.calcul()");
        double data = dao.getData();
        double result = data * 23;
        return result;
    }
}
