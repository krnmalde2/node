def build(){
    sh 'docker build -t krnmalde/final:2.22 .'
}

def deploy(){
    withCredentials([
        usernamePassword(
            credentialsId:'dockerhub repo',
            usernameVariable:'USER',
            passwordVariable:'PASS'
        )
    ]){

    sh "echo $PASS | docker login -u $USER --password-stdin"
    sh "docker push krnmalde/final:2.22"
    }
}

return this