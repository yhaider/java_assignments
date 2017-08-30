import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects = new ArrayList<>();
    // Each portfolio will have this attribute: an array list filled with
    // projects for the portfolio

    public Portfolio(){};

    public void addProject(Project project){
        this.projects.add(project);
    }
    // Adds a project to the projects array list in the Portfolio

    public ArrayList<Project> getProjects(){
        return this.projects;
    }
    // Gets all the projects, just as the method name suggests
    // Yippee for clear and concise naming of methods!! :)

    public float getPortfolioCost(){
       float sum = 0.0f;
       for(int i = 0; i < this.projects.size(); i++){
           sum += this.projects.get(i).getProjectCost();
       }
       return sum;
   }
   // Returns the portfolio's total cost by running through the
   // projects array and adding each project's cost (which we obtain
   // by running the getProjectCost() method on each project) to the sum

   public void showPortfolio(){
       System.out.println("PORTFOLIO CONTENTS");
       for(int i = 0; i < this.projects.size(); i++){
           System.out.println(this.projects.get(i).elevatorPitch());
       }
       System.out.println("Total Portfolio Cost: $" + this.getPortfolioCost());
   }
   // Prints each project's elevator pitch and then the portfolio's total cost
}
