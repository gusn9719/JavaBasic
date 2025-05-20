package test;

import item.DDItemService;
import item.ItemService;

public class DDItemServiceTest {
    public static void main(String[] args) {
        ItemService svc = new DDItemService();

        svc.addItem("Walkman TPS-L2", "80s", "TECH", 120000);
        svc.addItem("Rubik's Cube Lamp", "80s", "DESK", 35000);
        svc.addItem("Tamagotchi 25th", "90s", "DESK", 27000);

        System.out.println("=== 전체 목록 ===");
        svc.getAll().forEach(System.out::println);

        System.out.println("\n=== 80s / DESK ===");
        svc.getBy("80s", "DESK").forEach(System.out::println);
    }
}
