package week6.pb4;

public class Seat {
    // 좌석 16개
    String Name;

    public Seat() { // --- 값으로 초기화함
        Name = "---";
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
