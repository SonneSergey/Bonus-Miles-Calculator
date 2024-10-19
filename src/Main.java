public class Main {
    public static void main(String[] args) {
        // Объявление переменной для хранения стоимости билета
        int ticketPrice = 15000;
        // Объявление переменной для хранения количества рублей для одной бонусной мили
        int rublesPerMile = 20;
        // Рассчёт количества бонусных миль
        int bonusMiles = ticketPrice / rublesPerMile;
        // Вывод результата на экран
        System.out.println("Количество бонусных миль:" + bonusMiles);
    }
}
