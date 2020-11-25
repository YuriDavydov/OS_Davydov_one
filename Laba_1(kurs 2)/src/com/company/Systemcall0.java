package com.company;

public class Systemcall0 {
    public  Systemcall0(Object[]args)
    {
        if(args.length == 2 && args[0]instanceof Integer && args[1]instanceof Integer)
        {
            System.out.println("Вызывается системный вызов 0");
        }
        else
        {
            System.out.println("Системмный взыв 0:неверно указан аргумент");
        }
    }
}
