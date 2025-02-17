package appiumpack1;

 
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class basicADBCommondsScripts {
    public static void main(String[] args) {
        // File to store the results
        String outputFilePath = "ADB_Commands_Output.txt";
        
        // List of ADB commands to execute
        List<String> commands = new ArrayList<>();
        commands.add("adb devices");
        commands.add("adb shell pm list packages");
        commands.add("adb shell dumpsys battery");
        commands.add("adb shell getprop");
        commands.add("adb shell dumpsys window | grep mCurrentFocus");
		/*
		 * commands.add("adb shell top -o CPU,PID,NAME | grep system");
		 * commands.add("adb logcat -d"); // Collect and stop logcat logs
		 */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            // Execute each command and write the output to the file
            for (String command : commands) {
                writer.write("Executing Command: " + command);
                writer.newLine();
                writer.write(runCommand(command));
                writer.newLine();
                writer.write("======================================");
                writer.newLine();
            }
            System.out.println("ADB command outputs written to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Runs a shell command and returns its output as a String.
     * 
     * @param command The command to execute.
     * @return The output of the command.
     * @throws IOException If an I/O error occurs.
     */
    public static String runCommand(String command) throws IOException {
        Process process = Runtime.getRuntime().exec(command);
        StringBuilder output = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append(System.lineSeparator());
            }
        }

        try (BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
            String line;
            while ((line = errorReader.readLine()) != null) {
                output.append("ERROR: ").append(line).append(System.lineSeparator());
            }
        }

        return output.toString();
    }
}
