package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("состояние:  " + active);
        System.out.println("номер: " + status);
        System.out.println("сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        System.out.println();
        Error error1 = new Error(true, 404, "неизвестная ошибка ");
        error1.printInfo();
    }
}
