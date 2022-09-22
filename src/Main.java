public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new int[] {1,2,3,4,5,6,7,8,9});
        System.out.println("Самая большая продажа: " + manager.max());
        System.out.println("Среднее: " + manager.average(manager.sales));
    }
}
