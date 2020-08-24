pipeline {
    environment {
        registry = "ktbcbsms95.ktb"
        registryCredential ='dockerhub'
        dockerImage =''
        imageName ="rest"
        
    }
    agent any
    tools {
        maven 'maven3.6.3'
    }
    stages {
        stage('Build Maven'){
            steps {
                sh '''
                    echo "start download maven"
                    echo "end download maven"
                '''
            }
        }
        
    
        // stage('Push image'){
        //  steps{
        //       script {
        //            unstash 'targetfiles'
        //            a = docker.build("${env.registry}" +"/"+"${env.imageName}" + ":0."+"0."+"${env.BUILD_NUMBER}" , "-f Dockerfile .")
        //            a.push()
        //         }
        //     }
    }

}