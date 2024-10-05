import java.util.Arrays;

public class DividePlayersIntoTeamsOfEqualSkills {

    // brute
    public static long  dividePlayers(int[] skill) {

        Arrays.sort(skill);
        long res=0;
        int n= skill.length-1;
        int  sum= skill[0]+skill[n];
        for(int i=0;i<=n/2;i++)
        {
            if(skill[i]+skill[n-i]==sum)
                res= res+ (skill[i]*skill[n-i]);

            else
                return -1;
        }

        return res;

    }

    //optimal
    public static long dividePlayersOptimal(int[] skill) {

        //Target skill
        int len=skill.length;
        int totalSkill=0;
        int[] freq= new int[1000];
        for(int i=0;i<len;i++)
        {
            //total Skill
            totalSkill+= skill[i];

            //freq
            freq[skill[i]]+=1;
        }

        //skill per team
        int teamSkill=0;
        if(totalSkill % (len/2)==0)
        {
            teamSkill = totalSkill / (len/2);
        }
        else
            return -1;


        //chemistry
        long chem=0l;
        for(int j=0;j<len;)
        {
            //check and create chemistry
            int teamMemb= teamSkill- skill[j];
            if(freq[teamMemb]!=0)
            {
                chem+= teamMemb * skill[j];
                freq[teamMemb]-=1;
            }
            else
                return -1;
        }

        // remove the double calculation
        return chem/2;
    }


    public long initialSolution(int[] skill)
    {
        Arrays.sort(skill);
        long res=0;
        int n= skill.length-1;
        int  sum= skill[0]+skill[n];
        for(int i=0;i<=n/2;i++)
        {
            if(skill[i]+skill[n-i]==sum)
                res= res+ (skill[i]*skill[n-i]);

            else
                return -1;
        }

        return res;
    }

    public static void main(String[] a) {


        int[] mat = {3,2,5,1,3,4};
        //int[][] mat = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
        //[0,1,2,0],[3,4,5,2],[1,3,1,5]


        //long res= dividePlayers(mat);
        long resOpt= dividePlayersOptimal(mat);
        System.out.println("Optimized: ");
        //Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        System.out.println(resOpt);

    }
}
