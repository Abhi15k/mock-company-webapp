pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'
                // Execute Gradle build task
                sh './gradlew assemble'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Execute Gradle test task
                sh './gradlew test'
            }
        }
    }

    post {
        // If the build fails, mark it as failed
        failure {
            echo 'Build failed! Please check the errors.'
        }

        // If the build is successful, mark it as successful
        success {
            echo 'Build and tests ran successfully.'
        }
    }
}
