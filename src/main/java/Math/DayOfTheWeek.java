package Math;

public class DayOfTheWeek {

    public static String dayOfTheWeek(int day, int month, int year) {
        String[] days= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int[] monthDays={31,28,31,30,31,30,31,31,30,31,30,31};
        int sum=4; //consider friday was the 1971 jan 1
        //calculate no of days per year
        for(int j=1971;j<year;j++)
        {
            if(j%100==0){
                if(j%400==0)
                    sum+=366;
                else sum+=365;
            }
            else if(j%4==0)
            {
                sum+=366;
            }

            else sum+=365;
        }

        //calculate no of days per month
        for(int m=1;m<month;m++)
        {

            if(m==2) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        sum += 1;
                    else sum += 0;
                }
                else if (year % 4 == 0) {
                    sum += 1;
                }
                else sum += 0;

            }
            sum+=monthDays[m-1];
        }

        //day
        sum+=day;

        int ans=sum%7;
        return days[ans];


    }

    public static void main(String[] s)
    {
        System.out.println(dayOfTheWeek(31,8,2019));
    }
}
