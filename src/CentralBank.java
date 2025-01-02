public class CentralBank {
    int getInterestRate() {
        return 8;
    }
}
class NDB extends CentralBank{
    @Override
    int getInterestRate() {
        return 9;
    }
}
class HNB extends CentralBank{
    @Override
    int getInterestRate() {
        return 10;
    }
}
class BOC extends CentralBank{
    @Override
    int getInterestRate() {
        return 11;
    }
}
class Test{
    public static void main(String[] args) {
        CentralBank cb = new CentralBank();
        NDB n = new NDB();
        HNB h = new HNB();
        BOC b = new BOC();

        System.out.println("Central Bank's Rate : " + cb.getInterestRate());
        System.out.println("NDB's Rate :" +n.getInterestRate());
        System.out.println("HNB's Rate :" +h.getInterestRate());
        System.out.println("BOC's Rate :" +b.getInterestRate());
    }
}
