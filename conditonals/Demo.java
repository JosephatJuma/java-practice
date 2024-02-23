class Demo{
    public static void main(String[] a){
        // int x=10;
        // if(x==10 & x<20)
        //     System.out.println("x is 10");
        // else
        //     System.out.println("x is 10");

        int day=1;
        if(day==1){
            System.out.println("Monday");
        }
        else if(day==2){
            System.out.println("Tuesday");
        }
        else if (day==3){
            System.out.println("Wednesday");
        }
        else if(day==4){
            System.out.println("Thursday");
        }
        else if(day==5){
            System.out.println("Friday");
        }
        else if(day==6){
            System.out.println("Saturday");
        }
        else if(day==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid day");
        }

        //the above is a lot of code and it is not good

        //so we use switch case

        switch(day){
            case 1:
            System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            
            
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
             default:
                System.out.println("Invalid day");
        }

        
    }
}