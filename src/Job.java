public class Job { 
    private String company; 
    private String role;
    private double minimumPercentage;
    private int maximumBacklogs;
    private int requiredGraduationYear; 
    private String[] requiredSkills;

    public Job( 
        String company, 
        String role, 
        double minimumPercentage, 
        int maximumBacklogs, 
        int requiredGraduationYear
    ) {
        this(company, role, minimumPercentage, maximumBacklogs, requiredGraduationYear, new String[0]);
    }

    public Job( 
        String company, 
        String role, 
        double minimumPercentage, 
        int maximumBacklogs, 
        int requiredGraduationYear,
        String[] requiredSkills
    ) {
        this.company = company; 
        this.role = role; 
        this.minimumPercentage = minimumPercentage; 
        this.maximumBacklogs = maximumBacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
        this.requiredSkills = requiredSkills != null ? requiredSkills : new String[0];
    }

    public String getCompany() { 
        return company; 
    } 

    public String getRole() { 
        return role; 
    }

    public double getMinimumPercentage() { 
        return minimumPercentage; 
    } 
            
    public int getMaximumBacklogs() { 
        return maximumBacklogs; 
    } 

    public int getRequiredGraduationYear() { 
        return requiredGraduationYear;
    }

    public String[] getRequiredSkills() {
        return requiredSkills;
    }
}
