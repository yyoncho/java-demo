package com.dap.demo.projectb;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class App {
    private String name;

    public static void main(String[] args) {

        App app = new App();
        app.doStuff();
        app.name = "appField";

        System.out.println();
    }

    private void doStuff() {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.submit(new Runnable() {
            @Override
            public void run() {
                doStuffInsideExecutor("doStuffInsideExecutor");
            }

            private void doStuffInsideExecutor(String input) {
                System.out.println(name);
            }
        });
    }
}
