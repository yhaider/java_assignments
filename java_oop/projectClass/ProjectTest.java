
public class ProjectTest {
    public static void main(String[] args) {
        Project project = new Project("P1", "Desc1", 10.00);
        System.out.println(project.elevatorPitch());

        Project project2 = new Project();
        project2.setProjectName("P2");
        project2.setProjectDesc("Desc2");
        project2.setProjectCost(12);
        System.out.println(project2.elevatorPitch());
    }
    // Testing out our Project class
}
