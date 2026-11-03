public class Candidate {
    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;
    private String[] skills;

    public Candidate(String name, double percentage, int backlogs, int graduationYear) {
        this(name, percentage, backlogs, graduationYear, new String[0]);
    }

    public Candidate(String name, double percentage, int backlogs, int graduationYear, String[] skills) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
        this.skills = skills != null ? skills : new String[0];
    }

    public String getName() {
        return name; 
    }  

    public double getPercentage() {
        return percentage;  
    }  

    public int getBacklogs() {
        return backlogs;  
    }  

    public int getGraduationYear() {
        return graduationYear;  
    }

    public String[] getSkills() {
        return skills;
    }

    public boolean hasSkill(String targetSkill) {
        if (skills == null || targetSkill == null) {
            return false;
        }
        for (String skill : skills) {
            if (skill != null && skill.equalsIgnoreCase(targetSkill)) {
                return true;
            }
        }
        return false;
    }
}
