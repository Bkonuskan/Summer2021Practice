package _04_switchCase;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        int suAndakiGunNo = 100 % 7; // 2 kalır, demekki bugünden 2 gün sonraki gün

        switch (suAndakiGunNo) {
            case 0:
                System.out.println("perşembe");
                break;
            case 1:
                System.out.println("cuma");
                break;
            case 2:
                System.out.println("cumartesi");
                break;
            case 3:
                System.out.println("pazar");
                break;
            case 4:
                System.out.println("pazartesi");
                break;
            case 5:
                System.out.println("salı");
                break;
            case 6:
                System.out.println("çarşamba");
                break;
            default:
                System.out.println("hatalı veri girdiniz!!");
        }
    }
}

