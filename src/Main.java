public class Main {
    public static void main(String[] args) {
        int client = 200;
        int insert = 1100;
        int bonus = insert / 100 + insert + client;
        int bonusRub = insert / 100;
        int noBonusa = insert + client;
        boolean withaBonusom = insert >= 1000;
        boolean Bonus = insert <= 1000;
        int inTotal = withaBonusom ? bonus : noBonusa;
        System.out.println( intTotal + " итоговый счет");
        System.out.println( bonusRub + " бонус рубли");
    }
}
