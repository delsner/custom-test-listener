package edu.tum.delsner; 

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class CustomTestListener extends RunListener {
    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("STARTING RUN " + description.toString());
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("Finishing RUN " + result.toString());
    }

    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("Starting test " + description.toString());
    }

    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("Finishing test " + description.toString());
    }
}

