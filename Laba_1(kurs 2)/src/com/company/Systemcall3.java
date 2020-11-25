package com.company;

public class Systemcall3 {
    public  Systemcall3(Object[]args)
    {
        if(args.length == 2 && args[0]instanceof Integer && args[1]instanceof String)
        {
            System.out.println("Вызывается системный вызов 3");
        }
        else
        {
            System.out.println("Системмный взыв 3:неверно указан аргумент");
        }
    }
}
