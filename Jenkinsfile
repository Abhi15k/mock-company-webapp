pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh './gradlew assemble'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Tests...'
                sh './gradlew test'
            }
        }
    }
}

