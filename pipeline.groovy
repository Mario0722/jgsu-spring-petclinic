pipeline {
    agent any

    stages {
        stage('Checkout'){
            steps{
                 // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/Mario0722/jgsu-spring-petclinic.git'
            }
        }
        stage('Build') {
            steps {
                // Run Maven on a Unix agent.
                bat '.\\mvnw clean package'

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
