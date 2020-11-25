package com.company;

public class Systemcall1 {
    public  Systemcall1(Object[]args)
    {
        if(args.length == 2 && args[0]instanceof Double && args[1]instanceof Double)
        {
            System.out.println("Вызывается системный вызов 1");
        }
        else
        {
            System.out.println("Системмный взыв 1:неверно указан аргумент");
        }
    }
}
