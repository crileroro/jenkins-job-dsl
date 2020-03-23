job ('seed'){
    scm{
        git{
            remote{
                url('https://github.com/crileroro/jenkins-job-dsl.git')
            }
            branch('master')
        }
    }
    
    steps{
        dsl{
            external('jobs/*.groovy')
            removeAction('DISABLE')
        }
    }
}