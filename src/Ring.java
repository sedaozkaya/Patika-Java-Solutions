
public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Fighter firstAttacker;  // İlk saldırıyı yapacak dövüşçü

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        // İlk saldırıyı yapacak dövüşçüyü belirliyoruz (%50 olasılık)
        this.firstAttacker = (Math.random() > 0.5) ? f1 : f2;
    }

    public void run() {
        if (checkWeight()) {
            Fighter attacker = firstAttacker;  // İlk dövüşçü saldırıyor
            Fighter defender = (attacker == f1) ? f2 : f1;

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                defender.health = attacker.hit(defender);
                if (isWin()){
                    break;
                }

                // Vuruş sırasını değiştiriyoruz
                Fighter temp = attacker;
                attacker = defender;
                defender = temp;

                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
