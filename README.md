# jenkins-job-dsl

This project explains how to use the DSL plugin along with a seed job.

## Setup
1. Create a new Jenkins Job (Freestyle project) called 'seed'.
2. In the SCM section, select `Git` and use as `Repository URL ` the URL of this repository.
3. In the `Build` section, add a new step `Process Job DSLs`.
4. Enable the option `Look on Filesystem` and put the path to the job: `jobs/*.groovy`
5. Build the job just created.
***
In case your Jenkins job fails due to the error `ERROR: script not yet approved for use`, as admin user, you will need to approve your Groovy script. Go to Manage Jenkins -> In-process Script Approval. This is a Jenkins Security feature.
***
See [this link](https://github.com/jenkinsci/job-dsl-plugin/wiki/Script-Securityon) and [this](https://github.com/jenkinsci/job-dsl-plugin/wiki/Script-Security) on how to use a Groovy sandbox for the DSL plugin.
