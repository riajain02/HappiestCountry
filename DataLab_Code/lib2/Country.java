import java.util.List;

public class Country
{
    private String name;
    private int year;
    private double ladderScore;
    private double GDP;
    private double socialSupport;
    private double lifeExp;
    private double freedom;
    private double generosity;
    private double corruption;
    
    public Country(String n, int y, double lad, double gdp, double s, double life, double f, double gen, double c)
    {
        name = n;
        year = y;
        ladderScore = lad;
        GDP = gdp;
        socialSupport = s;
        lifeExp = life;
        freedom = f;
        generosity = gen;
        corruption = c;
    }
    /*public static void main(String args[])
    {
        Country ex = new Country("US",2021,1.0,1.0,1.0,1.0,1.0,1.0,1.0);
        System.out.println(ex);
    }
    */
    
    public String toString()
    {
        return "\n\n" + name + " (" + year + "):" + "\nLadder score: " + ladderScore + "\nGDP: "
        + GDP + "\nSocial Support: " + socialSupport + "\nLife Expectancy: " + lifeExp + "\nFreedom: "
        + freedom + "\nGenerosity: " + generosity + "\nCorruption: " + corruption;
    }

    public String getName()
    {
        return name;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public double getLadderScore()
    {
        return ladderScore;
    }
    
    public double getGDP()
    {
        return GDP;
    }

    public double getSocialSupport()
    {
        return socialSupport;
    }

    public double getLifeExp()
    {
        return lifeExp;
    }

    public double getFreedom()
    {
        return freedom;
    }

    public double getGenerosity()
    {
        return generosity;
    }

    public double getCorruption()
    {
        return corruption;
    }

    public void setName(String n)
    {
        name = n;
    }
    
    public void setYear(int y)
    {
        year = y;
    }
    
    public void setLadderScore(double l)
    {
        ladderScore = l;
    }
    
    public void setGDP(double g)
    {
        GDP = g;
    }

    public void setSocialSupport(double s)
    {
        socialSupport = s;
    }

    public void setLifeExp(double l)
    {
        lifeExp = l;
    }

    public void setFreedom(double f)
    {
        freedom = f;
    }

    public void setGenerosity(double g)
    {
        generosity = g;
    }

    public void setCorruption(double c)
    {
        corruption = c;
    }

    public double getTotal()
    {
        return ladderScore + GDP + socialSupport + lifeExp + freedom + generosity - corruption;
    }
}