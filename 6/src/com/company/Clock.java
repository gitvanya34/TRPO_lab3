package com.company;

import java.text.Normalizer;

public class Clock {
    private int hour;
    private int min;
    private int sec;

    public Clock ()
    {
      hour=12;
      min=0;
      sec=0;
    }
    public void Normalizer()
    {
        if(sec<0)
        {
            min--;
            sec=60+sec;
        }
        if(min<0)
        {
            hour--;
            min=60+min;
        }
        if(hour<0)
        {
            hour=24+hour;
        }

        if(sec>59)
        {
            min+=sec/60;
            sec=sec%60;
        }
        if(min>59)
        {
            hour+=min/60;
            min=min%60;
        }
        if(hour>23)
        {
            hour=hour%24;
        }
    }
    public Clock (int h, int m ,int s)
    {
        hour=h;
        min=m;
        sec=s;
        Normalizer();
    }
    public Clock (int s)
    {
        min = s/60;
        sec = s%60;
        hour = min/60;
        min=min%60;
        hour=hour%24;
    }
    public void Tick()
    {
//        Clock clock =new Clock(hour, min,++sec);
//        hour=clock.hour;
//        min=clock.min;
//        sec=clock.sec;
        sec++;
        Normalizer();
    }
    public void TickDown()
    {
//        Clock clock =new Clock(hour, min,--sec);
//        hour=clock.hour;
//        min=clock.min;
//        sec=clock.sec;
        sec--;
        Normalizer();
    }
    public void AddClock(int t1,int t2,int t3)
    {
//        Clock clock =new Clock(hour+=c.hour, min+=c.min,sec+=c.sec);
//        hour=clock.hour;
//        min=clock.min;
//        sec=clock.sec;
            hour+=t1;
            min+=t2;
            sec+=t3;
        Normalizer();
    }
    public void SubtractClock(int t1,int t2,int t3)
    {
//        Clock clock =new Clock(hour-=c.hour, min-=c.min,sec-=c.sec);
//        hour=clock.hour;
//        min=clock.min;
//        sec=clock.sec;
        hour-=t1;
        min-=t2;
        sec-=t3;
        Normalizer();
    }
    public void printClock()
    {
        System.out.printf(" %d:%d:%d\n", hour,min,sec );
    }
}
