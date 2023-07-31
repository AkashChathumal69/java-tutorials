public class Employee 
{
    private String name;
    private float bsal;

    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }

     public void setBsal(int a)
    {
        bsal=a;
    }
    public float getBsal()
    {
        return bsal;
    }

    public void bonus(float amount)
    {
        bsal= bsal+ amount;
        System.out.println("Bonus:"+amount);
        System.out.println("Bonus amount  :"+bsal);
    }


}
