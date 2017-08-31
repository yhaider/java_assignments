public class Project {
    private String name;
    private String description;
    private double initialCost;
    private float cost;
    // These are all the attributes of a project

    public Project(){}

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
        this.cost = (float) initialCost;
    }
    // Above are four different ways to overload the constructor method
    // The first just creates the project but does not define name or description
    // The second creates the project, taking in the name as a string, to set the name
    // The third creates the project, taking in the name and desc, and setting both
    // The fourth creates the project, taking in name, desc, and initial cost
    // and setting them

    public String getProjectName(){
        return this.name;
    }
    public void setProjectName(String name){
        this.name = name;
    }

    public String getProjectDesc(){
        return this.description;
    }
    public void setProjectDesc(String description){
        this.description = description;
    }

    public float getProjectCost(){
        return this.cost;
    }
    public void setProjectCost(float cost){
        this.cost = cost;
    }
    // The above three pairings are getter and setter methods for
    // the project name, project description, and project cost

    public String elevatorPitch(){
        return this.name + "($" + this.cost + "): " + this.description;
    }
    // This method brings all three attributes and spits out an elevator pitch
}
