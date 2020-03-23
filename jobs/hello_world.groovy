job('hello-world-dsl'){
    steps{
        shell("""
          echo Hello World
          echo in two lines!
        """)
    }
}