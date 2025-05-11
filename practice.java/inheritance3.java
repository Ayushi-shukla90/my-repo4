class Device {
void powerOn() {
System.out.println("Device is powered on");
}
}
class Laptop extends Device {
void boot() {
System.out.println("Laptop is booting");
}
}
class GamingLaptop extends Laptop {
void startGame() {
System.out.println("Game is starting on Gaming Laptop");
}
}
public class inheritance3 {
public static void main(String[] args) {
GamingLaptop g = new GamingLaptop();
g.powerOn();
g.boot();
g.startGame();
}
}