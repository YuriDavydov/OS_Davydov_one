package com.company;

public class Systemcall4 {
    public  Systemcall4(Object[]args)
    {
        if(args.length == 2 && args[0]instanceof Double && args[1]instanceof String)
        {
            System.out.println("Вызывается системный вызов 4");
        }
        else
        {
            System.out.println("Системмный взыв 4:неверно указан аргумент");
        }
    }
}
