public class Main {
    public static void main(String[] args) {
        int client = 200;
        int vnos = 90;
        int bonus = vnos / 100 + vnos + client;
        int bonusRub = vnos / 100;
        int bezBonusa = vnos + client;
        boolean sBonusom = vnos >= 1000;
        boolean Bonusom = vnos <= 1000;
        int itogo = sBonusom ? bonus : bezBonusa;
        System.out.println( itogo + " итоговый счет");
        System.out.println(bonusRub + " бонус рубли");
    }
}
