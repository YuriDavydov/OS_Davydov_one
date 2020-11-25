package com.company;
public class Systemcall
{
    int identificator ;
    Object[]args;
    public Systemcall(int a,Object[]ar){
        this.identificator = a;
        this.args=new Object[ar.length];
        for(int i =0;i< ar.length;i++){
            this.args[i]=ar[i];
        }

    }
    public void invoke(){
        switch(identificator)
        {
            case 0:
                Systemcall0 s0 = new Systemcall0(args);
                break;
            case 1:
                Systemcall1 s1 = new Systemcall1(args);
                break;
            case 2:
                Systemcall2 s2 = new Systemcall2(args);
                break;
            case 3:
                Systemcall3 s3 = new Systemcall3(args);
                break;
            case 4:
                Systemcall4 s4 = new Systemcall4(args);
                break;

        }
    }





}
