import java.util.Scanner; 
 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
           String name = scanner.next();
           
           double percentage = scanner.nextDouble(); 
           int backlogs = scanner.nextInt();
           int graduationYear = scanner.nextInt(); 
            Candidate candidate = new Candidate( name, percentage, backlogs, graduationYear  ); 
             Job job1 = new Job( "Infosys","Java Developer",65.0,0, 2026);
                   System.out.println("Candidate: " + candidate.getName()); 
                   System.out.println("Company: " + job1.getCompany());
                    System.out.println("Role: " + job1.getRole());
                     System.out.println("Minimum Percentage: " + job1.getMinimumPercentage()); 
                     System.out.println("Maximum Backlogs: " + job1.getMaximumBacklogs());
                      System.out.println("Required Graduation Year: " + job1.getRequiredGraduationYear()); 
                      
                      scanner.close(); 
                 }
                }
