package com.company;

public class Systemcall2 {
    public  Systemcall2(Object[]args)
    {
        if(args.length == 2 && args[0]instanceof String && args[1]instanceof String)
        {
            System.out.println("Вызывается системный вызов 2");
        }
        else
        {
            System.out.println("Системмный взыв 2:неверно указан аргумент");
        }
    }
}
