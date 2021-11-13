public class Monster 
{
    private String name;

    public Monster() 
    {
        super();
    }
    public Monster(String name)
    {
        this.name = name;
    }

    public String name()
    {
        return name;
    }

    public String attack()
    {
        return "Your family is dead :(";
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static void main (String[] args)
    {
        Monster fire = new FireMonster("fire bender");
        Monster water = new WaterMonster("water bender");
        Monster stone = new StoneMonster("earth bender");

        System.out.println(fire.attack());
        System.out.println(water.attack());
        System.out.println(stone.attack());

        fire = new StoneMonster("king boomy");
        System.out.println(fire.attack());

        Monster air = new Monster ("the dead nation");
        System.out.println(air.attack());
    }

    static class FireMonster extends Monster
    {
        public FireMonster(String name)
        {
            super(name);
        }

        @Override
        public String attack()
        {
            return "Attack with fire!";
        }

        int damage = 10;
        double attackSpeed = 5;
        
    }

    static class WaterMonster extends Monster
    {
        public WaterMonster(String name)
        {
            super(name);
        }

        @Override
        public String attack()
        {
            return "Attack with water!";
        }
        
        int damage = 5;
        double attackSpeed = 10;
    }

    static class StoneMonster extends Monster
    {
        public StoneMonster(String name)
        {
            super(name);
        }

        @Override
        public String attack()
        {
            return "Attack with stones!";
        }

        int damage = 20;
        double attackSpeed = 2.5;
    }

}