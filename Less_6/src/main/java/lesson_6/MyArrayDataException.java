package lesson_6;

class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String msg) {
        super("Ошибка преобразования элемента массива в целое число.\n" + " " + msg);
    }

}