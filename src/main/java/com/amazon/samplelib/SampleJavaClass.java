package com.amazon.samplelib;
/**
 * SampleJavaClass.
 */
public class SampleJavaClass {
    /**
     * Sample method.
     * @return a placeholder string
     */
    public String sampleMethod() {
        final String CodeCommitPullRequestSourceBranchNameTow = String.format("SingleSourceCommitFeature-%s", System.currentTimeMillis());
        return CodeCommitPullRequestSourceBranchNameTow;
    }
}
