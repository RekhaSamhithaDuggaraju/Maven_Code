
pipeline {
    agent any

    environment {
        JAVA_HOME = '/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home'
        PATH = '/opt/homebrew/bin:/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin:/usr/bin:/bin:/usr/sbin:/sbin'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Source code checked out from GitHub.'
            }
        }

        stage('Build and Test') {
            steps {
                sh '/opt/homebrew/bin/mvn clean test'
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
