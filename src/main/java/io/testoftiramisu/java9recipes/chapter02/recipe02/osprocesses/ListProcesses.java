package io.testoftiramisu.java9recipes.chapter02.recipe02.osprocesses;

import java.time.Duration;
import java.util.Optional;

public class ListProcesses {

  public static void listProcesses() {
    ProcessHandle.allProcesses().forEach(System.out::println);
  }

  private static void detailedListOfProcesses() {
    ProcessHandle.allProcesses().forEach(handle -> System.out.println(formattedProcess(handle)));
  }

  private static String formattedProcess(ProcessHandle handle) {
    long pid = handle.pid();
    boolean alive = handle.isAlive();

    Optional<Duration> cpuDuration = handle.info().totalCpuDuration();
    String duration = cpuDuration.map(Duration::toString).orElse("");

    String handleName = handle.info().command().orElse("");

    String user = handle.info().user().orElse("");

    return String.format("%-5s | %-18s | %5s | %s %s", pid, user, alive, handleName, duration);
  }

  public static void main(String[] args) {
    System.out.println("pid   | user               | alive | handle name ¢¢");
    detailedListOfProcesses();
  }
}
