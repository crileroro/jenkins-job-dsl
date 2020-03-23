# jenkins-job-dsl

This project explains how to use the DSL plugin along with a seed job.

## Setup
1. Create a new Jenkins Job (Freestyle project) called 'seed'.
2. In the SCM section, select `Git` and use as `Repository URL ` the URL of this repository.
3. In the `Build` section, add a new step `Process Job DSLs`.
4. Enable the option `Look on Filesystem` and put the path to the seed job: 'jobs/seed.groovy'
