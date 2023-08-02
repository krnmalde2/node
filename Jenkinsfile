def dv
pipeline{
    agent any
    stages{
        stage("init")
        {
            script{
                dv = load 'script.groovy'
            }
        }

        stage("build")
        {
            script{
                dv.build()
            }

        }
        stage("deploy")
        {
            script{
                dv.deploy()
            }
        }
    }
}