def call() {
    pipeline{
        agent any 
        stages{
            stage ('Checkout code') {
                steps {
                    checkout ([$class: 'GitSCM', 
                               branches: [[name: '*/main']],   
                               userRemoteConfigs: [[credentialsId: '<gitCredentials>', 
                               url: '<gitRepoURL>']]])
                }
            }
        }
    }
}