def dv
pipeline{
    agent any
    stages{
        stage("init")
        {
            steps{
            script{
                dv = load 'script.groovy'
            }
            }
        }

        stage("build")
        {   
            steps{
            script{
                dv.build()
            }
            }

        }
        stage("deploy")
        {
            steps{
            script{
                dv.deploy()
            }
            }
        }
    }
}