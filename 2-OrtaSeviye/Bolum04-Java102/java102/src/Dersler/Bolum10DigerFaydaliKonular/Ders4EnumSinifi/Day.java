package Dersler.Bolum10DigerFaydaliKonular.Ders4EnumSinifi;

public enum Day {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int day;

    Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void getDayName() {
        String dayName = switch (this) {
            case PAZARTESI -> "PAZARTESİ";
            case SALI -> "SALI";
            case CARSAMBA -> "CARŞAMBA";
            default -> throw new IllegalStateException("Unexpected value: " + this.day);
        };

        System.out.println(dayName);
    }
}
