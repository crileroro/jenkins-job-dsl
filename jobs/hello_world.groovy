job('hello-world-dsl'){
    steps{
        shell("""
          echo Hello World
          echo from Jenkins Home: $JENKINS_HOME!
        """)
    }
}