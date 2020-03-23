job('Maven-project-dsl'){
    parameters{
        stringParam('BRANCH_NAME', 'master')
    }
    scm{
        git{
            remote{
                url('https://github.com/crileroro/java-maven.git')
            }

            branch('$BRANCH_NAME')
        }
    }
    steps{
        maven{
            goals('clean')
            goals('verify')
            mavenInstallation('Default_mvn')
        }
    }
    publishers{
        archiveJunit('**/target/surefire-reports/*.xml'){
            allowEmptyResults()
            healthScaleFactor(1)
        }
    }
}
