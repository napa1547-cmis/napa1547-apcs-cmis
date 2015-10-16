import java.util.Random;
public class Planet
{
    private int maxPopulation;
    private double percentSpaceMarines;
    private int maxSpaceMarinesPerStarDestroyer;
    private int nPlanets = 10;
    private int SpaceM;
    private int StarD;
    private int SmSd;
    private int radius;
    Planet p;
    private String names;
    private String name;
    private String relationships;
    private String relationship;
    public Planet()
    {
        String[] names = {"Alpha", "Beta", "Delta", "Gamma"};
        name = new String (names[new Random().nextInt(names.length)]) + "\n" + Math.random();
        String[] relationships = {"friendly", "hostile", "neural", "at war", "ally"};
        relationship = new String (names[new Random().nextInt(relationships.length)]);
        radius = 1;
        maxPopulation = 1;
        percentSpaceMarines = 1.00;
        SpaceM = 1;
        StarD = 1;
        SmSd = SpaceM/StarD;
    }

    public Planet(int maxPopulation, int PercentSpaceMarines, int maxSpaceMarinesPerStarDestroyer)
    {
        this.maxPopulation = maxPopulation;
        this.percentSpaceMarines = percentSpaceMarines;
        this.maxSpaceMarinesPerStarDestroyer = maxSpaceMarinesPerStarDestroyer;
        maxPopulation = 1;
        percentSpaceMarines = 1.00;
        name = name;
        radius = (int)(Math.random());
        relationship = relationship;
        SpaceM = (int)(Math.random());
        StarD = (int)(Math.random());
        SmSd = SpaceM/StarD;
    }

    public String toString()
    {
        String result = String.format("Name: %s\n"+
                "Relationship: %s\n"+
                "Radius: %f\n"+
                "Population: %d\n"+
                "Space Marines as percent of Pop: %.2f\n"+
                "Space Marines: %d\n"+
                "Star Destroyers: %d\n"+
                "Space Marines per star destroyer: %.2f\n"+ name, relationship, radius, maxPopulation, percentSpaceMarines, SpaceM, StarD, SmSd);
        return result;
    }
}