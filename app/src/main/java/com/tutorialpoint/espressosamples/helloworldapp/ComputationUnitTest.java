package com.tutorialpoint.espressosamples.helloworldapp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ComputationUnitTest {
    private static Computation computation = null;
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
    @Test
    public void file_isCreated() throws IOException
    {
        folder.newFolder("MyTestFolder");
        File testFile = folder.newFile("MyTestFile.txt");
        assertTrue(testFile.exists());
    }
    @BeforeClass
    public static void CreateComputationObject()
    {
        computation = new Computation();

    }
    @AfterClass
    public static void DestroyComputationObject()
    {
        computation = null;
    }
    @Test
    public void sum_isCorrect() {
        Computation computation = new Computation();
        assertEquals(4, computation.Sum(2,2));
    }
    @Test
    public void multiply_isCorrect() {
        Computation computation = new Computation();
        assertEquals(4, computation.Multiply(2,2));
    }

}
