pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESS: all Maven tests passed.'
        }
        failure {
            echo 'BUILD FAILURE: check the Console Output for details.'
        }
    }
}
