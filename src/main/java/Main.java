public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        System.out.println(post.name);
        System.out.println(post.patronymic);
        System.out.println(post.surname);
        System.out.println("Паспорт " + post.passport);
        System.out.println("Номер телефона " + post.phone);
        System.out.println("День рождения " + post.birthday.day);
        System.out.println("Месяц рождения " + post.birthday.month);
        System.out.println("Год рождения " + post.birthday.year);// заполните другие поля
    }
}