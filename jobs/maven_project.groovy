job('Maven-project-dsl'){
    scm{
        git{
            remote{
                url('https://github.com/crileroro/java-maven.git')
            }

            branch('master')
        }
    }
    steps{
        shell('********** Starting build **********')
    }
}
