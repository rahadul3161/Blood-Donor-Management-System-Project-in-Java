package bloodDonorManagementSystemProject;

import java.util.*;
class bloodBank {
    private Map<String, List<String>> bloodDonors;
    public bloodBank() {
        bloodDonors = new HashMap<>();
        bloodDonors.put("A+", new ArrayList<>());
        bloodDonors.put("A-", new ArrayList<>());
        bloodDonors.put("B+", new ArrayList<>());
        bloodDonors.put("B-", new ArrayList<>());
        bloodDonors.put("O+", new ArrayList<>());
        bloodDonors.put("O-", new ArrayList<>());
        bloodDonors.put("AB+", new ArrayList<>());
        bloodDonors.put("AB-", new ArrayList<>());
    }
    public void addDonor(String name, String bloodType) {
        if (bloodDonors.containsKey(bloodType)) {
            bloodDonors.get(bloodType).add(name);
            System.out.println("Congratulations. "+name+" has been added as a donor with blood type "+bloodType);
        }
        else {
            System.out.println("Invalid blood type.");
        }
    }

    public void displayAvailableBlood() {
        System.out.println("\nAvailable Blood Types and Donors:");
        for (Map.Entry<String, List<String>> entry : bloodDonors.entrySet()) {
            String bloodType = entry.getKey();
            List<String> donors = entry.getValue();
            System.out.println("Blood Type: " + bloodType);
            if (donors.isEmpty()) {
                System.out.println("  No donors available.");
            }
            else {
                System.out.println("  Donors: " + String.join(", ", donors));
            }
        }
    }

    public void searchDonorByBloodType(String bloodType) {
        if (bloodDonors.containsKey(bloodType)) {
            List<String> donors = bloodDonors.get(bloodType);
            if (donors.isEmpty()) {
                System.out.println("No donors found for blood type " + bloodType);
            }
            else {
                System.out.println("Donors with blood type " + bloodType + ": " + String.join(", ", donors));
            }
        }
        else {
            System.out.println("Invalid blood type.");
        }
    }
}
