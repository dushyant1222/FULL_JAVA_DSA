package com.Arrays;

public class Assignment {
    public static void main(String[] args) {
                CustomThread customThread = new CustomThread();
                customThread.start();

                // Start a new process
                ProcessBuilder processBuilder = new ProcessBuilder("java", "-version");
                try {
                    Process process = processBuilder.start();
                    System.out.println("Process started: " + process);
                    int exitCode = process.waitFor();
                    System.out.println("Process exited with code: " + exitCode);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("Custom thread is running.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread loop " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}