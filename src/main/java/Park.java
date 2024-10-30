public class Park {
    String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        String nameAtt;
        String openingHours;
        double price;

        public Attraction(String nameAtt, String openingHours, double price) {
            this.nameAtt = nameAtt;
            this.openingHours = openingHours;
            this.price = price;
        }
        public void printInfoAtt(){
            System.out.println("Название аттракциона" + nameAtt);
            System.out.println("Время работы" + openingHours);
            System.out.println("Стоимость" + price);
        }
    }

    public static void main(String[] args) {
        Park park = new Park(" Парк аттракционов");
        Attraction attraction = park.new Attraction("Веселые горки ", "9.00 - 21.00 ", 200.0);
        attraction.printInfoAtt();
    }
}
