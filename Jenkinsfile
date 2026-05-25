pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK21'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/keerthanabmkeerthi14/bank-app.git',
                    credentialsId: 'github-token'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            mail to: 'keerthanabmkeerthi14@gmail.com',
                 subject: 'Jenkins Build Success',
                 body: 'The build completed successfully.'
        }

        failure {
            mail to: 'keerthanabmkeerthi14@gmail.com',
                 subject: 'Jenkins Build Failed',
                 body: 'The build has failed. Check Jenkins logs.'
        }
    }
}
