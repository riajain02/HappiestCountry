public class Cereal
{
    private String name;
    private char type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private int fiber;
    private int carbohydrate;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private double weight;
    private double cups;
    private double rating;

    public static void main(String args[])
    {
        Cereal cereal1 = new Cereal("100% Bran",'C',70,4,1,130,10,5,6,280,25,3,1,0.33,68.407923);
        Cereal cereal2 = new Cereal("100% Natural Bran",'C',120,3,5,15,2,8,8,135,0,3,1,1,33.983679);
        System.out.println(cereal1);
        System.out.println(cereal2);
    }
    
    public String toString()
    {
        return "\n\n" + "Name: " + name + "\nType: " + type + "\nCalories: " + calories +
        "\nProtein: " + protein + "\nFat: " + fat + "\nSodium: " + sodium + "\nFiber: " + fiber + 
        "\nCarbohydrate: " + carbohydrate + "\nSugar: " + sugar + "\nPotassium: " + potassium + 
        "\nVitamins: " + vitamins + "\nShelf: " + shelf + "\nWeight: " + weight + "\nCups: " + cups + 
        "\nRating: " + rating + "\n\n";
    }
    
    public Cereal(String n, char t, int c, int p, int f, int s, int f2, int c2, int s2, 
    int p2, int v, int s3, double w, double c3, double r)
    {
        name = n;
        type = t;
        calories = t;
        protein = p;
        fat = f;
        sodium = s;
        fiber = f2;
        carbohydrate = c2;
        sugar = s2;
        potassium = p2;
        vitamins = v;
        shelf = s3;
        weight = w;
        cups = c3;
        rating = r;
    }

    public void setName (String n)
    {
        name = n;
    }
    
    public void setType (char t)
    {
        type = t;
    }

    public void setCalories (int c)
    {
        calories = c;
    }

    public void setProtein (int p)
    {
        protein = p;
    }

    public void setFat (int f)
    {
        fat = f;
    }

    public void setSodium (int s)
    {
        sodium = s;
    }

    public void setFiber (int f)
    {
        fiber = f;
    }

    public void setCarbohydrate (int c)
    {
        carbohydrate = c;
    }

    public void setSugar (int s)
    {
        sugar = s;
    }

    public void setPotassium (int p)
    {
        potassium = p;
    }

    public void setVitamins (int v)
    {
        vitamins = v;
    }

    public void setShelf (int s)
    {
        shelf = s;
    }

    public void setCups (double c)
    {
        cups = c;
    }

    public void setWeight (double w)
    {
        weight = w;
    }

    public void setRating (double r)
    {
        rating = r;
    }

    public String getName()
    {
        return name;
    }
    
    public char getType()
    {
        return type;
    }

    public int setCalories()
    {
        return calories;
    }

    public int setProtein()
    {
        return protein;
    }

    public int setFat()
    {
        return fat;
    }

    public int setSodium()
    {
        return sodium;
    }

    public int setFiber()
    {
        return fiber;
    }

    public int setCarbohydrate()
    {
        return carbohydrate;
    }

    public int setSugar()
    {
        return sugar;
    }

    public int setPotassium()
    {
        return potassium;
    }

    public int setVitamins()
    {
        return vitamins;
    }

    public int setShelf()
    {
        return shelf;
    }

    public double setCups()
    {
        return cups;
    }

    public double setWeight()
    {
        return weight;
    }

    public double setRating()
    {
        return rating;
    }

}