public class GeneralPractitioner extends HealthProfessional {
    private String specialization;

    private String medicalLicense;

    public GeneralPractitioner() {
        super();
        this.specialization = "General Practice";
    }

    public GeneralPractitioner(int id, String name, int age, String specialization, String medicalLicense) {
        super(id, name, age);
        this.specialization = specialization;
        this.medicalLicense = medicalLicense;
    }

    @Override
    public void printInformation()
    {
        System.out.println("This is General Practitioner");
        System.out.println("medicalLicense is: " + this.medicalLicense);
        System.out.println("Specialization is: " + this.specialization);
        System.out.println("Information about the Health Professional:");
        super.printInformation();
        System.out.println(" ");
    }
}
