package ludo;
public class chal extends Ludo {
    public int move() {
        while (true) {
            for (int i = 1; i < 5; i++) {
                int sum = 0;
   /*1st move*/ int n = (int) (1 + Math.random() * (6 - 1 + 1));
                sum = sum + n;
                    if (n == 6) 
                    {
        /*2nd move*/    n = (int) (1 + Math.random() * (6 - 1 + 1));
                        sum = sum + n;
                                        if (n == 6) 
                                        {
                        /*3rd move*/        n =(int)(1 + Math.random() * (6 - 1 + 1));
                                            sum = sum + n;
                                                    if (n != 6)
                                                    {
                                                        sum = sum + n;
                                                    } 
                                                    else 
                                                    {
                                                        sum = 0;
                                                    }
                                        } 
                                        else 
                                        {
                                            sum = sum + n;
                                        }
                    } 
                    else 
                    {
                        sum = sum + n;
                    }
                return sum;
            }
        }
    }
}