pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Compiling application...'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating package...'
                bat 'mvn package'

                bat 'echo Build Number: %BUILD_NUMBER% > build-info.txt'
                bat 'echo Build Date: %DATE% %TIME% >> build-info.txt'
            }
        }
    }

    post {
        success {
            echo 'Build successful! Ready for release.'
        }

        failure {
            echo 'Build failed! Check the console output.'
        }
    }
}
