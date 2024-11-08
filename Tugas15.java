import java.util.Scanner;  

public class Tugas15 {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        int[][] hasilSurvey = new int[10][6];  

        for (int i = 0; i < 10; i++) {  
            System.out.println("Responden " + (i + 1) + ":");  
            for (int j = 0; j < 6; j++) {  
                while (true) {  
                    System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");  
                    hasilSurvey[i][j] = scanner.nextInt();  
                    
                    if (hasilSurvey[i][j] < 1 || hasilSurvey[i][j] > 5) {  
                        System.out.println("Peringatan: Masukan harus antara 1 dan 5. Silakan coba lagi.");  
                    } else {  
                        break;  
                    }  
                }  
            }  
        }  

        System.out.println("\nRata-rata untuk setiap responden:");  
        for (int i = 0; i < 10; i++) {  
            double total = 0;  
            for (int j = 0; j < 6; j++) {  
                total += hasilSurvey[i][j];  
            }  
            double rataRata = total / 6;  
            System.out.println("Responden " + (i + 1) + ": " + rataRata);  
        }  

        System.out.println("\nRata-rata untuk setiap pertanyaan:");  
        for (int j = 0; j < 6; j++) {  
            double total = 0;  
            for (int i = 0; i < 10; i++) {  
                total += hasilSurvey[i][j];  
            }  
            double rataRata = total / 10;  
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRata);  
        }  

        System.out.println("\nRata-rata keseluruhan:");  
        double totalKeseluruhan = 0;  
        int count = 0;  
        for (int i = 0; i < 10; i++) {  
            for (int j = 0; j < 6; j++) {  
                totalKeseluruhan += hasilSurvey[i][j];  
                count++;  
            }  
        }  
        double rataRataKeseluruhan = totalKeseluruhan / count;  
        System.out.println("Rata-rata keseluruhan: " + rataRataKeseluruhan);  

        scanner.close();  
    }  
}