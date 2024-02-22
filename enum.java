// Deklarasi enum
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class enum {
    public static void main(String[] args) {
        // Menggunakan nilai dari enum
        Day today = Day.WEDNESDAY;
        System.out.println("Hari ini adalah: " + today);

        // Menggunakan switch dengan enum
        switch (today) {
            case MONDAY:
                System.out.println("Ini hari Senin.");
                break;
            case WEDNESDAY:
                System.out.println("Ini hari Rabu.");
                break;
            default:
                System.out.println("Ini bukan Senin atau Rabu.");
        }
    }
}

