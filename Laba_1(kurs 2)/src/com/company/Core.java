package com.company;
public class Core {
    public void printcalls(){//функция вывода сис вызовов
        System.out.println("системный вызов 0 : аргументы(целое число,целое число)");
        System.out.println("системный вызов 1 : аргументы(дробное число,дробное число)");
        System.out.println("системный вызов 2 : аргументы(строка,строка)");
        System.out.println("системный вызов 3 : аргументы(целое число,строка)");
        System.out.println("системный вызов 4 : аргументы(дробное число,строка)");

    }
    public void Call(Systemcall call)
    {// выполнение системного вызова по его идентефикатору
        call.invoke();
    }
}
