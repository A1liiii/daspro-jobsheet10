import java.util.Scanner;  

public class BioskopWithScanner15 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int baris, kolom;  
        String nama;
        String[][] penonton = new String[4][2];  
        boolean running = true;  

        while (running) {  
            System.out.println("=== Menu ===");  
            System.out.println("1. Input data penonton");  
            System.out.println("2. Tampilkan daftar penonton");  
            System.out.println("3. Exit");  
            System.out.print("Pilih opsi: ");  
            int menuPilihan = sc.nextInt();  
            sc.nextLine();  

            switch (menuPilihan) {  
                case 1:   

                    boolean validInput = false;  
                    while (!validInput) {  
                        System.out.print("Masukkan nama: ");  
                        nama = sc.nextLine();  
                        System.out.print("Masukkan baris: ");  
                        baris = sc.nextInt();  
                        System.out.print("Masukkan kolom: ");  
                        kolom = sc.nextInt();  
                        sc.nextLine();  

                        if (baris > 0 && baris <= 4 && kolom > 0 && kolom <= 2) {  
                            if (penonton[baris - 1][kolom - 1] == null) {  
                                penonton[baris - 1][kolom - 1] = nama;  
                                validInput = true;  
                                System.out.println("Data penonton berhasil ditambahkan.");  
                            } else {  
                                System.out.println("Kursi sudah terisi! Silakan masukkan baris dan kolom lagi.");  
                            }  
                        } else {  
                            System.out.println("Baris dan kolom harus dalam rentang yang valid (1-4 untuk baris, 1-2 untuk kolom).");  
                        }  
                    }  
                    break;  

                case 2:   
                    System.out.println("=== Daftar Penonton ===");  
                    for (int i = 0; i < penonton.length; i++) {  
                        for (int j = 0; j < penonton[i].length; j++) {  
                            String tampilNama = (penonton[i][j] == null) ? "***" : penonton[i][j];  
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + tampilNama);  
                        }  
                    }  
                    break;    

                case 3:  
                    running = false;  
                    System.out.println("Terima kasih! Program dihentikan.");  
                    break;  

                default:  
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");  
                    break;  
            }  
        }  

        sc.close();  
    }  
}